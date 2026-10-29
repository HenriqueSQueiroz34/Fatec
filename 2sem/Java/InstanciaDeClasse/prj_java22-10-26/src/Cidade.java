// Limpando espaço na memória
public class Cidade {
    int codCid;
    String nomeCid;
    int acid;
    
    void Cidade(){
        codCid=0;
        nomeCid="";
        acid=0;
    }
    
    void Cidade(int cod, String nome, int n){
        codCid=cod;
        nomeCid=nome;
        acid=n;
    }
}