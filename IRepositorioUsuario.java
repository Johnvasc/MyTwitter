public interface IRepositorioUsuario{
    public void cadastrar(Perfil usuario);
    public void atualizar(Perfil usuario);
    public Perfil buscar(String usuario); 
}
