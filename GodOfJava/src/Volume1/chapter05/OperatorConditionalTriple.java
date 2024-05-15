package Volume1.chapter05;

public class OperatorConditionalTriple {
    public static void main(String[] args) {
        OperatorConditionalTriple operator = new OperatorConditionalTriple();
        operator.doBlindDate(30);
        operator.doBlindDate(80);
    }

    public void doBlindDate(int point) {
        boolean doBlindDateFlag = false;

        // 삼항 연산자 : (boolean조건식) ? true일때값 : false일때값
        //      변수에 값을 할당할 때 사용함
        doBlindDateFlag = point >= 80 ? true : false;
        System.out.println(point + " : " + doBlindDateFlag);
    }
}
