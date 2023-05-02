package org.example;

import java.io.*;
import java.util.StringTokenizer;

public class 백준_10250_ACM_호텔 {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int H = Integer.parseInt(st.nextToken());
            st.nextToken();
            int N = Integer.parseInt(st.nextToken());

            String left = String.valueOf(N % H == 0 ? H : N % H);
            String right = String.valueOf(N % H == 0 ? N / H : N / H + 1);
            right = right.length() == 1 ? "0" + right : right;

            bw.write(left + right + "\n");
        }

        bw.flush();

        bw.close();
        br.close();
    }
}