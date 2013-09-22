import java.util.Comparator;

public class Point implements Comparable<Point> {
    
    private final int x;
    private final int y;
    
 // compare points by slope to this point
   public final Comparator<Point> SLOPE_ORDER = new Comparator<Point>() {
    
    @Override
    public int compare(Point o1, Point o2) 
    {   
        return o1.compareTo(o2);
    }
};        

   public Point(int x, int y)                         // construct the point (x, y)
   {
       this.x = x;
       this.y = y;
   }
   public   void draw()                               // draw this point
   {
       StdDraw.point(this.x, this.y);
   }
   public   void drawTo(Point that)                   // draw the line segment from this point to that point
   {
       StdDraw.line(this.x, this.y, that.x, that.y);
   }
   public String toString()                           // string representation
   {
    return "(" + x + ", " + y + ")";
       
   }
   public    int compareTo(Point that)                // is this point lexicographically smaller than that point?
   { 
       if(this.y == that.y)
       {
           return this.x - that.x;
       }
       else
       {
           return this.y - that.y;
       }
       
   }
   public double slopeTo(Point that)                  // the slope between this point and that point
   {
       if(this.x == that.x && this.y == that.y)
       {
           return Double.NEGATIVE_INFINITY;
       }
       else
           if(this.x == that.x && this.y != that.y)
           {
               return Double.POSITIVE_INFINITY;
           }
           else
               if(this.x == that.x && this.y != that.y)
               {
                   return 0;
               }
               else
               {
                   return((that.y - this.y) / (that.x - this.x));
               }
       
   }
   
// unit test
   public static void main(String[] args) {
       /* YOUR CODE HERE */
   }
}