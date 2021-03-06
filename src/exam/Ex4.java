package exam;

import java.util.Arrays;

public class Ex4 {

	public static void main(String[] args) {
		
		/*[4-1] 다음의 문장들을 조건식으로 표현하라.
		1. int형 변수 x가 10보다 크고 20보다 작을 때 true인 조건식
		2. char형 변수 ch가 공백이나 탭이 아닐 때 true인 조건식
		3. char형 변수 ch가 ‘x' 또는 ’X'일 때 true인 조건식
		4. char형 변수 ch가 숫자(‘0’~‘9’)일 때 true인 조건식
		5. char형 변수 ch가 영문자(대문자 또는 소문자)일 때 true인 조건식
		6. int형 변수 year가 400으로 나눠떨어지거나 또는 4로 나눠떨어지고 100으로 나눠떨어지지
		않을 때 true인 조건식
		7. boolean형 변수 powerOn가 false일 때 true인 조건식
		8. 문자열 참조변수 str이 “yes”일 때 true인 조건식*/
		
		/*int x1 = 15;
        char ch2 = 'a';
        char ch3 = 'X';
        char ch4 = '9';
        char ch5 = 'A';
        int year6 = 800;
        boolean powerOn7 = false;
        String str = "yes";
        
        boolean[] Test = new boolean[9];
        
        Test[1] = (x1>10 && x1<20);
        Test[2] = (ch2 !=' ' && ch2 !='\t');
        Test[3] = (ch3 == 'x' || ch3 == 'X');
        Test[4] = (ch4 >='0' || ch4 <= '9');
        Test[5] = (ch5>='a' && ch5<='z' || ch5>='A' && ch5<='Z');
        Test[6] = (year6 % 400 == 0 || year6 % 4 == 0 && year6 %100 != 0);
        Test[7] = (powerOn7 == false);
        Test[8] = (str.equals("yes"));
        
        
        for (int i = 1; i<=8; i++){
            System.out.println( i + " : " + Test[i]);
        }*/
		
		//[4-2] 1부터 20까지의 정수 중에서 2 또는 3의 배수가 아닌 수의 총합을 구하시오.
		
		/*int sum = 0;
		
		for(int i = 1; i <= 20; i++){
			if(i%2 != 0 || i%3 !=0 ){
				sum += i;
			}
		}
		System.out.println(sum);*/
		
		//[4-3] 1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10)의 결과를 계산하시오.
		
		/*int sum = 0;
		
		for(int i = 1; i <= 10; i++){
			for(int j = 1; j <= i; j++){
				sum += j;
			}	
		}
		System.out.println(sum);*/
		
		//[4-4] 1+(-2)+3+(-4)+... 과 같은 식으로 계속 더해나갔을 때, 몇까지 더해야 총합이 
		//100이상이 되는지 구하시오.
		
		/*int i = 0;
		int sum = 0;
		
		
		while(sum < 100){
			i++;
			if(i%2 == 0){
				sum -= i;
			}else{
				sum += i;
			}	
		}
		System.out.println("i = " + i + " sum = " + sum);*/
		
		//[4-5] 다음의 for문을 while문으로 변경하시오.
		
		/*연습문제]/ch4/Exercise4_5.java
				public class Exercise4_5 {
					public static void main(String[] args) {
						for(int i=0; i<=10; i++) {
								for(int j=0; j<=i; j++){
									System.out.print("*");
								}	
							System.out.println();
						}
					} // end of main
				} // end of class*/		
		
		/*int i = 0;
		
		while((i++) != 11){
			int j = i;
			while((j--) != 0){
				System.out.print("*");
			}
			System.out.println();
		}*/
		
		//[4-6] 두 개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수를 출력하는 프
		//로그램을 작성하시오.
				
		/*for(int x = 1; x <= 6; x++){
			for(int y = 1; y <= 6; y++){
				if(x + y == 6){
					System.out.printf("(%d, %d) = 6%n", x, y);
				}
			}
		}*/
		
		//[4-7] Math.random()을 이용해서 1부터 6사이의 임의의 정수를 변수 value에 저장하는
		//코드를 완성하라. (1)에 알맞은 코드를 넣으시오.
		
			/*[연습문제]/ch4/Exercise4_7.java
				class Exercise4_7 {
					public static void main(String[] args) {
						int value = (  (1)  );
						System.out.println("value:"+value);
					}
				}*/
		
				/*int value = (int)(Math.random()*6)+1;
				System.out.println("value = " + value);*/
		
		//[4-8] 방정식 2x+4y=10의 모든 해를 구하시오.
		//		단, x와 y는 정수이고 각각의 범위는 0<=x<=10, 0<=y<=10 이다.
		//		[실행결과]
		//		x=1, y=2
		//		x=3, y=1
		//		x=5, y=0
		
		/*int x=0, y=0;
		for(x=0; x<=10; x++){
			for(y=0; y<=10; y++){
				if(2*x + 4*y==10){
					System.out.printf("x=%d, y=%d%n", x, y);
				}
			}
		}*/
		
		
		//[4-9] 숫자로 이루어진 문자열 str이 있을 때, 각 자리의 합을 더한 결과를 출력하는 코
		//드를 완성하라. 만일 문자열이 "12345"라면, ‘1+2+3+4+5’의 결과인 15를 출력이 출력되
		//어야 한다. (1)에 알맞은 코드를 넣으시오.
		
		//[Hint] String클래스의 charAt(int i)을 사용
		
		//[연습문제]/ch4/Exercise4_9.java
		/*class Exercise4_9 {
			public static void main(String[] args) {
				String str = "12345";
					int sum = 0;
					for(int i=0; i < str.length(); i++) {
			
						(1) 알맞은 코드를 넣어 완성하시오.
			
					}
					System.out.println("sum="+sum);
				}
			}
			*/	// [실행결과] 15
		
		/*String str = "12345";
			int sum = 0;
			for(int i=0; i<str.length(); i++){
				sum = sum+ Integer.parseInt(str.charAt(i)+"");	
			}
			System.out.println(sum);*/
		
		
		
		
		
		
		
		
		
		
	}

}
