package br.com.animati.controller;

import br.com.animati.Model.Medico;
import br.com.animati.Model.MedicoService;

import java.util.ArrayList;
import java.util.List;

public class MedicoServiceImpl implements MedicoService {

    private List<Medico> medicosList = new ArrayList<>();

    @Override
    public void add(Medico medico) {
        medicosList.add(medico);
    }

    @Override
    public void edit(Medico medico) {
        int idx = medicosList.indexOf(medico);
        Medico medicoEdt = medicosList.get(idx);
        if(medicoEdt != null){
            medicosList.set(idx, medico);
        }
    }

    @Override
    public List<Medico> list() {
        return medicosList;
    }

    @Override
    public void delete(long idMedico) {
        Medico medico = findById(idMedico);
        if(medico != null){
            medicosList.remove(medico);
        }
    }

    @Override
    public Medico findById(long idMedico) {
        int i;
        for (i=0; i < medicosList.size(); i++){
            if (medicosList.get(i).getIdMedico() == idMedico){
                return medicosList.get(i);
            }
        }
        return null;
    }

    @Override
    public Medico findByCrm(String crm) {
        int i;
        for (i=0; i < medicosList.size(); i++){
            if (medicosList.get(i).getCrm() == crm){
                return medicosList.get(i);
            }
        }
        return null;
    }

    @Override
    public Medico findByCrmAndEstado(String crm) {
        return null;
    }

    @Override
    public Medico findByExecutor() {
        int i;
        for (i=0; i < medicosList.size(); i++){
            if (medicosList.get(i).getExecutor()){
                return medicosList.get(i);
            }
        }
        return null;
    }

    @Override
    public Medico findByProvisorio() {
        int i;
        for (i=0; i < medicosList.size(); i++){
            if (medicosList.get(i).getProvisorio()){
                return medicosList.get(i);
            }
        }
        return null;
    }
}
