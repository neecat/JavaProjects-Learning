
import javax.swing.*;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.BasicStroke;
import java.awt.Dimension;
import java.awt.RenderingHints;
import java.awt.event.*;
import java.awt.Graphics2D;
import java.awt.geom.*;

public class graphicsdemo extends JPanel {
	public void paint(Graphics g){
		super.paint(g);
		
		Graphics2D g2= (Graphics2D) g;
		
		RenderingHints rh = new RenderingHints(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
		
		rh.put(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
		
		g2.setRenderingHints(rh);
		
		Dimension size =getSize();
		double w = size.getWidth();
		double h = size.getHeight();
		
		g2.setStroke(new BasicStroke(1));
		g2.setColor(Color.green);
		g2.drawLine(0, 0, 200, 200);
	}
}
