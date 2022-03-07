package com.open.light.domain.post;

import com.open.light.domain.user.User;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.sql.Update;

import javax.persistence.*;
import java.time.LocalDateTime;

@NoArgsConstructor
@Getter
@Entity
public class Post { //일기 겸 포스팅

    @Id
    @GeneratedValue
    private long id;

    private String postImgURL;  //포스팅 사진
    private String title;   //포스팅 제목
    private String text;    //포스팅 내용
    private LocalDateTime createDate;   //포스팅 생성시간

    @Column
    private User user;


    @PrePersist    //DB에 insert시 해당함수를 함께 실행한다는 의미이다.
    public void createDate() {
        this.createDate = LocalDateTime.now();
    }

    @Builder
    public Post(String title, String postImgURL, String text, User user) {
        this.title = title;
        this.postImgURL = postImgURL;
        this.text = text;
        this.user = user;
    }

    public void update(String title, String text) {
        this.title = title;
        this.text = text;
    }




}
