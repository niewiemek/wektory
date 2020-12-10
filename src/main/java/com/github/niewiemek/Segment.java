package com.github.niewiemek;

public class Segment implements Transform<Segment> {

  private final Point start, end;

  public Segment(Point start, Point end) {
    this.start = start;
    this.end = end;
  }


  @Override
  public Segment transform(Vector vector) {

    Point transformedStart =  this.start.transform(vector);
    Point transformedEnd =  this.end.transform(vector);

    return new Segment(transformedStart, transformedEnd);
  }
}
