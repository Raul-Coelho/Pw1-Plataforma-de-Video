package com.ifpb.controller.servico;

import com.ifpb.controller.connect.Conexao;
import com.ifpb.controller.factory.Factory;
import com.ifpb.model.dao.UsuarioDao;
import com.ifpb.model.entidades.Usuario;
import com.ifpb.model.interfaces.FactoryDAO;

import java.sql.SQLException;

public class UsuarioService {

    private FactoryDAO factory = null;
    private UsuarioDao dao = null;


    public UsuarioService() throws SQLException, ClassNotFoundException {
        factory = Factory.createFactory();
        dao = (UsuarioDao) factory.getDaoUsuario();
    }


    public boolean salvar(int id, String email, String senha, String nome, String sexo, String foto, String rua,
                          String cidade, String estado, String cep, String telefone, String numero) throws SQLException {
        Usuario u = new Usuario(id, email, senha, nome, sexo, foto, rua, cidade, estado, cep, telefone, numero);

        return dao.salvar(u);
    }
}
