package Classes;

public class Professor extends Usuario{
    private int cracha;

    public Professor() {

    }

    public Professor(String nome, String cpf, String telefone, String email, int cracha) {
        super(nome, cpf, telefone, email);
        this.cracha = cracha;
    }

    public int getCracha() {
        return cracha;
    }

    public void setCracha(int cracha) {
        this.cracha = cracha;
    }
}
