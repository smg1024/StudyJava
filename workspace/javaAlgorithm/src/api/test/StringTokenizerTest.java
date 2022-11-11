package api.test;

import java.util.Arrays;
import java.util.StringTokenizer;

public class StringTokenizerTest {

	public static void main(String[] args) {
		String tel="0,10-97,01----,5637";
		
		// split() : 구분문자가 연속될 시 새로운 문자열로 반영, 하나의 구분문자만 식별가능
		String[] phone=tel.split("-,");
		System.out.println("split->" + Arrays.toString(phone));
				
		// StringTokenizer : 구분문자가 연속되면 하나로 계산, 여러개의 구분문자를 식별할 수 있음
		StringTokenizer st=new StringTokenizer(tel, "-,");
		System.out.println("토큰 수->" + st.countTokens());
		
		// hasMoreElements(), hasMoreToken() : 토큰이 있으면 true, 없으면 false
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
	}

}
