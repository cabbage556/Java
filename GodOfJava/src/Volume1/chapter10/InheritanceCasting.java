package Volume1.chapter10;

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

        // 부모 타입은 자식 인스턴스를 품을 수 있음
        ParentCasting parent2 = child;

        // 자식 타입은 부모 인스턴스를 품을 수 없음
        //      만약 자식 타입이 부모 인스턴스를 품어야 한다면 형 변환을 명시적으로 선언해야 함 -> 컴파일 에러는 발생하지 않음
        //      하지만 실제 실행 시간에 형 변환 시 런타임 에러가 발생함
        //      parent 변수는 ParentCasting 클래스의 인스턴스이기 때문에 ChildCasting 타입으로 형 변환하지 못하기 때문
        // ChildCasting child2 = (ChildCasting) parent;
    }

    public void objectCast2() {
        ChildCasting child = new ChildCasting();
        ParentCasting parent = child;

        // objectCast() 메서드에서와 달리 런타임 에러가 발생하지 않음
        //      parent 변수는 사실 ChildCasting 클래스의 인스턴스이기 때문에 parent를 ChildCasting으로 형 변환해도 문제가 발생하지 않음
        ChildCasting child2 = (ChildCasting) parent;
    }

    public void objectCastArray() {
        // 부모 타입으로 자식 인스턴스를 담는 이유
        //      일반적으로 여러 개의 값을 처리하거나, 매개 변수로 값을 전달할 때는 부모 타입으로 자식 인스턴스를 담음
        //      그렇지 않으면 참조 자료형의 배열을 사용할 때 각 타입별로 구분해 메서드를 만들어야 하는 문제가 생길 수 있음
        ParentCasting[] parentArray = new ParentCasting[3];
        parentArray[0] = new ChildCasting();
        parentArray[1] = new ParentCasting();
        parentArray[2] = new ChildCasting();
        objectTypeCheck(parentArray);
    }

    public void objectTypeCheck(ParentCasting[] parentArray) {
        for (ParentCasting tempParent : parentArray) {
            // 부모 타입 배열의 원소가 정확히 어떤 타입인지 확인하는 방법: instanceof 연산자 사용
            //      '객체 instanceof 타입' 형태로 사용함
            //      boolean 타입의 값을 리턴함
            // instanceof로 객체의 타입을 확인할 때 가장 하위 자식 타입부터 점검해야 정확하게 타입 점검이 가능함
            if (tempParent instanceof ChildCasting) {
                System.out.println("ChildCasting");

                // ChildCasting 타입임을 확인하고 명시적으로 형변환하면 문제가 없음
                //      ChildCasting 클래스에만 선언된 printAge() 메서드 호출 가능
                ChildCasting tempChild = (ChildCasting) tempParent;
                tempChild.printAge();

            } else if (tempParent instanceof ParentCasting) {
                System.out.println("ParentCasting");
            }
        }
    }
}
