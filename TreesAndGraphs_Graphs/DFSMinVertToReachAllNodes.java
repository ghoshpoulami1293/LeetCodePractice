/*Example 5: 1557. Minimum Number of Vertices to Reach All Nodes
    Given a directed acyclic graph, with n vertices numbered from 0 to n-1,
    and an array edges where edges[i] = [x, y] represents a directed edge from node x to node y. 
    Find the smallest set of vertices from which all nodes in the graph are reachable.
*/


/**
 * The problem wants the smallest set of nodes from which all other nodes can be reached. 
 * This can be rephrased as the smallest set of nodes that cannot be reached from other nodes, 
 * because if a node can be reached from another node, then we would rather just include the "parent" 
 * rather than the "child" in our set.
 * 
 * 
 * A node cannot be reached from another node if it has an indegree of 0 (no edges are entering the node).
 * Therefore, we can just find the indegree of all nodes and only include the ones with a zero indegree.
 * 
 * Note: this algorithm works because the graph is a directed acyclic graph (DAG). 
 * If the graph had a cycle, let's say it just formed a circle, then there would be no nodes with an indegree of 0,
 * but we would still need to include at least one node
 */
package TreesAndGraphs_Graphs;

import java.util.ArrayList;
import java.util.List;

public class DFSMinVertToReachAllNodes {

    public List<Integer> findSmallestSetOfVertices(int n , List<List<Integer>> edges){
        int[] indegree = new int[n];

        for(List<Integer> edge :edges){
            //if an adjacency list is passed as input , for an edge, the indegree node is located at index  1 -->[0,1] --> entering 1
            //increment the number of incoming edges into the node 
            indegree[edge.get(1)]++;
        }

        List<Integer> answer = new ArrayList<>();
        
        //if indegree = 0, include in the answer list
        for(int i = 0;i<n ;i++){
            if(indegree[i]==0){
                answer.add(i);
            }
        }

        return answer;
    }
    
}
