package JavaInterviewQuestions.src;

public class FactorOfNumbers {

    public static void main(String[] args) {
        //factors: bolen
        int number = 66;

        System.out.print("Factors of " + number + " are: ");
        for (int i = 1; i <= number; ++i) {
            if (number % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
