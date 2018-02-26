package gruppo;

public class Gruppo {
    private double N_iscritti;
    private Studente[] iscritti;
    public Gruppo(double N,Studente[] iscr)
    {
        N_iscritti=N;
        iscritti=iscr;
    }
    public Gruppo()
    {
        N_iscritti=0;
    }
    public double GetN_iscritti(){
        return N_iscritti;}
    public void SetN_iscritti(double N){
        N_iscritti=N;}
    public Studente[] Getiscriti(){
        return iscritti;}
    public void Setiscritti(Studente[] iscr){
        iscritti=iscr;}
    public double Ricerca(Studente x)
    {
        String nome=x.GetNome();
        String cognome=x.GetCognome();
        double k=-1;
        for(int i=0;i<50;i++)
        {
            String nomeX=iscritti[i].GetNome();
            String cognomeX=iscritti[i].GetCognome();
            if(nomeX==nome && cognomeX==cognome)
                k=i;
            break;
        }
        return k;
    }
    public boolean Insert(Studente x){
        Studente z=new Studente();
        z.SetNome(null);
        int a=Ricerca(z);
        if (a!=-1){
            iscritti[a]=x;
            return true;
        }
        else
            return false;
    }
    public boolean Modify(Studente x){
        int a=Ricerca(x);
        if (a!=-1){
            iscritti[a]=x;
            return true;
        }
        else
            return false;        
    }
    public boolean Delete(Studente x){
        Studente z = new Studente();
        z.SetNome(null);
        int a=Ricerca(x);
        if (a!=-1){
            iscritti[a]=z;
            return true;
        }
        else
            return false;   
    }
}
