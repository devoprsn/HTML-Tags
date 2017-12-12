
public class HTML {
	public static void main(String[] args)
	{
		Tag h=new Header(3);
		h.setID("first");
		h.setMessage("Click to go to Touro's Website!");
		h=new Bold(h);
		h=new Link(h);
		((Link)h).setLink("www.touro.edu");
		h=new Italic(h);
		System.out.println(h.getDisplay());
		
		Tag img=new Image("https://www.imagesrc.com");
		System.out.println(img.getDisplay());
		
		Tag i=new Input();
		((Input)i).setEvent("onclick", "javascript:alert('action')");
		((Input)i).setType("button");
		i.setID("alert-button");
		i=new Emphasize(i);
		System.out.println(i.getDisplay());
		
		Tag link=new Link("Null Link");
		System.out.println(link.getDisplay());
		
		Tag p=new Paragraph();
		p=new Underline(p);
		p.setClassName("underlined-paragraph");
		p=new Strong(p);
		p.setMessage("Underlined Text");
		System.out.println(p.getDisplay());
	}
}
