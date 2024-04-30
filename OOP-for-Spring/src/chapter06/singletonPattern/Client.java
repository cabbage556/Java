package chapter06.singletonPattern;

public class Client {
    public static void main(String[] args) {
        // private 생성자이므로 외부에서 인스턴스 생성 불가능
        // Singleton s = new Singleton();

        // 정적 메서드로 단일 객체 참조값을 받음
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        Singleton s3 = Singleton.getInstance();

        // 객체 출력 결과 : toString() 메서드 리턴값
        //      chapter06.singletonPattern.Singleton@1fbc7afb
        //      참조 변수 모두 동일한 객체를 참조하게 됨
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
