package com.ifpb.model.interfaces;

import java.sql.SQLException;

public interface FactoryDAO {
    UsuarioDAO getDaoUsuario() throws SQLException, ClassNotFoundException;
}
