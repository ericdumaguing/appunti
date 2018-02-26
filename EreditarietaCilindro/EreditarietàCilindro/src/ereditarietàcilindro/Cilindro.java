package ereditarietàcilindro;
public class Cilindro extends Cerchio{
    protected double altezza;
    public boolean SetAltezza(double h){
        if (h>0){
            altezza=h;
            return true;
        }else{
            return false;
        }
    }
    public double GetAltezza(){
        return altezza;
    } 
    public Cilindro(){
        super();
        altezza=0;
    }
    public Cilindro(double r, double h){
        super(r);
        altezza=h;
    }
    public double AreaCil(){
        double areaTOT = 2*Area()+(Perimetro()*altezza);
        return areaTOT;
    }
    public double Volume(){
        double areaTOT=Area()*(Perimetro()*altezza);
        return areaTOT;
    }
}
