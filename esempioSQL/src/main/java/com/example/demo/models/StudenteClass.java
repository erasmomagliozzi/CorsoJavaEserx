package com.example.demo.models;

import com.example.demo.interfaces.Studente;

import java.sql.Connection;
import java.util.Set;

public class StudenteClass implements Studente {
    private int idStudente;
    private Connection db = null;

    public StudenteClass(int idStudente,String nome, String cognome, Integer idIndirizzo, Connection db) {
        this.idStudente = idStudente;
        this.db = db;
    }

    @Override
    public Integer id() {
        return null;
    }

    @Override
    public String getNome() {
        return null;
    }

    @Override
    public String getCognome() {
        return null;
    }

    /*@Override
    public com.example.demo.interfaces.Indirizzo getIndirizzo() {
        return null;
    }*/

    @Override
    public String getEsami() {
        return null;
    }
}
