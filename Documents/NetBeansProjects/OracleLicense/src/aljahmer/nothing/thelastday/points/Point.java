package aljahmer.nothing.thelastday.points;

public class Point {

    public int x;
    public int y;

    void warp(aljahmer.nothing.thelastday.threePoint.Point3d a) {
        if (a.z > 0) // compile-time error: cannot access a.z
        {
            a.delta(this);
        }
    }
}
