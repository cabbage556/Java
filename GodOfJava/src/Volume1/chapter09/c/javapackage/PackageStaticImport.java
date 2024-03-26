package Volume1.chapter09.c.javapackage;

// static 변수, 메서드를 사용하기 위해 import static을 사용하는 방법
// import static Volume1.chapter09.c.javapackage.sub.SubStatic.CLASS_NAME;
// import static Volume1.chapter09.c.javapackage.sub.SubStatic.subStaticMethod;

// SubStatic 클래스의 static 변수, 메서드를 한 번에 임포트하는 방법
import static Volume1.chapter09.c.javapackage.sub.SubStatic.*;

public class PackageStaticImport {
    public static void main(String[] args) {
        // import static을 사용한 경우 클래스를 통해 static 변수, 메서드를 사용하지 않고, 바로 사용 가능
        System.out.println(CLASS_NAME);
        subStaticMethod();
    }
}
