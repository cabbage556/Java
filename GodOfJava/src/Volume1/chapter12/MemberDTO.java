package Volume1.chapter12;

public class MemberDTO {
    public String name;
    public String phone;
    public String email;

    public MemberDTO(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    /*
        toString() 메서드 오버라이딩
            - 모든 클래스에서 toString() 메서드를 오버라이딩할 필요는 없음
            - DTO를 사용할 때는 toString() 메서드를 오버라이딩하여 객체를 쉽게 확인할 수 있게 하는 것이 좋음
            - DTO 인스턴스 변수들의 값을 쉽게 확인할 수 있도록 toString() 메서드를 오버라이딩함
     */
    public String toString() {
        return "Name = " + name + " Phone = " + phone + " Email = " + email;
    }

    /*
        equals() 메서드 오버라이딩
            - 두 객체를 적절하게 비교할 수 있도록 equals() 메서드를 오버라이딩해야 함
            - 직접 오버라이딩하는 것은 권장되지 않음
                - hashCode() 메서드와 마찬가지로 equals() 메서드의 오버라이딩 조건이 있기 때문
                - 만약 오버라이딩한다면 hashCode() 메서드와 마찬가지로 IDE의 자동 완성 기능을 활용하는 것이 권장됨

        equals() 메서드 오버라이딩 시 주의할 점 : hashCode() 메서드도 오버라이딩해야 함
            - equals() 메서드를 오버라이딩해서 두 객체가 같다고 판단했더라도, 두 객체의 주소값은 서로 다를 수 있기 때문
                - equals() 메서드의 리턴값이 true여도 hashCode() 메서드의 리턴값이 서로 다른 것
            - 두 객체에 대한 hashCode() 메서드의 리턴값이 동일하려면 hashCode() 메서드도 오버라이딩해야 함
                - 두 객체에 대한 equals() 메서드의 리턴값이 true라면 두 객체에 대한 hashCode() 메서드의 리턴값도 서로 같은 정수값이어야 한다는 조건이 있기 때문
     */

    // 오버라이딩 조건을 따라 equals() 메서드 오버라이딩
    public boolean equals(Object obj) {
        if (this == obj) return true;    // 두 객체의 주소가 같음: true
        if (obj == null) return false;   // obj가 null임: false
        if (getClass() != obj.getClass()) return false;  // 두 객체의 클래스가 다름: false

        // 같은 클래스이므로 캐스팅 가능
        MemberDTO other = (MemberDTO) obj;

        // 인스턴스 변수 name 비교
        if (name == null) {
            // name이 null일 때 비교 대상의 name이 null이 아니면 false
            if (other.name != null) return false;
        } else if (!name.equals(other.name)) {
            // name이 비교 대상의 name과 다르면 false
            return false;
        }

        // 인스턴스 변수 phone 비교 : name과 동일한 비교 수행
        if (phone == null) {
            if (other.phone != null) return false;
        } else if (!phone.equals(other.phone)) {
            return false;
        }

        // 인스턴스 변수 email 비교 : name과 동일한 비교 수행
        if (email == null) {
            if (other.email != null) return false;
        } else if (!email.equals(other.email)) {
            return false;
        }

        // 모든 검사를 통과하면 모든 인스턴스 변수들의 값이 동일한 객체로 판단하여 true 리턴
        return true;
    }

    /*
        hashCode() 메서드 오버라이딩
            - equals() 메서드 오버라이딩 시 함께 오버라이딩해야 함
                - 어떤 두 객체에 대해 equals() 메서드의 리턴값이 true일 때 두 객체에 대해 hashCode() 메서드를 호출하면 동일한 int 값을 리턴해야 함
            - 직접 오버라이딩하는 것은 권장되지 않음
                - equals() 메서드와 마찬가지로 hashCode() 메서드의 오버라이딩 조건이 있기 때문
                - 만약 오버라이딩한다면 equals() 메서드와 마찬가지로 IDE의 자동 완성 기능을 활용하는 것이 권장됨
     */
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((email == null) ? 0 : email.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((phone == null) ? 0 : phone.hashCode());
        return result;
    }
}
