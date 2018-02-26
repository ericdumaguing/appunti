/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figureconinterfacce;
public class Cerchio implements Figurapiana
{
    protected double raggio;
    public Cerchio()
    {
         raggio=0;
    }
    public Cerchio(double r)throws Cerchioeccezione
    {
        if(r<0)
            throw new Cerchioeccezione();
        else
             raggio=r;
    }
    public void Setraggio(double r)throws Cerchioeccezione
    {
        if(r<0)
            throw new Cerchioeccezione();
        else
            raggio=r;
    }
    public double Getraggio()
    {
        return raggio;
    }
    public boolean equals(Cerchio c1)
    {
        if(c1.raggio==this.raggio)
            return true;
        else
            return false;
    }
    public String toString()
    {
        return "raggio:"  +this.raggio;
    }
    public double Area()
    {
        return (Math.pow(this.raggio,2)*Math.PI);
    }
    public double Perimetro()
    {
        return (this.raggio*2)*Math.PI;
    }
    
}
