package 문자열;

import java.io.*;

public class N_8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0){
            String str =br.readLine();
            int total =0;
            int count=0;
            for(char ch : str.toCharArray()){
                if(ch=='O'){
                    count++;
                    total+=count;
                }else{
                    count =0;
                }
            }
            bw.write(total+"\n");
        }
        bw.flush();
        bw.close();
        
    }
}
