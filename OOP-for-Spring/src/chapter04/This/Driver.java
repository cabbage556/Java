package chapter04.This;

public class Driver {
    public static void main(String[] args) {
        Penguin pororo = new Penguin();
        pororo.test();
    }
}

/*
    지역 변수, 객체 변수, 정적 변수과 관련해 기억할 것
    지역 변수와 속성(객체 변수, 정적 변수)의 이름이 같은 경우 지역 변수가 우선함
    객체 변수와 이름이 같은 지역 변수가 있는 경우 객체 변수를 사용하려면 this를 접두사로 사용함
    정적 변수와 이름이 같은 지역 변수가 있는 경우 정적 변수를 사용하려면 클래스명을 접두사로 사용함
 */

class Penguin {
    int var = 10;

    void test() {
        int var = 20;

        System.out.println(var);        // 20

        // this
        //      객체가 자기 자신을 지칭할 때 사용하는 키워드
        //      "나"라는 대명사와 같은 것
        System.out.println(this.var);   // 10
    }
}
