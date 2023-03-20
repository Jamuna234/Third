package com.day8;

public class UseFridge {
	public static void main(String[] args) {
		
	
	
	Fridge fridge1=new Fridge();
	fridge1.brand="onida";
	fridge1.price=15000;
	fridge1 .isAutomatic=true;
	
	Fridge fridge2=new Fridge();
	fridge2.brand="samsung";
	fridge2.price=19000;
	fridge2.isAutomatic=false;
	
	
	Fridge fridge3=new Fridge();
	fridge3.brand="bajaj";
	fridge3.price=28000;
	fridge3.isAutomatic=true;
	
	Fridge fridge4=new Fridge();
	fridge4.brand="Whirlpool";
	fridge4.price=19500;
	fridge4 .isAutomatic=false;
	
	Fridge fridge5=new Fridge();
	fridge5.brand="lg";
	fridge5.price=27000;
	fridge5.isAutomatic=true;
	
	Fridge fridge6=new Fridge();
	fridge6.brand="onida";
	fridge6.price=15000;
	fridge6 .isAutomatic=true;
	
	Fridge fridge7=new Fridge();
	fridge7.brand="onida";
	fridge7.price=15000;
	fridge7 .isAutomatic=true;
	
	Fridge[] fridges= {fridge1,fridge2,fridge3,fridge4,fridge5,fridge6,fridge7};
	for(Fridge x: fridges) {
		System.out.println(x.price+", "+x.brand+", "+x.isAutomatic);
	}
	}
}
	
	
	
	
	
	
	


