package Volume1.chapter17;

import java.lang.reflect.Method;

/*
    Class, Method 클래스
        - 자바 리플렉션 API가 제공하는 클래스
        - Class 클래스 : 클래스의 정보를 확인할 때 사용하는 클래스
        - Method 클래스 : 클래스의 메서드 정보를 확인할 때 사용하는 클래스

    Class 클래스에 선언된 getDeclaredMethods() 메서드
        - 클래스에 선언된 메서드들을 배열로 리턴함

    Method 클래스에 선언된 getAnnotation() 메서드
        - 매개 변수로 전달한 어노테이션이 메서드에 선언되어 있는지 확인하고, 있으면 어노테이션의 객체를 리턴함
 */

public class UserAnnotationCheck {

    public static void main(String[] args) {
        UserAnnotationCheck sample = new UserAnnotationCheck();
        sample.checkAnnotations(UserAnnotationSample.class);
    }

    public void checkAnnotations(Class useClass) {
        // UserAnnotationSample 클래스에 선언된 메서드들을 배열로 리턴함
        Method[] methods = useClass.getDeclaredMethods();

        // UserAnnotationSample 클래스에 선언된 메서드 순회
        for (Method method : methods) {

            // UserAnnotationSample 클래스에 메서드를 선언할 때 사용한 @UserAnnotation 어노테이션의 객체를 리턴함
            UserAnnotation annotation = method.getAnnotation(UserAnnotation.class);
            if (annotation != null) {
                // 어노테이션에 선언된 메서드 호출 : 어노테이션을 적용할 때 괄호 안에 넣은 값을 리턴함
                //      annotationSample2 메서드인 경우 number() 메서드는 2를, text() 메서드는 "second"를 리턴함
                int number = annotation.number();
                String text = annotation.text();
                System.out.println(method.getName() + "(): number=" + number + " text=" + text);
            } else {
                System.out.println(method.getName() + "(): annotation is null");
            }
        }
    }
}
