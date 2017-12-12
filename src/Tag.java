
public abstract class Tag {

	private String tagName;
	private String id;
	private String className;
	private String msg;
	
	public Tag(String tagName)
	{		
		this.tagName=tagName;	
	}
	
	public String getTagName()
	{
		return tagName;
	}

	public void setID(String id)
	{
		this.id="id=\""+id+"\"";
	}
	
	public String getID() 
	{
		return id;
	}

	public void setClassName(String className)
	{
		this.className="class=\""+className+"\"";	
	}
	
	public String getClassName() 
	{
		return className;
	}
	
	public void setMessage(String msg)
	{
		this.msg=msg;
	}
	
	public String getMessage()
	{
		return msg;
	}

	
	public String getDisplay()
	{		
		StringBuilder tag=new StringBuilder("<"+tagName);
		if(id!=null)
		{
			tag.append(" "+id);
		}
		if(className!=null)
		{
			tag.append(" "+className);
		}
		tag.append(">");
		if(msg!=null)
		{
			tag.append(msg);
		}
		tag.append("</"+tagName+">");
		
		return tag.toString();
	}
}
