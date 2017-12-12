
public class Input extends Tag{

	private String type;
	private String event;
	private String value;
	private String placeHolder;
	
	public Input() 
	{
		super("input");
	}

	public void setType(String type) 
	{
		this.type=" type=\""+type+"\"";
	}

	public void setEvent(String eventType, String event)
	{
		this.event=" "+eventType+"=\""+event+"\"";
	}

	public void setValue(String value) 
	{
		this.value=" value=\""+value+"\"";
	}

	@Override
	public void setMessage(String msg) 
	{
		placeHolder=" placeholder=\""+msg+"\"";
		//I may have learned a little html for this one :)
		//I just wanted to know if it was possible for there to be text between input tags
	}
	
	@Override
	public String getDisplay()
	{
		StringBuilder tag=new StringBuilder("<"+getTagName());
		if(getID()!=null)
		{
			tag.append(getID());
		}
		if(getClassName()!=null)
		{
			tag.append(getClassName());
		}
		if(type!=null)
		{
			tag.append(type);
		}
		if(event!=null)
		{
			tag.append(event);
		}
		if(value!=null)
		{
			tag.append(value);
		}
		if(placeHolder!=null)
		{
			tag.append(placeHolder);
		}
		tag.append("></"+getTagName()+">");
		
		return tag.toString();
	}
}
