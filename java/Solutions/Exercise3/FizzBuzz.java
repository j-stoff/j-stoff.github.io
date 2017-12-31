public class FizzBuzz {
    public static void main(String[] args) {
        for (int index = 0; index < 100; index++) {
            System.out.println("Index: " + index);
            if (index % 3 == 0) {
                System.out.print("Fizz");
                if (index % 5 == 0) {
                    System.out.print("Buzz");
                }
                System.out.println();
            } else if (index % 5 == 0) {
                System.out.println("Buzz");
            }
        }
    }
}