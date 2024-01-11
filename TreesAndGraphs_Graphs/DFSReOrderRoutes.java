/*
Example 3: 1466. Reorder Routes to Make All Paths Lead to the City Zero

There are n cities numbered from 0 to n - 1 and n - 1 roads such that there is only one way to travel between two different cities.
Roads are represented by connections where connections[i] = [x, y] represents a road from city x to city y. 
The edges are directed. You need to swap the direction of some edges so that every city can reach city 0.
 Return the minimum number of swaps needed.

*/
package TreesAndGraphs_Graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class DFSReOrderRoutes {
    Map<Integer,List<Integer>> graph = new HashMap<>();
    Set<Integer> seen = new HashSet<>();
    Set<String> roads = new HashSet<>();


    public int minReorder(int n , int[][]connections){
      
        //create map to hold neighbour mapping for each node
        for(int i =0 ;i<n ; i++){
            graph.put(i, new ArrayList<>());
        }

        // creating a matrix to get all the neighbours of the node assuming that the graph is undirected. 
        for(int[] connection: connections){
            int x = connection[0];
            int y = connection[1];
            graph.get(x).add(y);
            graph.get(y).add(x);
            //contains the pairing of (row,col) which if matches, is the route that needs to be changed as it points away from 0.
            roads.add(convertToHash(x,y));
        }

        // we start traversal at 0, so it is added to set
        seen.add(0);
        //dfs traversal
        return dfs(0);
    }


    private String convertToHash(int row, int col) {
        return (String.valueOf(row) + "," + String.valueOf(col));
    }


    private int dfs(int node) {
        int ans=0;

        //iterate through each neighbour of each node
        for(int neighbour: graph.get(node)){
            
            //if the neighbour is not already encountered and verified
            if(!seen.contains(neighbour)){

                //if the (row,col) combo matches, then it needs to be re-routed , else not required
                if(roads.contains(convertToHash(node, neighbour))){
                    ans++;
                }

                seen.add(neighbour);
                ans+= dfs(neighbour); // recursive traversal for the neighbours of the current node
            }
        }

        return ans;
    }
    
}
