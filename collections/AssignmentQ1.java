package collections;

import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class AssignmentQ1 {
	public static void main(String[] args) {
		contact c1 = new contact(9545794554L,"mani","mani@gmail.com",gender.MALE);
		contact c2 = new contact(8894561233L,"surya","surya@gmail.com",gender.MALE);
		contact c3 = new contact(5554855554L,"pavan","pavan@gmail.com",gender.MALE);
		contact c4 = new contact(6989874512L,"naveen","naveen@gmail.com",gender.MALE);
		contact c5 = new contact(9215478977L,"ganesh","ganesh@gmail.com",gender.MALE);
		TreeMap<Long,contact> TM = new TreeMap<Long, contact>(Collections.reverseOrder());
		TM.put(c1.Phonenumber, c1);
		TM.put(c2.Phonenumber, c2);
		TM.put(c3.Phonenumber, c3);
		TM.put(c4.Phonenumber, c4);
		TM.put(c5.Phonenumber, c5);
		Set<Map.Entry<Long,contact>> entries= TM.entrySet();
		entries.forEach(entry ->
		{System.out.println(entry.getKey()+":"+entry.getValue());
		});
	}

}
class contact
{
	long Phonenumber;
	String Name;
	String Email;
	enum gender{
		MALE,
		FEMALE;
	}
	public gender gender;
	public contact()
	{
		System.out.println("Default constructor");
	}
	public contact(long Phonenumber,String Name,String Email,gender gender)
	{
		this.Phonenumber=Phonenumber;
		this.Name=Name;
		this.Email=Email;
		this.gender=gender;
	}
	public String toString()
	{
		return "["+this.Name+","+this.Email+","+this.gender+"]";
	}

}
