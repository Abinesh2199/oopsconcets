package override;

public class Axisbank extends Bankinfo {
	public void deposite() {
		System.out.println("20000");
	}
	public static void main(String[] args) {
		Axisbank sbi = new Axisbank();
		sbi.saving();
		sbi.fixed();
		sbi.deposite();
	}

}
