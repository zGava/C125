public class Twitter extends RedeSocial implements Compartilhamento{

    public Twitter(String senha, int numAmigos){
        super(senha, numAmigos);
    }

    @Override
    public void compartilhar(){
        System.out.println("Conteúdo compartilhado!");
    }

    @Override
    public void postarFoto(){
        System.out.println("Foto postada no Twitter!");
    }

    @Override
    public void postarVideo(){
        System.out.println("Video postado no Twitter!");
    }

    @Override
    public void postarComentario() {
        System.out.println("Comentario postado no Twitter!");
    }
}

