package com.open.light.dto.user;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;

@NoArgsConstructor
@Getter
@Data
public class UserSignDto {
       //정규식 추가

   private String name;
   private String password;
   private String email;
   private String phone;

   @Builder
    public UserSignDto(String name, String password, String email, String phone) {
        this.name = name;
        this.password = password;
        this.email = email;
        this.phone = phone;
    }
}
