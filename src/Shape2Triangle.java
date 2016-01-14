import java.awt.*;

public class Shape2Triangle implements Shape {
	// Attributes
	private int startX;
	private int startY;
	private int side;
	private int titleX;
	private int titleY;
	private int messageX;
	private int messageY;

	// Final Attributes
	private final String name = "Triangle";
	private final String message = "A Triangle has 3 sides.";

	// Overloaded Constructor
	public Shape2Triangle(int startX, int startY, int side, int titleX,int titleY, int messageX, int messageY) {
		this.startX = startX;
		this.startY = startY;
		this.side = side;
		this.titleX = titleX;
		this.titleY = titleY;
		this.messageX = messageX;
		this.messageY = messageY;
	}

	// Draw Shape
	public void drawShape(Graphics g) {
		g.setColor(Color.black);
		Polygon tri = new Polygon();
		tri.addPoint(startX, (startY + side));
		tri.addPoint((startX + side), (startY + side));
		tri.addPoint((startX + (side / 2)), startY);
		g.fillPolygon(tri);

	}

	//Display Names
	public void displayName(Graphics g) {
		g.drawString(name, titleX, titleY);
	}

	//Display message
	public void displayNumSides(Graphics g) {
		g.drawString(message, messageX, messageY);
	}

}
