package com.gl.fsd.dsa;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner sc=new Scanner(System.in);
 System.out.println("enter the number of transactions : ");
 int transactionsArraySize =sc.nextInt();
 int [] transactions =new int[transactionsArraySize];
 
 System.out.println("enter the transactions values : ");
 for(int i =0;i<transactionsArraySize;i++) {
	 transactions[i]=sc.nextInt();
 }
 
 System.out.println("enter the targets to be acheived ");
 int targetinstancesize=sc.nextInt();
  for(int count=0;count<targetinstancesize;count++) {
	  System.out.println();
	  System.out.println("enter the target value ");
	  int dailytarget=sc.nextInt();
	  System.out.println("processing transactions with target value - > " + dailytarget);
	  TargetDeterminator determinator =new  TargetDeterminator(transactions,dailytarget);
	  determinator.determin();
  }
  if( sc!=null) {
	  sc.close();
  }
	}

}
