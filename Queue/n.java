import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

class n {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        Queue<Integer> q = new LinkedList<>();
        while(t>0){
            String[] s = reader.readLine().split(" ");
            String e  = (s[0]);
            
            if(e.equals("E")){
                int d = Integer.parseInt(s[1]);
                q.add(d);
                System.out.println(q.size());
            }else if (e.equals("D")){
                
                if(q.size()<=0){
                    System.out.println(-1 + " "+ q.size());
                }else
                    System.out.println(q.remove() + " "+q.size());

            }

            t--;
        }

    }
    
}
