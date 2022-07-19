package Algorithm;

class HanoiTowerMove {
	void Move(int num, char start, char mid, char end) {
		if(num==1) System.out.printf("����1�� %c���� %c�� �̵�\n", start, end);
		else {
			Move(num-1, start, end, mid);
			System.out.printf("����%d�� %c���� %c�� �̵�\n",num, start, end);
			Move(num-1, mid, start, end);
		}
	}
}

public class HanoiTower {

	public static void main(String[] args) {
		new HanoiTowerMove().Move(3,'A','B','C');
	}
}


