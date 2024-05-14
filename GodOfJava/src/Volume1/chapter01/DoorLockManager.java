package Volume1.chapter01;

/*
    클래스는 상태와 행동을 갖는다.
        - 상태(state) : 변수
            - 클래스의 특성을 결정짓는 것
            - 클래스 안에, 메서드 밖에 정의함
        - 행동(behavior) : 메서드
 */
public class DoorLockManager {
    // 변수
    String currentPassword;

    // 메서드
    public boolean checkPassword(String password) {
        // 비밀번호 확인
        return true;
    }

    // 메서드
    public void setPassword(String password) {
        // 비밀번호 설정
    }

    // 메서드
    public void resetPassword() {
        // 비밀번호 재설정
    }
}
