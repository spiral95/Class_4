package Tasks;

import java.util.ArrayList;

public class Task_29 {

        public static void main(String[] args) {
            int element = 10;
            int negative = 3;
            ArrayList<Integer> mark = new ArrayList<Integer>(element);

            for (int i = 0; i < element; i++) {
                int a = (int) (Math.random() * 5 + 1);
                mark.add(a);
            }
            System.out.println(mark);

            ArrayList<Integer> negativeList = new ArrayList<Integer>();
            for (int i = 0; i < element; i++) {
                int k = mark.get(i);
                if (k <= negative) {
                    negativeList.add(k);
                }
            }
            mark.removeAll(negativeList);
            System.out.println(mark);
        }
    }
