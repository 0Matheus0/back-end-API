package com.strange.matheusApiResttraining.model;

import javax.persistence.*;
import java.sql.Timestamp;


@Entity (name = "agenda")
public class AgendaModel {

    @Id
    private Integer id;

    @Column (nullable = false, length = 35)
    private String nome_evento;

    @Column (name = "local_evento", nullable = false, length = 35)
    private String local;

    @Column (nullable = false)
    //@JsonFormat(timezone = "GMT-03:00")  informar que esse tipo retornar em gmm -03:00
    private Timestamp data_inicio;

    @Column (nullable = false)
    private Timestamp data_fim;

    @Column (nullable = false)
    private Integer id_da_pessoa;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome_evento() {
        return nome_evento;
    }

    public void setNome_evento(String nome_evento) {
        this.nome_evento = nome_evento;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public Timestamp getData_inicio() {
        return data_inicio;
    }

    public void setData_inicio(Timestamp data_inicio) {
        this.data_inicio = data_inicio;
    }

    public Timestamp getData_fim() {
        return data_fim;
    }

    public void setData_fim(Timestamp data_fim) {
        this.data_fim = data_fim;
    }

    public Integer getId_da_pessoa() {
        return id_da_pessoa;
    }

    public void setId_da_pessoa(Integer id_da_pessoa) {
        this.id_da_pessoa = id_da_pessoa;
    }


}
