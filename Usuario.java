public class Usuario {

    private String nome;
    private String email;

    //armazena quantidade de redes sociais que o usuario possui
    RedeSocial [] redes = new RedeSocial[4];  //4 pq sao 4 redes

    //recebe redes sociais
    public  Usuario(RedeSocial[] redesSociais) {
        for (int i = 0; i < redesSociais.length; i++) {
            if (redesSociais[i] == null) {
                redes[i] = redesSociais[i];
                break;
            } else {
                System.out.println("Limite máximo de redes sociais atingido");
            }
        }
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome(){
        return this.nome;
    }

    public String getEmail(){
        return this.email;
    }
}