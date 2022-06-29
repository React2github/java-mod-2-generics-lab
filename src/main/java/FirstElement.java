

class Problem {
     static <E> E getFirstElement(E[] array) {
        if(array.length > 0) {
            return array[0]; 
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
