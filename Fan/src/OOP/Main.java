package OOP;

public class Main {

    public static void main(String[] args) {
	final int SLOW = 1;
	final int MEDIUM = 2;
	final int FAST = 3;

	Fan Sony = new Fan();
	Sony.setFanSpeed(FAST);
	Sony.setColor("gray");
	Sony.setRadius(10d);
	Sony.setOnoff(true);

        System.out.print(Sony.fanInfo() + " ");

        Fan Samsung = new Fan();
        Samsung.setFanSpeed(FAST);
        Samsung.setColor("red");
        Samsung.setRadius(10d);
        Samsung.setOnoff(false);

		System.out.println(Samsung.fanInfo());
    }
}
