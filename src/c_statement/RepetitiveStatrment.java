package c_statement;

import java.util.*;

public class RepetitiveStatrment {

	public static void main(String[] args) {
		/*
		 * 1. 반복문
		 * - for, while, do-while
		 * - 규칙적으로 반복되는 작업을 할때 사용한다.
		 * - 조건식이 만족하는 동안 계속 반복된다.
		 * 
		 * 2. for문 
		 * - 반복횟수를 알 수 있을때 사용한다.
		 * - 조건식이 세부분으로 나뉘어 있다.(초기화; 조건식; 증감식;)
		 * - 1. 변수를 초기화 한다.
		 * - 2. 조건식을 주행해서 값을 얻는다.
		 * - 3. 조건식의 값이 true이면 {}블럭안의 문장을 수행한다.
		 * - 4. 증감식을 수행한다.
		 * - 5. 조건식을 수행해서 값을 얻는다.
		 * - 6. 조건식의 값이 false이면 for문을 벗어난다.
		 * 
		 * 3. while문
		 * - 반복횟수를 알 수 없을 때 사용한다.
		 * - 조건식이 있어야 한다.
		 * - 조건식의 값이 true이면 {}안의 문장을 수행하고 false이면 while문을 벗어난다.
		 * 
		 * 4. do-while문
		 * - while문의 변형이다.(while문과 동일한 특징을 가진다.)
		 * - while문과는 조건식과 {}의 순서가 다르다.
		 * - 최소 1번의 수행이 보장된다.
		 * 
		 * 5. break와 continue
		 * - 반복문 안에서 특정조건에 반복문을 탈출하기 위해 사용한다.
		 * - 자신이 속한 가장 가까운 반복문 하나만 탈출한다.
		 * - break는 반복문을 완전히 탈충한다.
		 * - continue는 현재 수행하고 있는 반복회차만 탈출한다. 
		 */
		
		for(int i = 0; i < 10; i++){	// 1 2 3 4 5 6 7 8 9
			System.out.println(i);
		}
		
		int total = 0;	// 5050 1부터 100까지의 수를 더한 값을 출력
		for(int i = 1; i <= 100; i++){
//			total = total +i;
			total += i;	// 위에 줄여서 쓴거
		}
		System.out.println(total);
		
		for(int i = 100; i >= 1; i--){
			total -=i;
		}
		System.out.println(total);
		
	
		for(int j=2; j <=10; j++){
			System.out.println("2 * " + j + " = " + 2*j);
		}
		
		
		
		
		
		
	}

}
