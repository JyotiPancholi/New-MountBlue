package string.practice.com;

public class S17_CountBracketsReversals {
	 static int countRev (String s)
	    {
	        if((s.length()&1)==1)
	        {
	            return -1;
	        }
	        int count=0,op=0;
	        for(int i=0;i<s.length();i++)
	        {
	            if(s.charAt(i)=='{')
	            {
	                op++;
	            }
	            else
	            {
	                if(s.charAt(i)=='}' && op==0)
	                {
	                    op++;
	                    count++;
	                }
	                else
	                {
	                    op--;
	                }
	            }
	        }
	        return count+(op/2);
	    }
	public static void main(String[] args) {
		String str = "}{{}}{{{";
		int s = countRev(str);
		System.out.println(s);
	}

}
