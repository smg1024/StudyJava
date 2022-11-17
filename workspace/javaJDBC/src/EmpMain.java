import java.util.Scanner;

import javaJDBC.DeleteTest;
import javaJDBC.InsertTest;
import javaJDBC.SelectTest;
import javaJDBC.UpdateTest;

public class EmpMain {
	Scanner sc = new Scanner(System.in);
	
	public EmpMain() {
		start();
	}
	
	public void start() {
		// 메뉴
		while(true) {
		System.out.print("[1]사원목록  [2]사원등록  [3]사원수정  [4]사원삭제  [5]종료 --> ");
		String menu = sc.nextLine();
		
			switch(menu) {
			case "1":
				// [1]사원목록
				SelectTest st = new SelectTest();
				st.empList();
				break;
			case "2":
				// [2]사원등록
				InsertTest it = new InsertTest();
				it.empInsert();
				break;
			case "3":
				// [3]사원수정
				UpdateTest ut = new UpdateTest();
				ut.empEdit();
				break;
			case "4":
				// [4]사원삭제
				DeleteTest dt = new DeleteTest();
				dt.empRemove();
				break;
			case "5":
				// [5]종료
				System.out.println("프로그램이 종료되었습니다.");
				System.exit(0);
				break;
			default :
				System.out.println("메뉴를 잘못 입력하였습니다.");
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		new EmpMain();

	}

}
