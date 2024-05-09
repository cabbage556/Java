package com.cabbage556.OOPforSpringchapter7.aop001;

public class Girl {
    public void runSomething() {
        /*
            횡단 관심사🔴
                프로그램 작성 시 다수의 모듈에서 공통적으로 나타나는 부분
                모듈별로 중복되어 나타나는 부분
         */
        System.out.println("열쇠로 문을 열고 집으로 들어간다.");  // 🔴

        try {
            /*
                핵심 관심사🟡
                    프로그램 작성 시 모듈마다 다르게 나타나는 부분
             */
            System.out.println("요리를 한다.");  // 🟡
        } catch (Exception ex) {
            if (ex.getMessage().equals("집에 불남")) {  // 🔴
                System.out.println("119 신고");
            }
        } finally {
            System.out.println("소등하고 잔다.");  // 🔴
        }

        System.out.println("문을 잠구고 집을 나간다.");  // 🔴
    }
}
