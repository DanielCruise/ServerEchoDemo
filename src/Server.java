import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
	public static void main(String args[]) throws IOException {
		String greeting, temp;
		ServerSocket s1 = new ServerSocket(1342);
		Socket s = s1.accept();
		Scanner sc = new Scanner(s.getInputStream());
		greeting = sc.nextLine();
		temp = "Hi";
		PrintStream p = new PrintStream(s.getOutputStream());
		p.println(temp);
	}
}
