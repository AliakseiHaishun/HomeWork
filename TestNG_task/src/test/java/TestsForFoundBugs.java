import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import triangle.Triangle;

import java.util.List;

public class TestsForFoundBugs {

    @DataProvider
    public static Object[][] dataForExistenceOfTriangleTest1() {
        return new Object[][] {
                {1, 2 ,0},
                {10, 20, -100},
                {1, 2, Double.MIN_VALUE}
        };
    }
    @DataProvider
    public static Object[][] nonExistenceOfTRNGLTestInDetectTRNGLOrGetSQMeths() {
        return new Object[][] {
                {-2, 14 ,43},
                {23, -100, 1100},
                {2, 1, 3},
                {23, 21, 100},
                {321, 1, 23},
                {12, 1000, 311}
        };
    }

    @Test (dataProvider = "dataForExistenceOfTriangleTest1")
    public void nonExistenceOfTRNGLTest1 (double x, double y, double z) {
        Triangle triangle1 = new Triangle(x, y, z);
        triangle1.checkTriangle();
        Assert.assertEquals(triangle1.getMessage(), "c<=0");
    }

    @Test (dataProvider = "nonExistenceOfTRNGLTestInDetectTRNGLOrGetSQMeths")
    public void nonExistenceOfTRNGLTestInDetectOrGetTriangleMeth (double x, double y, double z) {
        Triangle triangle2 = new Triangle(x, y, z);
        triangle2.detectTriangle();
        List <String> stringList = List.of("a<=0", "b<=0", "c<=0", "a+b<=c", "a+c<=b", "b+c<=a");
        Assert.assertEquals(triangle2.getMessage(), stringList, "Должна быть какая-то проверка на существование треугольника");
    }
    @Test (dataProvider = "nonExistenceOfTRNGLTestInDetectTRNGLOrGetSQMeths")
    public void nonExistenceOfTRNGLTestInGetSquareMeth (double x, double y, double z) {
        Triangle triangle2 = new Triangle(x, y, z);
        triangle2.getSquare();
        List <String> stringList = List.of("a<=0", "b<=0", "c<=0", "a+b<=c", "a+c<=b", "b+c<=a");
        Assert.assertEquals(triangle2.getMessage(), stringList, "Должна быть какая-то проверка на существование треугольника");
    }

    @Test (dataProvider = "nonExistenceOfTRNGLTestInDetectTRNGLOrGetSQMeths")
    public void nonExistenceOfTRNGLTestInDetectOrGetTriangleMeth2 (double x, double y, double z) {
        Triangle triangle2 = new Triangle(x, y, z);
        Assert.assertEquals(
                triangle2.detectTriangle(),
                "0",
                "Не должны происходить вычисления для несуществующего треугольника"
        );
    }

    @Test (dataProvider = "nonExistenceOfTRNGLTestInDetectTRNGLOrGetSQMeths")
    public void nonExistenceOfTRNGLTestInGetSquareMeth2 (double x, double y, double z) {
        Triangle triangle2 = new Triangle(x, y, z);
        Assert.assertEquals(
                triangle2.getSquare(),
                "0",
                "Не должны происходить вычисления для несуществующего треугольника"
        );
    }


}
