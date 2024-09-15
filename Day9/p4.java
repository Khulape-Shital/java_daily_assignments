class Pattern {

	public static void main(String args[]){


	
		for(int i=4;i>=1;i--){
			char a='A';
			char b='a';
			for(int j=1;j<=i;j++){
	
				if(i%2==0){
					System.out.print(a+" ");
				a++;
				}else{
					System.out.print(b+" ");
				b++;
			
				   }
			}
	
				System.out.println();
		}
	}
}
