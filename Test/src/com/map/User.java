package com.map;

public class User {

	private int age;
	private String name;
	public int getAge() {
		return age;
	}
	
	public User(){
		super();
	}
	
	/**
	 * 
	 * @param age
	 * @param name
	 */
	public User(int age,String name){
		super();
		this.age=age;
		this.name=name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int hashCode() {
		System.out.println("������hashCode");
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	
}
