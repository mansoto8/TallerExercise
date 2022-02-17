package com.company;

import java.util.ArrayList;
import java.util.List;

public class Islands2 {

    /**
     * You are given an m x n binary matrix grid. An island is a group of 1's (representing land) connected
     * 4-directionally (horizontal or vertical.) You may assume all four edges of the grid are surrounded by water. The
     * area of an island is the number of cells with a value 1 in the island. Return the maximum area of an island in
     * grid. If there is no island, return 0.
     **/
    public static void main(String[] args) {
        int grid1[][] = {
                {0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0},
                {0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0}};
        int grid2[][] = {
                {0, 0, 1, 0, 0, 0, 0, 1, 0, 1, 1, 1, 1},
                {0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1},
                {0, 1, 1, 0, 1, 0, 1, 0, 0, 0, 1, 0, 1},
                {0, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 1},
                {0, 1, 0, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0}};
        int grid3[][] = {
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}};
        System.out.println("Is test case 1 passing? " + (maxAreaOfIsland(grid1) == 6));
        System.out.println("Is test case 2 passing? " + (maxAreaOfIsland(grid2) == 12));
        System.out.println("Is test case 3 passing? " + (maxAreaOfIsland(grid2) == 0));
    }

    public static int maxAreaOfIsland(int[][] grid) {
        Integer area = 0;

        /////////////////////////
        //Insert your code here//
        /////////////////////////

        List<Integer> islandLengths = new ArrayList<>();

        // y axis
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    islandLengths.add(checkSpotTotalWeight(grid, j, i));
                }
            }
        }

        for (int islandLength : islandLengths) {
            if (area < islandLength) {
                area = islandLength;
            }
        }

        return area;
    }

    private static int checkSpotTotalWeight(int[][] grid, int x, int y) {
        int count = 0;
        if (grid[y][x] == 1) {
            count++;
            // Marking as two the spots already counted to avoid counting them again in later iterations
            grid[y][x] = 2;
            count += getNeighborsWeight(grid, x, y);
        }

        return count;
    }

    private static int getNeighborsWeight(int[][] grid, int x, int y) {
        int count = 0;

        if (y + 1 < grid.length) {
            count += checkSpotTotalWeight(grid, x, y + 1);
        }
        if (y - 1 > 0) {
            count += checkSpotTotalWeight(grid, x, y - 1);
        }
        if (x + 1 < grid[0].length) {
            count += checkSpotTotalWeight(grid, x + 1, y);
        }
        if (x - 1 > 0) {
            count += checkSpotTotalWeight(grid, x - 1, y);
        }

        return count;
    }
}
