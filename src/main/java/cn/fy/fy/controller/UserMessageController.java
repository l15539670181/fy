package cn.fy.fy.controller;
import cn.fy.fy.entity.*;
import cn.fy.fy.service.*;
import cn.fy.fy.util.DragYzm;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.zhenzi.sms.ZhenziSmsClient;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author liu
 * @since 2020-03-17
 */
@Controller
@RequestMapping("/user-message")
public class UserMessageController {
    @Resource
    private IUserMessageService iUserMessageService;
    @Resource
    private IConcernService iConcernService;
    @Resource
    private IFansService iFansService;
    @Resource
    private IStoreDealService iStoreDealService;
    @Resource
    private IUserRechargeService iUserRechargeService;
    @RequestMapping("/login")
    public String login(){
        return "login";
    }
    @RequestMapping("/lo")
    public String lo(UserMessage userMessage, HttpSession session,String userAdim, String userPwd){
        userMessage.setUserAdim(userAdim);
        userMessage.setUserPwd(userPwd);
        UserMessage user= iUserMessageService.finduser(userMessage);
        if(user!=null){
            System.out.println("******************************");
            System.out.println(user.getUserName());
            session.setAttribute("user",user);
            return "redirect:/";
        }else{
            return "redirect:login";
        }
    }
    @RequestMapping("/zhuce.html")
    public String zhuce(){
        return "zhuce";
    }

    @RequestMapping("/zhuce")
    public String tianjia(UserMessage userMessage, @RequestParam(value ="tou", required = false) MultipartFile tou) throws IllegalStateException, IOException {
        userMessage.setUserType(3);
        userMessage.setUserRegistration(LocalDate.now());
        userMessage.setUserMoney(0.0);
        userMessage.setUserVipWhether(0);
        if(!tou.isEmpty()) {
            File directory = new File("");// 参数为空
            String courseFile = directory.getCanonicalPath();
            System.out.println("name:"+tou.getOriginalFilename());
            String oldFileName = tou.getOriginalFilename();
            userMessage.setUserHead(oldFileName);
            //后缀名
            String suffix = FilenameUtils.getExtension(oldFileName);
            System.out.println("suffix:"+ suffix);
            if(suffix.equals("png")||suffix.equals("jpg")) {
                File file = new File(courseFile+"/src/main/resources/static/img",oldFileName);
                tou.transferTo(file);
            }
        }
        boolean i=iUserMessageService.save(userMessage);
        if(i==true){
            return "redirect:login";
        }else{
            return " redirect：zhuce.html";
        }

    }

    @RequestMapping("/yzmServlet")
    @ResponseBody
    public String hua(HttpServletResponse response, HttpServletRequest request, String point, String imgname) {
        Map<String, String> result = new HashMap<String, String>();
        try {
            response.setContentType("application/json-rpc;charset=UTF-8");
            if (StringUtils.isEmpty(point)) { //生成图形验证码
                if(StringUtils.isEmpty(imgname)) {
                    imgname = "5.png";
                }
                DragYzm resourImg = new DragYzm();
                result = resourImg.create(request, imgname);
            } else { //验证验证码
                Integer location_x = (Integer) request.getSession().getAttribute("location_x");
                if ((Integer.valueOf(point) < location_x + 4) && (Integer.valueOf(point) > location_x - 4)) {
                    //说明验证通过，
                    result.put("data", "success");
                } else {
                    result.put("data", "error");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return JSONObject.toJSONString(result);
    }
    @RequestMapping("admin")
    public String admin(String userName,Model model,HttpSession session){
        UserMessage user = (UserMessage) session.getAttribute("user");
        user.setUserName(userName);
        List<UserMessage> userList = iUserMessageService.findByName(user);
        List<Concern> concernList = iConcernService.findByUserId(user.getUserId());
        List<Fans> fansList = iFansService.findByUserId(user.getUserId());
        model.addAttribute("fansList",fansList);
        model.addAttribute("concernList",concernList);
        model.addAttribute("userList",userList);

        List<StoreDeal> StoryMin = iStoreDealService.FindDeal(user.getUserId());
        model.addAttribute("StoryDD",StoryMin);

        List<UserRecharge> shu=iUserRechargeService.get();
        model.addAttribute("shu",shu);
        return "admin";
    }

    @RequestMapping("sjh")
    @ResponseBody
    public String sjh(String hao,HttpSession session){
        UserMessage userMessage = new UserMessage();
        userMessage.setUserAdim(hao);
        userMessage.setUserType(3);
        userMessage.setUserRegistration(LocalDate.now());
        userMessage.setUserMoney(0.0);
        userMessage.setUserVipWhether(0);
        userMessage.setUserPwd(hao.substring(hao.length()-6));
        userMessage.setUserHead("2e917f904725d4a234aca6a34371589.jpg");
        userMessage.setUserName("游客"+hao);
        if(iUserMessageService.save(userMessage)){
            session.setAttribute("user",iUserMessageService.finduser(userMessage));
            return "1";
        }
        return "0";
    }

    //删除账单操作
    @RequestMapping("del")
    public String del(int userId,Model model){
        int i=iUserMessageService.delc(userId);
        if(i>0){
            int b=iUserRechargeService.deld(userId);
            List<UserRecharge> shu=iUserRechargeService.get();
            model.addAttribute("shu",shu);
            return "admin";
        }
        return "admin";
    }
    //修改账单
    @RequestMapping("upd")
    public String upd(UserMessage userMessage,Model model){
        int i=iUserMessageService.updatemoney(userMessage);
        List<UserRecharge> shu=iUserRechargeService.get();
        model.addAttribute("shu",shu);
        if(i>0){
            return "admin";
        }
        return "redirect:/";
    }

    //查询修改账单
    @RequestMapping("sel")
    public String sel(Integer userIde,Model model){
        UserMessage u= iUserMessageService.ectupd(userIde);
        model.addAttribute("u",u);
        return "updmoney";
    }
    @RequestMapping("loginout")
    public String loginout(HttpSession session){
        session.removeAttribute("user");
        return "redirect:/";
    }
    @RequestMapping("/sendSms")
    @ResponseBody
    public String sendSms(HttpServletRequest request, @RequestParam("number") String number,int num) {
        boolean flag = false;
        JSONObject json = null;
        try {
            // JSONObject json = null;
            //生成6位验证码
            //发送短信
            ZhenziSmsClient client = new ZhenziSmsClient
                    ("https://sms_developer.zhenzikj.com", "105010","ef99fd96-bd0f-410c-8ba9-2c626ea9990c");
            Map<String,String> params = new HashMap<String,String>();
            params.put("number",number);
            params.put("message","验证码为:"+num);
            String result = client.send(params);
            json = JSONObject.parseObject(result);
            if(json.getIntValue("code") != 0){
                //发送短信失败
                flag = false;
                // System.out.print(json.getString("data"));
                // System.out.print(json.getString("message"));
            }else{
                flag = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return JSONArray.toJSONString(flag);
    }
}
