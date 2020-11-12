/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sgse.model.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Juan Carlos Arguello
 * @version 1.0
 */
@Entity
@Table(name = "seguro")
public class Seguro implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;
    
    @Column(name = "paquete_servicio")
    private String paqueteServicio;
    
    @Column(name = "precio")
    private int precio;
    
    @Column(name = "iva")
    private int iva;
    
    @Column(name = "tipo_servicio")
    private String tipoServicio;
    
    @Column(name = "descripcion")
    private String descripcion;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "seguro")
    private List<Compra> compraList;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "seguro")
    private List<RegistrarVenta> registrarVentaList;
    
    @OneToMany(mappedBy = "idSeguro")
    private List<Plan> planList;

    public Seguro() {
    }

    public Seguro(Integer id) {
        this.id = id;
    }

    public Seguro(Integer id, String paqueteServicio, int precio, int iva, String tipoServicio) {
        this.id = id;
        this.paqueteServicio = paqueteServicio;
        this.precio = precio;
        this.iva = iva;
        this.tipoServicio = tipoServicio;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPaqueteServicio() {
        return paqueteServicio;
    }

    public void setPaqueteServicio(String paqueteServicio) {
        this.paqueteServicio = paqueteServicio;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getIva() {
        return iva;
    }

    public void setIva(int iva) {
        this.iva = iva;
    }

    public String getTipoServicio() {
        return tipoServicio;
    }

    public void setTipoServicio(String tipoServicio) {
        this.tipoServicio = tipoServicio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Compra> getCompraList() {
        return compraList;
    }

    public void setCompraList(List<Compra> compraList) {
        this.compraList = compraList;
    }

    public List<RegistrarVenta> getRegistrarVentaList() {
        return registrarVentaList;
    }

    public void setRegistrarVentaList(List<RegistrarVenta> registrarVentaList) {
        this.registrarVentaList = registrarVentaList;
    }

    public List<Plan> getPlanList() {
        return planList;
    }

    public void setPlanList(List<Plan> planList) {
        this.planList = planList;
    }

}
