package br.casasbahia.com.carro.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "carro")
public class Carro implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column (length = 10, nullable = false)
    private String placa;
    @Column(length = 20, nullable = false)
    private String marca;
    @Column(length = 20, nullable = false)
    private String modelo;
    @Column(length = 20, nullable = false)
    private String cor;
    @Column(updatable = false)
    private Date dataCadastro;


    public long getId() {
        return id;
    }

    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }
}
