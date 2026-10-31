public class Indicadores {
    
    public void EleitoresSecao(Votacao[] votos){
        int eleitores=0;
        
        for (int i=0;i<199;i++){
            if(votos[i].secao == votos[i+1].secao){
                eleitores++;
            } else{
                eleitores++;
                System.out.printf("Eleitores na secão %d: %d",votos[i].secao,eleitores);
                System.out.println();
                eleitores = 0;
            }
        }
    }
    
    public void MaiorMenor(Votacao[] votos){
        Votacao[] contagem = new Votacao[10];
        Votacao[] aux = new Votacao[1];
        int sec=0; //identificando a seção para separar
        int eleitores=0;
        
        for (int i=0;i<10;i++){ contagem[i] = new Votacao(); }
        aux[0] = new Votacao();
        
        for (int i=0;i<199;i++){
            if(votos[i].secao == votos[i+1].secao){
                eleitores++;
            } else{
                eleitores++;
                contagem[sec].secao = sec+1;
                contagem[sec].candidato = eleitores;
                sec++;
                eleitores = 0;
            }
        }
        
        for (int i=0;i<10;i++){
            for (int a=0;a<10;a++){
                if(contagem[i].candidato > contagem[a].candidato){
                    aux[0].secao = contagem[i].secao;
                    aux[0].candidato = contagem[i].candidato;
                    
                    contagem[i].secao = contagem[a].secao;
                    contagem[i].candidato = contagem[a].candidato;
                    
                    contagem[a].secao = aux[0].secao;
                    contagem[a].candidato = aux[0].candidato;
                }
            }
        }
        
        System.out.printf("Quantidade de eleitores:\nMaior: %d -> %d\nMenor: %d -> %d"
                        ,contagem[0].secao,contagem[0].candidato
                        ,contagem[sec-1].secao,contagem[sec-1].candidato);
        System.out.println();
    }
    
    public void CandidatoVotos(Votacao[] votos){
        Votacao[] candidatos = new Votacao[300];
        int candidatoVotos=0;
        
        for (int c=0;c<300;c++){
            candidatos[c] = new Votacao();
        }
        
        for (int a=0;a<300;a++){
            for (int i=0;i<200;i++){
                if (votos[i].candidato == a){
                    candidatoVotos++;
                }
            }
            
            if (candidatoVotos != 0){
                candidatos[a].secao = a;
                candidatos[a].candidato = candidatoVotos;
                
                if (candidatos[a].secao == 0){
                    System.out.printf("Candidatos Nulos: %d",candidatos[a].candidato);
                } else{
                    
                    System.out.printf("Candidato: %d\nVotos: %d",
                            candidatos[a].secao,candidatos[a].candidato);
                    System.out.println();
                }
            }
            
            candidatoVotos=0;
        }
        
        System.out.println("Caso o candidato não esteja na lista, teve 0 votos");
    }
    
    public void Colocados(Votacao[] votos){
        int limite = 10;
        int qtd = 200; // Quantidade de votos
        Votacao[] aux = new Votacao[1];
        Votacao[] candidatos = new Votacao[300];
        aux[0] = new Votacao();
        
        for(int i=0;i<300;i++){
            candidatos[i] = new Votacao();
            candidatos[i].secao = 0;
        }
        
        for (int a=0;a<300;a++){
            for (int i=0;i<200;i++){
                
                if (candidatos[a].secao == 0){
                    candidatos[a].secao = a;
                } else{
                    if (candidatos[a].secao == votos[i].candidato){
                        candidatos[a].candidato++;
                    }
                }
            }
        }
        
        System.out.println("10 Candidatos mais votados:\n");
        
        // ordenando candidatos
        for (int a=0;a<qtd;a++){
            for (int i=0;i<qtd;i++){
                if (candidatos[a].candidato > candidatos[i].candidato){
                    aux[0].secao = candidatos[i].secao;
                    aux[0].candidato = candidatos[i].candidato;
                    
                    candidatos[i].secao = candidatos[a].secao;
                    candidatos[i].candidato = candidatos[a].candidato;
                    
                    candidatos[a].secao = aux[0].secao;
                    candidatos[a].candidato = aux[0].candidato;
                }
            }
        }
        
        for (int i=0;i<limite;i++){
            System.out.printf("%dº %d -> %d",
                    i+1,candidatos[i].secao,candidatos[i].candidato);
            System.out.println();
        }
    }
}
