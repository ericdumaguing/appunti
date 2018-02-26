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
public class Rettangolo implements Figurapiana
{
    private double altezza;
    private double base;
    public Rettangolo()
    {
        super();
        altezza=0.0;
        base=0.0;
    }
    public Rettangolo(double a,double b)throws Eccezionerettangolo
    {
        super();
        /*
        if(a<0 && b<0 )
        throw new Eccezionerettangolo();
        else
        {
            altezza=a;
            base=b;
        }
        */
        Setbase(b);
        Setaltezza(a);
    }
    public double Setbase(double b)throws Eccezionerettangolo
    {
        if(b<0)
        	throw new Eccezionerettangolo();
        	
        else
        	base=b;
        return base;
        	
        
    }
    public double Setaltezza(double a)throws Eccezionerettangolo
    {
       if(a<0)
            throw new Eccezionerettangolo();
       else
            altezza=a;
       		return altezza;
    }
    public double Getbase()
    {
        return base;
    }
    public double Getaltezza()
    {
        return altezza;
    }
    public boolean equals(Rettangolo r1)
    {
        if(r1.altezza==this.altezza && r1.base==base)
            return true;
        else
            return false;
    }
    public String toString()
    { 
    return "Altezza: '" + Getaltezza() + "', Base: '" + Getbase();
    } 
    public double Area()
    {
        return this.base*this.altezza;
    }
    public double Perimetro()
    {
        return (this.base+this.altezza)*2;
    }    
}
