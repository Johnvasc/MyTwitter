public class UNCException{
    String usuario;
    void UNCException(String usuario){
        this.usuario = usuario;
        System.out.println("O perfil atualizado nao existe!");
    }
    public String getUsuario(){
        return this.usuario;
    }
}
