public class GooglePlus extends RedeSocial  implements VideoConferencia, Compartilhamento{

    public GooglePlus(String senha, int numAmigos){
        super(senha, numAmigos);
    }

    @Override
    public void compartilhar(){
        System.out.println("Conteúdo compartilhado!");
    }

    @Override
    public void postarFoto(){
        System.out.println("Foto postada no Google Plus!");
    }

    @Override
    public void postarVideo(){
        System.out.println("Video postado no Googe Plus!");
    }

    @Override
    public void postarComentario(){
        System.out.println("Comentario postado no Google Plus!");
    }

    @Override
    public void fazStreaming(){
        System.out.println("Fazendo vídeo conferência  no Google Plus!");
    }
}
