package collections;

import java.util.ArrayList;
import java.util.List;

public class dupicate_words {
	
	
	
	public static int dupicateWords(String text)
	{
		//the THE dog is brown BROWN
		
		String[] words;
		text=text.toUpperCase();
		words=text.split(" ");
		int result=0;
		List<String> visited=new ArrayList<>();
		for(int i=0;i<words.length;i++)
		{
			if(visited.indexOf(words[i])==-1) {
				visited.add(words[i]);
			
			int count=0;
			for(int j=0;j<words.length;j++)
			{
				if(i==j)
					{continue;}
				else if (words[i].equals(words[j]))
				{
					count++;
					
				}
					
				
			}
			if(count>=1)
			{
				result++;
			}
			}	
		}
		return result;
		
		
	}
	
	public static void main(String[]args)
	{
		String str="the  the THE dog is brown BROWN";

		
		System.out.println(dupicateWords(str));
	
	}
	
	
	
	

}
