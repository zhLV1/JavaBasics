package com.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user=new User(10,"小明");
		User user1=new User(12,"小里");
		Map<User,String> map=new HashMap<User, String>();
		map.put(user, "小明");
		map.put(user1, "kk");
		
		Iterator<User> iter=map.keySet().iterator();
		while(iter.hasNext()){
			User user2=iter.next();
			String name=map.get(user2);
		}
		
		
		
	}

}
