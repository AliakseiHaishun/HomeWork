import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import triangle.Triangle;

import java.util.List;
import java.util.Optional;

public class UnitTests {

    @DataProvider
    public static Object[][] dataForZeroNumbsTest() {
        return new Object[][]{
                {18, 0, 25, "b<=0"},
                {0, 2, 3, "a<=0"},
                {0, 27, 23, "c<=0"},
                {18, -30, 25, "b<=0"},
                {-430, 2, -3, "a<=0"},
                {100, 27, -3332, "c<=0"}
        };
    }

    @DataProvider
    public static Object[][] dataForNumbCLessOrEqualZeroTest() {
        return new Object[][]{
                {1, 1, 5, "a+b<=c"},
                {100, 101, 218, "a+b<=c"},
                {8, 4, 200, "a+b<=c"},
                {4, 4, 8, "a+b<=c"}
        };
    }

    @DataProvider
    public static Object[][] dataForNumbBLessOrEqualZeroTest() {
        return new Object[][]{
                {28, 100, 1, "a+c<=b"},
                {72, 79, 5, "b<=a+c<=b"},
                {2, 375, 64, "a+c<=b"},
                {25, 425, 400, "a+c<=b"}
        };
    }

    @DataProvider
    public static Object[][] dataForNumbALessOrEqualZeroTest() {
        return new Object[][]{
                {268, 100, 168, "b+c<=a"},
                {425, 200, 220, "b+c<=a"},
                {18, 8, 7, "b+c<=a"},
                {25, 425, 400, "b+c<=a"}
        };
    }

    @DataProvider
    public static Object[][] dataForTriangleIsTrueMethod() {
        boolean res = true;
        return new Object[][]{
                {3, 4, 5, res},
                {23, 23, 23, res},
                {234, 234, 400, res},
                {Double.MAX_VALUE, Double.MAX_VALUE, Double.MAX_VALUE, res}
        };
    }

    @DataProvider
    public static Object[][] dataForTriangleIsRectangularMethod() {
        return new Object[][]{
                {3, 4, 5, 8},
                {6, 8, 10, 8}
        };
    }

    @DataProvider
    public static Object[][] dataForTriangleIsEquilateralMethod() {
        return new Object[][]{
                {1, 1, 1, 1},
                {Double.MAX_VALUE, Double.MAX_VALUE, Double.MAX_VALUE, 1},
                {Double.MAX_EXPONENT, Double.MAX_EXPONENT, Double.MAX_EXPONENT, 1}
        };
    }

    @DataProvider
    public static Object[][] dataForTriangleIsIsoscelesMethod() {
        return new Object[][]{
                {10, 10, 18, 2},
                {Double.MAX_VALUE, 4535, Double.MAX_VALUE, 2},
                {42342, Double.MAX_EXPONENT, Double.MAX_EXPONENT, 2}
        };
    }
    @DataProvider
    public static Object[][] dataForTriangleIsOrdinaryMethod() {
        return new Object[][]{
                {32, 232, 235, 4},
                {Double.MAX_VALUE, Double.MAX_EXPONENT, Double.MAX_VALUE, 4},
                {7, 6, 5, 4}
        };
    }

    @DataProvider
    public static Object[][] dataForSquareMethod() {
        return new Object[][]{
                {3, 4, 5, 6},
                {18, 18, 20, 149.66629547095766},
                {1, 1, 1, 0.4330127018922193},
                {432, 324, 500, 69206.93791810183}
        };
    }

    @DataProvider
    public static Object[][] dataForNegTest() {
        return new Object[][]{
                {(Double.MAX_VALUE+Double.MAX_VALUE),
                        (Double.MAX_VALUE+Double.MAX_VALUE),
                        (Double.MAX_VALUE+Double.MAX_VALUE)},
                {(Double.MIN_VALUE-Double.MIN_VALUE), 1, 1},
                {(Double.MIN_VALUE-Double.MIN_VALUE),
                        (Double.MIN_VALUE-Double.MIN_VALUE),
                        (Double.MIN_VALUE-Double.MIN_VALUE)},
                {"fdsd", "авыаыв", "fdsfds"}
        };
    }

