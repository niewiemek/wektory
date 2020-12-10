package com.github.niewiemek;

public class Vector implements Transform<Vector> {

  private final double dx, dy;

  public Vector(double dx, double dy) {
    this.dx = dx;
    this.dy = dy;
  }

  public Vector(Point start, Point end) {
    this.dx = end.getX() - start.getX();
    this.dy = end.getY() - start.getY();
  }

  public double getDx() {
    return dx;
  }

  public double getDy() {
    return dy;
  }

  @Override
  public Vector transform(Vector vector) {
    Point transformedDxy = new Point(dx, dy).transform(vector);
    return new Vector(transformedDxy.getX(), transformedDxy.getY());
  }
}
