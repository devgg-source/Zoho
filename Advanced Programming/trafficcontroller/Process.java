package trafficcontroller;

import java.util.*;

public class Process {
	Scanner sc = new Scanner(System.in);
	
	Calculation calc = new Calculation();
	
	void process() {
		System.out.println("Request");
		System.out.println("1.Takeoff Request 2.Landing Request 3.Emergency Landing Request");
		System.out.println("What is your req");
		int request = sc.nextInt();
		
		System.out.println("Plane Types");
		System.out.println("1.ATR 2.AIRBUS 3.BOEING 4.CARGO");
		System.out.println("Select the type of Plane");
		int flight = sc.nextInt();
		int c = calc.cal1(flight);
		double l = (double)3/4*(c);
		double h = (double)1/2*(c);
		
		System.out.println("Plane Weight");
		System.out.println("1. >"+(int)h+" tonnes");
		System.out.println("2. "+(int)l+"-"+(int)h+" tonnes");
		System.out.println("3. <"+(int)l+" tonnes");
		System.out.println("Select the Weight of plane");
		int weigh = sc.nextInt();
		
		int i = calc.get(flight);
		double j = calc.cal2(weigh, i);
		int time = (int)j;
		Thread1 td = new Thread1(flight,time,l,h,weigh);
		 new Thread(td).start();
		
		
	}

}
