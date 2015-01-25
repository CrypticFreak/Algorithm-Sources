package javacodes.geometry;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.List;

/**
 * Created by CrypticFreak on 11/11/14.
 */

class Line {
    double ycoff;
    double b;
    double c;
    Line(Point a, Point b){
        if(a.x != b.x){
        ycoff = 1;
        this.b = (a.y - b.y)/(a.x - b.x);
        c = (a.x * b.y - b.x * a.y) / (a.x - b.x);
        } else {
            ycoff = 0;
            c = -1*a.x;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Line line = (Line) o;

        if (Double.compare(line.b, b) != 0) return false;
        if (Double.compare(line.c, c) != 0) return false;
        if (Double.compare(line.ycoff, ycoff) != 0) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(ycoff);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(b);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(c);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}

public class MaxLines {
    public int maxPoints(Point[] points) {
        if(points.length == 1 || points.length == 2) return points.length;
        HashMap<Line, Integer> pointsToLineMap = new HashMap<Line, Integer>();

        for(int i=0; i<points.length; i++){
            for(int j=i+1; j<points.length; j++){
                if(i == j || points[i] == points[j]) continue;
                Line line = new Line(points[i], points[j]);
                if(pointsToLineMap.containsKey(line)){
                    pointsToLineMap.put(line, pointsToLineMap.get(line) + 1);
                } else {
                    pointsToLineMap.put(line, 2);
                }
            }
        }
        int maxresult = 0;
        for(Line key: pointsToLineMap.keySet()){
            maxresult = Math.max(pointsToLineMap.get(key), maxresult);
        }
        return maxresult;
    }
}



















