/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sismob;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author olive
 */
@Entity
@Table(name = "sismob")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Sismob.findAll", query = "SELECT s FROM Sismob s")
    , @NamedQuery(name = "Sismob.findById", query = "SELECT s FROM Sismob s WHERE s.id = :id")
    , @NamedQuery(name = "Sismob.findByAnoHabilitacao", query = "SELECT s FROM Sismob s WHERE s.anoHabilitacao = :anoHabilitacao")
    , @NamedQuery(name = "Sismob.findByEstabelecimento", query = "SELECT s FROM Sismob s WHERE s.estabelecimento = :estabelecimento")
    , @NamedQuery(name = "Sismob.findByNomeCidade", query = "SELECT s FROM Sismob s WHERE s.nomeCidade = :nomeCidade")
    , @NamedQuery(name = "Sismob.findByPac", query = "SELECT s FROM Sismob s WHERE s.pac = :pac")
    , @NamedQuery(name = "Sismob.findByTipoObra", query = "SELECT s FROM Sismob s WHERE s.tipoObra = :tipoObra")
    , @NamedQuery(name = "Sismob.findByUf", query = "SELECT s FROM Sismob s WHERE s.uf = :uf")
    , @NamedQuery(name = "Sismob.findByVlrLatitude", query = "SELECT s FROM Sismob s WHERE s.vlrLatitude = :vlrLatitude")
    , @NamedQuery(name = "Sismob.findByVlrLongitude", query = "SELECT s FROM Sismob s WHERE s.vlrLongitude = :vlrLongitude")})
public class Sismob implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "ANO_HABILITACAO")
    private Integer anoHabilitacao;
    @Size(max = 255)
    @Column(name = "ESTABELECIMENTO")
    private String estabelecimento;
    @Size(max = 255)
    @Column(name = "NOME_CIDADE")
    private String nomeCidade;
    @Size(max = 255)
    @Column(name = "PAC")
    private String pac;
    @Size(max = 255)
    @Column(name = "TIPO_OBRA")
    private String tipoObra;
    @Size(max = 255)
    @Column(name = "UF")
    private String uf;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VLR_LATITUDE")
    private Float vlrLatitude;
    @Column(name = "VLR_LONGITUDE")
    private Float vlrLongitude;

    public Sismob() {
    }

    public Sismob(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAnoHabilitacao() {
        return anoHabilitacao;
    }

    public void setAnoHabilitacao(Integer anoHabilitacao) {
        this.anoHabilitacao = anoHabilitacao;
    }

    public String getEstabelecimento() {
        return estabelecimento;
    }

    public void setEstabelecimento(String estabelecimento) {
        this.estabelecimento = estabelecimento;
    }

    public String getNomeCidade() {
        return nomeCidade;
    }

    public void setNomeCidade(String nomeCidade) {
        this.nomeCidade = nomeCidade;
    }

    public String getPac() {
        return pac;
    }

    public void setPac(String pac) {
        this.pac = pac;
    }

    public String getTipoObra() {
        return tipoObra;
    }

    public void setTipoObra(String tipoObra) {
        this.tipoObra = tipoObra;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public Float getVlrLatitude() {
        return vlrLatitude;
    }

    public void setVlrLatitude(Float vlrLatitude) {
        this.vlrLatitude = vlrLatitude;
    }

    public Float getVlrLongitude() {
        return vlrLongitude;
    }

    public void setVlrLongitude(Float vlrLongitude) {
        this.vlrLongitude = vlrLongitude;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Sismob)) {
            return false;
        }
        Sismob other = (Sismob) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Sismob.Sismob[ id=" + id + " ]";
    }
    
}
