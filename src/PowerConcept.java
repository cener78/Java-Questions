package JavaInterviewQuestions.src;

public class PowerConcept {

    public static void main(String[] args) {

        //3^4 = 81

        int base = 3, exponent = 4;

        long result = 1;
        while (exponent != 0) {
            result *= base;
            --exponent;
        }

        System.out.println("Answer = " + result);

    }

}
