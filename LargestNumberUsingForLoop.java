package JavaInterviewQuestions;

public class LargestNumberUsingForLoop {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 56, 57, 5, 8};

        System.out.println(getLargest(arr));

    }

    public static int getLargest(int[] a) {
        int temp;
        for (int i = 0; i < a.length-1; i++) {
            for (int j = i + 1; j < a.length-1; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a[a.length - 2];
    }

}
