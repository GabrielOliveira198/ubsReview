/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author olive
 */
@Entity
@Table(name = "model")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Model.findAll", query = "SELECT m FROM Model m"),
    @NamedQuery(name = "Model.findByCodCnes", query = "SELECT m FROM Model m WHERE m.codCnes = :codCnes"),
    @NamedQuery(name = "Model.findByCodMunic", query = "SELECT m FROM Model m WHERE m.codMunic = :codMunic"),
    @NamedQuery(name = "Model.findByDscAdapDeficFisicIdosos", query = "SELECT m FROM Model m WHERE m.dscAdapDeficFisicIdosos = :dscAdapDeficFisicIdosos"),
    @NamedQuery(name = "Model.findByDscBairro", query = "SELECT m FROM Model m WHERE m.dscBairro = :dscBairro"),
    @NamedQuery(name = "Model.findByDscCidade", query = "SELECT m FROM Model m WHERE m.dscCidade = :dscCidade"),
    @NamedQuery(name = "Model.findByDscEndereco", query = "SELECT m FROM Model m WHERE m.dscEndereco = :dscEndereco"),
    @NamedQuery(name = "Model.findByDscEquipamentos", query = "SELECT m FROM Model m WHERE m.dscEquipamentos = :dscEquipamentos"),
    @NamedQuery(name = "Model.findByDscEstrutFisicAmbiencia", query = "SELECT m FROM Model m WHERE m.dscEstrutFisicAmbiencia = :dscEstrutFisicAmbiencia"),
    @NamedQuery(name = "Model.findByDscMedicamentos", query = "SELECT m FROM Model m WHERE m.dscMedicamentos = :dscMedicamentos"),
    @NamedQuery(name = "Model.findByDscTelefone", query = "SELECT m FROM Model m WHERE m.dscTelefone = :dscTelefone"),
    @NamedQuery(name = "Model.findByNomEstab", query = "SELECT m FROM Model m WHERE m.nomEstab = :nomEstab"),
    @NamedQuery(name = "Model.findByVlrLatitude", query = "SELECT m FROM Model m WHERE m.vlrLatitude = :vlrLatitude"),
    @NamedQuery(name = "Model.findByVlrLongitude", query = "SELECT m FROM Model m WHERE m.vlrLongitude = :vlrLongitude")})
public class Model implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "COD_CNES")
    private Integer codCnes;
    @Column(name = "COD_MUNIC")
    private Integer codMunic;
    @Size(max = 255)
    @Column(name = "DSC_ADAP_DEFIC_FISIC_IDOSOS")
    private String dscAdapDeficFisicIdosos;
    @Size(max = 255)
    @Column(name = "DSC_BAIRRO")
    private String dscBairro;
    @Size(max = 255)
    @Column(name = "DSC_CIDADE")
    private String dscCidade;
    @Size(max = 255)
    @Column(name = "DSC_ENDERECO")
    private String dscEndereco;
    @Size(max = 255)
    @Column(name = "DSC_EQUIPAMENTOS")
    private String dscEquipamentos;
    @Size(max = 255)
    @Column(name = "DSC_ESTRUT_FISIC_AMBIENCIA")
    private String dscEstrutFisicAmbiencia;
    @Size(max = 255)
    @Column(name = "DSC_MEDICAMENTOS")
    private String dscMedicamentos;
    @Size(max = 255)
    @Column(name = "DSC_TELEFONE")
    private String dscTelefone;
    @Size(max = 255)
    @Column(name = "NOM_ESTAB")
    private String nomEstab;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VLR_LATITUDE")
    private Float vlrLatitude;
    @Column(name = "VLR_LONGITUDE")
    private Float vlrLongitude;

    public Model() {
    }

    public Model(Integer codCnes) {
        this.codCnes = codCnes;
    }

    public Integer getCodCnes() {
        return codCnes;
    }

    public void setCodCnes(Integer codCnes) {
        this.codCnes = codCnes;
    }

    public Integer getCodMunic() {
        return codMunic;
    }

    public void setCodMunic(Integer codMunic) {
        this.codMunic = codMunic;
    }

    public String getDscAdapDeficFisicIdosos() {
        return dscAdapDeficFisicIdosos;
    }

    public void setDscAdapDeficFisicIdosos(String dscAdapDeficFisicIdosos) {
        this.dscAdapDeficFisicIdosos = dscAdapDeficFisicIdosos;
    }

    public String getDscBairro() {
        return dscBairro;
    }

    public void setDscBairro(String dscBairro) {
        this.dscBairro = dscBairro;
    }

    public String getDscCidade() {
        return dscCidade;
    }

    public void setDscCidade(String dscCidade) {
        this.dscCidade = dscCidade;
    }

    public String getDscEndereco() {
        return dscEndereco;
    }

    public void setDscEndereco(String dscEndereco) {
        this.dscEndereco = dscEndereco;
    }

    public String getDscEquipamentos() {
        return dscEquipamentos;
    }

    public void setDscEquipamentos(String dscEquipamentos) {
        this.dscEquipamentos = dscEquipamentos;
    }

    public String getDscEstrutFisicAmbiencia() {
        return dscEstrutFisicAmbiencia;
    }

    public void setDscEstrutFisicAmbiencia(String dscEstrutFisicAmbiencia) {
        this.dscEstrutFisicAmbiencia = dscEstrutFisicAmbiencia;
    }

    public String getDscMedicamentos() {
        return dscMedicamentos;
    }

    public void setDscMedicamentos(String dscMedicamentos) {
        this.dscMedicamentos = dscMedicamentos;
    }

    public String getDscTelefone() {
        return dscTelefone;
    }

    public void setDscTelefone(String dscTelefone) {
        this.dscTelefone = dscTelefone;
    }

    public String getNomEstab() {
        return nomEstab;
    }

    public void setNomEstab(String nomEstab) {
        this.nomEstab = nomEstab;
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
        hash += (codCnes != null ? codCnes.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Model)) {
            return false;
        }
        Model other = (Model) object;
        if ((this.codCnes == null && other.codCnes != null) || (this.codCnes != null && !this.codCnes.equals(other.codCnes))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Model[ codCnes=" + codCnes + " ]";
    }
    
}
