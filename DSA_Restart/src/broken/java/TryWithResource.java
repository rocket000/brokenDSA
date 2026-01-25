package broken.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithResource {

	public static void main(String[] args) throws IOException {
		int i = 0;
		BufferedReader b = null;

		// Normal try catch
		try {
			InputStreamReader in = new InputStreamReader(System.in);
			b = new BufferedReader(in);
			System.out.println("Enter some val:");
			System.out.println(b.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// b.close();
		}

		// Try with resource
		// No need to close the resource - it closes automatically after execution
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			System.out.println("Enter some val:");
			System.out.println(br.readLine());
		}

	}

}
