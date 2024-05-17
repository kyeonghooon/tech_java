package io.file.ch03;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedFileCopy {

	public static void main(String[] args) {
		// (바이트 기반 스트림을 활용)
		// 기반 스트림 + 보조 스트림을 활용해서 파일 복사 기능을 만들고
		// 소요 시간을 측정하시오

		// 파일 경로 (복사할 대상)
		String sourceFilePath = "C:/Users/KDP/Downloads/a.zip";
		// 목적지 파일
		String destinationFilePath = "cop1.zip";

		// 소요시간 확인
		long startTime = System.nanoTime();

		try (FileInputStream fis = new FileInputStream(sourceFilePath);
				FileOutputStream fos = new FileOutputStream(destinationFilePath);
				BufferedInputStream bis = new BufferedInputStream(fis);
				BufferedOutputStream bos = new BufferedOutputStream(fos)) {
			int data;
			while ((data = bis.read()) != -1) {
				// 파일의 출력
				bos.write(data);
			}
			bos.flush(); // 매번 입출력을 발생하는 것이 아니라 한번에 입출력을 사용
			System.out.println("입력 스트림 --> 출력스트림 --> 입력 --> 출력의 반복 완료");
		} catch (Exception e) {
			e.printStackTrace(); // 파일 저장 가능 가능
		}
		long endTime = System.nanoTime();
		long duration = endTime - startTime;
		double seconds = duration / 1_000_000_000.0;
		String resultFormat = String.format("소요 시간은 : %.6f초 입니다.", seconds);
		// % 는 포맷 지정자의 시작
		// f 지정자는 float, double 유형의 변수를 인자로 받아 처리하겠다.
		System.out.println(resultFormat);

	}

}
