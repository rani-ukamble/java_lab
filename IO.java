import java.io.*;
 import java.util.*;  
 
class student { 
 int RollNo; 
 String name; 
 String city;
 String Collegename; 
 String Dept;
 Double cgpa; 
 String Hobby;
 int No_clubs;
 int No_courses;
 int internships;
 student()  { 
 Scanner sc1=new Scanner(System.in);
 System.out.print("Enter Roll No:");
 RollNo=sc1.nextInt();
 System.out.print("Enter Name:");   
 name=sc1.next();
 System.out.print("Enter City");   
 city=sc1.next();
 System.out.print("Enter College Name:");   
 Collegename=sc1.next();
 System.out.print("Enter Department name:");  
 Dept=sc1.next();
 System.out.print("Enter cgpa:"); 
 cgpa=sc1.nextDouble(); 
 System.out.print("Enter Hobby:");   
 Hobby=sc1.next();
 System.out.print("Enter No of clubs u have been part of:");   
 No_clubs=sc1.nextInt();
 System.out.print("Enter No of courses u have complete till:");   
 No_courses=sc1.nextInt();
 System.out.print("Enter No of internships u have done:");   
 internships=sc1.nextInt();
 } } 
 class IO { 
 public static void main(String args[])throws Exception  {  
 Scanner sc=new Scanner(System.in);
 String s;  
 File f1 = new File("studentData.txt");
 f1.createNewFile();   
 OutputStream fos=new FileOutputStream(f1,true);
 PrintStream ps=new PrintStream(fos);  
  student stu1=new student();   
  ps.print("Roll No         Name            City    College Dept    Cgpa    Hobby");
  ps.print(""+stu1.RollNo); 
  ps.print("\t"+stu1.name); 
  ps.print("\t"+stu1.city);
ps.print("\t"+stu1.Collegename);  
  ps.print("\t"+stu1.Dept);   
  ps.print("\t"+stu1.cgpa);
    ps.print("\t"+stu1.Hobby);
ps.print("\t"+stu1.No_clubs);  
  ps.print("\t"+stu1.No_courses);
ps.print("\t"+stu1.internships);  


   System.out.print("Record inserted successfully!");  
   fos.close();   
   ps.close();    } }  
   