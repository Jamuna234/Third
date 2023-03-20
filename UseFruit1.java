package com.day8;

public class UseFruit1 {
	public static void main(String[] args) {
		Fruit fruit=new Fruit();
		fruit.name="orange";
		fruit.price=160;
		fruit.isHybrid=false;
		
		Fruit fruit2=new Fruit();
		fruit2.name="plum";
		fruit2.price=160;
		fruit2.isHybrid=false;
		
		Fruit fruit3=new Fruit();
		fruit3.name="banana";
		fruit3.price=160;
		fruit3.isHybrid=true;
		
		Fruit fruit4=new Fruit();
		fruit4.name="apple";
		fruit4.price=160;fruit4.isHybrid=false;
		 
		Fruit fruit5=new Fruit();
		fruit5.name="guava";
		fruit5.price=160;
				fruit5.isHybrid=true;
		
		Fruit fruit6=new Fruit();
		fruit6.name="pineapple";
		fruit6.price=160;
		fruit6.isHybrid=false;
		
		Fruit fruit7=new Fruit();
		fruit7.name="mango";
		fruit7.price=160;
		fruit7.isHybrid=true;
		
		Fruit [] fruits= {fruit,fruit2,fruit3,fruit4,fruit5,fruit6,fruit7};
		for(Fruit x : fruits) {
			System.out.println(x.isHybrid);
		}
	}

}
