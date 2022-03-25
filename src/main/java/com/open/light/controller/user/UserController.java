package com.open.light.controller.user;

import com.open.light.domain.user.User;
import com.open.light.dto.user.UserProfileDto;
import com.open.light.service.user.UserService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.security.Principal;

@RequiredArgsConstructor    //final 생성자 만들어줌
@Controller
public class UserController {
    private final UserService userService;


//로그인 만들자



    //사용자 프로필 화면 이동
    @GetMapping("/user/profile")
    public String profile(Model model, long id, User user){
        UserProfileDto userProfileDto = userService.userProfileDto();

        return "user/profile";
    }

    //사용자 수정페이지 이동
    @GetMapping("/user/update")
    public String update() {
        return "user/update";
    }


    //사용자 프로필 업데이트
    @PostMapping
    public String updateUser() {

        return "redirect:/user/profile";
    }


}
