class Divisible{

		public static void main(String args[]){
		
			System.out.println("number divisible by 3 & 7 are: ");

			int i =1;
			while(i<=30){

				if(i%3== 0 && i%7== 0){
					System.out.println(i);
				}else{
				System.out.println("0");
				}
				i++;
					
				
			}
		}
}