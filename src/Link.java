
public class Link extends WrapperTag{

	private String link;
	private String msg;
	
	public Link(Tag base) 
	{
		super(base, "a");
		link=" href=\"#\"";
	}
	
	public Link(String msg) //gives the option for a link to be its own tag instead of a wrapper
	{						
		super(null, "a");
		this.msg=msg;
		link=" href=\"#\"";
	}
	
	public void setLink(String link)
	{
		this.link=" href=\""+link+"\"";
	}
	
	@Override
	public String getDisplay()
	{
		StringBuilder t=new StringBuilder("<a");
		t.append(link);
		if(msg==null)
		{	
			t.append(">"+getBase().getDisplay()+"</a>");
			return t.toString();
		}
		else
		{
			t.append(">"+msg+"</a>");
			return t.toString();
		}
	}
}
