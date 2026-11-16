public class Votos {
    int numero;
    String nome;
    int cand;
    int secao;
    
    void Votacao(){
        this.numero = 0;
        this.nome = "";
        this.cand = 0;
        this.secao = 0;
    }
    
    void Votacao(int n, String no, int c, int s){
        this.numero = n;
        this.nome = no;
        this.cand = c;
        this.secao = s;
    }
}
