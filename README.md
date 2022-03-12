# operlight

# 기술스택

- Java11, Spring Boot, JPA
- Thymeleaf, BootStrap
- InteliJ
- DB : h2 이후에 mysql로 전환

## 1. 프로젝트 개요

### 개발목표와 범위

- 개발 필요성
  나의 필요성
- 개발 목표
  나의 모든 게 담겨 있는 박스
  나만 아는 박스

### 개발일정/산출물

## 2. 서비스 요구사항 정의

### 서비스 개요

### 서비스 구성요소 정의

### 요구사항 정의(사용자)

- 사용자 인증
    - 회원가입 / 인증
        - 해당 서비스에 가입한 적이 없다면 회원가입을 해야한다.
        - 사용자는 사용할 계정의 아이디(PID), 비밀번호, 이름(UID), 생년월일, 이메일, 전화번호를 입력하여 이메일로 전송된 키를 인증후에 가입이 완료된다.
        - 본인 생일 포함 가족 생일은 회원가입시 캘린더에 등록이 된다.(등록된 자녀도 등록)
        - 서로의 이메일을 추가하면서 가족을 만들수 있다.
    - 로그인
        - 가입한 계정이 있다면 아이디와 비밀번호를 입력하고 로그인한다.
    - ID찾기 / 비밀번호 찾기
        - 가입시 인증했던 이메일로 ID / PW 를 찾을 수 있다.
        - 부모 역시 자녀의 이메일로 ID / PW 를 찾을 수 있다.
    - 회원 탈퇴
        - 탈퇴한 회원은 1주일간 유지하지만 문구는 즉시 삭제됨으로 안내한다.
- 캘린더
    - 일정 생성 / 수정 / 삭제
        - 일정 생성의 목록으로 제목, 날짜, 시간, 일정동행추가, 메모를 포함한다.
    - 일정 알림
        - 초대 할 사람에 추가되면 알림을 준다.
        - 일정을 당일아침 9시에 알림을 준다.
- 앨범 & 일기 (SNS형식)
    - 게시물 생성 / 수정 / 삭제
    - 게시물 좋아요
        - 게시물에 버튼 기능
    - 회원 태그
        - 게시물에 태그 기능
    - 댓글
        - 게시물에 댓글 기능
- 환경 설정
    - 계정 수정, 계정 탈퇴 설정가능
- 관리자
    - 사용자 관리
    - 사용자 삭제


### **요구사항 정의(서버)**

- 관리자 기능
    - 사용자 관리
    - 사용자 삭제
- 프로세스(기능) 설계
- 화면(UI)설계
    - 스토리보드 구성
        - 사용자 시나리오
    - 초기화면
        - 로그인화면
        - 회원가입 화면
        - ID / PW 찾기
    - 메인화면 UI ⇒ index.html
        - 로그인 후 메인화면
        - 캘린더 화면
        - 전화요청 화면
        - SNS 화면
        - 환경 설정
- REST API 인터페이스 설계
    - 서버/클라이언트 구조
    - REST API 정의 및 설계 (Client)
    - REST API 정의 및 설계 (Server)
- 데이터베이스 설계
    - ERD
    - 논리적설계(테이블명세서)

---

# 사용처

- 프로필
    - 단체 그룹에서만 나타나기
    -

- UserService
    - multipartFile
      ⇒ 인터페이스
      ⇒ 파일업로드할때 사용
      ⇒ 다른방법은?
    - SpringSecurity



