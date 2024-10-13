void main() {
    dirReduc(new String[]{"UP", "LEFT", "DOWN", "RIGHT"});
    dirReduc(new String[]{"UP", "DOWN", "DOWN", "RIGHT", "LEFT", "UP", "LEFT"});
}

public String[] dirReduc(String[] arr) {
    int x = 0;
    int y = 0;
    for (String str : arr) {
        switch (str) {
            case "UP" -> y++;
            case "DOWN" -> y--;
            case "LEFT" -> x--;
            case "RIGHT" -> x++;
        }
    }
    System.out.print("x = " + x);
    System.out.println("\ty = " + y);


    return new String[]{};

}
