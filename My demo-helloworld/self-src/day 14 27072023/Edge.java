public class Edge {
   
  private Edge[] edges; // instance variable

  private int id;
  private double length;
  private String color;
  private static int counter;

   public Edge(double length, String color){
    counter++;
    this.length = length;
    this.color = color;
   }

    public Square() { //empty constructor
      edges = new Edge[4]; //null, null, null, null
      edges[0] = new Edge(3.0d, "RED");
      edges[1] = new Edge(3.0d, "YELLOW");
      edges[2] = new Edge(3.0d, "BLACK");
      edges[3] = new Edge(3.0d, "BLUE");
  }
 
      public Edge[] getEdges() {
        return this.edges;
      }
      public static void main(String[] args) {
        Square s1 = New square(10);
        Square s2 = New square(4);
        Square s3 = New square(5);

        // s1 -> edges[0] color -> YELLOW
        s1.getEdges()[0].setColor("YELLOW");
      }


      public void modify(double length) {
        this.getEdges()[0].setLength(length);
        this.getEdges()[1].setLength(length);
        this.getEdges()[2].setLength(length);
        this.getEdges()[3].setLength(length);
        this.getEdges()[4].setLength(length);
        
      }
}
