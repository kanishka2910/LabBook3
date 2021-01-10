import java.lang.Math;
public class Exercise4 {
	public static void main(String[]args)
	{
		int n=4567;
		String str=String.valueOf(n);
		StringBuilder sb=new StringBuilder("");
		for(int i=1;i<=str.length();i++)
		{
			sb.append(Math.abs(str.charAt(i)-str.charAt(i+1)));
		}
		System.out.println(sb);
		
}
}
