import java.util.Scanner;

public class UJCException extends Exception {
    private Perfil perfil;
    private Scanner scan = new Scanner(System.in);
    void UJCException(Perfil p){
        super("conta com esse usuario ja registrada!");
        this.perfil = p;
    }
    public void setPerfil(Perfil p){
        this.perfil = p;
    }
    public Perfil getPerfil(){
        return this.perfil;
    }
}
