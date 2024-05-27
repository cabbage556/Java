package Volume1.chapter15;

/*
    String 생성자
        - String(byte[] bytes)
            - 현재 사용중인 플랫폼의 캐릭터 셋을 사용해, 매개 변수에 전달한 byte 배열을 디코딩한 String 객체를 생성함
        - String(byte[] bytes, String charsetName)
            - 매개 변수에 전달한 이름을 갖는 캐릭터 셋을 사용해, 매개 변수에 전달한 byte 배열을 디코딩한 String 객체를 생성함
    캐릭터 셋 : 문자의 집합
        - 한글, 한자 같은 글자를 말함
        - 다양한 글자들이 존재하므로 다양한 캐릭터 셋이 존재함
    디코딩 : 컴퓨터가 이해하는 값들을 사람이 알아보기 쉽게 변환하는 것

    String 객체의 값(문자열)을 byte 배열로 변환하기
    String 생성자의 매개 변수로 전달하는 byte 배열을 생성하려면 String 클래스가 제공하는 getBytes() 메서드를 사용함
        - getBytes() : 기본 캐릭터 셋을 사용해 byte 배열을 생성함
        - getBytes(Charset charset) : 매개 변수에 전달한 캐릭터 셋 객체 타입으로 byte 배열을 생성함
        - getBytes(String charsetName) : 매개 변수에 전달한 캐릭터 셋 이름으로 byte 배열을 생성함
 */

public class StringSample {

    public static void main(String[] args) {
        StringSample sample = new StringSample();
        sample.convert();
        sample.convertUTF16();
    }

    public void convert() {
        try {
            // String 객체 생성, "감바스" 값을 가짐
            String korean = "감바스";

            // 문자열 "감바스"를 byte 배열로 변환함(기본 캐릭터 셋 사용)
            byte[] arr1 = korean.getBytes();
            printByteArray(arr1);

            // 문자열 "감바스"를 변환한 byte 배열로 String 객체 생성(기본 캐릭터 셋 사용)
            //      문자열을 byte 배열로 변환할 때 사용한 캐릭터 셋과 동일한 캐릭터 셋을 사용해야 함
            String korean2 = new String(arr1);
            System.out.println(korean2);  // 감바스
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void convertUTF16() {
        // try-catch 블록 사용 이유 : UnsupportedEncodingException 예외 처리를 위해
        //      getBytes(String charsetName) 메서드와 String(byte[] bytes, String charsetName) 생성자의
        //      charsetName 매개 변수에 전달하는 캐릭터 셋이 존재하지 않는 캐릭터 셋일 경우 이 예외가 발생함
        try {
            String korean = "감바스";

            // 문자열 "감바스"를 byte 배열로 변환함(UTF-16 캐릭터 셋 사용)
            //      UTF-16 : 자바에서 한글을 처리하기 위해 많이 사용하는 캐릭터 셋
            //      UTF-16을 사용하면 한글 글자 수에 따라 2바이트의 차이가 발생함
            //          1글자: 4바이트, 2글자: 6바이트, 3글자: 8바이트, ...
            byte[] arr1 = korean.getBytes("UTF-16");
            printByteArray(arr1);

            // 문자열 "감바스"를 변환한 byte 배열로 String 객체 생성(UTF-16 캐릭터 셋 사용)
            //      문자열을 byte 배열로 변환할 때 사용한 캐릭터 셋과 동일한 캐릭터 셋을 사용해야 함 **
            String korean2 = new String(arr1, "UTF-16");
            System.out.println(korean2);    // 감바스
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void printByteArray(byte[] arr) {
        for (byte data : arr) {
            System.out.println("data = " + data);
        }
    }
}
