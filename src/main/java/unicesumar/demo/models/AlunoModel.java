package unicesumar.demo.models;


import jakarta.persistence.*;

@Entity // Cria nossa entidade no banco
@Table(name = "TBL_ALUNO") // Adiciona um nome personalizado para a tabela

public class AlunoModel {

    @Id // Gera a chave privada
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Gera o ID automaticamente
    private Long id;

    private String nome;
    private String cpf;
    private String email;

    public AlunoModel() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
