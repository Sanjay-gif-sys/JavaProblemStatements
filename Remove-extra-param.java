package cloudframe_assignment;
import java.util.*;

public class prac_gfg {
	
	public static void main(String args[]) {
		
		String expression="((A+b))+C)";
		removeUnwantedParanthesis(expression);
	}
	
	public static boolean isValidParanthesis(String str) {
		
		int count=0;
		for(int i=0;i<str.length();i++) {
			
			if(str.charAt(i)=='(') count++;
			else if(str.charAt(i)==')') count--;
			
			if(count<0) return false;
			
		}
		return (count==0);
	}
	
	public static boolean isParanthesis(char c) {
		if(c=='(' || c==')') return true;
		else return false;
	}
	
	public static void removeUnwantedParanthesis(String str) {
		
		if(str.length()<0) return;
		
		Queue<String> q=new LinkedList<>();
		HashSet<String> visit=new HashSet<String>();
		q.add(str);
		visit.add(str);
		
		boolean level=false;
		while(!q.isEmpty()) {
			
			str=q.peek();q.remove();
			if(isValidParanthesis(str)) { //Check for input is valid or not
				
				System.out.println(str);
				level=true;
				break;
			}
			if(level) continue;
			
			for(int i=0;i<str.length();i++) {
				
				if(!isParanthesis(str.charAt(i))) continue; //Check for whether it is bracket or not
				
				String temp;
				temp=str.substring(0,i)+str.substring(i+1);
				if(!visit.contains(temp)) {
					q.add(temp);
					visit.add(temp);
				}
				
			}
			
			
			
		}
	}

}
