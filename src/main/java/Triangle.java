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
     * @param a int, length of first triangle side
     * @param b int, length of second triangle side
     * @param c int, length of second triangle side
     * @return integer value of triangle type
     */
    int getTriangleType(int a, int b, int c) {
        List<Integer> list = Arrays.asList(a, b, c);
        Collections.sort(list);
        if (list.get(0) <= 0) return ERROR;
        if ((list.get(0) + list.get(1)) <= list.get(2)) return ERROR;
        if (list.get(0).equals(list.get(1)) && list.get(1).equals(list.get(2))) return EQUILATERAL;
        else {
            if (list.get(0).equals(list.get(1)) || list.get(1).equals(list.get(2))) return ISOSCELES;
            else return SCALENE;
        }
    }
}
