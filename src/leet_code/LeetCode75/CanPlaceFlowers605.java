import java.util.Arrays;

static int[] incept = new int[0];
static int[] parsed = new int[0];
static int numsLeft = Integer.MAX_VALUE;

void main() {
    byte ignored;
    ignored = canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 1) ? pass() : err();
    ignored = !canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 2) ? pass() : err();
    ignored = canPlaceFlowers(new int[]{0, 0, 1, 0, 1}, 1) ? pass() : err();
}

public boolean canPlaceFlowers(int[] arr, int n) {
    incept = arr;
    if (n > arr.length) return false;
    if (arr.length <= 2) {
        return handleShortArray(arr, n);
    }

    if (arr[0] == 0 && arr[1] == 0) {
        arr[0] = 1;
        n--;
    }
    if (arr[arr.length - 1] == 0 && arr[arr.length - 2] == 0) {
        arr[arr.length - 1] = 1;
        n--;
    }

    for (int i = 1; i < arr.length - 1; i++) {
        if (arr[i - 1] != 1 && arr[i] == 0 && arr[i + 1] != 1) {
            arr[i] = 1;
            n--;
        }

    }
    parsed = arr;
    numsLeft = n;
    return n < 1;
}

private boolean handleShortArray(int[] arr, int n) {
    if (arr.length == 1 && arr[0] == 0 ) {
        return n == 1 || n == 0;
    } else if (arr.length ==1 && arr[0] == 1) {
        return n == 0;
    }
    else {
        if ((arr[0] == 1 || arr[1] == 1) && n == 0)  {
            return true;
        }else {
            return arr[0] == 0 && arr[1] == 0 && n < 2;
        }

    }
}

byte pass() {
    String message = STR."\u001B[32mPASSED\u001B[0m initial: \{Arrays.toString(incept)}. New: \{Arrays.toString(parsed)}";
    System.out.println(message);
    return 0;
}

byte err() {
    String errorMessage = STR."\u001B[31mFAILED\u001B[0m initial: \{Arrays.toString(incept)}. New: \{Arrays.toString(parsed)}. Nums left = \{numsLeft}.";
    System.out.println(errorMessage);
    return 0;
}
