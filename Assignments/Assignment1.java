class Assignment1{
	public static void main(String[] args){
		String name = "Bill Gates" ;
		String a1 = "1 Microsoft way";
		String a2 = "Redmond, WA 98104";
		
		int start_len=20;
		
		System.out.print("+");
		for(int i=0;i<45;i++){
			System.out.print("-");
			
		}
		System.out.println("+");
		
		for(int i=0;i<10;i++){
			System.out.print("|");
			
			if(i<4 || i>6){
				for(int j=0;j<40;j++){
					System.out.print(" ");
				}
			}
			else{
				for(int j=0;j<start_len;j++){
					System.out.print(" ");
				}
				if(i==4){
					System.out.print(name);
					for(int j=0;j<start_len-name.length();j++){
						System.out.print(" ");
					}
				}
				if(i==5){
					System.out.print(a1);
					for(int j=0;j<start_len-a1.length();j++){
						System.out.print(" ");
					}
				}
				if(i==6){
					System.out.print(a2);
					for(int j=0;j<start_len-a2.length();j++){
						System.out.print(" ");
					}
				}
			}
			
			
			if(i<3)
				System.out.print("####");
			else{
				System.out.print("    ");
			}
			
			
			
			
			System.out.println(" |");
		}
		
		// System.out.print("|");
		
		System.out.print("+");
		for(int i=0;i<45;i++){
			System.out.print("-");
			
		}
		System.out.println("+");
		
	}
}