package JavaInterviewQuestions.src;

public class StepsRegular {

    public static void main(String[] args) {

        /*
         * 1
         * 12
         * 123
         * 1234
         * 12345
         */


        for (int x = 1; x <= 5; x++) {
            for (int y = 1; y <= x; y++) {
                System.out.print(y + " ");
            }
            System.out.println();
        }


    }

}
