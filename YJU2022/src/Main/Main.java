package Main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
	
		for(int i=0; i<n; i++) {
			String txt=sc.next();
			int l=0, r=0;
			
			for(int j=0; j<txt.length(); j++) {
				char []arr=new char[txt.length()];
				arr[j]=txt.charAt(j);
				if(arr[j]=='(') l++;
				else if(arr[j]==')') r++;	
			} // for j
			if(l==r) System.out.println("YES");
			else System.out.println("NO");	
		} // for i		

	}
}