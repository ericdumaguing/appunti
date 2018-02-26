package gruppo;

public class Studente {
    private String nome;
    
    private String cognome;
    
    private Data D_nascita = new Data();
    
    private String L_nascita;
    
    private String residenza;
    
    private boolean sesso; // true = donna   false = uomo
    
    private String CodFiscale;
    
    private String N_matricola;
    
    private double acconto;
    
    private double saldo;
    
    
    public String GetNome(){
        return nome;}
    public String GetCognome(){
        return cognome;}
    public Data GetD_nascita(){
        return D_nascita;}
    public String GetL_nascita(){
        return L_nascita;}
    public String GetResidenza(){
        return residenza;}
    public boolean GetSesso(){
        return sesso;}
    public String GetCodFiscale(){
        return CodFiscale;}
    public String GetN_matricola(){
        return N_matricola;}
    public double GetAcconto(){
        return acconto;}
    public double GetSaldo(){
        return saldo;}
    
    
    public void SetNome(String x){
        nome=x;
    }
    public void SetCognome(String x){
        cognome=x;
    }
    public void SetD_Nascita(Data x){
        D_nascita=x;
    }
    public void SetL_nascita(String x){
        L_nascita=x;
    }
    public void SetResidenza(String x){
        residenza=x;
    }
    public void SetSesso(boolean x){
        sesso=x;
    }
    public void SetCodFiscale(String x){
        CodFiscale=x;
    }
    public void SetN_matricola(String x){
        N_matricola=x;
    }
    public void SetAcconto(double x){
        acconto=x;
    }
    public void SetSaldo(double x){
        saldo=x;
    }
    
    
    public Studente(String nomeX, String cognomeX, Data D_nascitaX, String L_nascitaX, String residenzaX, boolean sessoX, String CodFiscaleX, String N_matricolaX, double accontoX, double saldoX){
        nome=nomeX;
    
        cognome=cognomeX;
    
        D_nascita=D_nascitaX;
    
        L_nascita=L_nascitaX;
        
        residenza=residenzaX;
    
        sesso=sessoX;
    
        CodFiscale=CodFiscaleX;
    
        N_matricola=N_matricolaX;
    
        acconto=accontoX;
    
        saldo=saldoX;
    }
    
    public Studente(){
        nome=null;
    
        cognome=null;
    
        D_nascita=null;
    
        L_nascita=null;
        
        residenza=null;
    
        sesso=false;
    
        CodFiscale=null;
    
        N_matricola=null;
    
        acconto=0;
    
        saldo=0;
    }
    
}