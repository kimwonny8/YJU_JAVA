import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.tree.*;
import javax.swing.table.*;
import javax.swing.border.*;

public class StarUI extends JFrame implements Runnable, MouseListener, ActionListener, ListSelectionListener{
	SCV scv;
	StarObject starObj;
	
	boolean effect = true;
	
	JPanel panel; //전체적인 패널
	JPanel jPanel1;//미네랄정보 패널
	JPanel jPanel2;//건물 정보 패널
	JPanel jPanel3;//유닛 정보 패널
	JPanel jPanel5;//선택 정보 패널
	JLabel U_mineralLB; //미네랄 아이콘
	JLabel U_gasLB; //가스아이콘
	JLabel U_unitLB; //유닛정보 아이콘

	JLabel[] U_BU = new JLabel[2]; //건물 및 유닛 라벨
	JLabel[] U_worker = new JLabel[10]; //scv 10마리 표시용
	static JLabel[] U_workerLB = new JLabel[10]; //유닛 상태
	
	JLabel U_nameLB; //이름
	JLabel U_powerLB; //공격력
	JLabel U_countLB; //수량
	JLabel U_energyLB;//에너지
	
	JLabel U_desc; //선택 간략 설명
	JLabel U_progressingLB; //progressing라벨
	JLabel U_tribe; // 선택 종족
	JLabel U_mineral; // 미네랄
	JLabel U_gas; // 가스
	JLabel U_unit; // 유닛
	JLabel U_slush; // "/"
	JLabel U_maxunit; // 최대 만들수 있는 유닛
	
	JLabel U_name; //선택 이름
	JLabel U_power; // 선택 파워
	JLabel U_cnt; // 선택 수량
	JLabel U_face; // 선택 페이스(아이콘)
	JLabel U_message; //메세지 출력 라벨
	JProgressBar U_energyPB; //에너지 바
	JProgressBar U_progressPB; //진행상태 바
	
	Vector U_infoTB_model_vector; //테이블 컬럼
	DefaultTableModel U_infoTB_DTM; //디폴트 테이블 모델
	JTable U_infoTB; // 테이블 선택 객체 정보
	JScrollPane U_infoTB_scroll; //테이블 스크롤바
	JButton U_selectBT; // 수행 버튼
	JComboBox cb; //선택된 객체 할수 있는일
	
	Object[] DefOB; //테이블 값 변경시켜주기위한 오브젝트

	Tribe clan; //선택된 종족 참조변수
	Thread progressing; //진행상태 바와 에너지 바를 갱신해주기위한 쓰레드
	int rowcnt; //선택된 행 변수(테이블)
	int job; // 쓰레드의 작업 컨트롤 변수
	
	public StarUI(int tribe, String User) {
		setClan(new Terran(this));
		UIManager.put("swing.boldMetal", Boolean.FALSE);
		setTitle(User);
		this.setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		panel = new JPanel(){ImageIcon i = new ImageIcon("img/map.jpg");
	    	public void paintComponent(Graphics g) {
	    		g.drawImage(i.getImage(), 0, 0, 640, 620, null);
	    	}
	    };
		panel.setLayout(null);
		
		makeComponent();
		makeSVC();
		
		getContentPane().add(panel, BorderLayout.CENTER);
		
		for(int i=0;i<2;i++){
			U_BU[i].addMouseListener(this);
		}
		U_selectBT.addActionListener(this);
		U_infoTB.getSelectionModel().addListSelectionListener(this);
		
		progressing = new Thread(this);
		progressing.start();
		
		Thread state = new Thread(new State());
		state.start();
		
	}
	
	public void setClan(Tribe clan){
		this.clan = clan;
	}
	
