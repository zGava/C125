public class Zumbi {

    double vida;
    String nome;

    double mostraVida(){
        return 0;
    }
    void transfereVida(Zumbi zumbiAlvo, double quantia){
        vida-=quantia;
        zumbiAlvo.vida+=quantia;
    }
}
