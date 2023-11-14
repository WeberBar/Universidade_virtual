package Classes;

import java.util.ArrayList;

public class Usuario {
    private String nome, cpf, Telefone,email, senha;

    private ArrayList<String> cursos = new ArrayList<>() ;

    public Usuario() {

    }

    public Usuario(String nome, String cpf, String telefone, String senha) {
        this.nome = nome;
        this.cpf = cpf;
        this.Telefone = telefone;
        this.senha = senha;
      
    }
    

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String telefone) {
        Telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void addCurso(String materia){
        cursos.add(materia);
    }

    public void removerMateria(int index){
        cursos.remove(index);
    }
    public ArrayList<String> getListamateria() {
        return cursos;
    }


}
