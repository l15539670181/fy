package cn.fy.fy.controller;

import com.alibaba.fastjson.JSONObject;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;

@Controller
@RequestMapping("/cartoon")
public class CartoonController {

    @RequestMapping("xq")
    public String xq(String mhurl1, Model model){
        try {
            //创建默认连接
            CloseableHttpClient httpClient = HttpClients.createDefault();
            //创建HttpGet对象,处理get请求,转发到A站点
            HttpGet httpGet = new HttpGet("http://api.pingcc.cn/?mhurl1="+mhurl1);
            //执行
            CloseableHttpResponse response = httpClient.execute(httpGet);
            int code = response.getStatusLine().getStatusCode();
            //获取状态
            System.out.println("http请求结果为:"+code);
            if(code == 200){
                //获取A站点返回的结果
                String result = EntityUtils.toString(response.getEntity());
                JSONObject json=JSONObject.parseObject(result);
                model.addAttribute("json",json);
            }
            response.close();
            httpClient.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "mhxq";
    }
    @RequestMapping("nr")
    public String nr(String mhurl2, Model model){
        try {
            //创建默认连接
            CloseableHttpClient httpClient = HttpClients.createDefault();
            //创建HttpGet对象,处理get请求,转发到A站点
            HttpGet httpGet = new HttpGet("http://api.pingcc.cn/?mhurl2="+mhurl2);
            //执行
            CloseableHttpResponse response = httpClient.execute(httpGet);
            int code = response.getStatusLine().getStatusCode();
            //获取状态
            System.out.println("http请求结果为:"+code);
            if(code == 200){
                //获取A站点返回的结果
                String result = EntityUtils.toString(response.getEntity());
                JSONObject json=JSONObject.parseObject(result);
                model.addAttribute("json",json);
            }
            response.close();
            httpClient.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "content";
    }

    @RequestMapping("sp")
    public String sp(String ysurl, Model model){
        try {
            //创建默认连接
            CloseableHttpClient httpClient = HttpClients.createDefault();
            //创建HttpGet对象,处理get请求,转发到A站点
            HttpGet httpGet = new HttpGet("http://api.pingcc.cn/?ysurl="+ysurl);
            //执行
            CloseableHttpResponse response = httpClient.execute(httpGet);
            int code = response.getStatusLine().getStatusCode();
            //获取状态
            System.out.println("http请求结果为:"+code);
            if(code == 200){
                //获取A站点返回的结果
                String result = EntityUtils.toString(response.getEntity());
                JSONObject json=JSONObject.parseObject(result);
                model.addAttribute("json",json);
            }
            response.close();
            httpClient.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "sp";
    }
    @RequestMapping("video")
    public String video(String download,Model model){
        model.addAttribute("download",download);
        return "video";
    }

}
