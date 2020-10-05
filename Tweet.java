public class Tweet{
    private String usuario;
    private String mensagem;
    
//=========get'rs e set'rs===============

    public String getUsuario(){
        return this.usuario;
    }
    public String getMensagem(){
        return this.mensagem;
    }
    public void setUsuario(String nome){
        this.usuario = nome;
    }
    public void setMensagem(String msg){
        this.mensagem = msg;
    }

}
