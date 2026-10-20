package model.service;

import model.entity.StatusTarefa;
import model.entity.Tarefa;
import java.util.ArrayList;
import java.util.List;

public class TarefaService {

    List<Tarefa> bancoDeDados = new ArrayList<>();
    private int proximoId = 1;


    public void criar() {
        Tarefa t = new Tarefa();
        t.setId(proximoId);
        proximoId++;
        t.setTitulo(IO.readln("Digite o título: "));
        t.setDescricao(IO.readln("Digite a descrição: "));
        t.setStatus(StatusTarefa.PENDENTE);
        bancoDeDados.add(t);
    }
}
