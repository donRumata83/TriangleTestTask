import java.util.Arrays;

public class Triangle {
    private static final int SCALENE = 1;
    private static final int ISOSCELES = 2;
    private static final int EQUILATERAL = 3;
    private static final int ERROR = 4;

    /**
     * This method verifies whether given three integers could be a sides of a triangle,
     * and returns the type of it.
     *
     * @param firstSide  a length of the first triangle side
     * @param secondSide a length of the second triangle side
     * @param thirdSide  a length of the third triangle side
     * @return integer value of triangle type
     * possible values: 1- for scalene triangle, 2 - for isosceles triangle,
     * 3 - for equilateral triangle, 4 - if it is not a triangle or if was
     * entered negative number or null
     */
    public static int getTriangleType(int firstSide, int secondSide, int thirdSide) {
        int[] array = {firstSide, secondSide, thirdSide};
        Arrays.sort(array);
        firstSide = array[0];
        secondSide = array[1];
        thirdSide = array[2];
        if (firstSide <= 0) return ERROR;
        if ((firstSide + secondSide) <= thirdSide) return ERROR;
        if (firstSide == secondSide && secondSide == thirdSide) return EQUILATERAL;
        else {
            if (firstSide == secondSide || secondSide == thirdSide) return ISOSCELES;
            else return SCALENE;
        }
    }
}
