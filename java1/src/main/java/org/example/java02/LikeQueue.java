package org.example.java02;

public class LikeQueue {

	private final LikeList list = new LikeList();

	public void enqueue(int value) {
        list.insert(0, value);
	}
	// 삭제
	public void dequeue() {
		int size = list.getSize();
		list.delete(size - 1);
	}
	// 큐의 첫번쨰 값 조회
	public int peek() {
		return list.getCurrentData();
	}
	// 큐가 비었는지 확인
	public boolean isEmpty() {
		return list.getSize() == 0;
	}
}
