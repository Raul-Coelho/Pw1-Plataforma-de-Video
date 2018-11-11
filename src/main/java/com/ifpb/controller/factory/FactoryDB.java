package com.ifpb.controller.factory;

import com.ifpb.model.dao.UsuarioDao;
import com.ifpb.model.interfaces.FactoryDAO;
import com.ifpb.model.interfaces.UsuarioDAO;

import java.sql.SQLException;

public class FactoryDB implements FactoryDAO {
    @Override
    public UsuarioDAO getDaoUsuario() throws SQLException, ClassNotFoundException {
        return new UsuarioDao();
    }
}
