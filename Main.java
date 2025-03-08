//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;
public class Main {

      public static void bfs(int startNode , List<List<Integer>> list){
          Queue<Integer> q = new LinkedList();
          boolean visited[] = new boolean[list.size()];
          q.add(startNode);
          visited[startNode] = true;

          while(!q.isEmpty()){
              int ele = q.poll();
              System.out.print(ele+" ");
              for(int neighbour :list.get(ele))
                if(!visited[neighbour]){
                    q.add(neighbour);
                    visited[neighbour]=true;
                }
          }
          System.out.println();
      }

      public static void dfs(int startNode, List<List<Integer>>list, boolean vis[]){
          System.out.print(startNode+" ");
          vis[startNode]=true;

          for(int num:list.get(startNode)){
              if(!vis[num]){
                  dfs(num,list,vis);
              }
          }
      }

    public static void main(String[] args) {
          int numberOfNodes = 6;
          boolean vis[] = new boolean[numberOfNodes];
          List<List<Integer>>list = new ArrayList<>();

          for(int i=0;i<numberOfNodes;i++){
              list.add(new ArrayList<>());
          }


        list.get(0).add(1);
        list.get(0).add(2);
        list.get(1).add(3);
        list.get(1).add(4);
        list.get(2).add(4);
        list.get(3).add(5);
        list.get(4).add(5);

        bfs(0,list);

        dfs(0,list,vis);

    }
}