/*
Example 1: 1091. Shortest Path in Binary Matrix

Given an n x n binary matrix grid, return the length of the shortest clear path in the matrix. 
If there is no clear path, return -1. 
A clear path is a path from the top-left cell (0, 0) to the bottom-right cell (n - 1, n - 1) such that all visited cells are 0. 
You may move 8-directionally (up, down, left, right, or diagonally).

Solution:
With trees, we used a for loop inside of a while loop. 
This was because we cared about the levels as a whole - we wanted to analyze each level separately 
(find the maximum element, etc.). Here, we don't really care about the levels as a whole - we just want to reach the end

*/

package TreesAndGraphs_Graphs;

import java.util.LinkedList;
import java.util.Queue;


public class BFSShortestMatrixPath {
    public class State{
        int row;
        int col;
        int steps;

        State(int row, int col, int steps){
            this.row = row;
            this.col = col;
            this.steps = steps;            
        }
    }

    public class Solution{
        int n;
        int[][] directions = new int[][]{{-1,-1},{-1,0},{-1,1},{0,-1},{0,-1},{1,-1},{-1,1},{1,0},{1,1}};

        public int shortestPathBinaryMatrix(int[][]grid){
            
            // first cell should have 0
            if(grid[0][0]==1){
                return -1;
            }

            //square matrix
            n= grid.length;
            
            boolean[][] seen = new boolean[n][n];
            seen[0][0]= true;

            Queue<State> queue = new LinkedList<>();
            queue.add(new State(0,0,1)); //add 1st element

            while(!queue.isEmpty()){
                State state = queue.remove();
                int row = state.row;
                int col = state.col;
                int steps = state.steps;

                //reached the last box , so return min step count
                if(row == n-1 && col == n-1){
                    return steps;
                }

                for(int[] direction : directions){
                    int nextRow = row + direction[0]; // {0 , 1} --> 0 chosen
                    int nextCol = col + direction[1]; // {0 , 1} --> 1 chosen
                    
                    if(valid(nextRow,nextCol,grid) && !seen[nextRow][nextCol]){
                        seen[nextRow][nextCol] = true;
                        queue.add(new State(nextRow,nextCol,steps+1)); //add this neighbour to the queue
                    }
                }

            }
           return -1;            
        }

        private boolean valid(int row, int col, int[][] grid) {
            return (0<=row 
                    && row<n
                    && 0<=col
                    && col<n
                    && grid[row][col]==0);
        }
    }

}
