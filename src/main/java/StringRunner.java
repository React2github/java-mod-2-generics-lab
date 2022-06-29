import java.util.Arrays;

class Problem {
  static <E> String convertToString(E[] array) {
    return Arrays.toString(array);
}
}

public class StringRunner {
  public static void main(String[] args) {
    Integer[] inputInt = { 1, 2, 3 };
    String[] inputStr = { "Cake", "Donut", "Cupcake" };

    System.out.println(Problem.convertToString(inputInt)); // [1, 2, 3]
    System.out.println(Problem.convertToString(inputStr)); // [Cake, Donut, Cupcake]
  }
}