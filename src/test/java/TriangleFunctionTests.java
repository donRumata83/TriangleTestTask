import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class TriangleFunctionTests {
    private static final int SCALENE = 1;
    private static final int ISOSCELES = 2;
    private static final int EQUILATERAL = 3;
    private static final int ERROR = 4;
    private Triangle triangle;

    @Before
    public void setTriangle(){
        triangle = new Triangle();
    }
    @Test
    public void equilateralTriangleTest() {
        int triangleType = triangle.getTriangleType(2, 2, 2);

        assertThat(triangleType, is(equalTo(EQUILATERAL)));
    }


    @Test
    public void isoscelesTriangleTest() {
        int triangleType = triangle.getTriangleType(3,2,2);

        assertThat(triangleType, is(equalTo(ISOSCELES)));
    }

    @Test
    public void scaleneTriangleTest(){
        int triangleType = triangle.getTriangleType(2,3,4);

        assertThat(triangleType, is(equalTo(SCALENE)));
    }

    @Test
    public void nullEnterTest(){
        int triangleType = triangle.getTriangleType(1,2,0);

        assertThat(triangleType, is(equalTo(ERROR)));
    }

    @Test
    public void negativeNumberEnterTest() {
        int triangleType = triangle.getTriangleType(-1, -1, 2);

        assertThat(triangleType, is(equalTo(ERROR)));
    }

    @Test
    public void notTriangleEnterTest(){
        int triangleType = triangle.getTriangleType(1,2,5);

        assertThat(triangleType, is(equalTo(ERROR)));
    }

    @Test
    public void testWhenLineLehgthEnter(){
        int triangleType = triangle.getTriangleType(3, 2, 1);

        assertThat(triangleType, is(equalTo(ERROR)));
    }

}
