package Volume1.chapter13;

public class FinalReferenceType {
    // 참조 자료형 final 인스턴스 변수 : 선언과 동시에 초기화해야 함
    final MemberDTO finalDto
            = new MemberDTO("Sangmin", "010xxxxyyyy", "ask@godofjava.com");

    public static void main(String[] args) {
        FinalReferenceType referenceType = new FinalReferenceType();
        referenceType.checkDTO();
    }

    public void checkDTO() {
        System.out.println(finalDto);

        // finalDto 인스턴스 변수에 새로운 MemberDTO 객체를 생성해 할당할 수 없음
        //      참조 자료형인 finalDto 인스턴스 변수가 final로 선언되어 있어 다른 객체를 참조할 수 없게 되었기 때문
        // finalDto = new MemberDTO("Sangmin", "010xxxxyyyy", "ask@godofjava.com");

        // finalDto 인스턴스 변수가 참조하는 MemberDTO 객체의 name 인스턴스 변수는 변경 가능
        //      MemberDTO 객체의 name 인스턴스 변수는 final로 선언되어 있지 않기 때문
        finalDto.name = "Sungchoon";
        System.out.println(finalDto);
    }
}
