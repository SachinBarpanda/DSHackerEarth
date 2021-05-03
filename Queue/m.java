

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

class m {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        String[] q1 = reader.readLine().split(" ");
        String[] q2 = reader.readLine().split(" ");
        Queue<Integer> queue1 = new LinkedList<>();
                
        int[] in = new int[n];
        for (int i = 0; i < n; i++) {
            in[i] = Integer.parseInt(q2[i]);
            queue1.add(Integer.parseInt(q1[i]));
        }
        int i = 0,count = 0 ;
        while(queue1.size() > 0) {
            for (int j = 0; j < queue1.size(); j++) {
                if(queue1.peek() != in[i]){

                    int removed =  queue1.remove();
                    queue1.add(removed);
                    count++;
                    
                }else{
                    queue1.remove();
                    i++;count++;
                    break;
                }
            }
        }
        System.out.println(count);
    }
}
