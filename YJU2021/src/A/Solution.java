package A;

public class Solution {
	//큰 틀 복사
	public static int[] solution(int[] array, int[][] commands) {
        int[] answer = {};
        return answer;
    }
	
	public static void main(String[] args) {
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2, 5, 3},{4, 4, 1},{1, 7, 3}};
		int[] answer = solution(array, commands);
		for(int i=0;i<answer.length;i++)
			System.out.println(answer[i]);
		
		
	}

}
