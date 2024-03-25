package Volume1.chapter07;

public class ArrayInitialize {
    // 중괄호를 사용해 배열을 선언하는 경우: 절대 변경되지 않는 값을 지정할 때(예를 들어 12달)
    //      하나의 메서드에서만 배열을 사용하는 경우: 해당 메서드 내부에서만 배열을 선언하는 것이 좋음
    // static 키워드를 붙인 이유
    //      static을 붙이지 않으면 ArrayInitialize 객체를 생성할 때마다 객체에 month 배열이 생성됨
    //      같은 역할을 하는데 객체마다 생성되면 비효율적임
    //      따라서 static을 붙여 클래스 변수로 선언함
    static String[] month = { "January",  "February", "March", "April", "May", "June", "July", "August", "September",
            "October", "November", "December"};

    public static void main(String[] args) {
        ArrayInitialize array = new ArrayInitialize();
        array.otherInit();
    }

    public void otherInit() {
        // 배열을 선언하는 또다른 방법
        //      중괄호 안에 각 위치에 해당하는 값들을 콤마로 구분하여 나열
        int[] lottoNumbers = {5, 12, 23, 25, 38, 41, 2};
        System.out.println("lottoNumbers = " + lottoNumbers);

        // 중괄호를 사용해 배열 선언 시 두 줄에 걸쳐 선언할 수 없음
        //      (선언 + 초기화)를 한 줄에 작성해야 함
        // int[] lottoNumbers2;
        // lottoNumbers2 = {5, 12, 23, 25, 38, 41, 2};
    }

    public String getMonth(int monthInt) {
        if (monthInt <= 0 || monthInt >= 12) return "잘못된 인덱스";
        return month[monthInt - 1];
    }
}
