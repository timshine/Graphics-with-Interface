import java.awt.*;
import java.applet.*;
import java.util.ArrayList;

public class Runner extends Applet {

	// Class variable
	ArrayList<Shape> shapes;

	public void init() {
		setSize(850, 650);
	}

	//Paint method
	public void paint(Graphics g) {
		drawGrid(g);
		addToArrayList();
		draw(g);

	}

	//Draw Grid
	public void drawGrid(Graphics g) {
		g.drawRect(10, 10, 800, 600);
		g.drawLine(10, 300, 810, 300);
		g.drawLine(410, 10, 410, 610);
	}

	public void addToArrayList() {
		// Makes arraylist
		shapes = new ArrayList<Shape>();

		// Adds square to arraylist
		Shape square = new Shape1Square(125, 100, 125, 20, 30, 125, 280);
		shapes.add(square);

		// Adds triangle to arraylist
		Shape triangle = new Shape2Triangle(550, 100, 125, 420, 30, 550,280);
		shapes.add(triangle);

		// Adds octagon to arraylist
		Shape octagon = new Shape3Octagon(115, 375, 50, 20, 320, 115,585);
		shapes.add(octagon);

		// Adds circle to arraylist
		Shape circle = new Shape4Circle(550, 375, 125, 420, 320, 550,585);
		shapes.add(circle);
	}

	//Draws the shape, writes name and writes message
	public void draw(Graphics g) {
		for (Shape shape : shapes) {
			shape.drawShape(g);
			shape.displayName(g);
			shape.displayNumSides(g);
			
		}
	}


}
