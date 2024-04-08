package Volume1.chapter09.c.javapackage;

import Volume1.chapter09.c.javapackage.sub.AccessModifier;

public class AccessCall {
    public static void main(String[] args) {
        // AccessModifier 클래스는 다른 패키지에 존재함
        AccessModifier accessModifier = new AccessModifier();

        accessModifier.publicMethod();  // 호출 가능
        // accessModifier.protectedMethod();       // 호출 불가능: protected는 같은 패키지에 있거나 상속받은 경우에만 접근 가능
        // accessModifier.packagePrivateMethod();  // 호출 불가능: package-private은 같은 패키지 내에 있을 때만 접근 가능
        // accessModifier.privateMethod();         // 호출 불가능: private은 해당 클래스 내부에서만 접근 가능
    }
}
