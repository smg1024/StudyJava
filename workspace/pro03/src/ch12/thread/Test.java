package ch12.thread;

class AA{
	public void apple() {}
	public void banana() {}
}

public class Test {

	public static void main(String[] args) {
		// 메모리 공간 - constant heap stack register(참고)
		
		int[] a=new int[] {10, 20, 30, 40, 50};
		int[] b=a;
		int[] c=a;
		
		for(int i=0; i<c.length; i++) {
			System.out.println(c[i]);
		}
		
		b[0]=77;
		System.out.println(b[0]);
		System.out.println(a[0]);
		System.out.println(c[0]);
		
		b=null;
		c=null;
		a=null;
		
//		AA x=new AA();
//		AA y=new AA();
//		AA z=x;
	}
	
	public static void sub(AA su) {
		
	}

}
