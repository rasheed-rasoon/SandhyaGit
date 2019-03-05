
public abstract class AbstractClassSample {
	
	AbstractClassSample(int i)
	{
		
	System.out.println(i);	
	}
	
	static int i=1;
	public abstract void add();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractClassSample abs=new AbstractClassSample(2) {

			@Override
			public void add() {
				// TODO Auto-generated method stub
				
			}
			
			
		};
	}

}
