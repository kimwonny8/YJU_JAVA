package Main;

public class ArrayTest5 {
	final static int n = 5;
	
	public static void main(String[] args) {
		int[][] arr= {{10,20,30,40},{50,60,70,80},{90,100,110,120}};
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.println((i+1)+"За "+(j+1)+"ї­: "+arr[i][j]);
			}
		}
	
	}

}
