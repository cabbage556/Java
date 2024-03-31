package Volume1.chapter15;

public class StringSample {

    public static void main(String[] args) {
        StringSample sample = new StringSample();
        // sample.convert();
        sample.convertUTF16();
    }

    public void convert() {
        try {
            // "한글" 값을 갖는 String 객체 생성
            String korean = "한글";

            // getBytes(): String 객체를 byte 배열로 변환함
            //      기본 캐릭터셋 사용
            byte[] arr1 = korean.getBytes();
            printByteArray(arr1);

            // String(byte[]): byte 배열로 String 객체 생성
            //      기본 캐릭터셋 사용
            String korean2 = new String(arr1);
            System.out.println(korean2);  // 한글
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void convertUTF16() {
        // try-catch 블록 사용 이유: UnsupportedEncodingException 예외 처리
        //      getBytes(String charsetName) 메서드와 String(byte[] bytes, String charsetName) 생성자에
        //      전달하는 캐릭터셋이 지원하지 않는 캐릭터셋일 경우 이 예외가 발생함
        try {
            String korean = "감바스";

            // getBytes(String charsetName): String 객체를 byte 배열로 변환함
            //      charsetName: UTF-16 캐릭터셋 사용 명시
            //      UTF-16을 사용하면 한글 글자 수에 따라 2바이트의 차이가 발생함
            //         1글자: 4바이트, 2글자: 6바이트, 3글자: 8바이트, ...
            byte[] arr1 = korean.getBytes("UTF-16");
            printByteArray(arr1);

            // String(byte[] bytes, String charsetName): byte 배열로 String 객체 생성
            //      charsetName: UTF-16 캐릭터셋 사용 명시
            //      byte[] 배열로 변환할 때 사용한 캐릭터셋과 동일한 캐릭터셋을 사용해야 함
            String korean2 = new String(arr1, "UTF-16");
            System.out.println(korean2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void printByteArray(byte[] arr) {
        for (byte data : arr) {
            System.out.println("data = " + data);
        }
        System.out.println();
    }
}
