public class Brute {

    public static void main(String[] args) {
        int[] points = null;
        Point point1, point2, point3, point4;
        if (args.length > 0) {
            String argFileName = args[0];

            try {
                In in = new In(argFileName);

                if (!in.isEmpty()) {
                    points = new int[in.readInt() * 2];
                    points = in.readAllInts();
                }

                for (int i = 0; i < points.length / 2; i++) {
                    for (int j = 0; j < points.length / 2; j++) {
                        for (int k = 0; k < points.length / 2; k++) {
                            for (int l = 0; l < points.length / 2; l++) {
                                point1 = new Point(points[i], points[i + 1]);
                                point2 = new Point(points[j], points[j + 1]);
                                point3 = new Point(points[k], points[k + 1]);
                                point4 = new Point(points[l], points[l + 1]);
                                if (point1.slopeTo(point2) == point1
                                        .slopeTo(point3)
                                        && point1.slopeTo(point2) == point1
                                                .slopeTo(point4)) {
                                    StdOut.print(point1);
                                    StdOut.print(" -> ");
                                    StdOut.print(point2);
                                    StdOut.print(" -> ");
                                    StdOut.print(point3);
                                    StdOut.print(" -> ");
                                    StdOut.print(point4);

                                    StdOut.println();

                                    StdDraw.setXscale(0, 32768);
                                    StdDraw.setYscale(0, 32768);

                                    point1.draw();
                                    point2.draw();
                                    point3.draw();
                                    point4.draw();

                                    point1.drawTo(point2);
                                    point2.drawTo(point3);
                                    point3.drawTo(point4);

                                }
                            }
                        }
                    }
                }

            } catch (Exception ex) {
                StdOut.println(ex.toString());
            }
        } else {
            StdOut.println("main() - No arguments.");
        }
    }
}
