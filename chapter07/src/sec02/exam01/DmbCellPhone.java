package sec02.exam01;

public class DmbCellPhone extends CellPhone {
	
	//�ʵ�
	int channel;
	
	//������
	DmbCellPhone(String model, String color, int channel){
		this.model = model;	//
		this.color = color;	//CellPhone���κ��� ��ӹ��� �ʵ�
		this.channel = channel;
	}
	
	//�޼ҵ�
	void turnOnDmb() {
		System.out.println("" + channel + "�� DMB ��� ������ �����մϴ�.");
	}
	
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("ä�� " + channel + "������ �ٲߴϴ�.");
	}
	
	void turnOffDmb() {
		System.out.println("DMB ��� ������ ����ϴ�.");
	}
	
}
