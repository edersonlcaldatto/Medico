package br.com.animati.Model;

public class Medico {

    private long idMedico;
    private String profissao;
    private ConselhorProfissionalType conselhorProfissional;
    private String crm;
    private String cns;
    private EstadoType estadoCrm;
    private Boolean solicitante;
    private Boolean executor;
    private Boolean anestesista;
    private Boolean provisorio;

    public long getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(long idMedico) {
        this.idMedico = idMedico;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public ConselhorProfissionalType getConselhorProfissional() {
        return conselhorProfissional;
    }

    public void setConselhorProfissional(ConselhorProfissionalType conselhorProfissional) {
        this.conselhorProfissional = conselhorProfissional;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getCns() {
        return cns;
    }

    public void setCns(String cns) {
        this.cns = cns;
    }

    public EstadoType getEstadoCrm() {
        return estadoCrm;
    }

    public void setEstadoCrm(EstadoType estadoCrm) {
        this.estadoCrm = estadoCrm;
    }

    public Boolean getSolicitante() {
        return solicitante;
    }

    public void setSolicitante(Boolean solicitante) {
        this.solicitante = solicitante;
    }

    public Boolean getExecutor() {
        return executor;
    }

    public void setExecutor(Boolean executor) {
        this.executor = executor;
    }

    public Boolean getAnestesista() {
        return anestesista;
    }

    public void setAnestesista(Boolean anestesista) {
        this.anestesista = anestesista;
    }

    public Boolean getProvisorio() {
        return provisorio;
    }

    public void setProvisorio(Boolean provisorio) {
        this.provisorio = provisorio;
    }
}
