
public class Cerc {

	static class Cerchio{
	
	double r;
	
	public Cerchio()
	{
		r = 0.0;
	}
	
	public Cerchio(double r)
	{
		
		this.r = r;
	}
	
	public double getPer()
	{
		return (2*Math.PI*r);
	}
	
	public double getArea()
	{
		return (Math.PI*Math.pow(r, 2));
	}
	
	public boolean isSameRad(double r)
	{
		if(this.r==r)
		{
			return true;
		}
		else
		{
			return false;
		}
		
		
		
	}
		
		
@Override
	public boolean equals(Object obj) {
	if(!(obj instanceof Cerchio))
		return false;
	
	Cerchio c = (Cerchio) obj;
	return c.isSameRad(r);
}
	
	@Override
		public String toString() {
	
			return "Cerchio: raggio = " + r + " per: " + getPer() + " area: " + getArea();
		}

		
		
}
	static class MathCerchio
	{
		static double getSumPerim (Cerchio c1, Cerchio c2)
		{
			return c1.getPer() + c2.getPer();
		}
		
		static double getSumArea (Cerchio c1, Cerchio c2)
		{
			return c1.getArea() + c2.getArea();
		}
	}

	public static void main(String[] args) {

		
		Cerchio c1 = new Cerchio(3);
		Cerchio c2 = new Cerchio(4);
		System.out.println(c1	.toString());
		
	}
	
	
	
}
	
	
	
	
	
	
	
	
	


