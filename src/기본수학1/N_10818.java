package 기본수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N_10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        br.readLine();
        StringTokenizer st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()){
            int cur =Integer.parseInt(st.nextToken());
            max = Math.max(cur, max);
            min = Math.min(cur, min);
        }
        sb.append(min+" "+max);
        System.out.println(sb.toString());
    }
}
