package org.example.java02;

public class Main {
	public static void main(String[] args) {
		LikeTree likeTree = new LikeTree();

		likeTree.insert(10);

		// likeTree.print(likeTree.root);

		likeTree.insert(6);
		likeTree.insert(13);
		// likeTree.print(likeTree.root);

		likeTree.insert(11);
		likeTree.insert(17);
		likeTree.insert(7);
		likeTree.insert(3);
		likeTree.insert(18);
		likeTree.insert(8);
		likeTree.insert(12);


		likeTree.delete(12);

		likeTree.print(likeTree.root);


	}

}
