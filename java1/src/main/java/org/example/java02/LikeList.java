package org.example.java02;

public class LikeList {

	private Node head;
	private int size = 0;

	private class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			next = null;
		}

		public int getData() {
			return this.data;
		}
	}

	// 삽입 메서드, index 위치에 노드 추가
	public void insert(int index, int data) {
		Node current = this.head;
		for (int i = 0; i < index; i++) {
			current = current.next;
		}
		Node temp = current.next.next;
		current.next = new Node(data);
		current.next.next = temp;
		this.size += 1;
	}

	// 삭제 메서드, index 위치에 노드 삭제
	public void delete(int index) {
		Node current = this.head;
		for (int i = 0; i < index; i++) {
			current = current.next;
		}
		current.next = current.next.next;
		this.size -= 1;
	}

	// 전체 노드 출력 메서드
	public void print() {
		Node current = this.head;
		while (current.next != null) {
			System.out.println(current.data);
			current = current.next;
		}
	}

	public int getCurrentData() {
		return head.getData();
	}

	public Node getHead() {
		return head;
	}

	public int getSize() {
		return size;
	}
}
