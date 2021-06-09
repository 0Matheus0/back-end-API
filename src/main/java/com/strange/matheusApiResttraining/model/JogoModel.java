package com.strange.matheusApiResttraining.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;

@Entity (name = "jogos")
public class JogoModel {

    @Id
    private Integer id;

    @Column (nullable = false, length = 30)
    private String nome;

    @Column (nullable = false, length = 25)
    private String tipo;

    @Column (nullable = false)
    private Date data_lancamento;

    @Column (nullable = false)
    private Date data_compra;

    @Column (nullable = false)
    private Float preco;

    @Column (nullable = false)
    private Float progress;

    @Column (nullable = false)
    private Integer id_dono_pessoa;


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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Date getData_lancamento() {
        return data_lancamento;
    }

    public void setData_lancamento(Date data_lancamento) {
        this.data_lancamento = data_lancamento;
    }

    public Date getData_compra() {
        return data_compra;
    }

    public void setData_compra(Date data_compra) {
        this.data_compra = data_compra;
    }

    public Float getPreco() {
        return preco;
    }

    public void setPreco(Float preco) {
        this.preco = preco;
    }

    public Float getProgress() {
        return progress;
    }

    public void setProgress(Float progress) {
        this.progress = progress;
    }

    public Integer getId_dono_pessoa() {
        return id_dono_pessoa;
    }

    public void setId_dono_pessoa(Integer id_dono_pessoa) {
        this.id_dono_pessoa = id_dono_pessoa;
    }

}
