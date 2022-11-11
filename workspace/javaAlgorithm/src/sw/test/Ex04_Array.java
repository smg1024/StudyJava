package sw.test;

public class Ex04_Array {

	public static void main(String[] args) {
		int[] arr={10,20,30,40,50,60,70,80,90,100};
		// 홀수번째에 있는 데이터를 모두 출력하라.(1줄에 데이터의 구분은 공백문자로)
		
		for(int i=0; i<arr.length; i++) {
			if(i%2==0) {
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println();

		
		// 문자열 : Have a nice Day를 String 변수에 대입한 후
		//			yaD ecin a evaH 로 출력하라.
		
		String str="Have a nice Day";
		for(int i=str.length()-1; i>=0; i--) {
			System.out.print(str.charAt(i));
		}
		
		
//		String rev=null;
//		for(int i=str.length()-1; i>=0; i--) {
//			rev=rev+=str.charAt(i);
//		}
//		System.out.println(rev);
		
		
		
	}

}
