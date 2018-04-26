package ro.unibuc.fmi.tv;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Problem {
	static public class ConditionsNotMetException extends RuntimeException {
		private static final long serialVersionUID = 1L;
	}

	static public boolean isPalindrome(String s) {
	    int i1 = 0;
	    int i2 = s.length() - 1;
	    while (i2 > i1) {
	        if (s.charAt(i1) != s.charAt(i2)) {
	            return false;
	        }
	        ++i1;
	        --i2;
	    }
	    return true;
	}

	static public int solve(int n, String[] v, int l) {
		if (n <= 0 || n >= 1000 || l < 0) {
			throw new ConditionsNotMetException();
		}

		int count = 0;
		for (int i = 0, len = v.length; i < len; ++i) {
			String str = v[i];
			boolean isStrPalindrome = isPalindrome(str);
			if (isStrPalindrome && str.length() == l) {
				++count;
			}
		}

		return count;
	}

	public static void main(String[] args) {
		solve(0, new String[] {}, -1);
	}
}
