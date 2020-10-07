import java.util.Vector;
import java.util.Scanner;

public class RepositorioVector implements IRepositorioUsuario{
    private Vector<Perfil> armazenamento;
    private Scanner scan = new Scanner<System.in>;
    void RepositorioVector(){
        armazenamento = new Vector<Perfil>();
    }
    public void cadastrar(Perfil usuario) throws UJCException{
        try{
            checarRepetido(usuario.getUsuario(), usuario);
            armazenamento.add(Perfil);
            System.out.println("Perfil cadastrado com sucesso!");
        }catch(UJCException ujc) {
            System.out.println("Essa conta pode ser atualizada ou descartada");
            System.out.println("1 - Manter conta e mudar usuario");
            System.out.println("2 - Descartar conta");
            int opcao = scan.nextInt();
            if(opcao==1){
                ujc.setPerfil(atualizar(ujc.getPerfil());
                cadastrar(ujc.getPerfil());
            }
            else System.out.println("O perfil foi descartado!");
        }
    }
    public void atualizar(Perfil usuario);
    public Perfil buscar(String usuario){
        for(int i=0; i<armazenamento.size(); i++){
            if(usuario.equals(armazenamento.get(i).getUsuario()){
                return armazenamento.get(i).getUsuario();
            }
        }
        return null;
    }
    public void checarRepetido(String usuario, Perfil p) throws UJCException{
        for(int i=0; i<armazenamento.size(); i++){
            if(usuario.equals(armazenamento.get(i).getUsuario()){
                throw new UJCException(p);
            }
        }
        return null;
    }
}
