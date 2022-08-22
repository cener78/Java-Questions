package JavaInterviewQuestions;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LargestNumberInArrayUsingCollections {

    public static void main(String[] args) {

        Integer x[] = {4, 3, 5, 76, 89};
        System.out.println(getLargest(x)); // 4 is index number. If you have more index you have to change value

    }

    public static int getLargest(Integer[] a) {
        List<Integer> list = Arrays.asList(a);
        Collections.sort(list);
        int element = list.get(a.length - 1);
        return element;
    }

}
