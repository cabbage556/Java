package Volume1.chapter08;

public class MemberDTO {
    public String name;
    public String phone;
    public String email;

    // 아무 정보도 모를 때
    public MemberDTO() {

    }

    // 이름만 알 때
    public MemberDTO(String name) {
        // this
        //      객체의 변수와 매개 변수를 구분하기 위해 객체의 변수 앞에 사용
        //      객체의 메서드 앞에도 사용 가능
        this.name = name;
    }

    // 이름과 전화번호만 알 때
    public MemberDTO(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    // 모든 정보를 알 때
    public MemberDTO(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }
}
