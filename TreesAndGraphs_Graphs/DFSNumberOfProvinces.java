/*Example 1: 547. Number of Provinces

There are n cities. A province is a group of directly or indirectly connected cities and no other cities outside of the group. 
You are given an n x n matrix isConnected where isConnected[i][j] = isConnected[j][i] = 1 if the 
i th  city and the j th city are directly connected, and isConnected[i][j] = 0 otherwise. 
Return the total number of provinces.

*/

package TreesAndGraphs_Graphs;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DFSNumberOfProvinces{
    Map<Integer, List<Integer>> graph = new HashMap<>();
    boolean[] seen;


    public int findCircleNum(int[][] isConnected) {
        //build the graph
        int n = isConnected.length;

        //traverse row
        for(int i = 0 ; i < n ;i++){
            if(!graph.containsKey(i)){
                graph.put(i, new ArrayList<>());
            }
            //traverse column
            for (int j = i + 1; j < n; j++) {
                if (!graph.containsKey(j)) {
                    graph.put(j, new ArrayList<>());
                }
                if (isConnected[i][j] == 1) {
                    graph.get(i).add(j);
                    graph.get(j).add(i);
                }
            }
        }

        seen = new boolean[n];
        int ans =0;

        for(int i =0;i<n;i++){
            if (!seen[i]) {  
                //increment number of connected components if added to set  - this gives the total number of provinces           
                ans++;
                seen[i]= true;
                // add all nodes of a connected component to the set
                dfs(i);

            }
        }
        return ans;
    }

    private void dfs(int node) {
        // iterate over the graph to get the neighbours, add it to the set and make it true
        for (int neighbour: graph.get(node)) {
            if (!seen[neighbour]) 
            {
                seen[neighbour] = true;
                dfs(neighbour);
            }
         }
    }
}