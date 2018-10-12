import java.net.Inet4Address;
import java.net.InetAddress;

public class IPAddress {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		InetAddress  Addr = InetAddress.getLocalHost();
		System.out.println(Addr.getHostAddress());
		
		
		
	}

}
