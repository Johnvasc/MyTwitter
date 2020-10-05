import java.util.Vector;

public abstract class Perfil{
	private String usuario; boolean ativo;
	private seguidos Vector<Perfil>; private seguidores Vector<Perfil>;
	private timeline Vector<Tweet>;
//========construtor da classe=====================================	
	void Perfil(String nome){
	    this.usuario = nome;
	    seguidos = new Vector<Perfil>();
	    seguidores = new Vector<Perfil>();
	    timeline = new Vector<Tweet>();
	}
//=======manipulacao da var usuario=================================
	public String getUsuario(){
	    return this.usuario;
	}
	public void setUsuario(String u){
	    this.usuario = u;
	}
//=======manipulacao da var ativo===================================
    public boolean getAtivo(){
        return this.usuario;
    }
    public void setAtivo(boolean b){
        this.ativo = b;
    }
}
