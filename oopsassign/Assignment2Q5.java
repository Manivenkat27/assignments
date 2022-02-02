package oopsassign;

public class Assignment2Q5 {
	public static void main(String[] args) {
		Rectangle5 R = new Rectangle5();
		System.out.println(R.draw());
		Line5 L = new Line5();
		System.out.println(L.draw());
		Cube5 C = new Cube5();
		System.out.println(C.draw());


	}

}
abstract class Shape5 {
    abstract public String draw();
}
class Rectangle5 extends Shape5 {
    @Override
    public String draw()
    {
    	return "drawing a reactangle";
    }
}

class Line5 extends Shape5{
    @Override
    public String draw()
    {
    	return "drawing a line";
    }
}

class Cube5 extends Shape5 {
    @Override
    public String draw()
    {
    	return "drawing a cube";
    }

}
