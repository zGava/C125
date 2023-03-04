public class Zumbi {

    double vida;
    String nome;

    double mostraVida(){
        return vida;
    }
    boolean transfereVida(Zumbi zumbiAlvo, double quantia){
        if (vida>quantia){
            vida-=quantia;
            zumbiAlvo.vida+=quantia;
            return true;
        }
        else {
            System.out.println("Não foi possível fazer a transferência da vida :(");
            return false;
        }
    }
}
