package ch10.Map;

import java.util.HashMap;
import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		HashMap<String, Object> map=new HashMap<String, Object>();
		map.put("id", "abc");	// 문자열과 정수 모두를 포함하는 Object로 upcasting
		map.put("pass", 1234);
		
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			System.out.print("아이디: ");
			String id=sc.next();
			
			System.out.print("비밀번호: ");
			int pass=sc.nextInt();
			
			String mapId=(String) map.get("id");		// 연산을 위해서 downcasting
			int mapPass=(Integer) map.get("pass");
			
			if(mapId.equals(id)) {
				if(mapPass==pass) {
					System.out.println("로그인 성공");
					break;
				}else {
					System.out.println("비밀번호를 확인하세요");
				}
			}else {
				System.out.println("아이디를 확인하세요");
			}
		}
		sc.close();
	}

}
