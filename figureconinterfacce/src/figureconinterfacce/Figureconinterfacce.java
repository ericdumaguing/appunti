package figureconinterfacce;
import java.util.*;
public class Figureconinterfacce {
    public static void main(String[] args) {
        Figurapiana[] figure = new Figurapiana[6];
        figure[0]= new Rettangolo();//facciata chiesa
        figure[1]= new Rettangolo();//facciata campanile
        figure[2]= new Rettangolo();//portone chiesa
        figure[3]= new Rettangolo();//porta campanile
        figure[4]= new Rettangolo();//finestra chiesa
        figure[5]= new Cerchio();//finestra campanile
        Scanner tastiera = new Scanner(System.in);
       
       double[] basi = new double[5];
       double[] altezze = new double[5];
        Rettangolo rp = new Rettangolo();
        Cerchio cp = new Cerchio();
       double val1 = 0.0;
       double val2 = 0.0;
       try {
        for(int i=0;i< 5;i++){

            	
            System.out.println("inserire la base del rettangolo");
			val1 = rp.Setbase(tastiera.nextDouble()); 
			basi[i] = val1;
			
			
			
			System.out.println("inserire l'altezza del rettangolo");
           
			val2 =rp.Setaltezza(tastiera.nextDouble());
			altezze[i] = val2;
			
			
			
			
			
        }
        

        }catch(Eccezionerettangolo x){
            System.exit(1);
        }  
            
            try {            	
        System.out.println("inserire il raggio del cerchio");
        double r = tastiera.nextDouble();
        
        cp.Setraggio(r);
        figure[5] = cp;
        }catch (Cerchioeccezione y){
            System.exit(1);
        }
        
            
            for(int i=0;i< 5;i++){
            	
            	System.out.println(rp.Getbase());
            	System.out.println(rp.Getaltezza());
            	
            	
            }
        /*
        try{
            for(int i=0;i<5;i++){
                rp.Setbase(basi[i]);
                rp.Setaltezza(altezze[i]);
                figure[i]=rp;
            }
        }
        catch(Eccezionerettangolo x){
            System.exit(1);
        }
        try{
            cp.Setraggio(r);
            figure[5]=cp;
        }
        catch(Cerchioeccezione y){
            System.exit(1);
        }
        */

        System.out.println("ret1 = "+ rp.Area());
        double areatinteggio = (figure[0].Area()+figure[1].Area())-(figure[2].Area()+figure[3].Area()+figure[4].Area()+figure[5].Area());
        System.out.println("l'area da tinteggiare equivale a" + areatinteggio);
    }    
}
