package TinhDongGoi;

public class CatsTest {
    public static void main(String[] args) {
        Cats kit = new Cats();
        kit.setName("kit");
        System.out.println(kit.getName());

        kit.setAge(6);
        System.out.println(kit.getAge());

        kit.setColor("Gray");
        System.out.println(kit.getColor());

        Cats meoww = new Cats();
        meoww.setName("meoww");
        String meowwName = meoww.getName();
        System.out.println("meoww is name: " + meowwName);

    }
}
