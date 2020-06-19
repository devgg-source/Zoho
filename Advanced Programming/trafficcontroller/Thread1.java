package trafficcontroller;
import java.lang.Thread;

 class Thread1 implements Runnable {
	 
	 int runarr[] = new int[] {0,0,0,0};
	 String flight;
	 int time;
	 int r;
	 String wt;
	 Data data = new Data();
      
	 public Thread1(int flight,int time,double l,double h,int weigh) {
		   if(flight==1) {
			   this.flight="ATR";
		   }
		   else if(flight==2) {
			   this.flight="AIRBUS";
		   }
		   else if(flight==3) {
			   this.flight="BOEING";
		   }
		   else if(flight==4) {
			   this.flight="CARGO";
		   }
		   
		   if(weigh==1) {
			   wt=" >"+h;
		   }
		   else if(weigh==2) {
			   wt=l+"-"+h;
		   }
		   else if(weigh==3) {
			   wt=" <"+l;
		   }
		   
		   
		   
		   this.time=time;
	 }
	 
	public void run() {
		try {
		 if(data.runway.get("runway1")>=time&&runarr[0]!=1) {
			 r=1;
			 runarr[0]=1;
			 Thread.sleep(time*1000);
			 runarr[0]=0;
		 }
		 else if(data.runway.get("runway2")>=time&&runarr[1]!=1) {
			 r=2;
			 runarr[1]=1;
			 Thread.sleep(time*1000);
			 runarr[1]=0;
		 }
		 else if(data.runway.get("runway3")>=time&&runarr[2]!=1) {
			 r=3;
			 runarr[2]=1;
			 Thread.sleep(time*1000);
			 runarr[2]=0;
		 }
		 
		 else if(data.runway.get("runway4")>=time&&runarr[3]!=1) {
			 r=4;
			 runarr[3]=1;
			 Thread.sleep(time*1000);
			 runarr[3]=0;
		 }
		 
		 System.out.println("Landing approved for "+flight+" with "+wt+" tonnes of weight in Runway"+r);
		 System.out.println("Touch down will happen in 15 secs");
		 System.out.println("The plane will stop after "+time+"secs of touchdown");
		 System.out.println("Runway"+r+"will be ready for next request in "+time+"secs");
	 }
		catch(Exception e) {
			System.out.println(e);
		}
}
 }
