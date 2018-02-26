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
public class Triangolorettangolo extends Triangolo
{
    protected double Cateto1;
    protected double Cateto2;
    protected double Altezza;
    public Triangolorettangolo()
    {
        Cateto1=0;
        Cateto2=0;
        Altezza=0;
    }
    public Triangolorettangolo(double c1,double c2,double a)throws Eccezionetriangolorettangolo
    {
        if(c1>0 && c2>0 && a>0)
        {
            Cateto1=c1;
            Cateto2=c2;
            Altezza=a;
        }
        else 
            throw new Eccezionetriangolorettangolo();
    }
   
   public void SetCateto1(double c1)throws Eccezionetriangolorettangolo
    {
        if(c1>0)
            Cateto1=c1;
        else
            throw new Eccezionetriangolorettangolo();
    }
    public void SetCateto2(double c2)throws Eccezionetriangolorettangolo
    {
        if(c2>0)
            Cateto1=c2;
        else
            throw new Eccezionetriangolorettangolo();
    }
    public void SetAltezza(double a)throws Eccezionetriangolorettangolo
    {
        if(a>0)
            Cateto1=a;
        else
            throw new Eccezionetriangolorettangolo();
    }
    public double GetAltezza(){return Altezza;}
    public double GetCateto1(){return Cateto1;}
    public double Getcateto2(){return Cateto2;}
    public double Area()
    {
        return (this.Cateto1*this.Altezza)/2;
    }
    public double Perimetro()
    {
        return Cateto1+Cateto2+Altezza;
    }
}
