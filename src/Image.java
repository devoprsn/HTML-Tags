
public class Image extends Tag{

	private String src;
	
	public Image(String src) 
	{
		super("img");
		this.src=src;
	}
	
	@Override
	public void setMessage(String msg)
	{
		System.out.println("An image cannot have text between its tags");
	}
	
	@Override
	public String getDisplay()
	{
		StringBuilder tag=new StringBuilder("<img");
		tag.append(" src=\""+src+"\"");
		if(getID()!=null)
		{
			tag.append(" "+getID());
		}
		if(getClassName()!=null)
		{
			tag.append(" "+getClassName());
		}
		tag.append("></img>");
		
		return tag.toString();
	}
}
