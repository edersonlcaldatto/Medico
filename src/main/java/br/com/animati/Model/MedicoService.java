package br.com.animati.Model;

import java.util.List;

public interface MedicoService {

    public void add(Medico medico);
    public void edit(Medico medico);
    public List<Medico> list();
    public void delete(long idMedico);
    public Medico findById(long idMedico);
    public Medico findByCrm(String crm);
    public Medico findByCrmAndEstado(String crm);
    public Medico findByExecutor();
    public Medico findByProvisorio();

}
