package stringManipulation;

import com.sun.org.apache.xml.internal.security.exceptions.Base64DecodingException;
import com.sun.org.apache.xml.internal.security.utils.Base64;

public class EcodingDecoding {

	public static void main(String[] args) throws Base64DecodingException {
		String encodedString = encodeString("india@123");
		decodeString(encodedString);
	}

	public static String encodeString(String string) {
		String encodedString = Base64.encode(string.getBytes());
		System.out.println(encodedString);
		return encodedString;
	}

	public static String decodeString(String encodedstring) throws Base64DecodingException {

		byte[] decodedString = Base64.decode(encodedstring);
		return new String(decodedString);
	}
}
