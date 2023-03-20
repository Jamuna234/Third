package com.day8;

public class UseSim {
	public static void main(String[] args) {
		
		Sim sim=new Sim();
		sim.companyName="airtel".toUpperCase();
		sim.simNumber=97157389;
		sim.is4g=true;
		sim.candidateName="aruna";
		
		Sim sim2=new Sim();
		sim2.companyName="aircel".toUpperCase();
		sim2.simNumber=917457385;
		sim2.is4g=true;
		sim2.candidateName="jage";
				
		Sim sim3=new Sim();
		sim3.companyName="bsn".toUpperCase();
		sim3.simNumber=794767768;
		sim3.is4g=true;
		sim3.candidateName="jamun";
				
		
		Sim sim4=new Sim();
		sim4.companyName="voda".toUpperCase();
		sim4.simNumber=927474885;
		sim4.is4g=false;
		sim4.candidateName="madhu";
				
		Sim sim5=new Sim();
		sim5.companyName="idea".toUpperCase();
		sim5.simNumber=900334542;
		sim5.is4g=false;
		sim5.candidateName="priya";
		
		Sim[]sims={sim,sim2,sim3,sim4,sim5};
		for(Sim x:sims) {
			if(x.companyName.contains("A")||x.companyName.contains("E")||x.companyName.contains("U")||x.companyName.contains("I")||x.companyName.contains("O")) {
					System.out.println(x.companyName);
		}
		}
	}
}
	
		
				
		
				

