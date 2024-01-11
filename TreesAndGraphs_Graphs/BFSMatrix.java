/*
Example 3: 542. 01 Matrix

Given an m x n binary (every element is 0 or 1) matrix mat, find the distance of the nearest 0 for each cell. 
The distance between adjacent cells (horizontally or vertically) is 1.
For example, given mat = [[0,0,0],[0,1,0],[1,1,1]], return [[0,0,0],[0,1,0],[1,2,1]].
*/


package TreesAndGraphs_Graphs;

import java.util.LinkedList;

public class BFSMatrix {
    public class State{
        int row;
        int col;
        int steps;

        public State(int row, int col, int steps) {
            this.row = row;
            this.col = col;
            this.steps = steps;
        }    
    }

    public class Solution{
        int m;
        int n;

        int[][] directions = new int[][]{{-1,-1},{-1,0},{-1,1},{0,-1},{0,-1},{1,-1},{-1,1},{1,0},{1,1}};

        public int[][] updateMatrix(int[][] mat){
            m = mat.length;
            n= mat[0].length;

            Queue<State> queue= new LinkedList<>();
            boolean seen[][] = new boolean[m][n]; 

            for(int row = 0; row < m ; row++){
                for 
            }

        }
    }
}