	public void makeComponent()
	{
		jPanel1 = new JPanel();
		jPanel1.setLayout(null);
		jPanel1.setBounds(7, 13, 692, 84);
		jPanel1.setOpaque(false);
		panel.add(jPanel1);

		jPanel2 = new JPanel();
		jPanel2.setLayout(null);
		jPanel2.setBounds(15, 100, 450, 330);
		jPanel2.setOpaque(false);
		panel.add(jPanel2);

		jPanel3 = new JPanel();
		jPanel3.setLayout(null);
		jPanel3.setBounds(480, 120, 150, 300);
		jPanel3.setOpaque(false);
		panel.add(jPanel3);
		
		jPanel5 = new JPanel();
		jPanel5.setLayout(null);
		jPanel5.setBounds(5, 450, 630, 170);
		jPanel5.setOpaque(false);
		panel.add(jPanel5);
		
		U_mineralLB = new JLabel();
		U_mineralLB.setOpaque(false);
		U_mineralLB.setIcon(new ImageIcon("img/mineral.jpg"));
		U_mineralLB.setOpaque(false);
		U_mineralLB.setBounds(300, 5, 13, 15);
		jPanel1.add(U_mineralLB);

		U_gasLB = new JLabel();
		U_gasLB.setIcon(new ImageIcon("img/gas.jpg"));
		U_gasLB.setOpaque(false);
		U_gasLB.setBounds(400, 5, 13, 15);
		jPanel1.add(U_gasLB);

		U_unitLB = new JLabel();
		U_unitLB.setIcon(new ImageIcon("img/unit.jpg"));
		U_unitLB.setOpaque(false);
		U_unitLB.setBounds(500, 5, 13, 15);
		jPanel1.add(U_unitLB);
		
		U_BU[0]=new JLabel();
		U_BU[0].setBounds(100, 0, 150, 130);
		U_BU[0].setText(clan.getMainBName());
		U_BU[0].setIcon(clan.mainBIC);
		U_BU[0].setOpaque(false);
		jPanel2.add(U_BU[0]);
				
		U_BU[1] = new JLabel();
		U_BU[1].setIcon(clan.workerIC);
		U_BU[1].setText(clan.getWorkerName());
		U_BU[1].setOpaque(false);
		U_BU[1].setBounds(0, 30, 57, 57);
		jPanel3.add(U_BU[1]);

		U_nameLB = new JLabel();
		U_nameLB.setText("이름");
		U_nameLB.setOpaque(false);
		U_nameLB.setForeground(new Color(255,255,255));
		U_nameLB.setBounds(10, 50, 45, 15);
		jPanel5.add(U_nameLB);

		U_powerLB = new JLabel();
		U_powerLB.setText("공격력");
		U_powerLB.setOpaque(false);
		U_powerLB.setForeground(new Color(255,255,255));
		U_powerLB.setBounds(10, 80, 45, 15);
		jPanel5.add(U_powerLB);

		U_countLB = new JLabel();
		U_countLB.setText("수량");
		U_countLB.setOpaque(false);
		U_countLB.setForeground(new Color(255,255,255));
		U_countLB.setBounds(10, 110, 45, 15);
		jPanel5.add(U_countLB);

		U_energyLB = new JLabel();
		U_energyLB.setText("에너지");
		U_energyLB.setOpaque(false);
		U_energyLB.setForeground(new Color(255,255,255));
		U_energyLB.setBounds(10, 140, 45, 15);
		jPanel5.add(U_energyLB);
		
		U_desc = new JLabel();
		U_desc.setHorizontalAlignment(SwingConstants.CENTER);
		U_desc.setOpaque(false);
		U_desc.setForeground(new Color(200,200,238));
		U_desc.setBounds(200,82,165,15);
		jPanel5.add(U_desc);
		
		U_progressingLB = new JLabel();
		U_progressingLB.setText("Progressing");
		U_progressingLB.setHorizontalAlignment(SwingConstants.CENTER);
		U_progressingLB.setOpaque(false);
		U_progressingLB.setForeground(new Color(200,200,238));
		U_progressingLB.setBounds(235,112,100,15);
		jPanel5.add(U_progressingLB);
		
		U_tribe = new JLabel();
		U_tribe.setText(clan.getTribeName());
		U_tribe.setOpaque(false);
		U_tribe.setForeground(new Color(32,253,44));
		U_tribe.setBounds(20, 5, 50, 15);
		jPanel1.add(U_tribe);

		U_mineral = new JLabel();
		U_mineral.setText(String.valueOf(clan.getMineral()));
		U_mineral.setForeground(new Color(32,253,44));
		U_mineral.setOpaque(false);
		U_mineral.setBounds(320, 5, 50, 15);
		jPanel1.add(U_mineral);

		U_gas = new JLabel();
		U_gas.setText(String.valueOf(clan.getGas()));
		U_gas.setForeground(new Color(32,253,44));
		U_gas.setOpaque(false);
		U_gas.setBounds(420, 5, 50, 15);
		jPanel1.add(U_gas);

		U_unit = new JLabel();
		U_unit.setText(String.valueOf(clan.getUnit()));
		U_unit.setOpaque(false);
		U_unit.setForeground(new Color(32,253,44));
		U_unit.setBounds(520, 5, 22, 15);
		jPanel1.add(U_unit);
		
		U_slush = new JLabel();
		U_slush.setText("/");
		U_slush.setOpaque(false);
		U_slush.setForeground(new Color(32,253,44));
		U_slush.setBounds(540, 5, 5, 15);
		jPanel1.add(U_slush);
		
		U_maxunit = new JLabel();
		U_maxunit.setText(String.valueOf(clan.getMaxunit()));
		U_maxunit.setOpaque(false);
		U_maxunit.setForeground(new Color(32,253,44));
		U_maxunit.setBounds(550, 5, 25, 15);
		jPanel1.add(U_maxunit);
		
		U_name = new JLabel();
		U_name.setForeground(new Color(32,253,44));
		U_name.setBounds(80, 50, 70, 15);
		jPanel5.add(U_name);

		U_power = new JLabel();
		U_power.setOpaque(false);
		U_power.setForeground(new Color(32,253,44));
		U_power.setBounds(80, 80, 70, 15);
		jPanel5.add(U_power);

		U_cnt = new JLabel();
		U_cnt.setOpaque(false);
		U_cnt.setForeground(new Color(32,253,44));
		U_cnt.setBounds(80, 110, 70, 15);
		jPanel5.add(U_cnt);
		
		U_face = new JLabel();
		U_face.setOpaque(false);
		U_face.setBounds(388,103,60,47);
		jPanel5.add(U_face);
		
		U_message = new JLabel();
		U_message.setForeground(Color.WHITE);
		U_message.setFont(new Font("Dialog.plain", 0, 15));
		U_message.setHorizontalAlignment(SwingConstants.CENTER);
		U_message.setOpaque(false);
		U_message.setBounds(195,0,250,30);
		jPanel5.add(U_message);

		U_energyPB = new JProgressBar();
		U_energyPB.setStringPainted(true);
		U_energyPB.setMinimum(0);
		U_energyPB.setMaximum(100);
		U_energyPB.setValue(0);
		U_energyPB.setOpaque(false);
		U_energyPB.setForeground(Color.RED);
		U_energyPB.setBounds(70, 140, 90, 20);
		jPanel5.add(U_energyPB);

		
		U_progressPB = new JProgressBar();
		U_progressPB.setOpaque(false);
		U_progressPB.setStringPainted(true);
		U_progressPB.setMinimum(0);
		U_progressPB.setMaximum(100);
		U_progressPB.setValue(0);
		U_progressPB.setForeground(Color.BLUE);
		U_progressPB.setBounds(220, 130, 124, 27);
		jPanel5.add(U_progressPB);

		U_infoTB_model_vector = new Vector();
		U_infoTB_model_vector.addElement("이름");
		U_infoTB_model_vector.addElement("상태");
		U_infoTB_DTM = new DefaultTableModel(U_infoTB_model_vector, 0){ //셀편집안되게 처리
			   public boolean isCellEditable(int row,int col){
				    return false;
				   }
				  };
		U_infoTB = new JTable(U_infoTB_DTM);
		U_infoTB.setOpaque(true);
		U_infoTB_scroll = new JScrollPane(U_infoTB);
		U_infoTB_scroll.setBounds(480, 10, 150, 90);
		jPanel5.add(U_infoTB_scroll);
		
		cb = new JComboBox();
		cb.setOpaque(false);
		cb.setBounds(500, 105, 110, 20);
		jPanel5.add(cb);
		
		U_selectBT = new JButton();
		U_selectBT.setText("선택");
		U_selectBT.setOpaque(false);
		U_selectBT.setForeground(new Color(-13421773));
		U_selectBT.setBounds(515, 130, 80, 30);
		jPanel5.add(U_selectBT);
	}
	
