package ar.edu.unq.po2.tp9.e3;

public class Point {

	private int x;
	private int y;
	
	public Point(int x, int y) {
		super();
		this.setXY(x, y);
	}
	
	public Point() {
		this.setXY(0, 0);
	}
	
	public void setXY( int x, int y ) {
		this.setX(x);
		this.setY(y);
	}
	
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public void movePointTo(int x, int y) {
		this.setXY(x, y);
	}
	
	public void addsPoints(Point punto) {
		int newX = this.getX() + punto.getX();
		int newY = this.getY() + punto.getY();
		this.setXY(newX, newY);
	}
}
