package JavaInterviewQuestions;

public class ArmstrongNumber {

    public static void main(String[] args) {


        // correct all of armstrong numbers

        int num2 = 1634;
        double num2ToDouble = (double) num2;
        String num3 = Integer.toString(num2);
        int index = num3.length();

        int arr[] = new int[index];

        for (int i = 0; i < index; i++) {
            arr[i] = num2 % 10;
            num2 /= 10;
        }

        //System.out.println("arr" + Arrays.toString(arr));
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += Math.pow((double) arr[i], (double) index); //kuvvet alma

        }

        if (sum == num2ToDouble)
            System.out.println("Given number is an Armstrong Number");

        else System.out.println("Given number is not an Armstrong Number");

        //153 = 1*1*1 5*5*5 3*3*3 = 1 + 125 + 27 = 153

        int num = 153;
        int number;
        int temp;
        int total = 0;

        number = num;
        while (number != 0) {
            temp = number % 10;
            total = total + temp * temp * temp;
            number /= 10;
        }

        if (total == num)
            System.out.println(num + " is an Armstrong number");
        else
            System.out.println(num + " is not an Armstrong number");
    }


}
