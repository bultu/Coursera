import java.util.Arrays;

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
                    
                    points[i++] = new Point(in.readInt(), in.readInt()) ;
                  }
                
                //Quick3way.sort(pointSlopeList);               
                
                Arrays.sort(points, points[0].SLOPE_ORDER);
                for(int k = 0 ; k < points.length ; k++)
                {
                for(int j = k ; j < points.length && points.length - k >3 ; j++)
                {
                    if(j > 0)
                    {
                        pointSlopeList[j-1] = points[k].slopeTo(points[j]);
                    }
                                       
                }
                int flag = pointSlopeList.length;
                int l = 0;
                Quick3way.sort(pointSlopeList);    
                while(flag > 0)
                {
                    System.out.print(pointSlopeList[l++] + "  ");
                    flag--;
                }
                System.out.println();
                
                //interrupted by earthquake
                }
                
                
                
                

            } catch (Exception ex) {
                StdOut.println(ex.toString());
            }
        } else {
            StdOut.println("main() - No arguments.");
        }
    }
}
