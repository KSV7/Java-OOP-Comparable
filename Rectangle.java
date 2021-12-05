package com.gmail.kutepov89.sergey;

import java.util.Objects;

public class Rectangle implements Comparable<Rectangle> {
	private String name;
	private int length;
	private int height;

	public Rectangle() {
		super();
	}

	public Rectangle(String name, int length, int height) {
		super();
		this.name = name;
		this.length = length;
		this.height = height;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getSquare() {
		return height * length;
	}
	
	@Override
	public String toString() {
		return "Rectangle [name=" + name + ", length=" + length + ", height=" + height + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Rectangle other = (Rectangle) obj;
		return length == other.length && height == other.height && Objects.equals(name, other.name);
	}

	@Override
	public int compareTo(Rectangle o) {
		if (o == null) {
			throw new NullPointerException();
		}
		if (this.getSquare() > o.getSquare()) {
			return 1;
		}
		if (this.getSquare() < o.getSquare()) {
			return -1;
		}
		return this.name.compareTo(o.name);
	}

}