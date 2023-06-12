import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class Main {

    public static int strengthCount(int num){
       int counter = 0;
       while(num != 1){
           if(num%2==0){
               num /= 2;
               counter++;
           }else {
               num = num*3+1;
               counter++;
           }
       }

        return counter;
    }

    public static void main(String[] args){
    int low = 7;
    int high = 11;
    int k = 4;

        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i = low; i <= high; i++){
            numbers.add(i);
        }
        System.out.println(numbers);

        Collections.sort(numbers, new Comparator<Integer>() {

            public int compare(Integer a, Integer b) {
                int strengthA = strengthCount(a);
                int strengthB = strengthCount(b);
                if (strengthA == strengthB) {
                    return a - b;
                } else {
                    return strengthA - strengthB;
                }
            }
        });
        System.out.println(numbers.get(k - 1));
    }
}
