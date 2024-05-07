package structure.ch03;

public class IntArrayQueue {
	
	private int[] array;
	private int front; // 큐의 시작점
	private int rear; // 큐의 끝 지점
	private int capacity; // 큐의 용량
	private int size; // 요소의 개수
	private final int ERROR_NUM = -9999;
	
	public IntArrayQueue(int capacity) {
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
		if (isFull()) {
			System.out.println("큐 메모리 공간이 가득");
		} else {
			// rear : -1 시작
			array[++rear] = item;
			size++;
		}
	}
	
	// todo - 2 데이터 꺼내기
	public int dequeue() {
		int item = ERROR_NUM;
		if(isEmpty()) { 
			System.out.println("큐 메모리 공간에 요소가 없음");
		} else {
			// 잠시 데이터 꺼내보기
			item = array[front]; // 0번째 요소에 접근
			for(int i = front; i < rear; i++) {
				array[i] = array[i+1];
			}
			// 마지막 요소를 초기화 처리한다
			array[rear--] = 0;
			size--;
		}
		return item;
	}
	
	// todo - 3 데이터 찾기 (peek)
	public int peek() {
		if (isEmpty()) {
			System.out.println("큐 메모리 공간에 요소가 없음");
			return ERROR_NUM;
		} else {
			return array[front];
		}
	}
	
	// 코드 테스트
	public static void main(String[] args) {
		
		IntArrayQueue queue = new IntArrayQueue(3);
		
		// 데이터 넣기
		queue.enqueue(100);
		queue.enqueue(200);
		queue.enqueue(300);
		queue.enqueue(400); // 안들어감
		
		// 데이터 꺼내고 삭제 처리
		// queue.dequeue(); // 맨 처음 들어온 녀석부터 꺼내지고 삭제처리 된다.
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		queue.enqueue(100);
		queue.enqueue(200);
		queue.enqueue(300);
		System.out.println(queue.peek());
		System.out.println(queue.peek());
		
		
	} // end of main
}
