package lambdafunctions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class AssignmentQ2 {
	private int totalPrice;
	private String status;

	public AssignmentQ2(int totalPrice, String status) {
		super();
		this.totalPrice = totalPrice;
		this.status = status;
	}

	public static ArrayList<AssignmentQ2> listOfOrders(ArrayList<AssignmentQ2> orders)
	{

		ArrayList<AssignmentQ2> filtered_data = orders.stream().filter(p -> p.totalPrice > 10000)
				.filter(p -> p.status.equals("ACCEPTED") || p.status.equals("COMPLETED"))
				.collect(Collectors.toCollection(ArrayList::new));
		return filtered_data;
	}

	public static void main(String[] args) 
	{
		ArrayList<AssignmentQ2> ordersArrayList = new ArrayList<AssignmentQ2>(
				Arrays.asList(new AssignmentQ2(11000, "COMPLETED"), new AssignmentQ2(8000, "COMPLETED"),
						new AssignmentQ2(12000, "ACCEPTED")));
		listOfOrders(ordersArrayList)
				.forEach(Assignment4Q2 -> System.out.println(Assignment4Q2.totalPrice + ": " + Assignment4Q2.status));

	}

}
