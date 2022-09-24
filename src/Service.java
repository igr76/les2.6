import java.util.ArrayList;
import java.util.List;

public class Service {
    static List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
    static List<String> strings = new ArrayList<>(List.of("111", "nnn", "nnn", "kkk", "kiu", "kkk"));

    public static void odd() {
        for (Integer num : nums) {
            if (num % 2 != 0) {
                System.out.print(num + " , ");
            }
        }
    }

    public static void od() {
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 != 0) {
                System.out.print(nums.get(i) + " , ");
            }

        }
    }


    public static void even() {


        int previous = 0;
        for (int e = 0; e < nums.size(); e++) {
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < nums.size(); i++) {

                if ((nums.get(i) % 2) == 0) {
                    if (nums.get(i) < min && nums.get(i) > previous) {
                        min = nums.get(i);
                    }
                }
            }
            if (min == Integer.MAX_VALUE) {
                break;
            }
            System.out.print(min + " , ");
            previous = min;


        }

    }

    public static void duble() {
        for (int i = 0; i < strings.size(); i++) {
            for (int e = 0; e < strings.size(); e++) {
                if (e != i) {
                    if (strings.get(i) == strings.get(e)) {
                        System.out.println("дубль: " + strings.get(i));

                    }
                }
            }
        }

    }
    public static void summDuble() {
        int summ =0;
        for (int i = 0; i < strings.size(); i++) {
            for (int e = 0; e < strings.size(); e++) {
                if (e != i) {
                    if (strings.get(i) == strings.get(e)) {
                        summ++;

                    }
                }
            }
        }
        System.out.println("Cумма дублей :" + summ);

    }
}





