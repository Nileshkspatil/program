package oop;

public class Atm {
	
	private double money;
	
	public void withdraw() {
		 System.out.println("you can withdraw money");
		 
	}
	public void setMoney(double money) {
		this.money=money;
	}
	
	public double getMoney() {
		return money;
	}

}
