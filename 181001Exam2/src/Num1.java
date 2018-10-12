import java.net.InetAddress;
import java.net.UnknownHostException;

public class Num1 {

	public static void main(String[] args) throws UnknownHostException {
		// TODO Auto-generated method stub
		 InetAddress addr = InetAddress.getLocalHost();
	      System.out.println("Local HostAddress: "+ addr.getHostAddress());
		
		
	}

}
