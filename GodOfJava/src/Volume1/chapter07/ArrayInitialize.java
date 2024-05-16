package Volume1.chapter07;

public class ArrayInitialize {
    // 중괄호를 사용해 배열을 선언하면서 원소를 초기화하는 경우
    //      일반적으로 절대 변경되지 않는 값을 지정하는 경우에 해당함(예를 들어 12달)
    //      얼마나 자주 사용하는지, 어디에서 사용하는지를 따져보고 지역 변수, 클래스 변수, 인스턴스 변수로 선언할지 결정하면 됨
    // static 키워드를 붙인 이유
    //      static을 붙이지 않으면 ArrayInitialize 객체를 생성할 때마다 객체에 month 배열이 생성됨
    //      모든 객체에서 똑같은 역할을 하는데 객체마다 생성되면 비효율적임
    //      따라서 static을 붙여 클래스 변수로 선언함
    static String[] month = { "January",  "February", "March", "April", "May", "June", "July", "August", "September",
            "October", "November", "December"};

    public static void main(String[] args) {
        ArrayInitialize array = new ArrayInitialize();
        array.otherInit();
    }

    public void otherInit() {
        // 배열을 선언하면서 원소를 초기화하는 방법
        //      중괄호 안에 배열의 각 위치에 해당하는 값들을 콤마로 구분하여 나열하면 선언과 동시에 원소들이 초기화됨
        int[] lottoNumbers = {5, 12, 23, 25, 38, 41, 2};
        System.out.println("lottoNumbers = " + lottoNumbers);

        // 중괄호를 사용해 배열을 선언하면서 원소를 초기화하는 경우 반드시 한 줄에 배열 선언 및 초기화가 이루어져야 함
        // int[] lottoNumbers2;
        // lottoNumbers2 = {5, 12, 23, 25, 38, 41, 2};
    }

    public String getMonth(int monthInt) {
        if (monthInt <= 0 || monthInt >= 12) return "잘못된 인덱스";
        return month[monthInt - 1];
    }
}
