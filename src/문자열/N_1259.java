import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N_1259 {
    public static boolean isPal(String str){
        for(int i=0;i<=str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while(true){
            String str = br.readLine();
            if(str.equals("0")){
                System.out.println(sb.toString());
                return;
            }
            if(isPal(str)){
                sb.append("yes\n");
            }else{
                sb.append("no\n");
            }
        }
    }
}