	public void makeSVC() {
		U_worker[0] = new JLabel();
		U_worker[0].setIcon(clan.workerIC);
		U_worker[0].setText(clan.getWorkerName());
		U_worker[0].setOpaque(false);
		U_worker[0].setBounds(100, 250, 57, 57);
		panel.add(U_worker[0]);
		
		U_worker[1] = new JLabel();
		U_worker[1].setIcon(clan.workerIC);
		U_worker[1].setText(clan.getWorkerName());
		U_worker[1].setOpaque(false);
		U_worker[1].setBounds(200, 250, 57, 57);
		panel.add(U_worker[1]);
		
		U_worker[2] = new JLabel();
		U_worker[2].setIcon(clan.workerIC);
		U_worker[2].setText(clan.getWorkerName());
		U_worker[2].setOpaque(false);
		U_worker[2].setBounds(300, 250, 57, 57);
		panel.add(U_worker[2]);
		
		U_worker[3] = new JLabel();
		U_worker[3].setIcon(clan.workerIC);
		U_worker[3].setText(clan.getWorkerName());
		U_worker[3].setOpaque(false);
		U_worker[3].setBounds(400, 250, 57, 57);
		panel.add(U_worker[3]);
		
		U_worker[4] = new JLabel();
		U_worker[4].setIcon(clan.workerIC);
		U_worker[4].setText(clan.getWorkerName());
		U_worker[4].setOpaque(false);
		U_worker[4].setBounds(500, 250, 57, 57);
		panel.add(U_worker[4]);
		
		U_worker[5] = new JLabel();
		U_worker[5].setIcon(clan.workerIC);
		U_worker[5].setText(clan.getWorkerName());
		U_worker[5].setOpaque(false);
		U_worker[5].setBounds(100, 340, 57, 57);
		panel.add(U_worker[5]);
		
		U_worker[6] = new JLabel();
		U_worker[6].setIcon(clan.workerIC);
		U_worker[6].setText(clan.getWorkerName());
		U_worker[6].setOpaque(false);
		U_worker[6].setBounds(200, 340, 57, 57);
		panel.add(U_worker[6]);
		
		U_worker[7] = new JLabel();
		U_worker[7].setIcon(clan.workerIC);
		U_worker[7].setText(clan.getWorkerName());
		U_worker[7].setOpaque(false);
		U_worker[7].setBounds(300, 340, 57, 57);
		panel.add(U_worker[7]);
		
		U_worker[8] = new JLabel();
		U_worker[8].setIcon(clan.workerIC);
		U_worker[8].setText(clan.getWorkerName());
		U_worker[8].setOpaque(false);
		U_worker[8].setBounds(400, 340, 57, 57);
		panel.add(U_worker[8]);
		
		U_worker[9] = new JLabel();
		U_worker[9].setIcon(clan.workerIC);
		U_worker[9].setText(clan.getWorkerName());
		U_worker[9].setOpaque(false);
		U_worker[9].setBounds(500, 340, 57, 57);
		panel.add(U_worker[9]);
		
		U_workerLB[0] = new JLabel();
		U_workerLB[0].setOpaque(false);
		U_workerLB[0].setBounds(110, 310, 57, 21);
		U_workerLB[0].setForeground(Color.white);
		panel.add(U_workerLB[0]);
		
		U_workerLB[1] = new JLabel();
		U_workerLB[1].setOpaque(false);
		U_workerLB[1].setBounds(210, 310, 57, 21);
		U_workerLB[1].setForeground(Color.white);
		panel.add(U_workerLB[1]);
		
		U_workerLB[2] = new JLabel();
		U_workerLB[2].setOpaque(false);
		U_workerLB[2].setBounds(310, 310, 57, 21);
		U_workerLB[2].setForeground(Color.white);
		panel.add(U_workerLB[2]);
		
		U_workerLB[3] = new JLabel();
		U_workerLB[3].setOpaque(false);
		U_workerLB[3].setBounds(410, 310, 57, 21);
		U_workerLB[3].setForeground(Color.white);
		panel.add(U_workerLB[3]);
		
		U_workerLB[4] = new JLabel();
		U_workerLB[4].setOpaque(false);
		U_workerLB[4].setBounds(510, 310, 57, 21);
		U_workerLB[4].setForeground(Color.white);
		panel.add(U_workerLB[4]);
		
		U_workerLB[5] = new JLabel();
		U_workerLB[5].setOpaque(false);
		U_workerLB[5].setBounds(110, 395, 57, 21);
		U_workerLB[5].setForeground(Color.white);
		panel.add(U_workerLB[5]);
		
		U_workerLB[6] = new JLabel();
		U_workerLB[6].setOpaque(false);
		U_workerLB[6].setBounds(210, 395, 57, 21);
		U_workerLB[6].setForeground(Color.white);
		panel.add(U_workerLB[6]);
		
		U_workerLB[7] = new JLabel();
		U_workerLB[7].setOpaque(false);
		U_workerLB[7].setBounds(310, 395, 57, 21);
		U_workerLB[7].setForeground(Color.white);
		panel.add(U_workerLB[7]);
		
		U_workerLB[8] = new JLabel();
		U_workerLB[8].setOpaque(false);
		U_workerLB[8].setBounds(410, 395, 57, 21);
		U_workerLB[8].setForeground(Color.white);
		panel.add(U_workerLB[8]);
		
		U_workerLB[9] = new JLabel();
		U_workerLB[9].setOpaque(false);
		U_workerLB[9].setBounds(510, 395, 57, 21);
		U_workerLB[9].setForeground(Color.white);
		panel.add(U_workerLB[9]);

	}
	
