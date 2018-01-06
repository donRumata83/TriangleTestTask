
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class TriangleFunctionTests {
    private static final int SCALENE = 1;
    private static final int ISOSCELES = 2;
    private static final int EQUILATERAL = 3;
    private static final int ERROR = 4;

    @Test
    public void verifiesThatTriangleIsEquilateral() {
        //given
        int a = 2;
        int b = 2;
        int c = 2;
        //when
        int triangleType = Triangle.getTriangleType(a, b, c);
        //then
        assertThat(triangleType, is(equalTo(EQUILATERAL)));
    }


    @Test
    public void verifiesThatTriangleIsIsosceles() {
        //given
        int a = 3;
        int b = 2;
        int c = 2;
        //when
        int triangleType = Triangle.getTriangleType(a, b, c);
        //then
        assertThat(triangleType, is(equalTo(ISOSCELES)));
    }

    @Test
    public void verifiesThatTriangleIsScalene() {
        //given
        int a = 2;
        int b = 3;
        int c = 4;
        //when
        int triangleType = Triangle.getTriangleType(a, b, c);
        //then
        assertThat(triangleType, is(equalTo(SCALENE)));
    }

    @Test
    public void shouldReturnErrorOnNullParam() {
        //given
        int a = 1;
        int b = 2;
        int c = 0;
        //when
        int triangleType = Triangle.getTriangleType(a, b, c);
        //then
        assertThat(triangleType, is(equalTo(ERROR)));
    }

    @Test
    public void shouldReturnErrorOnNegativeParams() {
        //given
        int a = -1;
        int b = -1;
        int c = 2;
        //when
        int triangleType = Triangle.getTriangleType(a, b, c);
        //then
        assertThat(triangleType, is(equalTo(ERROR)));
    }

    @Test
    public void shouldReturnErrorWhenParamsIsNotTriangle() {
        //given
        int a = 1;
        int b = 2;
        int c = 5;
        //when
        int triangleType = Triangle.getTriangleType(a, b, c);
        //then
        assertThat(triangleType, is(equalTo(ERROR)));
    }

    @Test
    public void shouldReturnErrorWhenLineLengthInParams() {
        //given
        int a = 3;
        int b = 2;
        int c = 1;
        //when
        int triangleType = Triangle.getTriangleType(a, b, c);
        //then
        assertThat(triangleType, is(equalTo(ERROR)));
    }
}
