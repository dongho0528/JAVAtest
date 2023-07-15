import java.util.Scanner;

public class Calculate {
	
	int firstNum = 0;
	int secondNum = 0;
	int selectedOperator = 0;
	int result = 0;
	
	public Calculate() {
		 
		Scanner scanner = new Scanner(System.in);
		System.out.println("첫 번째 정수 입력 : ");
		int firstNum = scanner.nextInt();
			
		System.out.println("두 번째 정수 입력 : ");
		int secondNum = scanner.nextInt();
			
		System.out.println("연산자 선택 1)덧셈 2)뺄셈 3)곱셈 4)나눗셈");
		int selectedOperator = scanner.nextInt();
		
		if (selectedOperator == 1) {
			result = firstNum + secondNum;
		}
		if (selectedOperator == 2) {
			result = firstNum - secondNum;
		}
		if (selectedOperator == 3) {
			result = firstNum * secondNum;
		}
		if (selectedOperator == 4) {
			result = firstNum / secondNum;
		}
		System.out.println("result : "+ result);
		 
	}
	

}
