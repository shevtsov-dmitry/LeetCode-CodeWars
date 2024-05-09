import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

void main () {
//    Input: candies = [2,3,5,1,3], extraCandies = 3
//    Output: [true,true,true,false,true]
    kidsWithCandies(new int[] {7,2,5,6,9,9,4,5}, 3);
}

public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
    int maxCandies = 0;
    for (int i = 0, j = candies.length - 1; i <= j; i++, j--) {
        if (candies[i] > maxCandies) {
            maxCandies = candies[i];
        }
        if (candies[j] > maxCandies) {
            maxCandies = candies[j];
        }
    }
    List<Boolean> result = new ArrayList<Boolean>(candies.length);
    for (int kidCandies : candies) {
        result.add(kidCandies + extraCandies >= maxCandies);

    }
    System.out.println(result);
    return result;
}


