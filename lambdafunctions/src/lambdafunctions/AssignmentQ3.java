package lambdafunctions;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class AssignmentQ3 {
	static void modifyValue()
	{
		Product p1 = new Product();
		Consumer <Product> setA = t->t.setA(10);
		setA.accept(p1);

		Supplier<Double> setA2 = ()->Math.random();
		System.out.println(setA2.get());
	}
    static class Product 
    { 
    	int a;
    	double b;
    	
		public int getA() {
			return a;
		}

		public void setA(int a) {
			this.a = a;
		}
    	
    }
    static void display()
    {
    	Product p2 = new Product();
    	p2.setA(20);
    	Predicate<Product> LessThan = t1->(t1.getA()<10);
    	System.out.println(LessThan.test(p2));
    	Function<Product,Integer> Percentage = t2->(t2.getA()*100);
    	System.out.println(Percentage.apply(p2));
    }
	
	public static void main(String[] args) 
	{
		modifyValue();
		display();

		
	}

}
