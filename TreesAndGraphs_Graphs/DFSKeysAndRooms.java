/**
 * Example 4: 841. Keys and Rooms

There are n rooms labeled from 0 to n - 1 and all the rooms are locked except for room 0.
Your goal is to visit all the rooms. When you visit a room, you may find a set of distinct keys in it. 
Each key has a number on it, denoting which room it unlocks, and you can take all of them with you to unlock the other rooms.
Given an array rooms where rooms[i] is the set of keys that you can obtain if you visited room i,
return true if you can visit all the rooms, or false otherwise.
 */
package TreesAndGraphs_Graphs;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DFSKeysAndRooms {
    
    Set<Integer> seen = new HashSet<>();

    //we are receiving an adjacency list as input
    public boolean canVisitAllRooms(List<List<Integer>> rooms){
        seen.add(0);        
        dfs(0, rooms);
        return (seen.size() == rooms.size());
    }

    //check for all node traversal starting from 0
    private void dfs(int node, List<List<Integer>> rooms) {
        for(int neighbour : rooms.get(node)){
            if(!seen.contains(neighbour)){
                seen.add(neighbour);
                dfs(neighbour, rooms);
            }
        }
        
    }  

}
