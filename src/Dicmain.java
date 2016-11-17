import java.io.*;
import java.net.*;
import java.util.*;
import java.util.concurrent.*;
public class Dicmain {
	public Dicmain(){
		ExecutorService executor=Executors.newCachedThreadPool();
			ServerSocket serversocket;
			try {
				serversocket = new ServerSocket(8000);
				Socket socket = null;
				while(socket==serversocket.accept()){
					Search search=new Search(socket);
					executor.execute(search);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Dicmain();
	}
}
