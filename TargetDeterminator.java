package com.gl.fsd.dsa;

import java.util.Arrays;

public class TargetDeterminator {
     private int [] transactions;
     
     private int dailytarget;
     
     private boolean outcome;
     
     public TargetDeterminator(int [] transactions,int dailytarget) {
    	 this.transactions=transactions;
    	 this.dailytarget= dailytarget;
     }



	public int[] getTransactions() {
		return transactions;
	}

	public void setTransactions(int[] transactions) {
		this.transactions = transactions;
	}

	public int getDailytarget() {
		return dailytarget;
	}

	public void setDailytarget(int dailytarget) {
		this.dailytarget = dailytarget;
	}
	


	public boolean isOutcome() {
		return outcome;
	}

	public void setOutcome(boolean outcome) {
		this.outcome = outcome;
	}
	  void determin() {
		int tempSum =0;
		int transactionscounter=0;
		for(int i =0;i<transactions.length;i++) {
			int transactionsvalue=transactions[i];
			
			tempSum =tempSum +transactionsvalue;
			
			if(tempSum>=dailytarget) {
				outcome =true;
				transactionscounter=i+1;
				break;
			}
			
		}
	
	if(outcome) {
		System.out.println(String.format("Daily target of %d is acheived after %d transactions-from the transaction list[%s]",dailytarget,transactionscounter,Arrays.toString(transactions)));
		
	}else {
		System.out.println(String.format("Daily target of %d is not  acheived -from the transaction list[%s]",dailytarget,Arrays.toString(transactions)));
	}
	}


		


	}
