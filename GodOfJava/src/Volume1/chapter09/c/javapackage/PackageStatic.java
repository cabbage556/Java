package Volume1.chapter09.c.javapackage;

// static 변수, 메서드를 사용하기 위해 클래스를 임포트하는 방법
import Volume1.chapter09.c.javapackage.sub.SubStatic;

public class PackageStatic {
    public static void main(String[] args) {
        // 클래스를 임포트한 경우 클래스를 통해 static 변수, 메서드를 사용해야 함
        System.out.println(SubStatic.CLASS_NAME);
        SubStatic.subStaticMethod();
    }
}
