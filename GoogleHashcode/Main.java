package GoogleHashcode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;




public class Main {

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

	public static void main(String[] args) {
		try {
			FastReader in = new FastReader();
			FastWriter out = new FastWriter();
			int testCases = in.nextInt();
			while (testCases-- > 0) {
			

				File file = new File("\\Users\\KIIT\\Documents\\a.txt");
				Scanner scan = new Scanner(file);

				String fileContent = "";
				while (scan.hasNextLine()) {
					fileContent = fileContent.concat(scan.nextLine() + "\n");
				}
				
			
				FileWriter writer = new FileWriter("\\Users\\KIIT\\Documents\\a.out");
				writer.write(fileContent);
				writer.close();
					
					

			}
			out.close();
		} catch (Exception e) {
			return;
		}
	}


}
