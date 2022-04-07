package Main2;
//����� �������X

//���࿡�� �ʿ��� ���� ��ü, ���࿡�� �� ���� �޼ҵ�(�Լ�)
//���� �̸��� public ���� 
class Bank { 
	//private ĸ��ȭ(�ۿ��� �鿩�ٺ��°� X)
	//�ڽ� Ŭ�������� ����Ϸ��� private X ,protected ���
	protected int regNo=0; //���¹�ȣ
	protected String name; //�̸�
	protected int money=0; //�ܾ�
	
	static int No=0; //�������� ����ϴ� �������� only 1��
	
	Bank(){ //������1
		regNo=++No;
	}
	Bank(String name){ //������2
		this.name=name;  //this=>�� ��ü�� name..., �Լ� ���� name�� �׳� ����(�򰥸�������� ���°�)
		regNo=++No;
		System.out.print(name+"�� ���°� �����Ǿ����ϴ�.");
		System.out.println(name+"�� �ܾ��� "+money+"�Դϴ�.");
	}
	Bank(String name, int m){ //������3
		this.name=name;
		money=m;
		regNo=++No;
		System.out.print(name+"�� ���°� �����Ǿ����ϴ�.");
		System.out.println(name+"�� �ܾ��� "+money+"�Դϴ�.");
	}
	
	@Override
	public String toString() {
		return "Bank [regNo = " +regNo +"], [name = "+name+"], [money = "+money+"]";
	}
	
	public void �Ա�(int m) {
		money+=m;
		System.out.println(name+"�� ���忡 "+m+"�� �ԱݵǾ� ���� �ܾ��� "+money+"�Դϴ�.");
	}
	public void ���(int m) {
		if(money>=m) { money-=m;
		System.out.println(name+"�� ���忡 "+m+"�� ��ݵǾ� ���� �ܾ��� "+money+"�Դϴ�.");
		}
		else System.out.println("�ܰ� �����ؼ� ����� �Ұ��մϴ�.");
	}
	public void �ܾ���ȸ() {
		System.out.println(name+"�� �����ܰ�� "+money+"�Դϴ�.");
	}
	
	void print() { 
		System.out.println(name+"�� ���¹�ȣ�� "+regNo+" �Դϴ�.");
	}
	
	/*�ʵ尡 private �϶��� getter setter ����
	public int getRegNo() { return regNo;	}
	public void setRegNo(int regNo) {this.regNo = regNo;	}
	public String getName() {	return name;	}
	public void setName(String name) {	this.name = name;	}
	public int getMoney() {	return money;	}
	public void setMoney(int money) {	this.money = money;	} */

}

//��� - Bank�� �����ִ� �� �� ���� ���� ���� �߰��ؼ� ������ => extends Bank = Bank Ȯ��
class BankA extends Bank {
	private int ������=1;
	
	//Bank�ȿ� private ������ �� Ŭ���������� ��� �����ϰ�
	//�ڽ� Ŭ����(BankA)���� ������ protected�� public���� ���ų� getter setter�� �ҷ��;���
	BankA (String name){ 
		this.name=name;  
		regNo=++No;
		System.out.print("BankA"+name+"�� ���°� �����Ǿ����ϴ�.");
		System.out.println(name+"�� �ܾ��� "+money+"�Դϴ�.");
	}
	
	/*BankA(String name){
		super(name);	 
		// super�� �θ��� ������ - �θ� ������ ������ private �״�� ����
	}*/
	
	//�θ�� �ڽĲ� ����� �� ����!
	public int get������() {
		return ������;
	}
	public void set������(int ������) {
		this.������ = ������;
	}

}


public class BankTest {

	public static void main(String[] args) {
		//�����ھȿ� ����־ �ڵ����� ��µ�(������)
		Bank Kim = new Bank("����");
		Bank Park = new Bank("�ڴ��",10000); 
		Bank Lee = new Bank();
		BankA Oh = new BankA("��ũ����"); //BankA�� 5�� �Ӽ��� ����
		System.out.println();
		
		Oh.�Ա�(10000);
		Kim.�Ա�(5000);
		Kim.���(10000);
		Kim.���(1000);
		Park.�ܾ���ȸ();
		
		System.out.println();
		Kim.print();
		System.out.println(Kim);
		System.out.println(Park);
		System.out.println(Lee);
		System.out.println(Oh.get������());
	}

}
