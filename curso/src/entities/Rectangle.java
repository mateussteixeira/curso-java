package entities;

public class Rectangle {
	
	private Double width;
	private Double height;
	
	public Rectangle(Double width, Double height) {
		this.setWidth(width);
		this.setHeight(height);
	}

	public Double getWidth() {
		return width;
	}

	public void setWidth(Double width) {
		this.width = width;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	public Double getArea() {
		return this.getHeight() * this.getWidth();
	}
	
	public Double getPerimeter() {
		return (this.getWidth() * 2) + (this.getHeight() * 2);
	}

	public Double getDiagonal() {
		return (this.getWidth() * this.getWidth()) + (this.getHeight() * this.getHeight());
	}
	
}
