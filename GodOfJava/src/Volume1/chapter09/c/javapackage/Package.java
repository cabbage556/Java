// 패키지 선언 제약사항
//      소스의 가장 첫 줄에 위치해야 함
//          만약 패키지 선언 위에 자바 문장이 하나라도 존재하면 컴파일 에러가 발생함
//      소스 하나에 패키지 선언은 하나만 존재해야 함
//          한 소스 파일이 두 개의 폴더에 한 번에 존재할 수 없음
//      패키지 이름과 디렉터리 이름이 같아야 함
//          패키지 이름과 디렉터리 이름이 다를 경우 컴파일할 때 파일을 찾지 못해 컴파일 에러가 발생함
//          패키지 이름을 지정할 때 해당 파일이 위치한 디렉터리 이름과 동일하게 패키지를 지정해야 함

// 패키지 이름 제약사항
//      패키지 이름은 java로 시작할 수 없음
//          java: 자바 기본 패키지 이름
//      패키지 이름은 모두 소문자로 지정해야 함
//          대부분의 자바 개발자들이 지키고 있는 제약사항
//      자바 예약어를 사용할 수 없음
//          int 등의 자바 예약어가 패키지 이름에 포함되어 있으면 안 됨

// 패키지 선언문
package Volume1.chapter09.c.javapackage;


// 임포트 없이 사용할 수 있는 클래스
//      같은 패키지의 클래스
//      java.lang 패키지의 클래스
// 이외의 클래스들은 모두 임포트해서 사용함

// 패키지가 같은지 다른지에 따라 임포트 여부가 결정됨
//      같은 패키지 -> 임포트하지 않음
//      다른 패키지 -> 임포트 해야 함
//          상위 패키지의 클래스도 하위 패키지의 클래스를 임포트해서 사용해야 함

// Volume1.chapter09.c.javapackage.sub 패키지에 있는 Sub 클래스 임포트
import Volume1.chapter09.c.javapackage.sub.Sub;

// Volume1.chapter09.c.javapackage.sub 패키지의 모든 클래스를 임포트하는 방법
//      *을 사용하면 그 패키지에 선언된 클래스들만 임포트함
//      Volume1.chapter09.c.javapackage.sub 패키지 밑에 있는 모든 패키지의 클래스까지 임포트하지 않음
//      Volume1.chapter09.c.javapackage.sub 패키지의 클래스들만 임포트함
//      예시
//          import Volume1.chapter09.c.* -> Volume1.chapter09.c 패키지의 클래스들만 임포트
//          import Volume1.chapter09.*   -> Volume1.chapter09 패키지의 클래스들만 임포트
import Volume1.chapter09.c.javapackage.sub.*;

public class Package {
    public static void main(String[] args) {
        // Volume1.chapter09.c.javapackage.sub 패키지에 있는 Sub 클래스의 객체 생성
        //      Sub 클래스가 Package 클래스와 서로 다른 패키지에 위치하므로 import 필요
        Sub sub = new Sub();
        sub.subClassMethod();
    }
}
