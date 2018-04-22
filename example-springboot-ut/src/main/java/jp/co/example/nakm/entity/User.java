package jp.co.example.nakm.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString
public class User {
    private String name;
    private Integer age;
    private String locale;
    private String address;
    private String email;
}
