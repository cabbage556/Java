package Volume1.chapter17;

import java.lang.reflect.Method;

public class UserAnnotationCheck {

    public static void main(String[] args) {
        UserAnnotationCheck sample = new UserAnnotationCheck();
        sample.checkAnnotations(UserAnnotationSample.class);
    }

    // Class, Method 클래스
    //      자바의 리플렉션 API가 제공하는 클래스
    //      Class 클래스: 클래스의 정보를 확인하는 데 사용함
    //      Method 클래스: 메서드의 정보를 확인하는 데 사용함
    public void checkAnnotations(Class useClass) {
        // Class 클래스의 getDeclaredMethods() 메서드
        //      클래스에 선언된 메서드들의 목록을 리턴함
        Method[] methods = useClass.getDeclaredMethods();

        for (Method method : methods) {
            // Method 클래스의 getAnnotation() 메서드
            //      메서드에 매개 변수로 넘겨준 어노테이션이 선언되어 있는지 확인하고, 있으면 어노테이션의 객체를 리턴함
            UserAnnotation annotation = method.getAnnotation(UserAnnotation.class);
            if (annotation != null) {
                // @UserAnnotation 어노테이션에 선언된 메서드를 호출하면, @UserAnnotation 어노테이션을 선언할 때 괄호 안에 넣은 값을 리턴함
                int number = annotation.number();
                String text = annotation.text();
                System.out.println(method.getName() + "(): number=" + number + " text=" + text);
            } else {
                System.out.println(method.getName() + "(): annotation is null");
            }
        }
    }
}
