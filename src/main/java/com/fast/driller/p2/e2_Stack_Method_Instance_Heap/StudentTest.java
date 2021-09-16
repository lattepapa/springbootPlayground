package com.fast.driller.p2.e2_Stack_Method_Instance_Heap;

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
