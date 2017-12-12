
public abstract class WrapperTag extends Tag{

	private Tag base; 
	
	public WrapperTag(Tag base, String tagName) 
	{	
		super(tagName);
		this.base=base;
	}
	
	public Tag getBase()
	{
		return base;
	}
	
	@Override
	public void setID(String id)
	{
		base.setID(id);
	}
	
	@Override
	public void setClassName(String className)
	{
		base.setClassName(className);
	}
	
	@Override
	public void setMessage(String msg)
	{
		base.setMessage(msg);
	}

	public String getDisplay()
	{
		String tag="<"+getTagName()+">"+base.getDisplay()+"</"+getTagName()+">";
		return tag;
	}
}
