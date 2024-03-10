package Stack_Queue;

import java.util.*;

class Person {
    int id;
    int priority;
    public Person(int id, int priority) {
        this.id = id;
        this.priority = priority;
    }
}

public class 응급실_8 {

    public int Solution(int n, int m, int[] ar) {

        Queue<Person> queue = new LinkedList<>();

        for (int i = 0; i < ar.length; i++) {
            queue.add(new Person(i,ar[i]));
        }

        int cnt = 1;
        while(!queue.isEmpty()) {
            Person tmp = queue.poll();
            for (Person x : queue) {
                if(x.priority > tmp.priority) {
                    queue.add(tmp);
                    tmp = null;
                    break;
                }
            }
            if(tmp != null) {
                if(tmp.id == m) return cnt;
                else cnt++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        응급실_8 T = new 응급실_8();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] ar = new int[n];

        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }
        System.out.println(T.Solution(n,m,ar));
    }
}
