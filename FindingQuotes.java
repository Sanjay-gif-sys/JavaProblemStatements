package StringSeparator;

import java.util.Scanner;

public class FindingQuotes {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int n=str.length();
		//String s="fdhhf'fghrhg'lkbgvfd\"fgj'gh'bjb\"jfd";
		int cnt1=0;
		int cnt2=0;
		int ssq=0,esq=0;
		int sdq=0,edq=0;
		for(int i=0;i<n;i++) {
			char c=str.charAt(i);
			switch(c) {
			case '\"': if(cnt2==0) {
			       sdq=i;
			       cnt2=1;
			}
			else if(cnt2==1) {
				     edq=i;
				     cnt2=0;
				     System.out.println("Double quote starts at "+sdq+" ends at "+edq+"\n");
			}
			
			break;
			case '\'': if(cnt1==0) {
			       ssq=i;
			       cnt1=1;
			}
			else if(cnt1==1) {
				     esq=i;
				     cnt1=0;
				     System.out.println("single quote starts at "+ssq+" ends at "+esq+"\n");
			}		
			break;
			}
		}
	}
}
