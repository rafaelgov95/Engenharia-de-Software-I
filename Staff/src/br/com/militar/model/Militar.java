package br.com.militar.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Militar implements Serializable {

    private static final long serialVersionUID = 1L;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idMilitar;

    private String nomeDeGuerra;
    private String nome;

    private String sobreNome;
    private String matricula;

    private String patente;


    private String telefone;


    private String DataNascimento;

    private String DataDeIngresso;


    public Integer getId() {
        return idMilitar;
    }

    public void setId(Integer id) {
        this.idMilitar = id;
    }

    public String getNomedeGuerra() {
        return nomeDeGuerra;
    }

    public void setNomedeGuerra(String nomedeGuerra) {
        this.nomeDeGuerra = nomedeGuerra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getDataNascimento() {
        return DataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        DataNascimento = dataNascimento;
    }

    public String getDataDeIngresso() {
        return DataDeIngresso;
    }

    public void setDataDeIngresso(String dataDeIngresso) {
        DataDeIngresso = dataDeIngresso;
    }
}
