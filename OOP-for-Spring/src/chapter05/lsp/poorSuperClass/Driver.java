package chapter05.lsp.poorSuperClass;

import java.util.Date;

public class Driver {
    public static void main(String[] args) {
        // 리스코프 치환 원칙에 따라 하위 객체가 상위 객체인 척 할 수 있음
        Person studentKim = new Student("Kim", new Date(2000, 1, 1), "20000101-1234567", "20190101");
        Person soldierLee = new Soldier("Lee", new Date(1998, 1, 1), "19980101-1234567", "19-0101");

        /*
            빈약한 상위 클래스인 경우
                캐스팅이 많이 발생해 상속의 혜택을 사용할 수 없음
         */

        System.out.println(studentKim.name);
        System.out.println(soldierLee.name);

        // birthDay 속성 접근 시 캐스팅 필요
        System.out.println(((Student) studentKim).birthDay);
        System.out.println(((Soldier) soldierLee).birthDay);

        // socialNumber 속성 접근 시 캐스팅 필요
        System.out.println(((Student) studentKim).socialNumber);
        System.out.println(((Soldier) soldierLee).socialNumber);

        // 캐스팅 없이 Person 인스턴스 메서드 eat()만 사용 가능
        studentKim.eat();
        soldierLee.eat();

        // sleep() 메서드 호출 시 캐스팅 필요
        ((Student) studentKim).sleep();
        ((Soldier) soldierLee).sleep();

        // introduce() 메서드 호출 시 캐스팅 필요
        ((Student) studentKim).introduce();
        ((Soldier) soldierLee).introduce();
    }
}

/*
    빈약한 상위 클래스인 경우
        하위 클래스 Student, Soldier 클래스가 중복 속성과 중복 메서드를 갖게 됨
 */
class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    void eat() {
        System.out.println("먹다");
    }
}

class Student extends Person {
    Date birthDay;
    String socialNumber;
    String studentNumber;

    Student(String name, Date birthDay, String socialNumber, String studentNumber) {
        super(name);
        this.birthDay = birthDay;
        this.socialNumber = socialNumber;
        this.studentNumber = studentNumber;
    }

    void sleep() {
        System.out.println("자다");
    }

    void introduce() {
        System.out.println("소개하다");
    }

    void study() {
        System.out.println("공부하다");
    }
}

class Soldier extends Person {
    Date birthDay;
    String socialNumber;
    String soldierNumber;

    Soldier(String name, Date birthDay, String socialNumber, String soldierNumber) {
        super(name);
        this.birthDay = birthDay;
        this.socialNumber = socialNumber;
        this.soldierNumber = soldierNumber;
    }

    void sleep() {
        System.out.println("자다");
    }

    void introduce() {
        System.out.println("소개하다");
    }

    void train() {
        System.out.println("훈련하다");
    }
}
