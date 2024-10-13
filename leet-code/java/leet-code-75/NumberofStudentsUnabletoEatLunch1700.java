import java.util.*;

void main() {
    int[] stud = { 1, 1, 0, 0 };
    int[] sand = { 0, 1, 0, 1 };
    int case1 = countStudents(stud, sand);
    assert case1 == 0 : "case1 err: " + case1;

    stud = new int[] { 1, 1, 1, 0, 0, 1 };
    sand = new int[] { 1, 0, 0, 0, 1, 1 };
    int case2 = countStudents(stud, sand);
    assert case2 == 3 : "case 2 err: " + case2;
}

int countStudents(int[] stud, int[] sand) {
    int countWhosLeft = stud.length;
    Queue<Integer> q = new LinkedList<>();
    Arrays.stream(stud).forEachOrdered(q::add);

    for (int curSand : sand) {
        if (curSand == q.peek()) {
            q.poll();
            countWhosLeft--;
        } else {
            for (int i = 0; i < q.size(); i++) {
                if (curSand == q.peek()) {
                    q.poll();
                    countWhosLeft--;
                    break;
                } else {
                    q.add(q.poll());
                }
                if (i == q.size() - 1) {
                    return countWhosLeft;
                }
            }
        }
    }
    return countWhosLeft;
}
