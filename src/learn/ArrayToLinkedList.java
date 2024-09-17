import java.util.StringJoiner;

void main() {
    int[] array = {1, 2, 3, 4, 5};
    Node head = fillNodeFromArray(array);
    printAllNodeValues(head);
}
Node fillNodeFromArray(int[] array) {
    Node head = new Node(array[0]);
    Node cur = head;
    for (int j = 1; j < array.length; j++) {
        int i = array[j];
        Node newNode = new Node(i);
        cur.next = newNode;
        cur = newNode;
    }
    return head;
}

void printAllNodeValues(Node head) {
    StringJoiner stringJoiner = new StringJoiner("->");
    while(head != null) {
        stringJoiner.add(String.valueOf(head.val));
        head = head.next;
    }
    System.out.println(stringJoiner);
}

class Node {
    int val;
    Node next;

    Node() {

    }

    Node(int val) {
        this.val = val;
    }

    Node(Node next, int val) {
        this.next = next;
        this.val = val;
    }
}