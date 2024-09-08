package oop;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Driver2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<User> users=new ArrayList<>();
		users.add( new User(1,"nilesh",29));
		users.add( new User(2,"harshal", 31));
		users.add(new User(3,"charan",19));
		users.add(new User(4,"teja",22));
		System.out.println(users);
		
		Map<String, Integer> map=users.stream().filter(p->p.age>25).collect(Collectors.toMap(User::getName, User::getAge));
		
		System.out.println(map);
		//Iterate by using value set lly for keyset
		
		users.stream().collect(Collectors.toMap(User::getId, User::getName)).values().stream().forEach(System.out::print);
		//sort the map
		System.out.println();
		users.stream().collect(Collectors.toMap(User::getId, User::getName,(o1,o2)->o1)).entrySet()
		.stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::print);

	}

}
