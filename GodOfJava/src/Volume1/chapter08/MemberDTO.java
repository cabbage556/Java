package Volume1.chapter08;

public class MemberDTO {
    public String name;
    public String phone;
    public String email;

    /*
        다양한 매개 변수 조합을 갖도록 생성자를 여러 개 선언할 수 있음
        여러 생성자를 선언하면 클래스의 객체를 간편하게 만들 수 있음
            다양한 상황과 필요에 따라 생성자를 선택해 객체를 생성하는 것
        생성자 갯수에는 제한이 없으나 꼭 필요한 생성자만 만드는 것이 좋음
     */

    // 생성자 1 : 아무 정보도 모를 때
    public MemberDTO() {}

    // 생성자 2 : 이름만 알 때
    public MemberDTO(String name) {
        /*
            this의 의미 : "이 객체의"
                생성자, 메서드 내부에서 this 사용 가능
                객체 변수(인스턴스 변수)와 매개 변수를 구분하기 위해 객체의 변수 앞에 붙여 사용
                컴파일러는 객체 변수 이름과 매개 변수 이름이 동일할 때 this가 붙은 변수를 "이 객체의" 변수라고 판단함
                객체의 메서드 앞에 붙여서도 사용 가능
         */
        this.name = name;
    }

    // 생성자 3 : 이름과 전화번호만 알 때
    public MemberDTO(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    // 생성자 4 : 모든 정보를 알 때
    public MemberDTO(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }
}
