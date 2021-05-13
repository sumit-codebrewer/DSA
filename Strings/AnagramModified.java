package hustlefolder7;

public class AnagramModified {

	public static void main(String[] args) {
		String s1="aabb";
		String s2="abab";
		boolean isAnagram=false;
		boolean []visited=new boolean[s2.length()];
		if(s1.length()==s2.length())
		{
			for(int i=0;i<s1.length();i++)
			{
				char c=s1.charAt(i);
				isAnagram=false;
				for(int j=0;j<s2.length();j++)
				{
					if(s2.charAt(j)==c&&!visited[j])
					{
						visited[j]=true;
						isAnagram=true;
						break;
					}
				}
				if(!isAnagram)
				{
					isAnagram=false;
				}
			}
			
		}
		if(isAnagram)
		{
			System.out.println("Anagram");
		}
		else
		{
			System.out.println("Not an Anagram");
		}	
	}

}
