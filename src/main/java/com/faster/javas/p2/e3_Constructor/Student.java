package com.faster.javas.p2.e3_Constructor;

public class Student {
    public int studentNumber;
    public String studentName;
    public int grade;

    public String showStudentInfo() {
        return studentName + " 학생의 학번은 " + studentNumber + ", " + grade + "학년";
    }

    // 매개변수를 활용한 생성자
    public Student(int studentNumber, String studentName, int grade) {
        this.studentNumber = studentNumber;
        this.studentName = studentName;
        this.grade = grade;
    }

    // 매개변수를 활용한 생성자 작성 시 한 묶음으로 기본생성자도 같이 작성해준다
    public Student() {}
}

// 생성자(constructor) : 인스턴스 객체를 생성할 때만 사용하는 문법요소로, 기본적으로는 외부에서 접근 가능하나, private으로 선언할 수도 있다
//      (1) public "클래스이름(매개변수) {구현부}" 형식으로 주문하는 방법은 클래스 안에 직접 생성자를 쓸 때이다
//          -> 단, 이렇게 클래스 내부에 매개변수를 활용한 생성자를 작성할 경우, 기본생성자도 한 묶음으로 같이 작성해준다
//             (constructor-overloading)
//          -> 그래야 다른 클래스(또는 main 함수)를 통해 new 키워드를 활용한 인스턴스 생성하는데에 오류가 없어진다
//      (2) "new 클래스이름()" 형식으로 주문하는 방법은 다른 클래스 또는 main 함수를 통해 생성자를 쓸 때이다


// 기본생성자(default constructor) : 만약 생성자가 구현되지 않으면 컴파일러가 알아서 생성자 코드를 넣어주는데 이것을 기본생성자라고 한다
//      (ex) public 클래스이름() {} -> 매개변수와 구현부가 없음!


// 생성자로 인스턴스를 만들고 나면, 당연히 해당 인스턴스의 속성은 초기화가 되어 있으므로 따로 값을 넣어줘야 한다
