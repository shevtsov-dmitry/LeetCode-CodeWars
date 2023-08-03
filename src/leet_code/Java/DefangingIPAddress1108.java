package leet_code.Java;
public class DefangingIPAddress1108 {
    public static String defangIPaddr(String address) {
        return address.replaceAll("[.]", "[.]");
    }

    public static void main(String[] args) {
        String s = defangIPaddr("255.100.50.0");
        System.out.println("s = " + s);
    }
}
