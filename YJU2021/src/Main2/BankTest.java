package Main2;
//상속은 시험범위X

//은행에서 필요한 것은 객체, 은행에서 할 일은 메소드(함수)
//파일 이름만 public 가능 
class Bank { 
	//private 캡슐화(밖에서 들여다보는거 X)
	//자식 클래스에서 사용하려면 private X ,protected 사용
	protected int regNo=0; //계좌번호
	protected String name; //이름
	protected int money=0; //잔액
	
	static int No=0; //공통으로 사용하는 정적변수 only 1개
	
	Bank(){ //생성자1
		regNo=++No;
	}
	Bank(String name){ //생성자2
		this.name=name;  //this=>이 객체의 name..., 함수 안의 name은 그냥 적음(헷갈리지말라고 적는거)
		regNo=++No;
		System.out.print(name+"의 계좌가 개설되었습니다.");
		System.out.println(name+"의 잔액은 "+money+"입니다.");
	}
	Bank(String name, int m){ //생성자3
		this.name=name;
		money=m;
		regNo=++No;
		System.out.print(name+"의 계좌가 개설되었습니다.");
		System.out.println(name+"의 잔액은 "+money+"입니다.");
	}
	
	@Override
	public String toString() {
		return "Bank [regNo = " +regNo +"], [name = "+name+"], [money = "+money+"]";
	}
	
	public void 입금(int m) {
		money+=m;
		System.out.println(name+"의 통장에 "+m+"이 입금되어 현재 잔액은 "+money+"입니다.");
	}
	public void 출금(int m) {
		if(money>=m) { money-=m;
		System.out.println(name+"의 통장에 "+m+"이 출금되어 현재 잔액은 "+money+"입니다.");
		}
		else System.out.println("잔고가 부족해서 출금이 불가합니다.");
	}
	public void 잔액조회() {
		System.out.println(name+"의 통장잔고는 "+money+"입니다.");
	}
	
	void print() { 
		System.out.println(name+"의 계좌번호는 "+regNo+" 입니다.");
	}
	
	/*필드가 private 일때만 getter setter 가능
	public int getRegNo() { return regNo;	}
	public void setRegNo(int regNo) {this.regNo = regNo;	}
	public String getName() {	return name;	}
	public void setName(String name) {	this.name = name;	}
	public int getMoney() {	return money;	}
	public void setMoney(int money) {	this.money = money;	} */

}

//상속 - Bank가 갖고있는 거 다 갖고 내꺼 조금 추가해서 만들자 => extends Bank = Bank 확장
class BankA extends Bank {
	private int 이자율=1;
	
	//Bank안에 private 변수는 그 클래스에서만 사용 가능하고
	//자식 클래스(BankA)에서 쓰려면 protected나 public으로 쓰거나 getter setter로 불러와야함
	BankA (String name){ 
		this.name=name;  
		regNo=++No;
		System.out.print("BankA"+name+"의 계좌가 개설되었습니다.");
		System.out.println(name+"의 잔액은 "+money+"입니다.");
	}
	
	/*BankA(String name){
		super(name);	 
		// super는 부모의 생성자 - 부모 생성자 변수를 private 그대로 쓸때
	}*/
	
	//부모는 자식꺼 사용할 수 없음!
	public int get이자율() {
		return 이자율;
	}
	public void set이자율(int 이자율) {
		this.이자율 = 이자율;
	}

}


public class BankTest {

	public static void main(String[] args) {
		//생성자안에 출력있어서 자동으로 출력됨(다형성)
		Bank Kim = new Bank("김댕댕");
		Bank Park = new Bank("박댕댕",10000); 
		Bank Lee = new Bank();
		BankA Oh = new BankA("뱅크에이"); //BankA는 5개 속성을 가짐
		System.out.println();
		
		Oh.입금(10000);
		Kim.입금(5000);
		Kim.출금(10000);
		Kim.출금(1000);
		Park.잔액조회();
		
		System.out.println();
		Kim.print();
		System.out.println(Kim);
		System.out.println(Park);
		System.out.println(Lee);
		System.out.println(Oh.get이자율());
	}

}
