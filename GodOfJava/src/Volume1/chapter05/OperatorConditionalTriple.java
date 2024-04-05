package Volume1.chapter05;

public class OperatorConditionalTriple {
    public static void main(String[] args) {
        OperatorConditionalTriple operator = new OperatorConditionalTriple();
        operator.doBlindDate(30);
        operator.doBlindDate(90);
    }

    public void doBlindDate(int point) {
        boolean doBlindDateFlag = false;

        // 삼항 연산자
        //      변수에 값을 할당할 때 사용할 수 있는 연산자
        doBlindDateFlag = point >= 80 ? true : false;
        System.out.println(point + " : " + doBlindDateFlag);
    }
}
