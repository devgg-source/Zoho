package trafficcontroller;

//import trafficcontroller.Initialization;

public class Traffic {
	public static void main(String args[]) {
       
		Initialization initi = new Initialization();
		
		Process proc = new Process();
		initi.put_weight();
		initi.put_time();
		initi.put_runway();
		proc.process();
		
		
		
	}

}
