package com.faster.javas.p2.e2_Stack_Method_Instance_Heap;

public class StudentTest {
    public static void main(String[] args) {
        // 생성자(new 키워드)를 통해 인스턴스 생성한다
        // 이때 "studentLee"와 "studentKim"은 Student 클래스의 인스턴스이자,
        // StudentTest 클래스의 참조변수이다
        // main 함수에 포함되므로 일단은 "studentLee"와 "studentKim"은 스택에 저장되지만,
        // 인스턴스이므로 JVM은 이 둘을 힙 공간의 어느 메모리 주소를 할당해준다(그래서 힙을 참조한다고 해서 "참조" 변수)
        Student studentLee = new Student();
        Student studentKim = new Student();

        // 인스턴스는 클래스에서 선언한 속성들과 메서드에 얼마든지 접근할 수 있다
        // 즉, "studentLee"와 "studentKim"은 그것의 속성(ID, Name, address...)들을
        // 언제든지 호출하고 새로운 값을 저장할 수 있도록, 속성들에 대한 메모리 공간이 힙에 예비된다
        studentLee.studentID = 12345;
        studentLee.setStudentName("Lee");
        studentLee.address = "서울 강남구";
        studentLee.showStudentInfo();

        studentKim.studentID = 54321;
        studentKim.setStudentName("Kim");
        studentKim.address = "서울 양천구";
        studentKim.showStudentInfo();

        // 각 인스턴스들은 서로 다른 메모리 주소값을 갖는다
        System.out.println(studentLee);
        System.out.println(studentKim);
    }
}

// 클래스(Class) : 객체의 속성(=멤버변수)을 프로그래밍 코드로 정의(만) 해놓은 것
// 메서드(method) : 클래스의 멤버변수(=속성)을 활용하여 클래스의 기능을 구현한 함수
// 인스턴스(instance) : new 키워드를 통해 클래스를 힙에 생성해놓은 것(=참조변수) -> 서로 다른 멤버변수 값을 갖는 객체
// 참조값 : 생성된 인스턴스의 힙 주소값


// 힙(Heap) : 동적 메모리(필요할 때 할당받고, 필요가 없어지면 다시 회수)를 의미하며, 생성된 인스턴스가 바로 이 힙에 할당된다
//            -> 하나의 클래스에서 생성된 여러 인스턴스는 각각 다른 메모리 주소(JVM이 부여한 가상 주소임)를 갖는다
//      (1) C나 C++에서는 사용한 동적 메모리를 free() 또는 delete를 활용하여 개발자가 직접 해제해야 함
//      (2) Java에서는 GC(Garbage Collector)가 주기적으로 구동되면서, 사용하지 않는 동적 메모리들을 해제 및 수거