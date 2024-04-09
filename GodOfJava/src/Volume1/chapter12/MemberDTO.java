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

    // toString() 메서드 오버라이딩
    //      DTO를 사용할 때 toString() 메서드를 오버라이딩하여 객체를 쉽게 확인할 수 있게 하는 것이 좋음
    public String toString() {
        return "Name = " + name + " Phone = " + phone + " Email = " + email;
    }

    // equals() 메서드 오버라이딩
    //      equals() 메서드 오버라이딩 시 지켜야 하는 조건이 있어 직접 오버라이딩하는 것은 권장되지 않음
    //          hashCode() 메서드와 마찬가지로 IDE의 자동 완성 기능을 활용하는 것이 권장됨
    //      true: equals() 메서드를 호출한 객체와 매개 변수에 전달한 객체가 동일함
    //      false: equals() 메서드를 호출한 객체와 매개 변수에 전달한 객체가 동일하지 않음
    public boolean equals(Object obj) {
        if (this == obj) return true;    // 두 객체의 주소가 같음: true
        if (obj == null) return false;   // obj가 null임: false
        if (getClass() != obj.getClass()) return false;  // 두 객체의 클래스가 다름: false

        // 같은 클래스이므로 형 변환 가능
        MemberDTO other = (MemberDTO) obj;

        if (name == null) {
            // name이 null일 때 비교 대상의 name이 null이 아니면 false
            if (other.name != null) return false;
        } else if (!name.equals(other.name)) {
            // name이 비교 대상의 name과 다르면 false
            return false;
        }

        // name과 동일한 비교 수행
        if (phone == null) {
            if (other.phone != null) return false;
        } else if (!phone.equals(other.phone)) {
            return false;
        }

        // name과 동일한 비교 수행
        if (email == null) {
            if (other.email != null) return false;
        } else if (!email.equals(other.email)) {
            return false;
        }

        return true;
    }

    // hashCode() 메서드 오버라이딩
    //      hashCode() 메서드 오버라이딩 시 지켜야 하는 조건이 있어 직접 오버라이딩하는 것은 권장되지 않음
    //          equals() 메서드와 마찬가지로 IDE의 자동 완성 기능을 활용하는 것이 권장됨
    //      equals() 메서드 오버라이딩 시 함께 오버라이딩해야 함
    //          두 객체가 equals() 메서드 결과에 따라 동일한 경우
    //          두 객체에 대한 hashCode() 메서드의 결과도 동일한 정수 값이어야 한다는 조건이 있음
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((email == null) ? 0 : email.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((phone == null) ? 0 : phone.hashCode());
        return result;
    }
}
