package Main;

import java.util.*;

class DiceGame{
	
	int diceFace;
	int userGuess;
	
	int score=0;
	int life=5;
	
	private void RollDice() {
		diceFace = (int)(Math.random()*6)+1;
	}
	
	private int getUserInput(String a) {
		System.out.print(a+": ");
		Scanner sc=new Scanner(System.in);
		return sc.nextInt();
	}
	
	private void checkUserGuess() {
		if(diceFace==userGuess) {
			score+=50;
			System.out.printf("오ㅋㅋ맞춤ㅋ 50점업 현재 점수는 %d 현재 남은 생명은 %d\n",score,life);
		}
		else {
			System.out.printf("틀림! 답은 %d임! ",diceFace);
			if(life!=0) {
				life--;
				System.out.printf("현재 점수는 %d 현재 남은 생명은 %d\n",score,life);	
			}
			
		}
	}
	
	public void startPlaying() {
		System.out.printf("현재 점수는 %d 현재 남은 생명은 %d 임당\n자 이제 ㄱ고ㅗㄱ\n",score,life);
		while(score!=100 && life!=0) {
			userGuess = getUserInput("예상해");
			RollDice();
			checkUserGuess();
		}
		if(score==100) System.out.println("축하드립니다 성공했슴당");
		else if(life==0) System.out.println("다시 도전하세용ㅠ");
	}
}

public class DiceGameTest {

	public static void main(String[] args) {
		DiceGame wonny = new DiceGame();
		wonny.startPlaying();
	}

}
