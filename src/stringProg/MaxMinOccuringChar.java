package stringProg;

public class MaxMinOccuringChar {

	public static void main(String[] args) {
		String s="she is my sister";
		char[] str=s.toCharArray();
		int[] freq=new int[str.length];
	
		  char minChar = s.charAt(0), maxChar = s.charAt(0);    
	      int i,j,min, max; 
		
		for(i=0;i<str.length;i++) {
			freq[i]=1;
			for(j=i+1;j<str.length;j++) {
				if(str[i]==str[j] && str[i]!=' ' && str[i]!='0') {
					freq[i]++;
					
					freq[j]='0';	
				}
			}
		}
		
		 min = max = freq[0];    
	      for(i = 0; i <freq.length; i++) {    
	              
	          //If min is greater than frequency of a character     
	          //then, store frequency in min and corresponding character in minChar    
	          if(min > freq[i] && freq[i] != '0') {    
	              min = freq[i];    
	              minChar = str[i];    
	          }    
	          //If max is less than frequency of a character     
	          //then, store frequency in max and corresponding character in maxChar    
	          if(max < freq[i]) {    
	              max = freq[i];    
	              maxChar = str[i];    
	          }    
	      }    
	          
	      System.out.println("Minimum occurring character: " + minChar);    
	      System.out.println("Maximum occurring character: " + maxChar);    
	  }    

	}


