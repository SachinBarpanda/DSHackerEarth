import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

class a {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] s1 = reader.readLine().split(" ");
        int N = Integer.parseInt(s1[0]);
        int Q = Integer.parseInt(s1[1]);
        
        HashMap<Integer, Integer> ok = new HashMap<>();
        HashMap<Integer, Integer> ban = new HashMap<>();
        for (int i = -N; i <= N; i++) {
            ok.put(i, 0);
            ban.put(i, 0);
        }

        Queue<Integer> q1 = new LinkedList<>();
        ArrayList<Integer> x = new ArrayList<>();
        ArrayList<Integer> d = new ArrayList<>();
        ArrayList<Integer> status = new ArrayList<>();

        int entrusted = 0;
                
        for (int i = 1; i <= N; i++) {
            if(i == 0){
                x.add(0,0);
                d.add(0,0);
                status.add(0,0);
            }
            String[] s2 = reader.readLine().split(" ");
            x.add(i,Integer.parseInt(s2[0]));
            d.add(i,Integer.parseInt(s2[1]));
        }

        for (int i = 1; i < Q; i++) {
            String[] s3 = reader.readLine().split(" ");
            int t = Integer.parseInt(s3[0]);
            int id = Integer.parseInt(s3[1]);
            
            int a = x.get(t) - d.get(id) ; int b = x.get(t) + d.get(id);
            
            if(status.get(id) == 1){
                ok.put(a,ok.get(a)-1);
                if(a != b) ok.put(b,ok.get(b)-1);
                entrusted--;
            }else if( status.get(id) == 2){
                ban.put(a, ban.get(a)-1);
                ban.put(b, ban.get(b)-1);
            }
            
            // if (!status.isEmpty()) 
            status.set(i, (t == 3 ? 0:t)) ;

            if(t == 1){
                ok.put(a,ok.get(a)+1);
                if(a != b) ok.put(b,ok.get(b)+1);
                entrusted ++;
                q1.add(id);
            }
            else if(t == 2){
                ban.put(a,ok.get(a)+1);
                ban.put(b,ok.get(b)+1);
            }

            int idx = -1;
            while(!q1.isEmpty()){
                int x1 = q1.peek();//if less items show change this to q1.front()
                if(status.get(x1) == 1 ){
                    idx = 1;
                    break;
                }
                q1.remove();
            }
            if(idx == -1) System.out.println("-1");
            else{
                int a1 = x.get(idx) - d.get(idx);
                int b1 = x.get(idx) - d.get(idx);
                ArrayList<Integer> res = new ArrayList<>();
                if(a1 > 0 && ban.get(a1) == 0) res.add(a1);
                if(b1 > 0 && ban.get(b1) == 0) res.add(b1);

                System.out.print(res.size());
                for(int x2 : res){
                    System.out.print(" "+x2);
                }
                System.out.println();
            }
        }
    }
}
