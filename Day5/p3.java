class Ladder{

		public static void main(String args[]){
			
		char ch = 'a';
		
		for(int i=1;i<=26;i++){

			if(ch =='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){

				System.out.println(ch +"is vowel");
			}else{

				System.out.println(ch +"is Consonent");

			}
			ch++;
		}
		
		
	}
}