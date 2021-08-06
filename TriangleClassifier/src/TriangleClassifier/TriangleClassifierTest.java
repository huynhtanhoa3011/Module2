package TriangleClassifier;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TriangleClassifierTest {

    @Test
    public void triangle () {
        assertEquals("equilateral triangle", TriangleClassifier.Triangle(2, 2, 2));
        assertEquals("isosceles triangle", TriangleClassifier.Triangle(2, 2, 3));
        assertEquals("regular triangle", TriangleClassifier.Triangle(3, 4, 5));
        assertEquals("not triangle", TriangleClassifier.Triangle(8, 2, 3));
    }
}
