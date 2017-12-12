
public class Header extends Tag{

	public Header(int num) 
	{
		super("h"+num);
		if(num<1 || num>6)
		{
			throw new IllegalArgumentException("Header number must be an integer between 1-6.");
		}
	}
}
