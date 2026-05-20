
public class Operations {
	
	public void Add()
	{
		int a=20,b=10, c;
		c=a+b;
		System.out.println("Addition is= "+c);
	}
	public void Sub()
	{
		int a=20,b=10, c;
		c=a-b;
		System.out.println("Substraction is= "+c)
	}

	public static void main(String[] args) {

		Operations o=new Operations();
		o.Add();
		o.Sub();
		
		
	}

}
