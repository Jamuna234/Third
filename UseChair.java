package com.day8;

public class UseChair {
	public static void main(String[] args) {
		
		Chair chair=new Chair();
		chair.material="jk";
		chair.price=270;
		chair.isFlex=true;
		
		Chair chair2=new Chair();
		chair2.material="plastic";
		chair2.price=210;
		chair2.isFlex=true;
		
		Chair chair3=new Chair();
		chair3.material="p";
		chair3.price=230;
		chair3.isFlex=true;
		
		Chair chair4=new Chair();
		chair4.material="pla";
		chair4.price=200;
		chair4.isFlex=true;
		
		Chair chair5=new Chair();
		chair5.material="pla";
		chair5.price=219;
		chair5.isFlex=true;
		
		Chair[] chairs= {chair,chair2,chair3,chair4,chair5};
		
		for(Chair x : chairs) {
//			System.out.println(x.price-(x.price*15/100));
			if(x.material.length()<5) {
				System.out.println(x.material.toUpperCase());
			}
		}
		
		
		
		
		
	}

}

