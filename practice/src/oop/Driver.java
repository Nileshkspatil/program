package oop;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog ref=new Dog();
		ref.bark();
		ref.eat();
		ref.run();
		System.out.println("============================");
		Animal ref1=new Dog();
		ref1.eat();
		ref1.run();
		System.out.println("==========Abstract class==================");
		
		Bike b=new Honda();
		b.run();
		b.start();
		
		Honda h=(Honda)b;
		h.stop();
		System.out.println("=======Interface===============");
		
		Vehical v=new Honda();
		v.dimesions();
		v.engine();
		Vehical.wheel();
		System.out.println(Vehical.price);
		 
		Honda h1=(Honda)v;
		h1.stop();
	}

}
