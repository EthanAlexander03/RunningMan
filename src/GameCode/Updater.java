package GameCode;

import collections.LinkedList;
import tools.Sort;

/**
 * Updater.java - description
 *
 * @author Ethan Alexander
 * @since Mar. 17, 2021,10:59:21 a.m.
 */
//public class Updater <T> {
public class Updater {

    private static int scoreBoardSize = 10;

    public LinkedList<Integer> add(LinkedList<Integer> list, Integer number) {
        LinkedList<Integer> newList = new LinkedList<>();
        newList = list.clone();
        newList.add(number);
        Sort sort = new Sort();
        sort.bubble(newList);
        while (newList.size() != scoreBoardSize) {
            newList.removeBack();
        }
        return newList;
    }

    public void output(LinkedList<Integer> list, Integer newNumber) {
        String text = "Highscores \n";
        for (int i = 0; i < scoreBoardSize; i++) {
            if (newNumber != list.get(i)) {
                text += (i + 1) + ". " + list.get(i) + "\n";
            } else {
                text += (i + 1) + ". " + list.get(i) + " <-\n";
            }
        }
        text += "\nYour Score -> " + newNumber;
        System.out.println(text);
    }

    public int getScoreBoardSize() {
        return scoreBoardSize;
    }

    public void setScoreBoardeSize(int newSize) {
        int oldSize = scoreBoardSize;
        scoreBoardSize = newSize;
        System.out.println("Scoreboard(size) " + oldSize + " --> " + newSize);
    }
}
