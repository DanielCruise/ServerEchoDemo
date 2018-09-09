import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
	public static void main(String args[]) throws UnknownHostException, IOException {
		String greeting, temp;
		// Initial a scanner object
		Scanner sc = new Scanner(System.in);
		// Initial a socket with specified host and port 
		Socket s = new Socket("127.0.0.1", 1342);
		Scanner sc1 = new Scanner(s.getInputStream());
		// Return typed string
		greeting = sc.nextLine();
		// ????
		PrintStream p = new PrintStream(s.getOutputStream());
		p.println(greeting);
		temp = sc1.nextLine();
		System.out.println(temp);
	}
} // End class Client
