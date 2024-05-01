package useful.ch05;

public class MyThread2MainTest {

	// 메인 작업자
	public static void main(String[] args) {
		System.out.println("main start ");

		// 문제 MyThread2 를 메모리에 올리고
		// 그 안에 정의된 run() 메서드를 호출 하시오.
		// 힌트 --> Thread 문서를 반드시 확인하시오.

		Runnable myThread1 = new MyThread2();
		Runnable myThread2 = new MyThread2();
		// myThread1.run(); 일반 메서드 호출, 쓰레드 아님. 걍 이름만 run()인 메서드일뿐

		// 새로운 작업자를 생성해서 위임 시킬때는 Thread 안에 있는 start() 메서드를 호출해야 한다.
		Thread thread1 = new Thread(myThread1);
		Thread thread2 = new Thread(myThread2);
		thread1.start();
		thread2.start();
		System.out.println("main end ");
	}

}
