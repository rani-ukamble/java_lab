import java.util.*;
 
class Result { 
	 int n;  
	 int marks[];  
	 double percentage; 
	 void getMarks()  {    
	 int flag=0;  
	 Scanner sc=new Scanner(System.in); 
	 System.out.print("Enter total number of subjects:");
	 n=sc.nextInt(); 
	 this.marks=new int[n];
	 try    { 
	 System.out.print("Enter marks [out of 100] of all subjects!\n"); 
	 for(int i=0;i<n;i++)     {
		 System.out.print("Enter marks of subject"+(i+1)+":");
		 marks[i]=sc.nextInt();  
		 if(marks[i]<40) {flag=1;} 
		 }     
		 if(flag==1) {
			 throw new PL4("Failure as marks < 40!");}
			 else {this.calResult();}
			 }  
			 catch(PL4 er)    {    
			 System.out.print("\nCaught an exception:  "+er.getMessage());    
			 }   
			 catch(Exception e)    {
				 System.out.print("\nCaught an exception:  "+e);    } 
				 finally    {    
				 System.out.print("\n\nIf\tGot the percentage,'Well done!'\nElse\tGot an Exception,'Try Department of Information Technology again!'");    }}
				 void calResult()  { 
				 int sum=0;   
				 for(int i=0;i<this.n;i++)   {
					 sum=sum+this.marks[i];   } 
					 this.percentage=((double)sum/this.n);  
					 System.out.print("Percentage="+this.percentage);  }
					 public static void main(String args[])  {
						 Result r1=new Result();
						 r1.getMarks();  }} 

						 
class PL4 extends Exception { 
 String detail;  
 PL4(String str)  {
	 detail=str;  }
	 public String getMessage()  { 
	 return "PL4["+this.detail+"]";  }}; 