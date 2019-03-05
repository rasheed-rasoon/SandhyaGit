package rough;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class CollectionPrograms {

public static void arryListExample()
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
System.out.println(itr.next());	
}	


System.out.println("Traversing using List iterator in forward direction");
ListIterator<String> listItr=aList.listIterator();

while(listItr.hasNext())
{
System.out.println(listItr.next());	

}
System.out.println("Traversing the list in reverse direction");
ListIterator<String> listItrBack=aList.listIterator(aList.size());

while(listItrBack.hasPrevious())
{
System.out.println(listItrBack.previous());	

}
}


public static void main(String[] args)
{
	CollectionPrograms.arryListExample();


}
}
