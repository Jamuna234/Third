package com.day8;

public class UseShirt {
	public static void main (String[] args) {
		Shirt shirt=new Shirt();
		shirt.brand="ww";
		shirt.price=740;
		shirt.isChecked=true;
		shirt.disCountAmount=152;
		
		Shirt shirt2=new Shirt();
		shirt2.brand="ww";
		shirt2.price=860;
		shirt2.isChecked=true;
		shirt2.disCountAmount=152;
		
		Shirt shirt3=new Shirt();
		shirt3.brand="ww";
		shirt3.price=722;
		shirt3.isChecked=true;
		shirt3.disCountAmount=159;
		
		Shirt shirt4=new Shirt();
		shirt4.brand="ww";
		shirt4.price=790;
		shirt4.isChecked=true;
		shirt4.disCountAmount=150;
		
		Shirt shirt5=new Shirt();
		shirt5.brand="ww";
		shirt5.price=740;
		shirt5.isChecked=true;
		shirt5.disCountAmount=190;
		
		Shirt[] shirts= {shirt,shirt2,shirt3,shirt4,shirt5};
		for(Shirt x:shirts)
		if(x.isChecked==true) {
			System.out.println(x.price-x.disCountAmount);
		}
		
	}
		
		
		
		
	}


