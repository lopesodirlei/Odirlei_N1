/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.rj.macae.femass.Odirlei_N1.modelo;

/**
 *
 * @author aluno
 */
public class Aluno {
    
    private int ie;
    private String nome;
    private float n1;
    private float n2;
    private float n3;
    private float n4;
    private float media;
    private String situacao;

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + this.ie;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Aluno other = (Aluno) obj;
        if (this.ie != other.ie) {
            return false;
        }
        return true;
    }

    public int getIe() {
        return ie;
    }

    public void setIe(int ie) {
        this.ie = ie;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getN1() {
        return n1;
    }

    public void setN1(float n1) {
        this.n1 = n1;
    }

    public float getN2() {
        return n2;
    }

    public void setN2(float n2) {
        this.n2 = n2;
    }

    public float getN3() {
        return n3;
    }

    public void setN3(float n3) {
        this.n3 = n3;
    }

    public float getN4() {
        return n4;
    }

    public void setN4(float n4) {
        this.n4 = n4;
    }

    public float getMedia() {
        return ((n1 + n2 + n3 + n4)/4);
    }

    public void setMedia(float media) {
        this.media = media;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    @Override
    public String toString() {
        return "Aluno{" + "ie=" + ie + ", nome=" + nome + ", n1=" + n1 + ", n2=" + n2 + ", n3=" + n3 + ", n4=" + n4 + ", media=" + media + ", situacao=" + situacao + '}';
    }
    

    
}
