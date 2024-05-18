package Volume1.chapter09.c.javapackage;

// static 변수, 메서드를 import 하는 방법 : import static
//      static 변수, 메서드 자체를 import 함
// import static Volume1.chapter09.c.javapackage.sub.SubStatic.CLASS_NAME;
// import static Volume1.chapter09.c.javapackage.sub.SubStatic.subStaticMethod;

// import static * : 클래스가 제공하는 모든 static 변수, 메서드를 import 함
import static Volume1.chapter09.c.javapackage.sub.SubStatic.*;

public class PackageStaticImport {
    public static void main(String[] args) {
        // import static을 사용한 경우
        //      static 변수, 메서드를 바로 사용 가능
        //      클래스를 통하지 않음
        System.out.println(CLASS_NAME);
        subStaticMethod();
    }
}
