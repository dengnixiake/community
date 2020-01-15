package life.majiang.community.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

//允许这个类接收前端的请求
@Controller
public class HelloController {

    //什么都不输入的时候返回根目录，也就是index目录
    @GetMapping("/")
    public String index(){
        return "index";
    }
}