    @DataProvider
    public static Object[][] dataForInvalidSquareTest() {
        return new Object[][]{
                {Double.MAX_VALUE, Double.MAX_VALUE, Double.MAX_VALUE}
        };
    }


    @Test(dataProvider = "dataForZeroNumbsTest")
    public void zeroNumbsTest (double x, double y, double z, String res) {
        Triangle triangle1 = new Triangle(x, y, z);
        triangle1.checkTriangle();
        Assert.assertEquals(triangle1.getMessage(), res);
    }

    @Test(dataProvider = "dataForNumbCLessOrEqualZeroTest")
    public void NumbCLessOrEqualZeroTest (double x, double y, double z, String res) {
        Triangle triangle1 = new Triangle(x, y, z);
        triangle1.checkTriangle();
        Assert.assertEquals(triangle1.getMessage(), res);
    }

    @Test(dataProvider = "dataForNumbALessOrEqualZeroTest")
    public void NumbALessOrEqualZeroTest (double x, double y, double z, String res) {
        Triangle triangle1 = new Triangle(x, y, z);
        triangle1.checkTriangle();
        Assert.assertEquals(triangle1.getMessage(), res);
    }

    @Test(dataProvider = "dataForNumbBLessOrEqualZeroTest")
    public void NumbBLessOrEqualZeroTest (double x, double y, double z, String res) {
        Triangle triangle1 = new Triangle(x, y, z);
        triangle1.checkTriangle();
        Assert.assertEquals(triangle1.getMessage(), res);
    }

    @Test(dataProvider = "dataForTriangleIsTrueMethod")
    public void TriangleIsTrueMethod (double x, double y, double z, boolean result) {
        Triangle triangle1 = new Triangle(x, y, z);
        Assert.assertEquals(triangle1.checkTriangle(), result);
    }


    @Test(dataProvider = "dataForTriangleIsRectangularMethod")
    public void TriangleIsRectangularMethod (double x, double y, double z, int result) {
        Triangle triangle1 = new Triangle(x, y, z);
        Assert.assertEquals(triangle1.detectTriangle(), result);
    }

    @Test(dataProvider = "dataForTriangleIsEquilateralMethod")
    public void TriangleIsEquilateralMethod(double x, double y, double z, int result) {
        Triangle triangle1 = new Triangle(x, y, z);
        Assert.assertEquals(triangle1.detectTriangle(), result);
    }

    @Test(dataProvider = "dataForTriangleIsIsoscelesMethod")
    public void TriangleIsIsoscelesMethod(double x, double y, double z, int result) {
        Triangle triangle1 = new Triangle(x, y, z);
        Assert.assertEquals(triangle1.detectTriangle(), result);
    }

    @Test(dataProvider = "dataForTriangleIsOrdinaryMethod")
    public void TriangleIsOrdinaryMethod(double x, double y, double z, int result) {
        Triangle triangle1 = new Triangle(x, y, z);
        Assert.assertEquals(triangle1.detectTriangle(), result);
    }

    @Test(dataProvider = "dataForSquareMethod")
    public void TriangleSquareMethodTest(double x, double y, double z, double result) {
        Triangle triangle1 = new Triangle(x, y, z);
        Assert.assertEquals(triangle1.getSquare(), result);
    }

    @Test(expectedExceptions = Exception.class, dataProvider = "dataForNegTest")
    public void invalidNumbsTest(double x, double y, double z) {
        Triangle triangle1 = new Triangle(x, y, z);
        triangle1.checkTriangle();
    }


    @Test(expectedExceptions = Exception.class, dataProvider = "dataForInvalidSquareTest")
    public void invalidSquareTest(double x, double y, double z) {
        Triangle triangle1 = new Triangle(x, y, z);
        triangle1.getSquare();
    }

}


