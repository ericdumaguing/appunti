package ereditarietàcilindro;
public class Cerchio {
    protected double raggio;
    
    public double GetRaggio(){
        return raggio;
    }
    
    public boolean SetRaggio(double r){
        if(r<=0)
            return false;
        else{
            raggio =r;
            return true;
        }
    }
    
    public Cerchio(double r){
        raggio = r;
    }
    
    public Cerchio(){
        raggio = 0;
    }
    
    public double Area(){
        return ((Math.PI)*(raggio*raggio));
    }
    public double Perimetro(){
        return (2*(Math.PI)*raggio);
    }
}
