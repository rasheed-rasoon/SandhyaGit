package rough;

public class StringStringBufferStringBuilder {
	
	public static void stringExample()
	{
		String str="rasheed";
		System.out.println("string before change  "+str);
		str.concat("ahmed");
		System.out.println("string after change  "+str);
		
		
		String s="Sachin";  
		   s.concat(" Tendulkar");//concat() method appends the string at the end  
		   System.out.println(s);//will print Sachin because strings are immutable objects  
	}
	
	
	public static void StringBuffer()
	{
		
		
		StringBuffer strBuffer=new StringBuffer("rasheed");
		strBuffer.append("ahmed");
		System.out.println("String buffer value is  "+strBuffer);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StringStringBufferStringBuilder.stringExample();
StringStringBufferStringBuilder.StringBuffer();  }

}
