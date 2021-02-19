package treino.treino.modulos.sala.model;

import treino.treino.modulos.pessoa.model.Pessoa;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "sala")
public class Sala implements Serializable {

    @Id
    @Column(name = "id_sala")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "lotacao")
    private String lotacao;

    @ManyToMany
    @JoinTable(name="pessoa_sala", joinColumns=
            {@JoinColumn(name="pessoa_id")}, inverseJoinColumns=
            {@JoinColumn(name="sala_id")})
    private List<Pessoa> pessoas = new ArrayList<>();

    public Sala() {
    }

    public Sala(long id, String nome, String lotacao, List<Pessoa> pessoas) {
        this.id = id;
        this.nome = nome;
        this.lotacao = lotacao;
        this.pessoas = pessoas;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLotacao() {
        return lotacao;
    }

    public void setLotacao(String lotacao) {
        this.lotacao = lotacao;
    }

    public List<Pessoa> getPessoas() {
        return pessoas;
    }

    public void setPessoas(List<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }
}
