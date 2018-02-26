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
public class Triangoloisoscele extends Triangolo 
{
    protected double base;
    protected double Lato1;
    protected double Lato2;
    public Triangoloisoscele()
    {
        super();
        base=0;
        Lato1=0;
        Lato2=0;
    }
    public Triangoloisoscele(double b,double l1,double l2)throws Eccezionetriangoloisoscele
    {
        if(b<0 && Lato1<0 && Lato2<0)
        {
        base=b;
        Lato1=l1;
        Lato2=l2;
        }
        else
        throw new Eccezionetriangoloisoscele();
    }
    public void Setbase(double b)throws Eccezionetriangoloisoscele 
    {
        if(b<0)
            throw new Eccezionetriangoloisoscele();
            else
            base=b;
    }
    public void SetLato1(double l1)throws Eccezionetriangoloisoscele
    {
        if(l1<0)
            throw new Eccezionetriangoloisoscele();
        else
            Lato1=l1;
    }
    public void SetLato2(double L2)throws Eccezionetriangoloisoscele
    {
        if(L2<0)
            throw new Eccezionetriangoloisoscele();
        else
           Lato2=L2;
    }
    public double Getbase(){return base;}
    public double GetLato1(){return Lato1;}
    public double GetLato2(){return Lato2;}
    
   //richiedere il metodo to string
    public String toString()
    {
        return "base:" +this.base +"Lato1:"+this.Lato1 +"Lato2"+this.Lato2;
    }
    public boolean equals(Triangoloisoscele T1)
    {
        if(T1.Lato1==this.Lato1 && T1.Lato2==this.Lato2 &&this.base==T1.base)
            return true;
        else
            return false;
            
    }
    public double Latoobliquo(Triangoloisoscele T1)
    {
        return Math.sqrt(Math.pow(this.Lato1,2)-(Math.pow(this.base,2)/4));
    }

    public double Perimetro()
    {
        return this.Lato1*2+this.base;
    }
    public double AltezzaT()
    {
        return Math.sqrt(Math.pow(this.Lato1,2)-Math.pow(this.base,2));
    }
    public double Area()
    {
        return (this.base*AltezzaT())/2;
    }
    
 }
