package com.company;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Islands2Test {

    // I included the example test scenarios here because it would make sense to have them in the unit test
    @Test
    public void testScenario1() {
        int grid[][] = {
                {0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0},
                {0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0}};

        assertEquals(6, Islands2.maxAreaOfIsland(grid));
    }

    @Test
    public void testScenario2() {
        int grid[][] = {
                {0, 0, 1, 0, 0, 0, 0, 1, 0, 1, 1, 1, 1},
                {0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1},
                {0, 1, 1, 0, 1, 0, 1, 0, 0, 0, 1, 0, 1},
                {0, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 1},
                {0, 1, 0, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0}};

        assertEquals(12, Islands2.maxAreaOfIsland(grid));
    }

    @Test
    public void testScenario3() {
        int grid[][] = {
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}};

        assertEquals(0, Islands2.maxAreaOfIsland(grid));
    }

    @Test
    public void testScenarioAllOnes() {
        int grid[][] = {
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1}};

        assertEquals(80, Islands2.maxAreaOfIsland(grid));
    }

    @Test
    public void testScenarioOnlyDiagonal() {
        int grid[][] = {
                {1, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 1, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 1, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 1, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 0, 0}};

        assertEquals(1, Islands2.maxAreaOfIsland(grid));
    }

    @Test
    public void testScenarioOnlyColumns() {
        int grid[][] = {
                {1, 0, 1, 0, 1, 0, 1, 0, 1, 0},
                {1, 0, 1, 0, 1, 0, 1, 0, 0, 0},
                {1, 0, 1, 0, 1, 0, 1, 0, 0, 0},
                {1, 0, 1, 0, 1, 0, 1, 0, 0, 0},
                {1, 0, 1, 0, 0, 0, 1, 0, 0, 0},
                {1, 0, 1, 0, 0, 0, 1, 0, 0, 0},
                {1, 0, 1, 0, 0, 0, 0, 0, 0, 0},
                {1, 0, 0, 0, 0, 0, 0, 0, 0, 0}};

        assertEquals(8, Islands2.maxAreaOfIsland(grid));
    }

    @Test
    public void testScenarioOnlyRows() {
        int grid[][] = {
                {0, 0, 1, 1, 1, 1, 1, 1, 1, 1},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 1, 1, 1, 1, 1, 1},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {1, 1, 1, 0, 1, 1, 1, 1, 1, 1},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}};

        assertEquals(10, Islands2.maxAreaOfIsland(grid));
    }

    @Test
    public void testScenarioUniqueZero() {
        int grid[][] = {
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 0, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1}};

        assertEquals(79, Islands2.maxAreaOfIsland(grid));
    }
}
