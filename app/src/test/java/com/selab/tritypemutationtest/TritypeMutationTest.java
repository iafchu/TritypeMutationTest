package com.selab.tritypemutationtest;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class TritypeMutationTest {

    @Test
    public void testTritypeMutantOne() {
        int result = TritypeMutantOne.Triang(2, 2, 3);
        Assert.assertEquals("This should be isosceles", 2, result);
    }

    @Test
    public void testKillMutant() {
        // 测试非法三角形的情况
        int resultInvalid = TritypeMutantTwo.Triang(1, 2, 3);
        assertEquals("Mutant should have been killed by presenting a non-triangle case", 4, resultInvalid);

        // 测试等边三角形
        int resultEquilateral = TritypeMutantTwo.Triang(2, 2, 2);
        assertEquals("Triangle should be equilateral", 3, resultEquilateral);

        // 测试等腰三角形
        int resultIsosceles = TritypeMutantTwo.Triang(2, 2, 3);
        assertEquals("Triangle should be isosceles", 2, resultIsosceles);

        // 测试不等边三角形
        int resultScalene = TritypeMutantTwo.Triang(3, 4, 5);
        assertEquals("Triangle should be scalene", 1, resultScalene);
    }
}