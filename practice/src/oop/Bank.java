package oop;

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Atm ref=new Atm();
		ref.withdraw();
		ref.setMoney(789999);
		System.out.println(ref.getMoney());

	}

}
