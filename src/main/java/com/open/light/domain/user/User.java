package com.open.light.domain.user;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@NoArgsConstructor
@Getter
@Entity
public class User {

    @Id
    @GeneratedValue
    private long id; //프로그램에서 인식하는 PID

    @Column
    private String email;   // 본인인증, 아이디,비번찾기위해
    @Column
    private String password;    //비밀번호

    @Column
    private String phone;   // 본인 인증, 로그인 ID

    @Column
    private String name;

    private String title;
    private String profileImage;



}
