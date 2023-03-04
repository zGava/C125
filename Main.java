public class Main {
    public static void main(String[] args) {

        Zumbi z1 = new Zumbi();
        Zumbi z2 = new Zumbi();

        z1.vida = 100;
        z2.vida = 200;

        System.out.println("Vida do zumbi z1 = "+z1.vida);
        System.out.println("Vida do zumbi z1 = "+z2.vida);

        if(z1.transfereVida(z2,100)){
            System.out.println("Transferindo 100 de vida do z1 para z2: ");
            System.out.println("Vida do zumbi z1 = "+z1.vida);
            System.out.println("Vida do zumbi z1 = "+z2.vida);
        }

        if(z1.transfereVida(z2, 50)){
            System.out.println("Transferindo 50 de vida do z1 para z2: ");
            System.out.println("Vida do zumbi z1 = "+z1.vida);
            System.out.println("Vida do zumbi z1 = "+z2.vida);
        }
        else{
            System.out.println("Não houve alteração na vida xD ");
        }
    }
}
