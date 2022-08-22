package JavaInterviewQuestions;

import java.util.ArrayList;
import java.util.List;

public class PalindromeNumber {

    public static void main(String[] args) {

        int num1=123454321;
        String num2=Integer.toString(num1);
        int index=num2.length();

        List<Integer> list=new ArrayList<>();
        for (int i = 0; i < index; i++) {
            list.add(num1%10); // 10 boldugumuzde kalan son rakam olur
            // ilk onu liste ekleriz dolayisiyla yeni lisrt digerinin tersi olur
            num1/=10;


        }
       String rvs="";
        for (int i = 0; i < list.size(); i++) {
            rvs+=list.get(i);
        }

        if(rvs.equals(num2))
            System.out.println("Given number is a Palindrome");
        else System.out.println("Given number is not a Palindrome");








        int num = 121;
        int rev = 0;

        int actualNum = num;

        while (num != 0) {
            int n = num % 10;
            rev = rev * 10 + n;
            num = num / 10;
        }

        System.out.println(rev);

        if (actualNum == rev) {
            System.out.println(actualNum + " is a palindrome");
        } else {
            System.out.println(actualNum + " is not a palindrome");
        }

    }

}
