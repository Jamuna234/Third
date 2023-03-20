package com.day8;

public class UseWaterBottle {
	public static void main(String[] args) {
		
WaterBottle bottle=new WaterBottle();
	bottle.brand="bisleri";
	bottle.price=99;
	bottle.isPlastic=true;
	bottle.capacity=1000;
	
	WaterBottle bottle2=new WaterBottle();
	bottle2.brand="aque";
	bottle2.price=100;
	bottle2.isPlastic=true;
	bottle2.capacity=1000;
	
	WaterBottle bottle3=new WaterBottle();
	bottle3.brand="bb";
	bottle3.price=150;
	bottle3.isPlastic=true;
	bottle3.capacity=1000;
	
	WaterBottle bottle4=new WaterBottle();
	bottle4.brand="cc";
	bottle4.price=98;
	bottle4.isPlastic=false;
	bottle4.capacity=1000;
	
	WaterBottle bottle5=new WaterBottle();
	bottle5.brand="dd";
	bottle5.price=120;
	bottle5.isPlastic=true;
	bottle5.capacity=1000;
	
	WaterBottle[] bottles= {bottle,bottle2,bottle3,bottle4,bottle5};	int count=0;
	
	
	for(WaterBottle x: bottles) {
		if(x.isPlastic==true) {
			count++;
		}
	}
			
			
			System.out.println(count);
		}
	}
		
	
	
	
	
	


