package trafficcontroller;
//import trafficcontroller.Data;

public class Initialization {
	
	Data data = new Data();
	void put_weight() {
		data.weight.put("ATR", 12);
		data.weight.put("AIRBUS", 20);
		data.weight.put("BOEING", 40);
		data.weight.put("CARGO", 100);
		
	}
	
	void put_time() {
		data.time1.put("ATR", 30);
		data.time1.put("AIRBUS",40);
		data.time1.put("BOEING", 50);
		data.time1.put("CARGO",60);
		
	}
	
	void put_runway() {
		data.runway.put("runway1", 40);
		data.runway.put("runway2",60);
		data.runway.put("runway3", 80);
		data.runway.put("runway4",90);
	}

}
