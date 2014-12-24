package day7.hashcode;

public class Person {
	private String name;
	private int age;
	private long salary;

	public void Person(String name, int age) {
		this.name = name;
		this.age = age;
		salary = 1000;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Person) {
			Person p = (Person) obj;
			if (name != null && name.equals(p.name) && p.age == age
					&& p.salary == salary) {
				return true;
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
		int result = 25;
		result = 37 * result + name.hashCode();
		result = 37 * result + age;
		result = 37 * result + new Long(salary).hashCode();
		return result;
//		copy implementation
//		public int hashCode() {
//      return (int)(value ^ (value >>> 32));
	}

}
