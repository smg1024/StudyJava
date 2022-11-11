package control_examples;

/**
 * @Data : 2022. 9. 24
 * @Author : 강사
 * @Description :  함수중복 (Function Overload/Overloading)
 * 						 
 */

public class Exam29 {
	public static void main(String[] ar){     
		int a=10;
		int b=20;
		int c=yonsan(a, b);
		
		float x=30.4f;
		float y=57.4f;
		float z=yonsan(x, y);
		System.out.println("c:" + c + "\t" + "z:" + z);
	}
	
	public static int yonsan(int a, int b){
		return a+b;
	}
	
	public static float yonsan(float x, float y){
		return x+y;
	}
}
