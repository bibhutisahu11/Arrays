package demo;

public class StatVariable {
	
	
		   static int count=0;
		   public void increment()
		   {
		       count++;
		   }

	public static void main(String[] args) {
		//StatVariable obj1=new StatVariable();
		StatVariable obj2=new StatVariable();
	       //obj1.increment();
	       obj2.increment();
	       //System.out.println("Obj1: count is="+obj1.count);
	       System.out.println("Obj2: count is="+obj2.count);
	}

}
