package com.day8;

public class UseIronBox {
	public static void main(String[] args) {
		IronBox iron=new IronBox();
		iron.brand="bajaj";
		iron.price=999;
		iron.colour="white";
		iron.isSteam=true;
		
		IronBox iron2=new IronBox();
		iron2.brand="";
		iron2.price=750;
		iron2.colour="red";
		iron2.isSteam=false;
		
		IronBox iron3=new IronBox();
		iron3.brand="surya";
		iron3.price=1000;
		iron3.colour="black";
		iron3.isSteam=true;
		
		IronBox iron4=new IronBox();
		iron4.brand="bajaj";
		iron4.price=999;
		iron4.colour="white";
		iron4.isSteam=true;
		
		IronBox iron5=new IronBox();
		iron5.brand="hl";
		iron5.price=1500;
		iron5.colour="silver";
		iron5.isSteam=true;
		
		
		
		IronBox [] irons={iron,iron2,iron3,iron4,iron5};
		
		int max=irons[0].price;
		
		IronBox a=null;
		
		for(IronBox x:irons) {
			if(x.price>=max) {
				max=x.price;
				a=x;
			}
		
		}
	    
		System.out.println(max);
		System.out.println(a.brand+" "+a.colour+" "+a.price+" "+a.isSteam);
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}


		
		
		
		
		
		
