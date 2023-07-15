package com.jinjeop.calculator;

import java.util.Scanner;

import com.jinjeop.calculator.newcal.AddCal;
import com.jinjeop.calculator.newcal.DivCal;
import com.jinjeop.calculator.newcal.MulCal;
import com.jinjeop.calculator.newcal.NewCalculator;
import com.jinjeop.calculator.newcal.RemCal;
import com.jinjeop.calculator.newcal.SubCal;

public class MainClass {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("첫 번재 정수 입력 : ");
		int firstNum = scanner.nextInt();
		
		System.out.println("두 번재 정수 입력 : ");
		int SecondNum = scanner.nextInt();
		
		System.out.println("연산자 선택 : 1) ADD 2) SUB 3) MUL 4) DIV 5) REM");
		int selectedOperation = scanner.nextInt();
		
		NewCalculator newCalculator = new NewCalculator();
		
		if (selectedOperation == 1) {
		//	newCalculator.add(firstNum, SecondNum);
			newCalculator.calculate(firstNum, SecondNum, new AddCal());
		}
		else if (selectedOperation == 2) {
		//	newCalculator.sub(firstNum, SecondNum);
			newCalculator.calculate(firstNum, SecondNum, new SubCal());
		}
		else if (selectedOperation == 3) {
		//	newCalculator.mul(firstNum, SecondNum);
			newCalculator.calculate(firstNum, SecondNum, new MulCal());
		}
		else if (selectedOperation == 4) {
		//	newCalculator.div(firstNum, SecondNum);
			newCalculator.calculate(firstNum, SecondNum, new DivCal());
		}
		else if (selectedOperation == 5) {
		//	newCalculator.div(firstNum, SecondNum);
			newCalculator.calculate(firstNum, SecondNum, new RemCal());
		}
	}

}
