package jp.co.example.demo.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jp.co.example.demo.entity.User;
import jp.co.example.demo.service.UserService;

@RestController
public class HelloRestController {
    
    @Autowired
    UserService userService;
    
    @GetMapping("/")
    public String greeting(){
        return "hello";
    }
    
    @GetMapping("/users")
    public List<User> getUsers(){
        return userService.getUsers();
    }
    
}
