package io.file.ch02;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class MyBufferedOutputStream {

	public static void main(String[] args) {
		
		// 현재 시간을 측정 (시작)
		long start = System.nanoTime(); // (더 정밀한 현재 시간을 출력)
		
		String data = "기반 스트림 + 보조 스트림을 활용해보자";

		// try - catch - resource
		try (FileOutputStream fos = new FileOutputStream("output2.txt");
			BufferedOutputStream bos = new BufferedOutputStream(fos)) {
			// 코드 수행 부분
			byte[] bytes = data.getBytes();
			
			// 보조 스트림 (버퍼)
			bos.write(bytes);
			
			// 간혹 버퍼에 데이터가 남아 있다면 중복된 데이터를 쓸 수 있다.
			// 한번 사용한 다음에
			bos.flush(); // flush --> 물을 내리다
			
			
			System.out.println("보조 스트림을 활용한 파일 출력 완료");
			// 시간 측정을 해보고 싶다

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// 현재 시간을 측정 (종료)
		long end = System.nanoTime();
		// 종료 - 시작 -> 소요 시간
		long duration = end - start;
		System.out.println("소요 시간 : " + duration);
	}

}
