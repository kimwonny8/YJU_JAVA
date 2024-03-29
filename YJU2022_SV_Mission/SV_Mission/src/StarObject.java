import java.util.ArrayList;
import java.util.Random;
import java.util.Vector;


abstract class StarObject {
	StarUI ui;
	
	Random random = new Random();
	protected String condi;	 //상태정보를 담는 변수
	protected int energy; // 객체 에너지
	protected String name; // 객체 이름
	protected String tribe; // 객체 속한 종족
	
	protected int value=0; // 상태 추가
	
	ArrayList con;//상태정보
	boolean work;//작업중인지 아닌지 파악
	boolean flag;//다른 작업을 위한 변수
	int job;//내가 할 작업
	int progress; //진행 상황
	
	Thread go;//스레드 변수
	StarObject target; //상대방 타겟
	Vector vt; // 자신의 객체 반환
	StarObject(StarUI ui){
		this.ui = ui;
	}
	
	
	public void setValue(int i){ 
		value+=i;
	}
	public int getValue() {
		return value;
	}
	
	public Object getCondition(int i){ //상태가져오기
		return con.get(i);
	}
	public String getTribe() {
		return tribe;
	}
	public String getCondition(){
		return condi;
	}
	public String getName(){
		return name;
	}
	public void setThread(Thread go){
		this.go = go;
	}
	public Thread getThread(){
		return go;
	}
	public int getEnergy() {
		return energy;
	}
	public void setFlag(boolean flag){
		this.flag = flag;
	}
	public boolean getFlag() {
		return flag;
	}
	public void setJob(int job) {
		this.job = job;
	}
	public int getJob() {
		return job;
	}
	
}
