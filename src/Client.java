import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
	public static void main(String args[]) throws UnknownHostException, IOException {
		String greeting, temp;
		Scanner sc = new Scanner(System.in);
		Socket s = new Socket("127.0.0.1", 1342);
		Scanner sc1 = new Scanner(s.getInputStream());
		greeting = sc.nextLine();
		PrintStream p = new PrintStream(s.getOutputStream());
		p.println(greeting);
		temp = sc1.nextLine();
		System.out.println(temp);
	}
}
