package Classes;
public class Aluno extends Usuario{
    private int ra;
    private double nota_um, nota_dois, nota_final;

    public Aluno() {

    }

    public Aluno(String nome, String cpf, String telefone, int ra, String senha) {
        super(nome, cpf, telefone,senha);
        this.ra = ra;
    }
    
    

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public double getNota_um() {
        return nota_um;
    }

    public void setNota_um(double nota_um) {
        this.nota_um = nota_um;
    }

    public double getNota_dois() {
        return nota_dois;
    }

    public void setNota_dois(double nota_dois) {
        this.nota_dois = nota_dois;
    }

    public double getNota_final() {
        return nota_final;
    }

    public void setNota_final(double nota_final) {
        this.nota_final = nota_final;
    }



    public double calcularMedia(){
        return  (nota_um + nota_dois + nota_final) / 3;
    }

}
