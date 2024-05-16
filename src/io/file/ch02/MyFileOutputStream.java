package io.file.ch02;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MyFileOutputStream {

	// 코드의 시작점
	public static void main(String[] args) {
		
		long start = System.nanoTime();
		
		// 데이터가 존재
		String data = "Hello, Java FileOUTputStream \n안녕반가워";

		// 1. 파일에다가 데이터를 저장 하고 싶다면 (바이트 기반)
		// 자바 8버전 부터 제공
		// try-catch-resource -> (자동으로 자원 닫아 준다)
		try (FileOutputStream fos = new FileOutputStream("output.txt", false)) {
			// 수행 코드
			// data(String) 가지고 있는 문자열들을 바이트 배열로 반환 처리
			
			// byte[] bytes = data.getBytes();
			
			byte[] bytes = {72, 101, 108, 108, 111};
			System.out.println("bytes : " + bytes);
			for (int i = 0; i < bytes.length; i++) {
				System.out.println("bytes[i] : " + bytes[i]);
			}
			
			// 연결된 스트림을 활용해서 바이트 배열을 파일에 흘려보냄
			fos.write(bytes);
			
			System.out.println("파일 출력 스트림을 통해서 데이터를 씀");
			
		} catch (FileNotFoundException e) {
			System.out.println("파일이 없음");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// 동작 이해해 보기
		// 파일에 바이트 단위로 데이터를 쓰고
		// 그 파일을 열었을 때 글자로 보이는 이유는 파일을 읽는 프로그램이
		// 파일내에 바이트 데이터를 문자로 해석해서 보여주었다.
		long end = System.nanoTime();
		long duration = end - start;
		System.out.println("기반 스트림 파일 입출력 소요 시간 : " + duration);

	}

}
