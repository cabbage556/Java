package Volume1.chapter08;

public class MemberDTO {
    public String name;
    public String phone;
    public String email;

    // 여러 생성자를 만들어 상황에 따라 사용할 수 있음
    // 1. 아무 정보도 모를 때
    public MemberDTO() {

    }

    // 2. 이름만 알 때
    public MemberDTO(String name) {
        // this
        //      "이 객체의"라는 의미를 가짐
        //      생성자, 메서드 내부에서 사용 가능
        //      객체의 변수와 매개 변수를 구분하기 위해 객체의 변수 앞에 붙여 사용
        //      객체의 메서드 앞에 붙여 사용 가능
        this.name = name;
    }

    // 3. 이름과 전화번호만 알 때
    public MemberDTO(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    // 4. 모든 정보를 알 때
    public MemberDTO(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }
}
