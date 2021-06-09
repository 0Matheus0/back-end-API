package com.strange.matheusApiResttraining.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity (name = "bicicleta")
public class BicicletaModel {

    @Id
    private Integer id;

    @Column (nullable = false, length = 20)
    private String marca;

    @Column (nullable = false, length = 15)
    private String modelo;

    @Column (nullable = false)
    private float aro;

    @Column (nullable = false, length = 15)
    private String cor;

    @Column (name = "id_pessoa_dono",nullable = false)
    private Integer id_dono_pessoa;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getAro() {
        return aro;
    }

    public void setAro(float aro) {
        this.aro = aro;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Integer getId_dono_pessoa() {
        return id_dono_pessoa;
    }

    public void setId_dono_pessoa(Integer id_dono_pessoa) {
        this.id_dono_pessoa = id_dono_pessoa;
    }



}
