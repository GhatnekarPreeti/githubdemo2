package com.acellere.corona.auxmod.frontend.solhint;

import com.sun.org.slf4j.internal.LoggerFactory;

import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.NullCipher;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLServerSocketFactory;

import org.apache.logging.log4j.Logger;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class Test {
	private static final Logger logger = org.apache.logging.log4j.LogManager.getLogger(Test.class);

	public void bar() {
		System.exit(0); // never call this when running in an application server!
	}

	public void foo() {
		Runtime.getRuntime().exit(0); // never stop the JVM manually, the container will do this.
	}

	public void expression1() {
		double y = 0;
		boolean x = (y == Double.NaN);

		boolean isNumber = false;
		if (isNumber) {

			logger.info("hello");
		}
	}

	String count;

	public void process() {
		SecureRandom secureRandom = new SecureRandom();
		try {
			PrintWriter out = new PrintWriter("");
			out.println("the text");

			System.out.println("");
			System.out.println("");
			out.close();
			Cipher c1 = Cipher.getInstance("DES");
			ServerSocket soc = new ServerSocket(1234); // Plain server socket (Cleartext communication):
			ServerSocket soc1 = SSLServerSocketFactory.getDefault().createServerSocket(1234); // SSL Server Socket
																								// (Secure
																								// communication):
			Cipher cc = new NullCipher();
		} catch (IOException | NoSuchAlgorithmException | NoSuchPaddingException e) {
			System.err.println();
			System.err.println();

			try {
				Cipher c1 = Cipher.getInstance("DES");
			} catch (NoSuchAlgorithmException | NoSuchPaddingException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				Socket soc234 = new Socket("127.0.0.1", 5000);
			} catch (UnknownHostException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}

	}

	public void process2() {
		try {
			try {
				SSLContext context1 = SSLContext.getInstance("SSL");
			} catch (NoSuchAlgorithmException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("out.txt", true)));
			out.println("the text");
		} catch (IOException e) {

			logger.error("Resource is not closed anywhere.", e);

			/* logger.error("Resource is not closed anywhere.",e); */

		}
	}

	protected void finalize() {

	}

	public void method() {
		Thread myThread = new Thread();
		// EMB-ISSUE: CodeIssueNames.RUN_SHOULD_NOT_BE_CALLED_DIRECTLY
		myThread.run();
	}

}
