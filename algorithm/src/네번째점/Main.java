package 네번째점;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//22.01.14
		//백준 3009번 네 번째 점 
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		String arr[] = new String[2];
		String x[] = new String[3];
		String y[] = new String[3];
		
		arr= br.readLine().split(" ");
		x[0]=arr[0];
		y[0]=arr[1];
		
		arr= br.readLine().split(" ");
		x[1]=arr[0];
		y[1]=arr[1];
		
		arr= br.readLine().split(" ");
		x[2]=arr[0];
		y[2]=arr[1];
		

		String xx;
		String yy;
		
		if(x[0].equals(x[1])) {
			xx = x[2];
		}else if(x[0].equals(x[2])) {
			xx = x[1];
		}else {	//x[2]==x[3]
			xx = x[0];
		}
		
		if(y[0].equals(y[1])) {
			yy = y[2];
		}else if(y[0].equals(y[2])) {
			yy = y[1];
		}else {	//y[2]==y[3]
			yy = y[0];
		}
		
		bw.write(xx+ " " + yy);
		bw.flush();
		
	}
	
}

