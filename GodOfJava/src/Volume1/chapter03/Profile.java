package Volume1.chapter03;

// 연습문제 : Profile 클래스 작성하기
public class Profile {

    String name;
    int age;

    public void setName(String str) {
        name = str;
    }

    public void setAge(int val) {
        age = val;
    }

    public void printName() {
        System.out.println("My name is " + name);
    }

    public void printAge() {
        System.out.println("My age is " + age);
    }

    public static void main(String[] args) {
        // Profile 인스턴스 생성
        Profile profile = new Profile();

        // name, age 변수 값 설정
        profile.setName("Min");
        profile.setAge(20);

        // name, age 변수 값 출력
        profile.printName();
        profile.printAge();
    }
}
