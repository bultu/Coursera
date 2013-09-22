public class Fast {

    public static void main(String[] args) {
        Point[] points = null;
        Double[] pointSlopeList = null;
        if (args.length > 0) {
            String argFileName = args[0];

            try {
                In in = new In(argFileName);
                int i = 0 ;
                while (!in.isEmpty()) {
                    if(points == null)
                    {
                    points = new Point[in.readInt()];
                    pointSlopeList = new Double[points.length -1];
                    }
                    
                    points[i] = new Point(in.readInt(), in.readInt()) ;
                    
                    if(i > 0)
                    {
                    pointSlopeList[i-1] = points[i].slopeTo(points[i-1]);
                    }
                    i++;
                  }
                Quick3way.sort(pointSlopeList);
               

            } catch (Exception ex) {
                StdOut.println(ex.toString());
            }
        } else {
            StdOut.println("main() - No arguments.");
        }
    }
}
