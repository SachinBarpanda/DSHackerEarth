
    import java.io.BufferedReader;
    import java.io.InputStreamReader;
    import java.util.ArrayList;

    
    class k {
        public static void main(String[] args) throws Exception {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(reader.readLine());
            int i,j,j2;
            ArrayList<Integer> a = new ArrayList<>();
            for (i = 0; i < n; i++) {
                a.add(Integer.parseInt(reader.readLine()));
            }
            for ( i = 0; i < a.size();i++) {  
                for (j = i+1; j < a.size(); j++) {
                    if(a.get(i)<a.get(j)){
                        break;
                    }
                }
                if(j!=n){
                    for (j2 = j+1; j2 < a.size(); j2++) {
                        if(a.get(j)>a.get(j2)){
                            break;
                        }
                    }
                    if(j2!=n){
                        System.out.print(a.get(j2)+" ");
                    }else{
                        System.out.print(-1+" ");
                    }
                }else{
                    System.out.print(-1+" ");
                }
            }
        }
    }
