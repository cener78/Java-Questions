package JavaInterviewQuestions;

public class StepsReverse {

    public static void main(String[] args) {

        /*
         * 54321
         * 5432
         * 543
         * 54
         * 5
         */
        for (int x = 0; x <= 6; x++) {
            for (int y = 5; y > x; y--) {
                System.out.print(y + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < 6; i++) {
            for (int j = 5; j >i ; j--) {
                System.out.print("*"+" ");

            }
            System.out.println();
        }

    }

}
