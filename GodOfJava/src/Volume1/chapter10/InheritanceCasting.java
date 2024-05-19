package Volume1.chapter10;

/*
    참조 자료형의 캐스팅
        - 상위 타입에는 하위 인스턴스를 담을 수 있음
        - 하위 타입에는 상위 인스턴스를 담을 수 없음
 */

public class InheritanceCasting {
    public static void main(String[] args) {
        InheritanceCasting inheritance = new InheritanceCasting();
        // inheritance.objectCast();
        // inheritance.objectCast2();
        inheritance.objectCastArray();
    }

    public void objectCast() {
        ParentCasting parent = new ParentCasting();
        ChildCasting child = new ChildCasting();

        // 상위 타입에는 하위 인스턴스를 담을 수 있음
        ParentCasting parent2 = child;  // ChildCasting 인스턴스

        // 하위 타입에는 상위 인스턴스를 담을 수 없음
        //      하위 타입에 상위 인스턴스를 담아야 한다면 명시적으로 캐스팅해야 함 -> 컴파일 에러는 발생하지 않음
        //      하지만 런타임에서 캐스팅 예외가 발생함
        //      parent 변수는 사실 ParentCasting 인스턴스이기 때문에 하위 타입인 ChildCasting으로 캐스팅할 수 없기 때문
        // ChildCasting child2 = (ChildCasting) parent;
    }

    public void objectCast2() {
        ChildCasting child = new ChildCasting();
        ParentCasting parent = child;  // ChildCasting 인스턴스

        // objectCast() 메서드에서와 달리 런타임에서 캐스팅 예외가 발생하지 않음
        //      parent 변수는 사실 ChildCasting 인스턴스이기 때문에 parent를 ChildCasting으로 캐스팅해도 문제가 없기 때문
        ChildCasting child2 = (ChildCasting) parent;
    }

    public void objectCastArray() {
        // 상위 타입에 하위 인스턴스를 담을 수 있다는 것의 장점
        //      일반적으로 여러 개의 값을 처리하거나, 매개 변수로 값을 전달할 때는 상위 타입으로 하위 인스턴스를 담음
        //      그렇지 않으면 참조 자료형의 배열을 사용할 때 각 타입별로 구분해 메서드를 만들어야 함
        ParentCasting[] parentArray = new ParentCasting[3];
        parentArray[0] = new ChildCasting();
        parentArray[1] = new ParentCasting();
        parentArray[2] = new ChildCasting();
        objectTypeCheck(parentArray);
    }

    public void objectTypeCheck(ParentCasting[] parentArray) {
        // 상위 타입 배열의 원소 순회
        for (ParentCasting tempParent : parentArray) {

            /*
                객체가 정확히 어떤 타입인지 확인하는 방법 : instanceof 연산자 사용
                    - '객체 instanceof 타입' 형태로 사용함
                    - boolean 값 리턴
                        - true : 객체의 타입이 맞음
                        - false : 객체의 타입이 맞지 않음
             */
            if (tempParent instanceof ChildCasting) {
                System.out.println("ChildCasting");

                // ChildCasting 타입임을 확인하고 명시적으로 캐스팅하면 문제 없음
                //      ChildCasting 클래스에만 선언된 printAge() 메서드 호출 가능
                ChildCasting tempChild = (ChildCasting) tempParent;
                tempChild.printAge();

            } else if (tempParent instanceof ParentCasting) {
                System.out.println("ParentCasting");
            }
        }
    }

    public void objectTypeCheck2(ParentCasting[] parentArray) {
        for (ParentCasting temp : parentArray) {
            /*
                instanceof 사용 시 주의할 점
                    - 객체의 타입을 확인할 때 가장 하위 타입부터 점검해야 타입을 정확하게 점검할 수 있음
                    - 하위 객체의 타입은 상위 타입이 되기도 함, 상위 타입은 하위 객체(인스턴스)를 담을 수 있기 때문
                    - 객체의 타입을 상위 타입부터 점검하면 하위 객체의 타입이 상위 타입이 되기도 함
                    - 따라서 하위 객체의 타입이 정확하게 어떤 타입인지 확인할 수 없음
             */
            if (temp instanceof ParentCasting) {
                System.out.println("ParentCasting");
            } else if (temp instanceof ChildCasting) {
                System.out.println("ChildCasting");
            }
        }
    }
}
