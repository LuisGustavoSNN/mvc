package model.service;
import model.entity.Pessoa;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PessoaService {



    Set<Pessoa> bancoDeDados = new HashSet<>();

    //CRUD

    public void criar(){
        Pessoa p = new Pessoa();
        p.setNome(IO.readln("Digite seu nome: "));
        p.setEmail(IO.readln("Digite seu email: "));
        p.setSenha(IO.readln("Digite sua senha: "));
    }
}
