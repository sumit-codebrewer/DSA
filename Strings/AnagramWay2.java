package hustlefolder7;

public class AnagramWay2 {

	public static void main(String[] args) {
		String a="abab";
		String b="bbaa";
		boolean isAnagram=true;
		int []arr1=new int[256];
		int []arr2=new int[256];
		for(char c:a.toCharArray())
		{
			int index=(int)c;
			arr1[index]++;
		}
		for(char c:b.toCharArray())
		{
			int index=(int)c;
			arr2[index]++;
		}
		for(int i=0;i<256;i++)
		{
			if(arr1[i]!=arr2[i])
			{
				isAnagram=false;
				break;
			}
		}
		if(isAnagram)
		{
			System.out.println("Anagarm");
		}
		else
		{
			System.out.println("Not an Anagarm");
		}

	}

}
