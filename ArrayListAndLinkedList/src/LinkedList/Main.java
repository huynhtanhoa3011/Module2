package LinkedList;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Persion persion1 = new Persion(1);
        Persion persion2 = new Persion(2);
        Persion persion3 = new Persion(3);

        List<Persion> list = new LinkedList<>();

        list.add(persion1);
        list.add(persion2);
        list.add(persion3);

        for (Persion p : list) {
            System.out.println(p.getId());
        }
        System.out.println("===========");
        list.remove(1);
        for (Persion p : list) {
            System.out.println(p.getId());
        }
    }
}
