package com.atul.multitreading;
class Demo extends Thread{

	@Override
	public void run() {
		String number = "123456789111213141516";

		for(int i=0;i<number.length();i++) {
			System.out.print(number.charAt(i));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	

}
public class Mainapp {

	public static void main(String[] args) {
		Demo d1 = new Demo();
		d1.start();
		String alphabet = "abcdefghijklmnopqrstuvwxyz";

		for(int i=0;i<alphabet.length();i++) {
			System.out.print(alphabet.charAt(i));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

}
