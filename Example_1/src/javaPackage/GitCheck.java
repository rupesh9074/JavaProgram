package javaPackage;

public class GitCheck {

	public static void main(String[] args) {

		String s = "aaaabbcccdd";
		int count =0;
		
		char[] ch = s.toCharArray();

				for(int i =0; i< ch.length; i++)
				{
					for(int j= i+1; j<ch.length; j++)
					{
						if (ch[i]==ch[j])
						{
							count++;	

						}
						
					}
					
					System.out.println(ch[i]+""+count);
				}
				
	}
}