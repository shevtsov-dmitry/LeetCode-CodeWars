/*
 * Create a function that takes an integer
 *  as an argument and returns "Even" for
 * even numbers or "Odd" for odd numbers.
 * */
public void main(String[] args) {
    System.out.println(
            even_or_odd(22)
    );
}

public String even_or_odd(int number) {
    return number % 2 == 0 ? "Even" : "Odd";
}
