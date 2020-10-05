public interface ITwitter{
    public void criarPerfil(Perfil p);
    public void cancelarPerfil(String s);
    public void tweetar(String texto, String usuario);
    public void seguir(String seguidor, String seguindo);
    public int nSeguidores(String usuario);
    public Vector<Tweet> timeline(String nome);
    public Vector<Tweet> twitters(String usuario);
    public Vector<Perfil> seguidores(String usuario);
    public Vector<Perfil> seguidos(String usuario);
}
