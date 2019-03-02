package rough;

import java.util.ArrayList;
import java.util.Iterator;

import org.testng.annotations.Test;

public class CollectionPrograms {
@Test
public static void arryList()
{
ArrayList<String> aList=new ArrayList<String>();
aList.add("Rasheed");
aList.add("ahmed");
aList.add("Sheik");

System.out.println("traverse using each loop is  ");

for(String eachValue:aList)
{
	
System.out.println(eachValue);
}

Iterator<String> itr=aList.iterator();

System.out.println("traversing  using iterator ");
while(itr.hasNext())
{
System.out.println("traversing using iterator"+itr.next());	
}
	
	
}
}
