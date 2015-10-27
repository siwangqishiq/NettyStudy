package com.xinlan.nettystudy;

/**
 * 
 * @author panyi
 *
 */
public class DiscardServer {
	private int port = 8964;//¶Ë¿ÚºÅ
	
	public void run() throws Exception{
		
	}
	
	public static void main(String[] args) {
		try {
			new DiscardServer().run();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}//end class