	synchronized public void setTB(ArrayList mainBVT){ // 다중 테이블 선택시 여러개의 스레드가(예 일꾼스레드)동시에 접근하여 테이블수정하는것을 막음.
		DefOB = new Object[2];
		StarObject so;
		
		while(U_infoTB_DTM.getRowCount()>=1){
			U_infoTB_DTM.removeRow(0);
		}
		for(int i=0; i<mainBVT.size(); i++){
			so=(StarObject)(mainBVT.get(i));
			DefOB[0]=so.getName();
			DefOB[1]=so.getCondition();
		
			U_infoTB_DTM.insertRow(i, DefOB);
		}

	}
	
	public void setMessage(String msg){
		for(int i = 0; i<4;i++){
			U_message.setText(msg);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {}
			U_message.setText("");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {}
		}
	}	

	public void mouseClicked(MouseEvent me){
		if(me.getSource()==U_BU[0]){
			job=0;
			U_desc.setText(clan.mainBdesc);
			U_face.setIcon(clan.buildingface);
			setInfo(clan.getMainBName(), "없음", String.valueOf(clan.mainBVT.size()));
			setTB(clan.mainBVT);
			U_energyPB.setValue(0);
			U_energyPB.setMaximum(clan.getMainBEnergy());
			U_progressPB.setValue(0);
			cb.removeAllItems();
			for(int i=0;i<clan.mainBItem.size();i++)
				cb.addItem(clan.mainBItem.get(i));
		}
		if(me.getSource()==U_BU[1]){
			job=0;
			U_desc.setText(clan.workerdesc);
			U_face.setIcon(clan.workerface);
			setInfo(clan.getWorkerName(), String.valueOf(clan.getWorkerpower())+" + "+String.valueOf(clan.getUpgrade()), String.valueOf(clan.workerVT.size()));
			setTB(clan.workerVT);
			U_energyPB.setValue(0);
			U_energyPB.setMaximum(clan.getWorkerEnergy());
			U_progressPB.setValue(0);
			cb.removeAllItems();
			for(int i=0;i<clan.workerItem.size();i++)
				cb.addItem(clan.workerItem.get(i));
		}
	}	
	public void mouseEntered(MouseEvent me){
		for(int i=0;i<2;i++){				
			if(me.getSource()==U_BU[i]){
				U_BU[i].setBorder(new BevelBorder(BevelBorder.RAISED));
			}
		}
	}
	public void mouseExited(MouseEvent me){
		for(int i=0;i<2;i++){
			if(me.getSource()==U_BU[i]){
				U_BU[i].setBorder(null);
			}
		}
	}
	public void mousePressed(MouseEvent me){
		for(int i=0;i<2;i++){			
			if(me.getSource()==U_BU[i]){
				U_BU[i].setBorder(new BevelBorder(BevelBorder.LOWERED));
			}
		}
	}
	public void mouseReleased(MouseEvent me){
		for(int i=0;i<2;i++){			
			if(me.getSource()==U_BU[i]){
				U_BU[i].setBorder(new BevelBorder(BevelBorder.RAISED));
			}
		}
	}
	
