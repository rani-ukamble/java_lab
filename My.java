import java.util.*; 

	class My {
		public static void main(String[] a)  { 
		Scanner input = new Scanner(System.in);   
		System.out.println("Enter number to check even or odd");
		int num1=input.nextInt();
		exp1 o=new exp1(num1);
		} } 
		class exp1 {
	exp1(int n)  {  
	if(n%2==0)  
		System.out.println("EVEN");
	else  
		System.out.println("ODD");
	} }