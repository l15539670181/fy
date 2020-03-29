package cn.fy.fy.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    /**
     * 注册拦截器
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //addPathPattern后跟拦截地址，excludePathPatterns后跟排除拦截地址
        //registry.addInterceptor(new MyInterceptor()).addPathPatterns("fy/vote/**").excludePathPatterns("fy/anime-type/list").excludePathPatterns("/user-message/login");
        InterceptorRegistration registration = registry.addInterceptor(new MyInterceptor());
        registration.addPathPatterns("/vote/**");
        registration.addPathPatterns("/vote-need/**");//所有路径都被拦截
        registration.addPathPatterns("/Recharge/**");
        registration.addPathPatterns("/anime-type/StoreTiao");
//        registration.excludePathPatterns(
//                "/user-message/login",//添加不拦截路径
//                "/anime-type/list",            //登录
//                "/**/*.html",            //html静态资源
//                "/**/*.js",              //js静态资源
//                "/**/*.css",             //css静态资源
//                "/**/*.woff",
//                "/**/*.ttf"
//        );
    }
}