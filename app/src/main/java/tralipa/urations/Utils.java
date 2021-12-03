package tralipa.urations;

import java.nio.charset.StandardCharsets;

import com.google.common.hash.HashFunction;
import com.google.common.hash.Hashing;

public class Utils {

	private static HashFunction hf = Hashing.sha256();
	
	
	public static String hash(String hashable) {
		return hf.hashString(hashable, StandardCharsets.UTF_8).toString();
		
	}
}
