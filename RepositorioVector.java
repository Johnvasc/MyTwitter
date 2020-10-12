import java.util.Vector;
import java.util.Scanner;

public class RepositorioVector implements IRepositorioUsuario{
    private Vector<Perfil> armazenamento;
    private Scanner scan = new Scanner<System.in>;
    void RepositorioVector(){
        armazenamento = new Vector<Perfil>();
    }
    public void cadastrar(Perfil usuario){
        try{
            checarRepetido(usuario.getUsuario(), usuario);
            armazenamento.add(usuario);
            System.out.println("Perfil cadastrado com sucesso!");
        }catch(UJCException ujc) {
            System.out.println("Essa conta pode ser atualizada ou descartada");
            System.out.println("1 - Manter conta e mudar usuario");
            System.out.println("2 - Descartar conta");
            int opcao = scan.nextInt();
            if(opcao==1){
                atualizar(ujc.getPerfil());
            }
            else System.out.println("O perfil foi descartado!");
        }
    }
    public void atualizar(Perfil usuario){
        try{
            int i = buscarPosicao(usuario.getUsuario(), usuario);
            armazenamento.remove(i);
            armazenamento.add(i, usuario);
            System.out.println("Perfil atualizado com sucesso!");
        }catch(UNCException unc){
            System.out.println("O usuario nao existe, deseja cria-lo agora?");
            System.out.println("1 - Sim");
            System.out.println("2 - Nao");
            int opcao = scan.nextInt();
            if(opcao==1){
                
            }
        }
    };
    public Perfil buscar(String usuario){
        for(int i=0; i<armazenamento.size(); i++){
            if(usuario.equals(armazenamento.get(i).getUsuario()){
                return armazenamento.get(i);
            }
        }
        return null;
    }
    public int buscarPosicao(String usuario, Perfil p) throws UNCException{
        for(int i=0; i<armazenamento.size(); i++){
            if(usuario.equals(armazenamento.get(i).getUsuario()){
                return i;
            }
            throw new UNCException(p);
        }
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
