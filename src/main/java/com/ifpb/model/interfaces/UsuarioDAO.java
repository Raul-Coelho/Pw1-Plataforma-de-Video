package com.ifpb.model.interfaces;

import com.ifpb.model.entidades.Usuario;

import java.sql.SQLException;
import java.util.List;

public interface UsuarioDAO {
    boolean salvar(Usuario u) throws SQLException;
    Usuario buscarById(int id) throws SQLException;
    List<Usuario> listar() throws SQLException;
    List<Usuario> buscarByName(String nome) throws SQLException;
    boolean deletar(String email) throws SQLException;
}
