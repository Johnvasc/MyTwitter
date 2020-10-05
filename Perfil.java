import java.util.Vector;

public abstract class Perfil{
	private String usuario; boolean ativo;
	private Vector<Perfil> seguidos; private Vector<Perfil> seguidores;
	private Vector<Tweet> timeline;
//======================metodos=================================================
	void Perfil(String nome){
	    this.usuario = nome;
	    seguidos = new Vector<Perfil>();
	    seguidores = new Vector<Perfil>();
	    timeline = new Vector<Tweet>();
	}
	public String getUsuario(){
	    return this.usuario;
	}
	public void setUsuario(String u){
	    this.usuario = u;
	}
    public boolean isAtivo(){
        return this.usuario;
    }
    public void setAtivo(boolean b){
        this.ativo = b;
    }
    public void addSeguidor(Perfil p){
        seguidores.add(p);
    }
    public Vector<Perfil> getSeguidores(){
        return this.seguidores;
    }
    public void addSeguido(Perfil p){
        seguidos.add(p);
    }
    public Vector<Perfil> getSeguidos(){
        return this.seguidos;
    }
    public void addTweet(Tweet t){
        timeline.add(t);
    }
    public Vector<Tweet> getTimeline(){
        return this.timeline;
    }
    public 
}
