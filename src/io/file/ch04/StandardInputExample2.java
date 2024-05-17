package io.file.ch04;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// 문자 기반 스트림 + 보조 문자 기반 스트림 확인
// 한줄 입력 하면 종료 됨
// 여러줄 반복저으로 동작할 수 있도록 기능을 추가해주세요
public class StandardInputExample2 {

	public static void main(String[] args) {

		// 문자 기반 스트림 + 보조 문자 기반 스트림을 사용한다. !!
		try (InputStreamReader isr = new InputStreamReader(System.in, "UTF-8");
				BufferedReader br = new BufferedReader(isr)) {
			boolean flag = true;
			while(flag) {
				// isr -> 한 문자씩 읽는 기능 read() 를 가짐
				// br -> 한번에 한 라인씩 읽은 수 있는 기능을 가짐
				System.out.println("여러 줄의 텍스트를 입력하세요");
				System.out.println("입력을 종료하려면 빈 줄에서 엔터를 누르세요");
				
				// isr.read(); --> 기능의 확장인
				String line = br.readLine();
				if (line.equals("")) {
					System.out.println("종료됩니다.");
					flag = false;
					break;
				}
				System.out.println("입력 확인 : " + line);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
