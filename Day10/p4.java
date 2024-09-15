class Pattern{

	public static void main(String args[]){
		
		int a =1;
		for(int i=1;i<=4;i++){
			
			for(int j=4;j>=1;j++){
			
				if(j>i){

					System.out.print(" ");	
				}else{
					System.out.print(a+" ");
					a++;
				}
					
			}
			
			System.out.println();
		}
	}
}