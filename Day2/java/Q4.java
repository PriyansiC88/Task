class Point{
    double x;
    double y;

    public Point(int x , int y){
        this.x = x;
        this.y = y;
    }

    public Point(double x , double y){
        this.x = x;
        this.y = y;
    }

    public void  display(){
        System.out.println("Values: "+ x + " "+ y);
    }

    public static void main(String[] args) {
        Point point = new Point(10,20);
        Point point1 = new  Point(10.0,20.10);

        point1.display();
        point.display();
    }
}
