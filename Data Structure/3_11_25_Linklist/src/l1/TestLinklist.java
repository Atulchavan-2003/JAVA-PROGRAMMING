package l1;

public class TestLinklist {
	public static void main(String[] args) {
		MyLInkedList  m1 = new MyLInkedList ();
		
//		m1.addLast(10);
//		m1.addLast(20);
//		m1.addLast(30);
//		m1.addFirst(5);
//		
		int posi = 100;
		
		m1.position(2,posi);
		m1.display();
		m1.rivDisplay();
	}
}
