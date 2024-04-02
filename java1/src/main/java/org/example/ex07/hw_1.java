package org.example.ex07;

// 1. 전위 증가 연산자랑 후위 증가 연산자와 같은 “연산자 함수” 를 작성하세요.
//
//     실제 전위, 후위 연산자랑 똑같은 결과가 나오도록 작성해주세요.
public class hw_1 {
	public static void main(String[] args) {
		int a = 0;
		myInteger b = new myInteger();

		System.out.println(a++);
		System.out.println(postIncrease(b));
		System.out.println("a: " + a + " b:" + b);
		System.out.println("-----");

		System.out.println(++a);
		System.out.println(preIncrease(b));
		System.out.println("a: " + a + " b:" + b);
		System.out.println("-----");

		System.out.println(a++ + a++);
		System.out.println(postIncrease(b) + postIncrease(b));
		System.out.println("a: " + a + " b:" + b);
		System.out.println("-----");

		System.out.println(++a + ++a);
		System.out.println(preIncrease(b) + preIncrease(b));
		System.out.println("a: " + a + " b:" + b);
		System.out.println("-----");
	}

	public static int preIncrease(myInteger b){
		return b.setNumPre();
	}

	public static int postIncrease(myInteger b){
		return b.setNumPost();
	}
}

class myInteger {
	private int num = 0;

	public int getNum() {
		return this.num;
	}

	public int setNumPre() {
		return ++this.num;
	}

	public int setNumPost() {
		return this.num++;
	}

	@Override
	public String toString() {
		return String.valueOf(this.num);
	}
}




