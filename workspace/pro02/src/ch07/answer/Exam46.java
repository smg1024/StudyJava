package ch07.answer;

/**
 * @Data : 2022. 9. 27
 * @Author : 강사
 * @Description : 상속 - 함수재정의(Overriding)
 */

class EParents{
	protected int x;
	protected int y;
	
	public EParents(){ }
	
	public EParents(int x, int y){
		this.x=x;
		this.y=y;
	}
	
	public void yonsan(){
		System.out.println("hap:" + (x+y));
	}
}

class ESon extends EParents{
	public ESon(){ }
	
	public ESon(int x, int y){
		super(x, y);
	}
	
	public void yonsan(){
		System.out.println("cha:" + (x-y));
	}
}

public class Exam46 {
	public static void main(String[] args) {
		EParents a=new EParents(20, 30);
		a.yonsan();
		
		ESon b=new ESon(10, 20);
		b.yonsan();
		
		EParents c=new ESon(20, 30);   // upCasting은 묵시적
		c.yonsan();
		
		// ESon d=(ESon) new EParents(55, 66); error
		ESon d=(ESon) c;   			      // downCasting은 명시적
		d.yonsan();
	}
}
