package chapter05.lsp.richSuperClass;

import java.util.Date;

public class Driver {
    public static void main(String[] args) {
        // 리스코프 치환 원칙에 따라 하위 객체가 상위 객체인 척 할 수 있음
        Person studentKim = new Student("Kim", new Date(2000, 1, 1), "20000101-1234567", "20190101");
        Person soldierLee = new Soldier("Lee", new Date(1998, 1, 1), "19980101-1234567", "19-0101");

        /*
            풍부한 상위 클래스의 경우
                빈약한 상위 클래스보다 불필요한 캐스팅이 적음
         */

        // 상속한 속성에 캐스팅 없이 접근 가능
        System.out.println(studentKim.name);
        System.out.println(soldierLee.name);

        System.out.println(studentKim.birthDay);
        System.out.println(soldierLee.birthDay);

        System.out.println(studentKim.socialNumber);
        System.out.println(soldierLee.socialNumber);

        // 각 클래스의 인스턴스 속성에 접근하는 경우는 캐스팅 필요
        System.out.println(((Student) studentKim).studentNumber);
        System.out.println(((Soldier) soldierLee).soldierNumber);

        // 상속한 메서드에 캐스팅 없이 접근 가능
        studentKim.eat();
        soldierLee.eat();

        studentKim.sleep();
        soldierLee.sleep();

        studentKim.introduce();
        soldierLee.introduce();

        // 각 클래스의 인스턴스 메서드에 접근하는 경우는 캐스팅 필요
        ((Student) studentKim).study();
        ((Soldier) soldierLee).train();
    }
}

/*
    풍부한 상위 클래스의 경우
        상위 클래스가 하위 클래스가 가질 수 있는 공통 속성과 공통 메서드를 상속해줌
 */
class Person {
    String name;
    Date birthDay;
    String socialNumber;

    public Person(String name, Date birthDay, String socialNumber) {
        this.name = name;
        this.birthDay = birthDay;
        this.socialNumber = socialNumber;
    }

    void eat() {
        System.out.println("먹다");
    }

    void sleep() {
        System.out.println("자다");
    }

    void introduce() {
        System.out.println("소개하다");
    }
}

class Student extends Person {
    String studentNumber;

    public Student(String name, Date birthDay, String socialNumber, String studentNumber) {
        super(name, birthDay, socialNumber);
        this.studentNumber = studentNumber;
    }

    void study() {
        System.out.println("공부하다");
    }
}

class Soldier extends Person {
    String soldierNumber;

    public Soldier(String name, Date birthDay, String socialNumber, String soldierNumber) {
        super(name, birthDay, socialNumber);
        this.soldierNumber = soldierNumber;
    }

    void train() {
        System.out.println("훈련하다");
    }
}