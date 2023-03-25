import java.util.*;

public class Count_Unreachable_Pairs_of_Nodes_in_an_Undirected_Graph_2316 {
    public static void main(String[] args) {
        var count = new Count_Unreachable_Pairs_of_Nodes_in_an_Undirected_Graph_2316();
        long wing = count.countPairs(7,new int[][]{{0,2},{0,5},{2,4},{1,6},{5,4}});
    }
    private List<Integer>[] graph;

    /* recursion way DFS
    * fn visit(node){
    *   if ( node != visited ){
    *       visit(node)
    *   }
    *}
    * */
    public long countPairs(int n, int[][] edges) {


        return 0;
    }
}
