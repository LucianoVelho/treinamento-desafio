package treino.treino.modulos.pessoa.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "pessoa")
public class Pessoa implements Serializable {

    private static  final long serialVersionLong = 1L;

    @Id
    @Column(name = "id_pessoa")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "sobrenome")
    private String sobrenome;

    public Pessoa() {
    }

    public Pessoa(long id, String nome, String sobrenome) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
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
}
