package Volume1.chapter04;

public class ProfilePrint {
    byte age;
    String name;
    boolean isMarried;

    public static void main(String[] args) {
        ProfilePrint profilePrint = new ProfilePrint();
        byte age = 32;
        String name = "cabbage";
        boolean isMarried = false;

        // 나이, 이름, 결혼여부 설정
        profilePrint.setAge(age);
        profilePrint.setName(name);
        profilePrint.setMarried(isMarried);

        // 나이, 이름, 결혼여부 출력
        System.out.println("Age: " + profilePrint.getAge());
        System.out.println("Name: " + profilePrint.getName());
        System.out.println("Married: " + profilePrint.isMarried());
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public byte getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setMarried(boolean flag) {
        isMarried = flag;
    }

    public boolean isMarried() {
        return isMarried;
    }
}
