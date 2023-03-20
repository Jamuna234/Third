package com.day8;

public class UseNote {
	public static void main(String[] args) {
		
		Note note=new Note();
		note.brand="class";
		note.isRolled=true;
		note.price=170;
		note.noOfPages=290;
		
		Note note2=new Note();
		note2.brand="power";
		note2.isRolled=true;
		note2.price=122;
		note2.noOfPages=200;
		
		Note note3=new Note();
		note3.brand="pns";
		note3.isRolled=true;
		note3.price=110;
		note3.noOfPages=180;
		
		Note note4=new Note();
		note4.brand="class";
		note4.isRolled=true;
		note4.price=190;
		note4.noOfPages=200;
		
		Note note5=new Note();
		note5.brand="classmate";
		note5.isRolled=true;
		note5.price=170;
		note5.noOfPages=100;
		Note[] notes= {note,note2,note3,note4,note5};
		for(Note x:notes) {
			if(x.isRolled==true) {
				System.out.println(x.brand+", "+x.isRolled+", "+x.price+", "+x.noOfPages);
			}
		}
				
				
	}

}
