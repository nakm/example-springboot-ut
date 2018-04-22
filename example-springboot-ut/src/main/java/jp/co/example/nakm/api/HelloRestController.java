package jp.co.example.nakm.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jp.co.example.nakm.entity.User;

@RestController
public class HelloRestController {
    
    @GetMapping("/")
    public String greeting(){
        return "hello";
    }
    
    @GetMapping("/user")
    public List<User> getUser(){
        List<User> users = new ArrayList<>();
        
        for(int i=0;i<10;i++){
            users.add(User.builder().name("abc"+i).locale("日本").address("hogehoge street"+i).age(20+i).email("agege"+i+"@example.com").build());
        }
        
        return users;
    }
    
    
    
}
