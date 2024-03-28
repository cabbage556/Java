package Volume1.chapter13;

public class FinalReferenceType {
    // final 인스턴스 변수: 참조 자료형
    final MemberDTO dto = new MemberDTO("Sangmin", "010xxxxyyyy", "ask@godofjava.com");

    public static void main(String[] args) {
        FinalReferenceType referenceType = new FinalReferenceType();
        referenceType.checkDTO();
    }

    public void checkDTO() {
        System.out.println(dto);

        // final 인스턴스 변수이므로 값 변경 불가능
        // dto = new MemberDTO("Sangmin", "010xxxxyyyy", "ask@godofjava.com");

        // final 인스턴스 변수가 참조하는 객체의 name 인스턴스 변수는 변경 가능
        //      name 인스턴스 변수는 final로 선언되어 있지 않음
        dto.name = "Sungchoon";
        System.out.println(dto);
    }
}
