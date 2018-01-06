import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Triangle {
    private static final int SCALENE = 1;
    private static final int ISOSCELES = 2;
    private static final int EQUILATERAL = 3;
    private static final int ERROR = 4;

    /**
     * Method checks is the three integer could be a sides of triangle,
     * and returns the type of it.
     * 1- if it is a scalene triangle, 2 - for isosceles triangle,
     * 3 - for equilateral triangle, 4 - if it is not a triangle or if was
     * entered negative number or null
     * @param a, a length of first the triangle side
     * @param b, a length of second the triangle side
     * @param c, a length of second the triangle side
     * @return integer value of triangle type
     */
    int getTriangleType(int a, int b, int c) {
        int[] array = {a,b,c};
        Arrays.sort(array);
        a = array[0];
        b = array[1];
        c = array[2];
        if (a <= 0) return ERROR;
        if ((a + b) <= c) return ERROR;
        if (a == b && b==c) return EQUILATERAL;
        else {
            if (a == b || b == c) return ISOSCELES;
            else return SCALENE;
        }
    }
}
