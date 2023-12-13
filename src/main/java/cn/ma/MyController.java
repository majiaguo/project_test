package cn.ma;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/t1")
    public String t1() {
        return "hello world";
    }

}
