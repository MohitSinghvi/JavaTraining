package com.company;
class Assignment1{
	public static void main(String[] args){
		String name = "Bill Gates" ;
		String a1 = "1 Microsoft way";
		String a2 = "Redmond, WA 98104";

		int total_length=60;
		int start_len=30;
		int rem_length=total_length-start_len;
		int breadth=10;
		printHorizontalBorder(total_length);
		
		for(int i=0;i<breadth;i++){
			System.out.print("|");
			
			if(i<4 || i>6){


				if(i<3){
					for(int j=0;j<total_length-4;j++){
						System.out.print(" ");
					}
					System.out.print("####");
				}
				else{
					for(int j=0;j<total_length;j++){
						System.out.print(" ");
					}
				}
			}
			else{
				for(int j=0;j<start_len;j++){
					System.out.print(" ");
				}

				if(i==4){
					System.out.print(name);
					for(int j=0;j<rem_length-name.length();j++){
						System.out.print(" ");
					}
				}
				if(i==5){
					System.out.print(a1);
					for(int j=0;j<rem_length-a1.length();j++){
						System.out.print(" ");
					}
				}
				if(i==6){
					System.out.print(a2);
					for(int j=0;j<rem_length-a2.length();j++){
						System.out.print(" ");
					}
				}
			}

			System.out.println("|");
		}

		printHorizontalBorder(total_length);
		
	}

	public static void printHorizontalBorder(int total_length){
		System.out.print("+");
		for(int i=0;i<total_length;i++){
			System.out.print("-");

		}
		System.out.println("+");
	}
}