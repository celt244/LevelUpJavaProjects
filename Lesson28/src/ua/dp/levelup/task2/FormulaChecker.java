package ua.dp.levelup.task2;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by java on 24.02.2017.
 */
public class FormulaChecker {

    public static void main(String[] args) {
        String formula = "(a + b)";

        String mistakes = findMistakes(formula);
    }

    private static String findMistakes(String formula) {

        char[] arr = formula.toCharArray();

        Deque<Integer> deque = new LinkedList<>();

        for(int i = 0; i < arr.length; i++) {
            if (arr[i] == '(') {
                deque.offer(i);
            } else if (arr[i]== ')') {
                Integer lastIndex = deque.peekLast();
                if (!deque.isEmpty() && arr[lastIndex] == '(') {
                    deque.removeLast();
                   }  else {
                    deque.offer(i);
                }

            }
        }

        if (deque.isEmpty()){
            return  null;
        }

        StringBuilder builder = new StringBuilder(formula.replaceAll(".", " "));

        Iterator<Integer> iter = deque.iterator();
        while (iter.hasNext()) {
            int currentIndex = iter.next();
            builder.setCharAt(currentIndex, '^');
        }
        return builder.toString();
    }
}
