# Array 구현

## 0. 배열을 구성하는 속성
- "배열"이라는 껍데기(`int[]`)
- 항목들을 순차순회 하기 위한 기준(`count`)

## 1. 배열생성 메서드
```java
public class MyArray {
	int[] intArr;
	int count;
	public int ARRAY_SIZE;
	public static final int ERROR = -999999999;
	
	public setArray(int size) {
		count = 0;
		ARRAY_SIZE = size;
		intArr = new int[size];
	}
}
```

## 2. 항목추가 메서드
```java
public class MyArray {
	int[] intArr;
	int count;
	public int ARRAY_SIZE;
	public static final int ERROR = -999999999;
	
	public addElement(int el) {
		if(count >= ARRAY_SIZE) {
			System.out.println("Not Enough Memory");
			return;
		}
		intArr[count++] = el;
	}
}
```

## 3. 특정인덱스(position)에 항목삽입 메서드
```java
public class MyArray {
	int[] intArr;
	int count;
	public int ARRAY_SIZE;
	public static final int ERROR = -999999999;
	
	public insertElement(int position, int el) {
		if(position < 0 || position >= count) {
			System.out.println("Scope Error");
			return;
		}
		if(count >= ARRAY_SIZE) {
			System.out.println("Not Enough Memory");
			return;
		}
		int i;
		for(i = position; i > position - 1; i--) {
			intArr[i+1] = intArr[i];
		}
		intArr[position] = el;
		count++;
	}
}
```

## 4. 특정인덱스(position)의 항목제거 메서드
```java
public class MyArray {
	int[] intArr;
	int count;
	public int ARRAY_SIZE;
	public static final int ERROR = -999999999;
	
	public removeElement(int position) {
		int ret = ERROR;
		if(isEmpty()) {
			System.out.println("Array is empty");
			return;
		}
		if(position < 0 || position > count - 1) {
			return ret;
		}
		ret = intArr[position];
		for(int i = position; i < count - 1; i++) {
			intArr[i] = intArr[i+1];
		}
		count--;
		return ret;
	}
	
	public boolean isEmpty() {
		return true;
	}
	
	public int getSize() {
		return count;
	}
}
```