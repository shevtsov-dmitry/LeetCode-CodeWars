void main() {
/*Input: x = 2.10000, n = 3
Output: 9.26100*/
    double x = 2.1D;
    double v = myPow(x, 3);
    System.out.println(v);
}

public double myPow(double x, int n) {
    double result  = x;
    for (int i = 0; i < n; i++) {
        result *= x;
    }
    return  result;
}