	public void ChangeJob(int job, ArrayList workerVT){
		int index[];
		index=U_infoTB.getSelectedRows(); //다중 선택 행 번호 반환
		for(int i=0;i<index.length;i++){
			((StarObject)(workerVT.get(index[i]))).go.interrupt(); //하던일 중지 예외 발생시킴 스레드 죽임
			((StarObject)(workerVT.get(index[i]))).setFlag(false); //하던일 중지 시킨다음
			((StarObject)(workerVT.get(index[i]))).setJob(job); //새로운 작업 부여
			((StarObject)(workerVT.get(index[i]))).getThread().resume();  //시작
		}
	}
	@SuppressWarnings("deprecation")
	public void actionPerformed(ActionEvent e){
		int[] i;
		i=U_infoTB.getSelectedRows();
		if(e.getSource()==U_selectBT){ //수행 버튼이 클릭되면
			if(U_name.getText()==clan.getWorkerName()){
				if((String)cb.getSelectedItem()=="미네랄"){
					ChangeJob(1,clan.workerVT);
				}
				else if((String)cb.getSelectedItem()=="가스"){
					ChangeJob(2,clan.workerVT);
				}
				else if((String)cb.getSelectedItem()==clan.getMainBName()){					
					ChangeJob(3,clan.workerVT);
				}
			}
			
			if(U_name.getText()==clan.getMainBName()){
				if((String)cb.getSelectedItem()==clan.getWorkerName()){
					ChangeJob(1,clan.mainBVT);
				}
			}
		}
	}
	public void setInfo(String name, String power, String count){
		U_name.setText(name);
		U_power.setText(power);
		U_cnt.setText(count);
	}
	public void run(){
		while(true){
			switch(job){
			case 0:
				U_progressPB.setValue(0);
				try { //시스템 과부하 줄이기 위해 텀줌..없애면 다운 먹음..리소스 엄청 먹는다...
					Thread.sleep(10);
				} catch (InterruptedException e) {}
				break;
			case 1:
				setProgress(clan.mainBVT);
				if(clan.mainBVT.size()!=0)
					setEnergy(clan.mainBVT);
				try { //시스템 과부하 줄이기 위해 텀줌..없애면 다운 먹음..리소스 엄청 먹는다...
						Thread.sleep(10);
					} catch (InterruptedException e) {}
				break;
			case 5:
				setProgress(clan.workerVT);
				if(clan.workerVT.size()!=0)
					setEnergy(clan.workerVT);
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {}
				break;			
			}	
			
		}
	}
	
	
	public void setEnergy(ArrayList mainBVT){
		StarObject so;
		if(mainBVT.size()!=0){
			try{
			so=(StarObject)(mainBVT.get(rowcnt));
			U_energyPB.setValue(so.energy);
			}catch(Exception e){}
			
		}
	}
	public void setProgress(ArrayList mainBVT){
		StarObject so;
		if(mainBVT.size()!=0){
			try{
				so=(StarObject)(mainBVT.get(getRowcnt()));
				U_progressPB.setValue(so.progress);
			}
			catch(Exception e){}
		}
	}
	synchronized int getRowcnt(){
		return rowcnt;
	}
	public void valueChanged(ListSelectionEvent event) {
		if(!U_infoTB.getSelectionModel().isSelectionEmpty()){ //테이블 선택되었을 경우
			rowcnt=U_infoTB.getSelectedRow(); //테이블 선택 행 번호 얻기
			if(U_infoTB_DTM.getValueAt(0, 0)==clan.getMainBName()){ //본건물 선택되었을 경우
				job=1; //프로그레스바 스레드 돌리기
			}
			if(U_infoTB_DTM.getValueAt(0, 0)==clan.getWorkerName()){//일꾼 선택되었을경우
				job=5;	
			}
		}
		else{
			U_progressPB.setValue(0);
			U_energyPB.setValue(0);
		}
    }
	public void endMessage(String msg){ //종료 메세지
		JOptionPane.showMessageDialog(this,msg);
	}
	
} 

