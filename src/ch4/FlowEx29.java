package ch4;

public class FlowEx29 {

	public static void main(String[] args) {
		
		//do-while문 3.6.9 게임 
		
		for(int i = 1; i <= 100; i++){
			System.out.printf("%d", i);
			
			int tmp = i;
			
			do{
				if(tmp %10 %3 == 0 && tmp % 10 != 0){
					System.out.print(" 짝!");
				}
			}while((tmp/= 10) != 0);
			
			System.out.println();
		}
		

	}

}
