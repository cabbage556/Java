package Volume1.chapter09.c.javapackage;
// 패키지 선언 제약사항
//      소스의 가장 첫 줄에 위치해야 한다.
//          만약 패키지 선언 위에 자바 문장이 하나라도 존재하면 컴파일 에러가 발생함
//      소스 하나에 패키지 선언은 하나만 존재해야 한다.
//          한 소스 파일이 두 개의 폴더에 한 번에 존재할 수 없으므로 당연함
//      패키지 이름과 폴더 이름이 같아야 한다.
//          패키지 이름과 폴더 이름이 다를 경우 javac로 컴파일할 때 파일을 찾지 못해 컴파일 에러가 발생함
//          패키지 이름을 지정할 때 해당 파일이 존재하는 위치와 동일하게 패키지를 지정해야 함

// 패키지 이름 제약사항
//      패키지 시작 이름은 java가 될 수 없다.
//          java는 금지된 패키지 이름
//      패키지 이름은 모두 소문자로 지정하기로 약속했다.
//          반드시 지켜야 하는 것은 아니지만, 대부분의 자바 개발자들이 지키고 있는 제약사항
//      자바 예약어를 사용할 수 없다.
//          int 등의 자바 예약어가 패키지 이름에 포함되어 있으면 안 된다.

// 어떤 패키지가 있을 때, 같은 패키지에 있는 클래스들과 java.lang 패키지에 있는 클래스들만 찾을 수 있다.
//      다른 패키지에 있는 클래스나 java.lang 패키지가 아닌 패키지에 있는 클래스들을 사용하려면 import 해야한다.
//          java.lang 패키지에 존재하는 클래스 예시: String, System -> import 하지 않고 사용 가능
import Volume1.chapter09.c.javapackage.sub.Sub;

// Volume1.chapter09.c.javapackage.sub 패키지에 있는 모든 클래스를 임포트하는 방법
//      이때 Volume1.chapter09.c.javapackage.sub 패키지의 밑에 있는 모든 패키지를 임포트하는 것은 아님
//      Volume1.chapter09.c.javapackage.sub 패키지에 선언된 클래스들만 임포트함
//      예시
//          import Volume1.chapter09.c.* -> Volume1.chapter09.c 패키지에 선언한 클래스들만 임포트
//          import Volume1.chapter09.*   -> Volume1.chapter09 패키지에 선언한 클래스들만 임포트
import Volume1.chapter09.c.javapackage.sub.*;

public class Package {
    public static void main(String[] args) {
        // Volume1.chapter09.c.javapackage 패키지에 있는 Sub 클래스의 객체 생성
        //      서로 다른 패키지에 위치하므로 import 필요
        Sub sub = new Sub();
        sub.subClassMethod();
    }
}
