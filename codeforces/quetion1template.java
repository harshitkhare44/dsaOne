package codeforces;

import java.util.*;

import lists.Pair;

import java.io.*;
import java.lang.*;
import java.text.DecimalFormat;

public class quetion1template {

	static class FastWriter {
		private final BufferedWriter bw;

		public FastWriter() {
			this.bw = new BufferedWriter(new OutputStreamWriter(System.out));
		}

		public void print(Object object) throws IOException {
			bw.append("" + object);
		}

		public void println(Object object) throws IOException {
			print(object);
			bw.append("\n");
		}

		public void close() throws IOException {
			bw.close();
		}
	}
	
	static class FastReader {
		BufferedReader br;
		StringTokenizer st;

		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreTokens()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine().trim();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return str;
		}
	}

	public static void main(String[] args) {
		try {
			FastReader sc = new FastReader();
			FastWriter out = new FastWriter();
//	            int testCases=in.nextInt();
			int testCases = sc.nextInt();

			while (testCases-- > 0) {
				int n=sc.nextInt();
				int m=sc.nextInt();
				String s[]=new String[n];
				for(int i=0;i<n;i++) {
					s[i]=sc.next();
				}
		Arrays.sort(s);

		long ans=Integer.MAX_VALUE;
		for(int j=1;j<n;j++) {
			long diff=0;
	for(int i=0;i<m;i++) {
		diff+=Math.abs(s[j].charAt(i)-s[j-1].charAt(i));
	}
	if(diff<ans) {
		ans=diff;
	}
		}
	out.println(ans);
			}
			out.close();
		} catch (Exception e) {
			return;
		}
	}
	
	 
	
}
