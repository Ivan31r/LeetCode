package main.algorithms.numberOfIslands;

public class Solution {
    public static void main(String[] args) {

    }

    public static int numIslands(char[][] grid) {
        int row = grid.length;
        int column = grid[0].length;
        int islandCounter = 0;
        for (int rowIndex = 0; rowIndex < row; rowIndex++) {
            for (int columnIndex = 0; columnIndex < column; columnIndex++) {
                if (grid[rowIndex][columnIndex] == '1') {
                    islandCounter++;
                    findWater(grid, rowIndex, columnIndex);
                }
            }
        }
        return islandCounter;
    }

    private static void findWater(char[][] grid, int rowIndex, int columnIndex) {
        int row = grid.length;
        int column = grid[0].length;
        grid[rowIndex][columnIndex] = 'x';
        if (rowIndex > 0 && grid[rowIndex - 1][columnIndex] == '1') {
            findWater(grid, rowIndex - 1, columnIndex);
        }
        if (columnIndex > 0 && grid[rowIndex][columnIndex - 1] == '1') {
            findWater(grid, rowIndex, columnIndex - 1);
        }
        if (rowIndex < row - 1 && grid[rowIndex + 1][columnIndex] == '1') {
            findWater(grid, rowIndex + 1, columnIndex);

        }
        if (columnIndex < column - 1 && grid[rowIndex][columnIndex + 1] == '1') {
            findWater(grid, rowIndex, columnIndex + 1);

        }
    }
    /*
        ["1","1","1","1","0"],
        ["1","1","0","1","0"],
        ["1","1","0","0","0"],
        ["0","0","0","0","0"]
*/

}
