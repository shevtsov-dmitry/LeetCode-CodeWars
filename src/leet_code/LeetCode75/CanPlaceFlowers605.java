class Solution {

    void main() { }

   public boolean canPlaceFlowers(int[] arr, int n) {
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

}
