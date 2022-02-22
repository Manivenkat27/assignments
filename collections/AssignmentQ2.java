package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

public class AssignmentQ2 {
	public static void main(String[] args) {
		Student s1 = new Student("hahaha",14,"Ninth","c");
		Student s2 = new Student("lalalal",15,"Tenth","A");
		Student s3 = new Student("mamama",13,"Eigth","B");
		Student s4 = new Student("nananan",12,"seventh","D");
		Student s5 = new Student("uauauau",11,"Fifth","C");
		Student s6 = new Student("oaoaoaoa",10,"sixth","E");
		Student s7 = new Student("papapapa",13,"seventh","B");
		Student s8 = new Student("kakakaka",14,"Ninth","c");
		Student s9 = new Student("babababa",13,"ninth","A");
		Student s10 = new Student("ahahaha",12,"seventh","B");
		Student s11 = new Student("yayayaya",12,"seventh","B");
		Student s12 = new Student("vavavav",15,"Tenth","A");
		HashSet<Student> hs = new HashSet<Student>();
		hs.add(s1);
		hs.add(s2);
		hs.add(s3);
		hs.add(s4);
		
		hs.add(s5);
		hs.add(s6);
		hs.add(s7);
		hs.add(s8);
		hs.add(s9);
		hs.add(s10);
		hs.add(s11);
		hs.add(s12);
		Iterator<Student> it = hs.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
			
	}

}

class Student
{
	String name;
	int age;
	String Standard;
	String Section;
	public Student(String name,int age,String Standard,String Section)
	{
		this.name=name;
		this.age=age;
		this.Standard=Standard;
		this.Section=Section;
	}
	public String toString()
	{
		return "["+this.name+","+this.age+","+this.Standard+","+this.Section+"]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(Section, Standard, age, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(Section, other.Section) && Objects.equals(Standard, other.Standard) && age == other.age
				&& Objects.equals(name, other.name);
	}

}
