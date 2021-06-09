package com.strange.matheusApiResttraining.model;


import javax.persistence.*;

@Entity (name="pessoa")
public class PessoaModel {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)                    //precisa ter para gerar id automatico
    private Integer id;                                                     //Se id for vazio, gerar id automaticamente.

    @Column (nullable = false, length = 25)
    private String nome;

    @Column (nullable = false, length = 35)
    private String sobrenome;

    @Column (nullable = false)
    private int idade;

    @Column (nullable = false, length = 15)
    private String cpf;

    @Column (nullable = false, length = 9)
    private String telefone;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }



}
