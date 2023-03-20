package com.day8;

public class UseWatch {
	public static void main(String[] args) {
		Watch watch=new Watch();
		
		watch .brand="titan";
		watch. price=1500;
		watch. isSmart=true;
		watch. colour="red";
		
		Watch watch2=new Watch();
		
		watch2 .brand="titan";
		watch2. price=1100;
		watch2. isSmart=true;
		watch2. colour="red";
		Watch watch3=new Watch();
		watch3 .brand="titan";
		watch3. price=1150;
		watch3. isSmart=true;
		watch3. colour="red";
		
		Watch watch4=new Watch();
		
		watch4 .brand="titan";
		watch4. price=1250;
		watch4. isSmart=true;
		watch4. colour="red";
		
	Watch watch5=new Watch();
		
		watch5 .brand="titan";
		watch5. price=1100;
		watch5. isSmart=true;
		watch5. colour="red";
		
		Watch[] watches= {watch,watch2,watch3,watch4,watch5};
		int min=watches[0].price;
		for(Watch x:watches) {
		if(x.price<=min) {
			min=x.price;
			min=x.price+x.price*10/100;
			}
		}
			System.out.println(min);
			
		}
		
		
		
	}


