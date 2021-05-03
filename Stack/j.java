
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

class j {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        while(t>0){
            Stack<String> s = new Stack<>();
            String[] s1 = reader.readLine().split("");
            for (String p1 : s1) {
                if(!s.isEmpty()){
                    if(p1.equals(s.peek())){
                        s.pop();
                    }else{
                        s.push(p1);
                    }
                }else{
                    s.push(p1);
                }
            }
            if(s.isEmpty()){
                System.out.println("KHALI");
            }else{
                for(String p : s){
                    System.out.print(p);
                }
                System.out.println();
            }


            t--;
        }
    }
}
