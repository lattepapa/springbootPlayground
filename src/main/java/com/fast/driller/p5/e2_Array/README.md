# Array 구현

## 0. 배열을 구성하는 속성
- "배열"이라는 껍데기(`int[]`)
- 항목들을 순차순회 하기 위한 기준(`count`)

## 1. 배열생성 메서드
```java
public class MyArray {
	public int[] intArr;
	public int count;
	public int ARRAY_SIZE;
	public static final int ERROR = -999999999;
	
	public MyArray() {
		count = 0;
		ARRAY_SIZE = 10;
		intArr = new int[ARRAY_SIZE];
	}
	
	public MyArray(int size) {
		count = 0;
		ARRAY_SIZE = size;
		intArr = new int[ARRAY_SIZE];
	}
}
```

## 2. 항목추가 메서드
```java
public void addElement(int el) {
	if(count > ARRAY_SIZE) {
		System.out.println("Memory Overhead);
	}
	intArr[count++] = el;
}
```

## 3. 특정인덱스에 항목삽입 메서드
```java
public void insertElement(int index, int el) {
	if(index < 0 || index > count) {
		return;
	}
	for(int i = count - 1; i >= index; i--) {
		intArr[i+1] = intArr[i];
	}
	count++;
	intArr[index] = el;
}
```

## 4. 특정인덱스의 항목제거 메서드
```java
public int removeElement(int index) {
	if(index < 0 || index >= count) {
		return ERROR;
	}
	int result = intArr[index];
	for(int i = index; i < count - 1; i++) {
		intArr[i] = intArr[i+1];
	}
	count--;
	return result;
}
```

## 5. 특정인덱스의 항목조회 메서드
```java
public int getElement(int index) {
	if(index < 0 || index >= count) {
		return ERROR;
	}
	return intArr[index];
}
```

## 6. 배열 크기 확인 메서드
```java
public int getSize() {
	return count;
}
```

## 7. 배열 순회 메서드
```java
public void traverse() {
	for(int i = 0; i < count; i++) {
		System.out.println(intArr[i]);
	}
}
```
