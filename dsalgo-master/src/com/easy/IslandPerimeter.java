package com.easy;

public class IslandPerimeter {

	public static void main(String[] args) {
		int[][] grid = {{0,1,0,0},
		                {1,1,1,0},
		                {0,1,0,0},
		                {1,1,0,0}};
		islandPerimeter(grid);
	}
	public static int islandPerimeter(int[][] grid) {
        int perimeter = 0;
        int row = grid.length;
        int column = grid[0].length;
        for (int i=0; i < row; i++) {
        		for (int j=0; j < column; j++) {
        			if (grid[i][j] == 1) {
        				perimeter = perimeter + (4-findAdjacent(grid, i,j, row, column));
        			}
        		}
        }
        return perimeter;
    }
	
	public static int findAdjacent(int[][] grid, int itemx, int itemy, int gridRowIndexMax, int gridColumnIndexMax) {
		int numAdjacent = 0;
		if (itemy-1 >= 0 && grid[itemx][itemy-1] == 1) numAdjacent++;
		if (itemy+1 < gridColumnIndexMax && grid[itemx][itemy+1] == 1) numAdjacent++;
		if (itemx-1 >= 0 && grid[itemx-1][itemy] == 1) numAdjacent++;
		if (itemx+1 < gridRowIndexMax && grid[itemx+1][itemy] == 1) numAdjacent++;
		return numAdjacent;
	}


}
