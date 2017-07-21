import java.net.*;
public class A01_InetAddressDemo01{
	public static void main(String[] args) throws Exception{
		InetAddress locAdd = InetAddress.getLocalHost();
		InetAddress remAdd = InetAddress.getByName("112.80.248.74");
		System.out.println(locAdd.getHostAddress());
		System.out.println(remAdd.getHostAddress());
		System.out.println(locAdd.isReachable(5000));
		System.out.println(remAdd.isReachable(5000));
	}
}
