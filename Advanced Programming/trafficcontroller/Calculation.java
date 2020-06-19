package trafficcontroller;

public class Calculation {
	Data data = new Data();
	int s,m;
	int cal1(int c) {
		
		if(c==1) {
			s = data.weight.get("ATR");
		}
		
		else if(c==2) {
			s = data.weight.get("AIRBUS");
		}
		else if(c==3) {
			s = data.weight.get("BOEING");
		}
		else if(c==4) {
			s = data.weight.get("CARGO");
		}
		
		return s;
	}
	
	int get(int k) {
		int m=0;
		if(k==1) {
			m = data.time1.get("ATR");
		}
		else if(k==2) {
			m = data.time1.get("AIRBUS");
		}
		else if(k==3) {
			m=  data.time1.get("BOEING");
			
		}
		else if(k==4) {
			m = data.time1.get("CARGO");
		}
		
		return m;
		
	}
	
	double cal2(int m, int d) {
        if (m == 1) {
            return d;
        } else if (m == 2) {
            return d - (0.1 * d);
        } else {
            return d - (0.2 * d);
        }

    }

}
