package oopsassign;

public class Assignment2Q1 {
	public static void main(String[] args) {
			SingletonInheritanceCheck obj1 = SingletonInheritanceCheck.getObject();


		}

	}
	class SingletonInheritanceCheck
	{ 
		static SingletonInheritanceCheck obj = new SingletonInheritanceCheck();

		private SingletonInheritanceCheck()
		{
			System.out.println("This is a private constructor of singleton class ");
		}

		public static SingletonInheritanceCheck getObject()
		{
			return obj;
		}




	}

