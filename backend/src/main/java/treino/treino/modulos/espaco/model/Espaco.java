package treino.treino.modulos.espaco.model;

import treino.treino.modulos.pessoa.model.Pessoa;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "espaco")
public class Espaco implements Serializable {

    private static  final long serialVersionLong = 1L;

    @Id
    @Column(name = "id_espaco")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;

    @Column(name = "lotacao")
    private int lotacao;

    @ManyToMany
    @JoinTable(name="pessoa_espaco", joinColumns=
            {@JoinColumn(name="pessoa_id")}, inverseJoinColumns=
            {@JoinColumn(name="espaco_id")})
    private List<Pessoa> pessoas = new ArrayList<>();

    public Espaco() {
    }

    public Espaco(long id, int lotacao, List<Pessoa> pessoas) {
        this.id = id;
        this.lotacao = lotacao;
        this.pessoas = pessoas;
    }

    public static long getSerialVersionLong() {
        return serialVersionLong;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getLotacao() {
        return lotacao;
    }

    public void setLotacao(int lotacao) {
        this.lotacao = lotacao;
    }

    public List<Pessoa> getPessoas() {
        return pessoas;
    }

    public void setPessoas(List<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }
}
