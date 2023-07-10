package leet_code.Java;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public class SuperWashingMachines517 {
    public static void main(String[] args) {
//        int[] array = new int[]{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
        int[] array = new int[]{4,0,0,4};
        int n = findMinMoves(array);
        System.out.println(n);

    }

    /*
    * @param int[] - washing machines
    * in each of array element contains the int amount of dresses
    * @return amount of iterations
    * to distribute dresses equally among all washing machines
    * */
    public static int findMinMoves(int[] machines) {
        try{
            AtomicInteger amountOfIterations = new AtomicInteger(0);
            distributeDresses(machines, amountOfIterations);
            return amountOfIterations.get();
        }
        catch(StackOverflowError stackOverflowError){
            return -1;
        }

    }

    private static void distributeDresses(int[] machines, AtomicInteger amountOfIterations) {
        int firstArrayNumber = machines[0];
        boolean notContainsDifferentNumbers = Arrays.stream(machines).allMatch(e -> e == firstArrayNumber);
        if(notContainsDifferentNumbers) return;

        int maxIndex = 0, minIndex = 0;
        for (int i = 0; i < machines.length; i++) {
            if(machines[i] > machines[maxIndex]) maxIndex = i;
            if(machines[i] < machines[minIndex]) minIndex = i;
        }
        machines[minIndex]++;
        machines[maxIndex]--;

        amountOfIterations.incrementAndGet();
        System.out.println("machines = " + Arrays.toString(machines));
        distributeDresses(machines, amountOfIterations);
    }
}