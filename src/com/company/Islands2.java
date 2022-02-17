package com.company;

import java.util.ArrayList;
import java.util.List;

public class Islands2 {

    private static int[][] foundSpots;

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
        int area = 0;
        //int[][] foundSpots = new int[grid.length][grid[0].length];

        /////////////////////////
        //Insert your code here//
        /////////////////////////

        List<Integer> islandLengths = new ArrayList<>();

        // y axis
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    //foundSpots[i][j] = 1;
                    grid[i][j] = 2;
                    int islandWeight = getNeighborsWeight(grid, i, j/*, foundSpots*/) + 1;
                    System.out.println("Found island weight: " + islandWeight);
                    islandLengths.add(islandWeight);
                }
            }
        }

        for(int islandLength : islandLengths) {
            if(area<islandLength) {
                area = islandLength;
            }
        }

        return area;
    }

    private static int getNeighborsWeight(int[][] grid, int y, int x/*, int[][] foundSpots*/) {
        int count = 0;

        if (y + 1 < grid.length && grid[y + 1][x] == 1) {
            count++;
            printSpot(y + 1, x, grid[y + 1][x]);
            grid[y + 1][x] = 2;
            count += getNeighborsWeight(grid, y + 1, x);
        }
        if (y - 1 > 0 && grid[y - 1][x] == 1) {
            count++;
            printSpot(y - 1, x, grid[y - 1][x]);
            grid[y - 1][x] = 2;
            count += getNeighborsWeight(grid, y - 1, x);
        }
        if (x + 1 < grid[0].length && grid[y][x + 1] == 1) {
            count++;
            printSpot(y, x + 1, grid[y][x + 1]);
            grid[y][x + 1] = 2;
            count += getNeighborsWeight(grid, y, x + 1);
        }
        if (x - 1 > 0 && grid[y][x - 1] == 1) {
            count++;
            printSpot(y - 1, x, grid[y - 1][x]);
            grid[y][x - 1] = 2;
            count += getNeighborsWeight(grid, y, x - 1);
        }

        return count;
    }

    private static void printSpot(int x, int y, int value) {
        // System.out.format("Spot y=%s, x=%s with value %s\n", y, x, value);
    }

}
