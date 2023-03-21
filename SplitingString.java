package cloudframe_assignment;
import java.util.*;

public class split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="1';','ISS SSID ;','RCDATE;','RC;','CUR;','X;','ISS MEMBER ;','ISS XFER AG;','SAM REF #;','ISS SETTLE LOC ;','ISS SETTLE GLB ;',' ;','ACQ SSID ;','RCDATE;','RC;','CUR;','X;','ACQ MEMBER ;','ACQ XFER AG;','SAM REF #;','ACQ SETTLE LOC ;','ACQ SETTLE GLB ;',' ;',&DATE";
//		String str="1';','ISS\"SSID;'";
		Scanner sc=new Scanner(System.in);
//		String str=sc.nextLine();
		int value=0;
		String res="";
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			if(value==0 && c=='\'' || c=='\"') {
				value=1;
				res=res+c;
			}
			else if(value==1 && c=='\'' || c=='\"') {
				value=0;
				res=res+c;
			}
			
			else if(c==';' || c==',' || c=='&' || c==' ') {
				if(value==0) {
					System.out.println(res);
					res="";
				}
				else {
					res=res+c;
				}
			}
			else {
				res=res+c;
			}
		}
		System.out.println(res);
		
		sc.close();
		
		
		
	}

}
