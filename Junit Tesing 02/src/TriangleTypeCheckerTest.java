import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TriangleTypeCheckerTest {

    @Test
    void testRightAngledTriangle() {
        assertEquals("Right-angled", TriangleTypeChecker.classifyTriangle(3, 4, 5));
    }

    @Test
    void testAcuteAngledTriangle() {
        assertEquals("Acute-angled", TriangleTypeChecker.classifyTriangle(5, 6, 7));
    }

    @Test
    void testObtuseAngledTriangle() {
        assertEquals("Obtuse-angled", TriangleTypeChecker.classifyTriangle(3, 4, 6));
    }

    @Test
    void testInvalidTriangle() {
        assertEquals("Invalid", TriangleTypeChecker.classifyTriangle(1, 2, 3));
    }
    
    @Test
    void testZeroSideTriangle() {
        assertEquals("Invalid", TriangleTypeChecker.classifyTriangle(0, 4, 5));
        assertEquals("Invalid", TriangleTypeChecker.classifyTriangle(3, 0, 5));
        assertEquals("Invalid", TriangleTypeChecker.classifyTriangle(3, 4, 0));
    }

    @Test
    void testNegativeSideTriangle() {
        assertEquals("Invalid", TriangleTypeChecker.classifyTriangle(-3, 4, 5));
        assertEquals("Invalid", TriangleTypeChecker.classifyTriangle(3, -4, 5));
        assertEquals("Invalid", TriangleTypeChecker.classifyTriangle(3, 4, -5));
    }
    
    @Test
    void testCannotDetermineTriangleType() {
        assertEquals("Cannot determine triangle type", TriangleTypeChecker.classifyTriangle(2, 3, 6));
    }
}
