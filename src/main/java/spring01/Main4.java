package spring01;

import java.util.Scanner;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Main4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		GenericXmlApplicationContext ctx = 
			new GenericXmlApplicationContext(
					"classpath:applicationContext3.xml");
		Calculator cal = ctx.getBean("calc" , Calculator.class);
		System.out.println("사칙연산 시~ 작~");
		System.out.println("첫번째 수 입력 : ");
		int n1 = sc.nextInt();
		
		System.out.println("연산자 입력 : ");
		String s = sc.next();
		
		System.out.println("두번째 수 입력 : ");
		int n2 = sc.nextInt();
		
		if(s.equals("+")) {
			System.out.println(n1 + " + " + n2 + " = " + cal.cal1(n1, n2));
		}
		else if(s.equals("-")) {
			System.out.println(n1 + " - " + n2 + " = " + cal.cal2(n1, n2));
		}
		else if(s.equals("/")) {
			System.out.println(n1 + " / " + n2 + " = " + cal.cal3(n1, n2));
		}
		else if(s.equals("*")) {
			System.out.println(n1 + " * " + n2 + " = " + cal.cal4(n1, n2));
		}
		ctx.close();
	}
}


