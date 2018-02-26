import Cerc.Cerchio;

public class Lavoro {

	abstract static class Person 
	{
		private String name, surname;
		private int age;
		
		public Person()
		{
			name = "null";
			surname = "null";
			age = 0;
					
		}
		
		public Person(String name, String surname, int age)
		{
			this.name = name;
			this. surname = surname;
			this.age = age;
		}
		
		
		
		public abstract String getFullName();
		
		public boolean SameName(String name)
		{
			if(this.name == name)
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
			if(!(obj instanceof Person))
				return false;
			
			Person p = (Person) obj;
			return p.SameName(name);
		}
		
		
		

		
	}
	
	
	
	static class Employee extends Person 
	{
		private int workHour; // ore lavoro settimana
		private double salary; // paga oraria
		
		
		public Employee()
		{
			workHour = 0;
			salary = 0.0;
		}
		
		public Employee(int workHour, double salary)
		{
			this.workHour = workHour;
			this.salary = salary;
		}
		

		
		public double calcMonthSalary()
		
		{
			// calcolare stipendio mensile return -1d;
			
			double stipendio = ((workHour * salary) * 31);
			
			return stipendio;
			
			
		}
		public boolean controllo(int workHour, double salary)
		{
			if((workHour < 0) && (salary <0.0))
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
				if(!(obj instanceof Person))
					return false;
				
				Employee e = (Employee) obj;
				return e.controllo(workHour, salary);
			}
			
			
			@Override
			public String toString() {
				
				return "Ore di lavoro: " + workHour + " salary: " + salary + " stipendio= " + calcMonthSalary() ;
			}
		
		//override in maniera consistente di euqals e tostring
		
	}
	
	
	static class Boss extends Person 
	{
		private int empCount; // numero dipendenti
		private double avgSalary; // media paga mensile dipendenti
		
		public Boss()
		{
			empCount = 0;
			avgSalary = 0.0;
		}
		
		
		public Boss(int empCOunt, double avgSalary)
		{
			this.avgSalary = avgSalary;
			this.empCount = empCount;
		}
		public double getEmpCost()
		{
			//calcolo costo dipendenti return -1d
		}
		
		//override in maniera consistente di equals e tostring
	}

	
	
	
	
	public static void main(String[] args) {

	}

}
