import java.applet.*;
import java.awt.*;


public class ButtonTry extends Applet
{
	Button okButton = new Button("Ok");
	private int mouseX, mouseY;
	private boolean mouseclick= false;
					  
	public void paint(Graphics g)
	{
		super.paint(g);
		g.drawRect(50,20,100,100);
		
	}
	
	public boolean mouseMove(Event e, int x, int y)
	{
		mouseX= x;
		mouseY= y;
		return true;
	}
	
	public boolean mouseDown(Event p1, int p2, int p3)
	{
		mouseclick= true;
		repaint();
		return true;
	}
	
	public void init()
	{
		BorderLayout BorderlayBs = new BorderLayout(10,15);		setLayout(BorderlayBs);
		add("South",okButton);
				super.init();
	}
	
}
