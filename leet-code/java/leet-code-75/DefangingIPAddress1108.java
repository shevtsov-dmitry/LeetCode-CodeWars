public String defangIPaddr(String address) {
    return address.replaceAll("[.]", "[.]");
}

void main() {
    String s = defangIPaddr("255.100.50.0");
    System.out.println("s = " + s);
}
