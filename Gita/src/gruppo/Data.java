package gruppo;

public class Data {
    private int giorno;
    private int mese;
    private int anno;
    public Data(int g, int m, int a){
        giorno = g;
        mese = m;
        anno = a;
    }
    public Data(){
        giorno = 0;
        mese = 0;
        anno = 0;
    }
    public double GetGiorno(){
        return giorno;
    }
    public int GetMese(){
        return mese;
    }
    public double GetAnno(){
        return anno;
    }
    public boolean SetGiorno(int g){
        if((g>0)&&(g<=31)){
            giorno=g;
            return true;
        }
        else
            return false;
    }
    public boolean SetMese(int m){
        if((m>0)&&(m<=12)){
            mese=m;
            return true;
        }
        else
            return false;
    }
    public boolean SetAnno(int a){
        if(a>0){
            anno=a;
            return true;
    }
        else
            return false;
    }
}
