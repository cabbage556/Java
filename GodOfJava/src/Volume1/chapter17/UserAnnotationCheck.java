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
        //      이 경우 UserAnnotationSample 클래스에 선언된 메서드들의 목록을 리턴함
        Method[] methods = useClass.getDeclaredMethods();

        // 메서드 목록 순회
        for (Method method : methods) {
            // Method 클래스의 getAnnotation() 메서드
            //      매개 변수로 전달한 어노테이션이 메서드에 선언되어 있는지 확인하고, 있으면 어노테이션의 객체를 리턴함
            //      UserAnnotationSample 클래스에 메서드를 선언할 때 사용한 @UserAnnotation 어노테이션의 객체를 리턴함
            UserAnnotation annotation = method.getAnnotation(UserAnnotation.class);
            if (annotation != null) {
                // @UserAnnotation 어노테이션에 선언된 메서드를 호출하면, @UserAnnotation 어노테이션을 사용할 때 괄호 안에 넣은 값을 리턴함
                //      annotationSample2 메서드의 경우, number는 2가 되고 text는 "second"가 됨
                int number = annotation.number();
                String text = annotation.text();
                System.out.println(method.getName() + "(): number=" + number + " text=" + text);
            } else {
                System.out.println(method.getName() + "(): annotation is null");
            }
        }
    }
}
