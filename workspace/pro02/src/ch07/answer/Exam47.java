package ch07.answer;

/**
 * @Data : 2022. 9. 27
 * @Author : 강사
 * @Description : 상속 - 하나의 객체로 배열관리
 */

class FParents{
	public void disp(){
		System.out.println("ParentsF CLASS");
	}
}

class FSon extends FParents{
	public void disp(){
		System.out.println("SonF CLASS");
	}
}

class GSon extends FParents{
	public void disp(){
		System.out.println("SonG CLASS");
	}
}

public class Exam47 {
	public static void main(String[] args) {
		FParents[] array=new FParents[3];
		array[0]=new FParents();
		array[1]=new FSon();
		array[2]=new GSon();
		
		for(int i=0;i<array.length;i++){
			array[i].disp();
		}
	}
}
