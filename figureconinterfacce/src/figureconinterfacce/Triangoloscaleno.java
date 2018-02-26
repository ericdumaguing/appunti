/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figureconinterfacce;

/**
 *
 * @author Aula125
 */
public class Triangoloscaleno extends Triangolo 
{
    protected double Lato1;
    protected double  Lato3;
    protected double Lato2;
    
    public Triangoloscaleno()
    {
        Lato1=0;
        Lato2=0;
        Lato3=0;
    }
    public Triangoloscaleno(double a,double b,double c)throws Eccezionetriangoloscaleno
    {
        if(a>0 && b>0 && c>0)
        {
        Lato1=a;
        Lato2=b;
        Lato3=c;
        }
        else
            throw new Eccezionetriangoloscaleno();
    }
    public void SetLato1(double l)throws Eccezionetriangoloscaleno
    {
        if(l>0)
            Lato1=l;
        else
            throw new Eccezionetriangoloscaleno();
    }
     public void SetLato2(double l)throws Eccezionetriangoloscaleno
    {
        if(l>0)
            Lato2=l;
        else
            throw new Eccezionetriangoloscaleno();
    }
      public void SetLato3(double l)throws Eccezionetriangoloscaleno
    {
        if(l>0)
            Lato3=l;
        else
            throw new Eccezionetriangoloscaleno();
    }
      public double GetLato1()
      {
          return Lato1;
      }
      public double GetLato2()
      {
          return Lato2;
      }
    public double GetLato3()
      {
          return Lato3;
      }
    public String toString()
    {
        return "Lato1"+this.Lato1+"Lato2"+this.Lato2+"Lato3"+this.Lato3;
    }
    public boolean equals(Triangoloscaleno t1)
    {
        if(this.Lato1==t1.Lato1 && this.Lato2==t1.Lato2 && this.Lato3==t1.Lato3)
            return true;
        else
            return false;
    }
    public double Perimetro()
    {
        return this.Lato1+this.Lato2+this.Lato3;
    }
    public double Area()
    {
        return 0;//farearea
    }
}
