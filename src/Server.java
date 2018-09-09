import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
	public static void main(String args[]) throws IOException {
		String greeting, temp;
		// Create and register server at port 1342
		ServerSocket s1 = new ServerSocket(1342);
		// Ready for requests from client
		Socket s = s1.accept();
		// Get input stream from client ?????
		Scanner sc = new Scanner(s.getInputStream());
		greeting = sc.nextLine();
		temp = "Hi";
		// Print response
		PrintStream p = new PrintStream(s.getOutputStream());
		p.println(temp);
	}
} // End class Server
