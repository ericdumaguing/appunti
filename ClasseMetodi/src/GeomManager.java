import javax.management.BadAttributeValueExpException;


	





public class GeomManager {

	abstract static class FormaGeometrica{
		
		public abstract double getPerim();
		public abstract double getArea();
		
	}
	
	static class Cerchio extends FormaGeometrica{
		
		// rappresentare autonomamente la classe cerchio consistente con la reala'
		//analizzata
		
		//implementare inoltre una versione consistente dei metodi equals e toString
		
		double r;
		
		public Cerchio()
			{
				r = 0.0;
			}
		
		public Cerchio(double r) throws BadAttributeValueExpException
				{
					
					setR(r);
				}
		
		public void setR(double r) throws BadAttributeValueExpException {

			if(r < 0  )
				throw new BadAttributeValueExpException ( "Invalid argument\r "	+	r ); 		
				
				this.r = r;
			}
		/*
		public boolean setRaggio(double r)
		{
			if(r < 0)
			{
				this.r = r;
				return true;
			}
			else
			{
				return false;
			}
		}
		*/
		
		@Override
		public boolean equals(Object obj) {
			if(!(obj instanceof Cerchio))
				return false;
			
			Cerchio c = (Cerchio) obj;
			return c.getPerim() == c.getPerim() && c.getArea() == c.getArea();
		}
		
		@Override
		public String toString() {
		
			return "Il raggio è: " + r + "Perimetro: " + getPerim() + "Area: " + getArea();
		}
		
		public double getRaggio( )
		{
			return r;
		}
		
		public double getPerim()
		{
			return (2*Math.PI*r);
		}
		
		public double getArea()
		{
			return (Math.PI*Math.pow(r, 2));
		}
		
		
	}
	
	static class Rect extends FormaGeometrica{
		// rappresentare autonomamente la classe cerchio consistente con la reala'
		//analizzata
				
		//implementare inoltre una versione consistente dei metodi equals e toString
		
		double base, altezza;
		
		
		public Rect()
		{
			base = 0;
			altezza = 0;
		}
		
		public Rect(double base, double altezza)throws BadAttributeValueExpException
		{
			
			setBase(base);
			setAltezza(altezza);
			
			
		}
		public void setBase(double base) throws BadAttributeValueExpException {

			if(base < 0  )
				throw new BadAttributeValueExpException ( "Invalid argument\rbase: "	+	base ); 		
				
				this.base = base;
			}
		public void setAltezza(double altezza) throws BadAttributeValueExpException {

			if(altezza < 0  )
				throw new BadAttributeValueExpException ( "Invalid argument\raltezza: "	+	altezza ); 		
				
				this.altezza = altezza;
			}
		/*
		public boolean setBase(double base)
		{
			if(base < 0)
			{
				this.base = base;
				return true;
			}
			else
			{
				return false;
			}
		}
		
		
		public boolean setAltezza(double altezza)
		{
			if(altezza < 0)
			{
				this.altezza = altezza;
				return true;
			}
			else
			{
				return false;
			}
		}
		*/
		public double getBase()
		{
			return base;
			
		}
		public double getAltezza()
		{
			return altezza;
		}
		
		public double getPerim()
		{
			return ((base+altezza) * 2);
		}
		
		public double  getArea()
		{
			return (base*altezza);
		}
		
		
		@Override
		public boolean equals(Object obj) {
			if(!(obj instanceof Cerchio))
				return false;
			
			Rect r = (Rect) obj;
			return r.getPerim() == r.getPerim() && r.getArea() == r.getArea();
		}
		
		@Override
		public String toString() {
			return "l'altezza è: " + altezza + "base: " + base + "Area: " + getArea() + " Perimetro: " + getPerim();
		}
				
	}
	

	double sumPerim(FormaGeometrica f1, FormaGeometrica f2) {
		
		return (f1.getPerim() + f2.getPerim());

	}
	double sumArea(FormaGeometrica f1, FormaGeometrica f2) {
		return (f1.getArea() + f2.getArea());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	public static void main(String[] args) {

		Cerchio c1 = null,
				c2 = null;
		Rect r1 = null,
			 r2 = null;
		FormaGeometrica  fc1 = null,
						 fc2 = null,
						 fr1 = null,
						 fr2 = null;
				
		try {	
			c1 = new Cerchio(-4d);
			c2 = new Cerchio(3d);
			r1 = new Rect(3d, 4d);
			r2 = new Rect(7d,8d);
		}catch (BadAttributeValueExpException e) {
			System.out.println(" Bad  values!" + ((String) e.toString()));
		}
		
		try {
			fc1 = new Cerchio (3d);
			fc2 = new Cerchio(4d);
			fr1 = new Rect(3d, 4d);
			fr2=  new Rect(7d, 8d);
		} catch (BadAttributeValueExpException e) {
			System.out.println(" Bad values!" + ((String) e.toString()));
		}

		if( c1 != null && c2 != null && r1 != null   && r2 != null) {
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		System.out.println(r1.toString());
		System.out.println(r2.toString());
		}else 
			System.out.println("Impossible good execution");
		
		
		
	}

	}
