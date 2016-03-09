
public class LongestPalindrome {
	
 public static boolean isPalindrome(String s) {
	     
		 int i=0;
		 int j=s.length()-1;
		 char ch1;
		 char ch2;
		
		 
		 s = s.toLowerCase();
		 
		 if (s.length()<2) return true;
		 
		 while ( i<j) {
			 ch1 = s.charAt(i);
			 ch2 = s.charAt(j);
			 
			while ( (ch1 < 'a' || ch1 > 'z') && (i < j-1)) {
				i++;
				ch1= s.charAt(i);
			}
			
			while (( ch2 < 'a' || ch2 > 'z') && (j >0)) {
				j--;
				ch2= s.charAt(j);
			}
					
			if ( ch1 != ch2 ) return false;
			else {
				i++;
				j--;
			}
			
		 }
		 
		 return true;
		 
	    }
 
 public static String Longest(String s){
	 
	 String current="";
		
		for (int i=0; i<s.length();i++){
			for (int j=i+1;j<s.length();j++){
				
				if (isPalindrome(s.substring(i, j+1)) &&  s.substring(i, j+1).length()>current.length())
					current = s.substring(i, j+1);
			}
		}
	 return current;
	 
 }

	public static void main(String[] args) {
		
		String s="havah kkkkakkk ";
		System.out.println(Longest(s));
	}

}
