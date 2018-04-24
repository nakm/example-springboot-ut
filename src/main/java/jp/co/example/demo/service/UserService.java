package jp.co.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import jp.co.example.demo.entity.User;

@Service
public class UserService {

    public List<User> getUsers() {
        List<User> users = new ArrayList<>();
        
        for(int i=0;i<10;i++){
            users.add(User.builder()
                        .name("abc"+i)
                        .locale("日本")
                        .address("hogehoge street"+i)
                        .age(20+i)
                        .email("agege"+i+"@example.com")
                        .build());
        }
        
        return users;
    }

    
    
}
