package 문자열;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class N_10798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        List<Character>[] str = new List[5];
        int len = 0;
        for(int i=0;i<str.length;i++){
            String line = br.readLine();
            len+=line.length();
            str[i] = new ArrayList<>();
            for(char ch: line.toCharArray()){
                str[i].add(ch);
            }
        }

        while(len>0){
            for(int i=0;i<str.length;i++){
                if(!str[i].isEmpty()){
                    bw.write(str[i].remove(0));
                    len--;
                }
            }
        }
        bw.flush();
        bw.close();

    }
}