// SCV 아래 라벨 아이콘, 글자 추가 (Thread 연습)
class State implements Runnable {
	   ImageIcon mineralImg=new ImageIcon("img/work1.png");
	   ImageIcon gasImg=new ImageIcon("img/work2.png");
	   ImageIcon comImg=new ImageIcon("img/work3.png");
	   
	   StarUI ui;
	   
	   public void run() {
	      while (true) {
	         for (int i=0; i <Terran.workerVT.size(); i++) {
	         
	            try {
	               Thread.sleep(100); 
	            } catch (InterruptedException e) {
	               e.printStackTrace();
	            }

	            if (((StarObject)Terran.workerVT.get(i)).getCondition().equals("미네랄")) {
	               ui.U_workerLB[i].setText(String.valueOf(((StarObject)Terran.workerVT.get(i)).getValue()));
	               ui.U_workerLB[i].setIcon(mineralImg);
	            }

	            else if (((StarObject)Terran.workerVT.get(i)).getCondition().equals("가스")) {
	               ui.U_workerLB[i].setText(String.valueOf(((StarObject)Terran.workerVT.get(i)).getValue()));
	               ui.U_workerLB[i].setIcon(gasImg);
	            }
	            else if(((StarObject)Terran.workerVT.get(i)).getCondition().equals("커맨드")) { 
	               ui.U_workerLB[i].setText(String.valueOf(((StarObject)Terran.workerVT.get(i)).progress)+"%");
	               ui.U_workerLB[i].setIcon(comImg);
	            }
	            else {
	               ui.U_workerLB[i].setText("노는 중");
	               ui.U_workerLB[i].setIcon(null);
	            
	            }
	         }
	      }
	   }
	}
