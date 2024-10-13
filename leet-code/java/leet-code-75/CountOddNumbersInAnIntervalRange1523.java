
void main() {
    System.out.println("args = " + countOdds(3, 7));
    System.out.println("s = " + countOdds(8, 10));
    System.out.println("s = " + countOdds(0, 10));
}

public int countOdds(int low, int high) {
    if (high % 2 == 1 && high == low || high - low == 1) return 1;
    int count = 0;
    count = (high - low) / 2;
    if (low % 2 == 1) count++;
    if (high % 2 == 1) count++;
    if (high - low == 2) count++;
    return count;
}
