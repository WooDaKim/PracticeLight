package com.open.light.service.user;

import com.open.light.domain.user.User;
import com.open.light.domain.user.UserRepository;
import com.open.light.dto.user.UserProfileDto;
import com.open.light.dto.user.UserSignDto;
import com.open.light.dto.user.UserUpdateDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.util.Optional;

@RequiredArgsConstructor
@Service
public class UserService {

    private final UserRepository userRepository;

    private String uploadFolder;



    //User 저장
    @Transactional
    public User save(UserSignDto userSignDto) {

        return userRepository.save(User.builder()
                .name(userSignDto.getName())
                .password(userSignDto.getPassword())
                .email(userSignDto.getEmail())
                .phone(userSignDto.getPhone())
                .build());
    }

    //User 수정
    @Transactional
    public void update(UserUpdateDto userUpdateDto, MultipartFile multipartFile)  {
        Optional<User> user = userRepository.findById(User.builder().build().getId());
        // 프로필업로드 되었는지 확인
        if(!multipartFile.isEmpty()) {

        }

    }

    @Transactional
    public UserProfileDto userProfileDto(long profileId, long sessionId) {


        return null;
    }




}
