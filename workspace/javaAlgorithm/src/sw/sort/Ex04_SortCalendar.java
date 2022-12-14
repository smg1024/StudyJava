package sw.sort;

import java.util.Arrays;
import java.util.GregorianCalendar;
import static java.util.GregorianCalendar.*;

public class Ex04_SortCalendar {

	public static void main(String[] args) {
		GregorianCalendar[] x = {new GregorianCalendar(2022, 11, 10),
				new GregorianCalendar(1998, 10, 24), new GregorianCalendar(1972, 1, 15), 
				new GregorianCalendar(1950, 6, 25), new GregorianCalendar(1968, 6, 24), 
				new GregorianCalendar(1995, 11, 06)};
		
		Arrays.sort(x);	// Object x
		for(int i=0; i<x.length; i++) {
			System.out.printf("%4d년 %2d월 %2d일\n", x[i].get(YEAR), x[i].get(MONTH), x[i].get(DAY_OF_MONTH));
		}
	}
}
