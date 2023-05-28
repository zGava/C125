import java.util.*;
public class Main {
    public static void main(String[] args) {
        RedeSocial[] novaRede = new RedeSocial[4];

        Usuario usuario1 = new Usuario(novaRede);
        usuario1.setNome("Lara");
        usuario1.setEmail("laragava@gmail.com");

        Scanner entrada = new Scanner(System.in);

        int valorEntrada = 0;
        int i = 0;


        while (valorEntrada != 5 && i < novaRede.length) {
            System.out.println("Digite abaixo para selecionar a rede social desejada: ");
            do {
                System.out.println("1 - Instagram\n2 - Google Plus\n3 - Twitter\n4 - Facebook\n5- Sair");
                valorEntrada = entrada.nextInt();
                entrada.nextLine();
            } while (!(valorEntrada == 1 || valorEntrada == 2 || valorEntrada == 3 || valorEntrada == 4 || valorEntrada == 5)); //digita novamente se for diferente disso

            switch (valorEntrada) {
                case 1:  //instagram
                    System.out.println("Insira sua senha: ");
                    String senha;
                    senha = entrada.nextLine();
                    System.out.println("Insira numero de seguidores");
                    int numAmigos;
                    numAmigos = entrada.nextInt();

                    Instagram instagram = new Instagram(senha, numAmigos);
                    usuario1.redes[i] = instagram;
                    break;
                case 2: //google plus
                    System.out.println("Insira sua senha: ");
                    senha = entrada.nextLine();

                    System.out.println("Insira numero de amigos");
                    numAmigos = entrada.nextInt();

                    GooglePlus googlePlus = new GooglePlus(senha, numAmigos);
                    usuario1.redes[i] = googlePlus;
                    break;

                case 3: //twitter
                    System.out.println("Insira sua senha: ");
                    senha = entrada.nextLine();

                    System.out.println("Insira numero de seguidores");
                    numAmigos = entrada.nextInt();

                    Twitter twitter = new Twitter(senha, numAmigos);
                    usuario1.redes[i] = twitter;
                    break;
                case 4: //facebook
                    System.out.println("Insira sua senha: ");
                    senha = entrada.nextLine();

                    System.out.println("Insira numero de seguidores");
                    numAmigos = entrada.nextInt();

                    Facebook facebook = new Facebook(senha, numAmigos);
                    usuario1.redes[i] = facebook;
                    break;
                default:
                    break;
            }
            i++;
        }

        System.out.println("Nome: " + usuario1.getNome() + "\nE-mail: " + usuario1.getEmail());

        System.out.println("Ações do usuário: \n");
        for (RedeSocial rede : usuario1.redes) {
            if (rede != null) {
                if (rede instanceof Facebook) {
                    System.out.println("\nFacebook:");
                    rede.postarComentario();
                    rede.postarFoto();
                    rede.postarVideo();
                } else if (rede instanceof GooglePlus) {
                    System.out.println("\nGoogle Plus:");
                    ((GooglePlus) rede).fazStreaming();
                    ((GooglePlus) rede).compartilhar();
                    rede.curtirPublicacao();
                } else if (rede instanceof Twitter) {
                    System.out.println("\nTwitter:");
                    rede.curtirPublicacao();
                    rede.postarFoto();
                    ((Twitter) rede).compartilhar();
                } else if (rede instanceof Instagram) {
                    System.out.println("\nInstagram:");
                    rede.postarFoto();
                    rede.postarVideo();
                    rede.curtirPublicacao();
                }
            }
        }
    }
}