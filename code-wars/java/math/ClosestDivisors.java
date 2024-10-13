
import java.util.Arrays;

/**
 * ClosestDivisors
 */
void main() {
    assert Arrays.equals(closestDivisors(8), new int[]{3, 3}) : 1;
    assert Arrays.equals(closestDivisors(123), new int[]{5, 25}) : 2;
    assert Arrays.equals(closestDivisors(999), new int[]{25, 40}) : 3;
}

public int[] closestDivisors(int num) {
    for (int i = (int) Math.sqrt(num + 2); i > 0; i--) {
        if ((num + 1) % i == 0) {
            return new int[]{i, (num + 1) / i};
        }
        if ((num + 2) % i == 0) {
            return new int[]{i, (num + 2) / i};
        }
    }
    return new int[]{};
}

