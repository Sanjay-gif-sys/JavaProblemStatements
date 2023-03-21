package cloudframe_assignment;
import java.util.*;
public class Double_quotes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int n=str.length();

		StringBuilder res=new StringBuilder();
		for(int i=0;i<n;i++) {
			char c=str.charAt(i);
			if(c!='\"') {
				res.append(str.charAt(i));
			}
			else if(c=='\"') {
				
				if(n!=i+1) {
					char c1=str.charAt(i+1);
					if(c1=='\"') {
						res.append('\\');
						res.append(str.charAt(i));
						i++;
						res.append('\\');
						res.append(str.charAt(i));
					}
					else {
						res.append(str.charAt(i));
					}
				}
				else {
					res.append(str.charAt(i));
				}
				
			}
		}
		sc.close();
		
		System.out.println(res.toString());
		
	}

}
