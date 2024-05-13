package chapter02;

public class Start4 {
    public static void main(String[] args) {
        int k = 5;
        int m;      // 변수 m에 값을 할당하지 않아 쓰레기값이 들어 있음

        /*
            Start4.square() 메서드 호출
                square() 메서드 스택 프레임이 스택 영역에 배치됨
                square() 메서드 스택 프레임 내부에 배치되는 변수 공간
                    - 반환값을 저장할 변수 공간
                    - 파라미터 k 공간
                    - 지역 변수 result 공간

            Start4.square() 메서드 모두 실행
                변수 공간의 값
                    - 반환값을 저장할 변수 공간 : 25
                    - 파라미터 k 공간 : 25
                    - 지역 변수 result 공간 : 25
                메서드를 호출한 쪽에 돌려줄 값을 갖는 반환값 변수 공간에 지역 변수 result에 담긴 값이 복사됨

            Start4.square() 메서드 종료
                반환값이 있으므로 그 값을 돌려주면서 square() 메서드 스택 프레임이 스택 영역에서 사라짐
                    - main() 메서드 스택 프레임의 지역 변수 m에 25가 할당됨
         */
        m = square(k);
    }

    /*
        어떤 메서드의 스택 프레임에서 다른 메서드의 스택 프레임의 내부 변수에 접근할 수 없음
            - main() 메서드에서 square() 메서드의 지역 변수에 접근할 수 없음
            - square() 메서드에서 main() 메서드의 지역 변수에 접근할 수 없음
        메서드 블랙박스화
            - 입력값들과 반환값에 의해서만 메서드 사이에 값이 전달됨
            - 메서드들은 서로 내부의 지역 변수를 볼 수 없음

        메서드 호출 시 파라미터에는 변수 자체가 저장한 값을 복사해서 전달함
            - Call By Value(값에 의한 전달)

        두 메서드 사이에 값을 전달하는 방법
            - 메서드 호출 시 파라미터 사용하기
            - 메서드 종료 시 반환값 넘겨주기
     */
    private static int square(int k) {
        int result;

        k = 25;

        result = k;

        return result;
    }
}
