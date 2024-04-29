package chapter06.singletonPattern;

public class Client {
    public static void main(String[] args) {
        // private 생성자이므로 외부에서 인스턴스 생성 불가능
        // Singleton s = new Singleton();

        // 정적 메서드로 단일 객체 참조값을 받음
        //      모두 동일한 객체를 참조하게 됨
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        Singleton s3 = Singleton.getInstance();

        // chapter06.singletonPattern.Singleton@1fbc7afb
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
