package JavaInterviewQuestions.src;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumberInterval {

    public static void main(String[] args) {

        //20 to 50
        //1. method
        List<Integer>primeNumberList=new ArrayList<>();

        for (int i = 20; i <=50 ; i++) {
            if(i%2!=0&&i%3!=0&&i%5!=0&&i%7!=0){
                primeNumberList.add(i);

            }
        }
        System.out.println(primeNumberList);



        //2. method
        int low = 20, high = 50;

        while (low < high) {
            boolean flag = false;

            for (int i = 2; i <= low / 2; ++i) {
                // condition for nonprime number
                if (low % i == 0) {
                    flag = true;
                    break;
                }
            }

            if (!flag && low != 0 && low != 1)
                System.out.print(low + " ");

            ++low;
        }
    }

}
