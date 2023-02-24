package stringProg;

public class LargeAndSmallWord {

	public static void main(String[] args) {
		String s="largest and small";
		String small="",large="";
		
		String[]words=s.split(" ");
		
		small=large=words[0];
		
		for(int i=0;i<words.length;i++) {
			if(small.length()>words[i].length())
				small=words[i];
			if(large.length()<words[i].length())
				large=words[i];
		}
		
		System.out.println("smallest word is: "+small);
		System.out.println("largest word is: "+large);
	}

}
