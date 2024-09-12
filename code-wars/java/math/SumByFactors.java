import java.util.*;

/*
*
* An example using the provided input array {12, 15}:
*
Prime factors for 12: 2, 3
Prime factors for 15: 3, 5

Calculate the sums:
    For prime factor 2: Sum of elements with prime factor 2 = 12
    For prime factor 3: Sum of elements with prime factor 3 = 12 + 15 = 27
    For prime factor 5: Sum of elements with prime factor 5 = 15

Store the results in the specified format:
    (2 12), (3 27), (5 15)

Sort the results in ascending order of prime factors: (2 12), (3 27), (5 15)

Return the sorted result: "(2 12)(3 27)(5 15)"*/

void main() {
    String string = sumOfDivided(new int[]{-29804, -4209, -28265, -72769, -31744});
    System.out.println("string = " + string);
}

/*  Testing [-29804, -4209, -28265, -72769, -31744]
    Actual []
    Expect (2 -61548)(3 -4209)(5 -28265)(23 -4209)(31 -31744)(53 -72769)(61 -4209)(1373 -72769)(5653 -28265)(7451 -29804)*/
public String sumOfDivided(int[] input) {
    StringBuilder result = new StringBuilder();
    int highestPrimeNumber = 0;
    int lowestPrimeNumber = 0;
    // your code
    Map<Integer, List<Integer>> map = new HashMap<>();
    for (int el : input) {
        List<Integer> primeFactorsOfEl = new ArrayList<>();
        fillListWithPrimeFactorsOfElement(primeFactorsOfEl, el);
        for (Integer primeFactor : primeFactorsOfEl) {
            highestPrimeNumber = Math.max(highestPrimeNumber, primeFactor);
            lowestPrimeNumber = Math.min(lowestPrimeNumber, primeFactor);
            fillMapWithOccurrences(el, primeFactor, map);
        }
    }

    for (int i = lowestPrimeNumber; i <= highestPrimeNumber; i++) {
        List<Integer> listToSum = map.getOrDefault(i, null);
        if (listToSum != null) {
            Integer sum = listToSum.stream().mapToInt(Integer::intValue).sum();
            result.append("(%d %d)".formatted(i, sum));
        }

    }
    return result.toString();
}

public void fillMapWithOccurrences(int el, Integer primeFactor, Map<Integer, List<Integer>> map) {
    if (map.get(primeFactor) != null) {
        map.get(primeFactor).add(el);
    } else {
        List<Integer> list = new ArrayList<>();
        list.add(el);
        map.put(primeFactor, list);
    }
}

public void fillListWithPrimeFactorsOfElement(List<Integer> primeFactorsOfEl, int el) {
    if (el >= 0) {
        for (int i = el; i > 1; i--) {
            if (el % i == 0) {
                boolean isPrime = true;
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) primeFactorsOfEl.add(i);
            }
        }
    } else {
        for (int i = el; i > 1; i++) {
            if (el % i == 0) {
                boolean isPrime = true;
                for (int j = -2; j > i; j--) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) primeFactorsOfEl.add(i);
            }
        }
    }

}
