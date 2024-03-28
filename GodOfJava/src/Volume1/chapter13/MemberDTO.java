package Volume1.chapter13;

public class MemberDTO {
    public String name;
    public String phone;
    public String email;

    public MemberDTO(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public String toString() {
        return "Name = " + name + " Phone = " + phone + " Email = " + email;
    }

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

    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((email == null) ? 0 : email.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((phone == null) ? 0 : phone.hashCode());
        return result;
    }
}
