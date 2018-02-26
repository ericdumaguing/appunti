package orchestra;
public class Figure {
    public static void main(String[] args) {
        Strumenti s[] = new Strumenti[3];
        int i;
        s[0]=new Oboe();
        s[1]=new Clarinetto();
        s[2]=new Percussioni();
        for(i=0;i<s.length;i++){
            s[i].Suona();
        }
    }
}