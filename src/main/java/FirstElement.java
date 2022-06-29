import java.util.Arrays;

class Problem {
     static <E> String getFirstElement(E[] array) {
        if(array.length > 0) {
            return Arrays.toString(array); 
        } 
        else {
            return null;
        }
        
    }
}

public class FirstElement {
    public static void main(String[] args) {
        Integer[] inputInt = { 1, 2, 3 };
        Integer[] inputEmpty = new Integer[5];
        String[] inputStr = { "Cake", "Donut", "Cupcake" };

        System.out.println(Problem.getFirstElement(inputInt)); // 1
        System.out.println(Problem.getFirstElement(inputEmpty)); // null
        System.out.println(Problem.getFirstElement(inputStr)); // Cake
    }
}
