package com.ifpb.model;

import com.ifpb.connect.Conexao;

import java.sql.*;

public class UsuarioDAO {

    private Connection connection;

    public boolean salvar(Usuario u){
        if(u.getId() == 0){
            String sql = "INSERT INTO usuario(nome, email, senha, sexo, rua, estado, cidade, numero, cep, foto, " +
                    "telefone VALUES (?,?,?,?,?,?,?,?,?,?,?)";

            try{
                PreparedStatement st = connection.prepareStatement(sql);
                st.setString(1, u.getNome());
                st.setString(2, u.getEmail() );
                st.setString(3, u.getSenha());
                st.setString(4, u.getSexo());
                st.setString(5, u.getRua());
                st.setString(6, u.getEstado());
                st.setString(7, u.getCidade());
                st.setString(8, u.getNumero());
                st.setString(9, u.getCep());
                st.setString(10, u.getFoto());
                st.setString(11, u.getTelefone());

                return st.executeUpdate() > 0;

            } catch (SQLException e) {
                return false;
            }
        }else{

            String sql = "UPDATE usuario(nome, email, senha, sexo, rua, estado, cidade, numero, cep, foto, " +
                    "                    telefone) set(?,?,?,?,?,?,?,?,?,?) WHERE id = ?";
            try{
                PreparedStatement st = connection.prepareStatement(sql);
                st.setString(1, u.getNome());
                st.setString(2, u.getSenha());
                st.setString(3, u.getSexo());
                st.setString(4, u.getRua());
                st.setString(5, u.getEstado());
                st.setString(6, u.getCidade());
                st.setString(7, u.getNumero());
                st.setString(8, u.getCep());
                st.setString(9, u.getFoto());
                st.setString(10, u.getTelefone());

                return st.executeUpdate() > 0;

            }catch (SQLException e){
                return false;
            }
        }
    }


    public Usuario buscarById(int id) throws SQLException {
        String sql = "SELECT * FROM usuario WHERE id = ?";

        try{
            PreparedStatement st = connection.prepareStatement(sql);

            st.setInt(1, id);
            ResultSet resultado = st.executeQuery();

            if(resultado.next()){
                Usuario u = new Usuario(
                        resultado.getInt("id"),
                        resultado.getString("email"),
                        resultado.getString("senha"),
                        resultado.getString("nome"),
                        resultado.getString("sexo"),
                        resultado.getString("foto"),
                        resultado.getString("rua"),
                        resultado.getString("cidade"),
                        resultado.getString("estado"),
                        resultado.getString("cep"),
                        resultado.getString("telefone")
                );
                return u;
            }
            return null;
        }catch (SQLException e){
            return null;
        }


    }


}
