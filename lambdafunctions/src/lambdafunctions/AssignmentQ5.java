package lambdafunctions;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class AssignmentQ5 {
	List<String> list = Arrays.asList("aa", "bb", "cc", "dd");
	public static void main(String[] args) {
		AssignmentQ5 assignmentQ5 = new AssignmentQ5();
        processWords(assignmentQ5.list);
	}
	public static String processWords(List<String> list) {
        StringBuilder words = new StringBuilder();
        Consumer<String> consumer = p-> words.append(p.charAt(0));

         list.stream().forEach(consumer);
        System.out.println(words);
        return  words.toString();
    }

}
