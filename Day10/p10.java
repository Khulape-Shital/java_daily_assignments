class Pattern{

	public static void main(String args[]){
		
		
		for(int i=1;i<=4;i++){
				int a =4;	
			for(int j=4;j>=1;j--){
			
				if(i<j){

					System.out.print("  ");	
				}else{
					System.out.print(a+" ");
					
				}
				a--;	
			}
			
			System.out.println();
		}
 	}
}