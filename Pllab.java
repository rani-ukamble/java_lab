import java.io.*;
import java.lang.*;
public class Pllab extends Thread {
	public static void main(String args[]){
		Pllab P1 = new Pllab();
		Pllab P2 = new Pllab();
		
		System.out.println("Tejal Yawalkar PL LAB");
		System.out.println();
		System.out.println("Isalive method" +"   "+ P1.isAlive());
		System.out.println();
		System.out.println("Get Priority method" +"   "+ P1.getPriority());
		System.out.println();
		//System.out.println("Start method" +"   "+ P1.Start());
		//System.out.println("Isalive method" +"   "+ P1.isAlive());
		System.out.println();
		System.out.println("Set Priority method" +"   ");
		System.out.println();
		Thread.currentThread().setPriority(7);
		
		System.out.println();
		System.out.println("Get Priority method" +"   "+ Thread.currentThread().getPriority());
	}
}