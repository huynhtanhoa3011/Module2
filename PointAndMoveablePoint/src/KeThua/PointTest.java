package KeThua;

public class PointTest {

    public static void main(String[] args) {
	Point point = new Point(4,5) ;
        System.out.println(point);

        MoveablePoint moveablePoint = new MoveablePoint(1,2,3,4);
        System.out.println(moveablePoint);

        moveablePoint.move();
        System.out.println(moveablePoint);
    }
}
