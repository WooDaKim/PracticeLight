package com.open.light.dto.user;

import com.open.light.domain.user.User;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@Data
public class UserProfileDto {
    private boolean loginUser; //로그인 유저가 맞냐
    private User user;  //user도메인 받아오기
    private int postCount; // 포스트 개수
    private int libraryCount; // 독서록 개수

    @Builder
    public UserProfileDto(boolean loginUser, User user, int postCount, int libraryCount) {
        this.loginUser = loginUser;
        this.user = user;
        this.postCount = postCount;
        this.libraryCount = libraryCount;
    }
}
