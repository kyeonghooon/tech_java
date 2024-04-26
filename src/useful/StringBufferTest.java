package useful;

public class StringBufferTest {

	// 코드의 시작점 - (메인 작업자)
	public static void main(String[] args) {
		
		String str1 = new String("Hello");
		System.out.println(str1);
		System.out.println(System.identityHashCode(str1)); // 원시 주소 값
		String str2 = new String("World");
		str1 = str1 + str2;
		System.out.println(str1);
		System.out.println(System.identityHashCode(str1)); // 원시 주소 값
		
		StringBuffer bufferStr = new StringBuffer("Hello");
		System.out.println(bufferStr);
		// 1.
		System.out.println(System.identityHashCode(bufferStr)); // 원시 주소 값
		
		bufferStr.append(str2);
		System.out.println(bufferStr);
		// 2.
		System.out.println(System.identityHashCode(bufferStr)); // 원시 주소 값
		
		// 1번 결과와 2번 결과에 주소값이 같다라는 의미는
		// 새로운 메모리를 할당 한 것이 아닌 변경한 것이다.
		
		// 활용
		String newStr = bufferStr.toString(); // toString 호출시 타입 -> String
		System.out.println(newStr);
	}

}
