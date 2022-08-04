package model;

public class AlunoModel {
    //Atributos
    private int id;
    private int cpf;
    private String nome;
    private String sobrenome;
    private String email;

    //Métodos construtores

    public AlunoModel() {
        super();
    }

    public AlunoModel(int id, int cpf, String nome, String sobrenome, String email) {
        super();
        this.id = id;
        this.cpf = cpf;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
    }

    public AlunoModel(int id, int cpf) {

    }

    //Métodos acessores

    //Quando estava criando a coleção Map, alterarei o modificador de acesso e encontrei muitas dificultades
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "\nAlunoModel{" +
                "id=" + id +
                ", cpf=" + cpf +
                ", nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
