package chewyt.demo.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Generate {
    private int numberVal;

    public int getNumberVal() {
        return numberVal;
    }

    public void setNumberVal(int numberVal) {
        this.numberVal = numberVal;
    }

    public List<Integer> getRandomArray() {
        List<Integer> tempList = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15,
                16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30));
        List<Integer> finalList = new ArrayList<>();
        for (int i = 0; i < this.numberVal; i++) {
            int number = new Random().nextInt(tempList.size() - 1);
            finalList.add(tempList.get(number));
            tempList.remove(number);
        }
        return finalList;
    }
}
