package br.com.animati;

import br.com.animati.Model.ConselhorProfissionalType;
import br.com.animati.Model.EstadoType;
import br.com.animati.Model.Medico;
import br.com.animati.controller.MedicoServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MedicoTest {

    private MedicoServiceImpl medicoService = new MedicoServiceImpl();
    private Medico medico1 = new Medico();
    private Medico medico2 = new Medico();
    private Medico medico3 = new Medico();

    @Before
    public void init(){
        medico1.setIdMedico(1);
        medico1.setProfissao("Radiologista");
        medico1.setConselhorProfissional(ConselhorProfissionalType.CFM);
        medico1.setCrm("4547-1");
        medico1.setCns("554");
        medico1.setEstadoCrm(EstadoType.BA);
        medico1.setSolicitante(false);
        medico1.setExecutor(true);
        medico1.setAnestesista(false);
        medico1.setProvisorio(false);
        this.medicoService.add(medico1);

        medico1.setIdMedico(2);
        medico1.setProfissao("Anestesista");
        medico1.setConselhorProfissional(ConselhorProfissionalType.CFM);
        medico1.setCrm("3375654-a");
        medico1.setCns("555726");
        medico1.setEstadoCrm(EstadoType.MA);
        medico1.setSolicitante(true);
        medico1.setExecutor(false);
        medico1.setAnestesista(true);
        medico1.setProvisorio(false);
        this.medicoService.add(medico2);

        medico1.setIdMedico(3);
        medico1.setProfissao("Clínico geral");
        medico1.setConselhorProfissional(ConselhorProfissionalType.CFM);
        medico1.setCrm("96334487");
        medico1.setCns("45596363ab");
        medico1.setEstadoCrm(EstadoType.PR);
        medico1.setSolicitante(false);
        medico1.setExecutor(false);
        medico1.setAnestesista(false);
        medico1.setProvisorio(true);

        this.medicoService.add(medico3);

    }
    @Test
    public void remove(){
        medicoService.delete(medico2.getIdMedico());
        Assert.assertEquals(2,medicoService.list().size());
    }


}
