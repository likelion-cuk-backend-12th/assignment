package org.example.java02;

public class LikeTree {

	public Node root;

	public class Node {
		Integer data;
		Node parent;
		Node left;
		Node right;

		Node(int data) {
			this.data = data;
			parent = null;
			left = null;
			right = null;
		}
	}

	// 삽입 메서드
	public void insert(int data) {
		Node current = this.root;
		Node insertNode = new Node(data);

		if (current == null) {
			this.root = insertNode;
			return;
		}

		while(true) {
			if (current.data <= data) {
				if (current.right == null) {
					current.right = insertNode;
					insertNode.parent = current;
					break;
				}

				current = current.right;
			} else if (current.data > data) {
				if (current.left == null) {
					current.left = insertNode;
					insertNode.parent = current;
					break;
				}

				current = current.left;
			}
		}
	}

	public Node find(int value) {
		Node current = this.root;
		while(true) {
			if (current.data == value) {
				break;

			} else if (current.data < value) {
				if (current.right != null) {
					current = current.right;
					continue;
				}
				break;

			} else if (current.data > value) {
				if (current.left != null) {
					current = current.left;
					continue;
				}
				break;

			}
		}
		return current;
	}


	// 삭제 메서드
	public void delete(Integer data) {

		Node deleteNode = find(data);

		if (deleteNode.left == null && deleteNode.right == null) {
			if (deleteNode.parent.left.data == data) deleteNode.parent.left = null;

			else deleteNode.parent.right = null;

			deleteNode.parent = null;

		} else if (deleteNode.left != null && deleteNode.right != null) {
			Node leftNode = findMinNode(deleteNode.left);
			Integer save = leftNode.data;

			delete(save);

			deleteNode.data = save;

		} else if (deleteNode.right != null) {
			Node rightNode = findMinNode(deleteNode.right);

			rightNode.parent = deleteNode.parent;
			deleteNode.parent.right = rightNode;
			deleteNode.right = null;
			deleteNode.parent = null;

		} else if (deleteNode.left != null) {
			Node leftNode = findMaxNode(deleteNode.left);

			leftNode.parent = deleteNode.parent;
			deleteNode.parent.left = leftNode;
			deleteNode.left = null;
			deleteNode.parent = null;
		}

	}

	private Node findMaxNode(Node node) {
		if (node.right == null)
			return node;
		else
			return findMaxNode(node.right);
	}

	private Node findMinNode(Node node) {
		if (node.left == null)
			return node;
		else
			return findMinNode(node.left);
	}

	// 전체 노드 출력 메서드
	public void print(Node node) {
		if (node == null) {
			return;
		}
		print(node.left);
		System.out.println(node.data);
		print(node.right);

	}
}
