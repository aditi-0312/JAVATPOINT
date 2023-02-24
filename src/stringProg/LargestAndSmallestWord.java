package stringProg;

public class LargestAndSmallestWord {

	public static void main(String[] args) {
		String s="largest word in string";
		String word="",small="",large="";
		String[] words=new String[100];
		int length=0;
		
		s=s+" ";
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=' ') {
				word=word+s.charAt(i);
			}
			else {
				words[length]=word;
				length++;
				
				word="";
			}
		}
		
		small=large=words[0];
		
		for(int i=0;i<length;i++) {
			if(small.length()>words[i].length())
				small=words[i];
			
			if(large.length()<words[i].length())
				large=words[i];
		}
		System.out.println(small + " "+large);
	}

}
