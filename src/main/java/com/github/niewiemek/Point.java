package com.github.niewiemek;

public class Point implements Transform<Point> {
  private final double x, y;

  public Point(double x, double y) {
    this.x = x;
    this.y = y;
  }

  public double getX() {
    return x;
  }

  public double getY() {
    return y;
  }

  @Override
  public Point transform(Vector vector) {
    // TODO: Transform x & y and return a new Point
    return new Point(this.x, this.y);
  }
}
