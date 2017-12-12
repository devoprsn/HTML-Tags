

public abstract class WrapperTag extends Tag{

	private Tag base; 
	
	public WrapperTag(Tag base) 
	{	
		this.base=base;
	}

	public abstract String getDisplay();
}
