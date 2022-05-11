package strings;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="ga";
		String b="ag";		
		boolean isAnagram=false;
		boolean visted[]=new boolean[b.length()];
		if(a.length()==b.length())
		{
			for(int i=0;i<a.length();i++) {
				char c=a.charAt(i);
				isAnagram=false;
				for (int j=0;j<b.length();j++) {
					if (b.charAt(j)==c&& !visted[j]){
						visted[j]=true;
						isAnagram=true;
						break;}
					}
				if(!isAnagram) {
						break;}
											}
			}if(isAnagram) {
					System.out.println("anagram");}
				else {System.out.println("not an anagram");}
			
		

	}

}
