/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.rj.macae.femass.Odirlei_N1.DAO;

import br.rj.macae.femass.Odirlei_N1.modelo.Aluno;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author aluno
 */
public class AlunoDAO {
    
    private Connection NULL;
    public void adicionar(Aluno a){
        Connection conexao=NULL;
        try{
            conexao =FabricaConexao.GetConexao(); 
            String sql="insert into aluno (nome, média, situação) values (?, ?, ?)";
            PreparedStatement stmt;
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, a.getNome());
            stmt.setFloat(2, a.getMedia());
            stmt.setString(3, a.getSituacao());
            stmt.executeUpdate();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
    
}
