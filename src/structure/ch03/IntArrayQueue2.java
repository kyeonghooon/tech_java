package structure.ch03;

public class IntArrayQueue2 {

	private int[] array;
	private int front; // 큐의 시작점
	private int rear; // 큐의 끝 지점
	private int capacity; // 큐의 용량
	private int size; // 요소의 개수
	private final int ERROR_NUM = -9999;

	public IntArrayQueue2(int capacity) {
		this.capacity = capacity;
		array = new int[this.capacity];
		this.front = 0;
		this.rear = -1;
		this.size = 0;
	}

	// 편의 기능 만들어 보기
	public boolean isEmpty() {
		return size == 0;
	}

	public boolean isFull() {
		return size == capacity;
	}

	// todo - 1 데이터 넣기 기능 구현
	public void enqueue(int item) {
		// 코드 수정
		// [10][20][30]
		// 나머지 연산자를 활용 한다 (순환구조)
		// 1 = 1 % 5; 몫 0, 나머지 1
		// 2 = 2 % 5; 몫 0, 나머지 2
		rear = (rear + 1) % capacity;
		array[rear] = item;
		size++;
		if (size >= capacity) {
			size = capacity;
		}
	}
	// todo - 2 데이터 꺼내기
	public int dequeue() {
		if(isEmpty()) {
			System.out.println("Queue is Empty");
			return ERROR_NUM;
		}
		
		int item = array[front];
		// [10] [20] [30]
		front = (front + 1) % capacity;
		size--;
		return item;
	}


	public void printAll() {
		if (isEmpty()) {
			System.out.println("Queue is Empty");
			return;
		}

		for (int i = 0; i < size; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	// 코드 테스트
	public static void main(String[] args) {

		IntArrayQueue2 queue = new IntArrayQueue2(3);

		// 데이터 넣기
		queue.enqueue(100);
		queue.enqueue(200);
		queue.enqueue(300);
		queue.enqueue(400);
		queue.enqueue(500);
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		
		// queue.printAll();

	} // end of main
}
