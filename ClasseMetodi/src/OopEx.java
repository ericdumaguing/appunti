import javax.management.BadAttributeValueExpException;

public class OopEx {

	// abstract static class FormaGeometrica {
	//
	//public abstract double getPerim();
	//public abstract double getArea();
	//}
	
	static interface FormaGeom	{
		// forma geometrica generica 
		public double getPerim();					// calcola perimetro
		public double getArea();					// calcola area
		
	}
	
	
	static abstract class Point {					//generico punto
		double x, y;								//coordinate punto
		
		//generare getter & setter
		
		public Point() {
			x = 0.0;
			y = 0.0;
		}
		
		public Point (double x, double y) {
			this.x = x;
			this.y = y;
		}
		
		public double getX() {
			return x;
		}
		
		public double getY() {
			return y;
		}
		public abstract double getOriginDist();			//calcola distanza dall'origine
			
		
	}
	
	static class Point2D extends Point{
		
		public Point2D() {
			x = 0.0;
			y = 0.0;
		}
		
		public Point2D (double x, double y) {
			this.x = x;
			this.y = y;
		}
		
		@Override
		public double getOriginDist() {
			return ( Math.pow((x-0), 2) + Math.pow((y-0), 2));
		}
			 	//punto bidimensionale
		
		
		
	}
		
	
	
	static class Point3D extends Point{
		
		double z = 0.0;
		

		public Point3D() {
			x = 0.0;
			y = 0.0;
			z = 0.0;
		}
		
		public Point3D (double x, double y, double z) {
			this.x = x;
			this.y = y;
			this.z = z;
		}
			
		public double getZ() {
			return z;
		}
		
		@Override
		public double getOriginDist() {
			return ( Math.pow((x-0), 2) + Math.pow((y-0), 2) + Math.pow((z-0), 2));
		}	//punto tridimensionale
		
		
	}
		
	
	
	static class Circle implements FormaGeom {			//forma cerchio con centro in c
		
		private Point2D c;			//centro
		private double r;	//raggio

		public void setR(double r) throws BadAttributeValueExpException {

			if(r < 0  )
				throw new BadAttributeValueExpException ( "Invalid argument\r "	+	r ); 		
				
				this.r = r;
			}
		
		   
		public Circle (double r, double x, double y)throws BadAttributeValueExpException
		{
			this.c = new Point2D(x, y);
			setR(r);
		}
		
		public Circle(Point c, double r ) 
		{
			this.c = new Point2D();
			this.r = r;
		}
		
		public Circle() {
			
		}
		
		
		
		
		
		
		@Override
		public double getPerim() {
			return (2*Math.PI*r);
		}
		@Override
		public double getArea() {
			return (Math.PI*Math.pow(r, 2));
		}

		
		@Override
			public String toString() {
			return " posizione: " + c.getX() + " | " + c.getY()+  " | "  +  " raggio ; " + r + "distanza: " + c.getOriginDist() ;
			}
		
		 
	}
	
	
	static class Sphere extends Circle implements FormaGeom { //sfera
		
		private Point3D c; 					//centro
		private double r;
		
		public void setR(double r) throws BadAttributeValueExpException {

			if(r < 0  )
				throw new BadAttributeValueExpException ( "Invalid argument\r "	+	r ); 		
				
				this.r = r;
			}
		
		public Sphere (double r, double x, double y, double z)
		{
			this.c = new Point3D(x, y, z);
			this.r = r;
		}
		public Sphere (Point3D c, double  r)
		{
			this.c = new Point3D();
			this.r = r;
		}
			public Sphere() {
			
		}
			
			@Override
				public String toString() {
					return " posizione: " + c.getX() + " | " + c.getY()+ " | " + c.getZ()+ " "  +  " raggio : " + r + " distanza: " + c.getOriginDist() ;
				}
	}
	
	
	public static void main(String[] arg) {
		Point2D p1 = new Point2D( 2d, 3d);
		Point3D p2 = new Point3D(2d, 3d, 4d);
		
		Circle c1 = null, 
			   c2 = null; 
		Sphere s1 = null, 
		   	   s2 = null; 
		try {
				c1	= new Circle(2d, 3d, 10d);
				c2	= new Circle(p1, 10d);
				s1	= new Sphere(2, 3, 4, 20);
				s2	= new Sphere(p2, 30d);
		}catch (BadAttributeValueExpException e) {
			System.out.println(" Bad r value!" + ((String) e.toString()));
		}
		
	
		if( c1 != null && c2 != null) {
		System.out.println(" cerchio 1 : " + c1.toString());
		System.out.println(" cercgio 2 : " + c2.toString());
		System.out.println(" sfera 1 : " + s1.toString());
		System.out.println(" sfera 2 : " + s2.toString());
		}
		else 
			System.out.println("Impossible good execution");
}
}