/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dao;

import com.mycompany.models.Material;
import com.mycompany.singleton.DBAccess;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JuanEAB
 */
public class MaterialDao implements Dao<Material> {

    @Override
    public Material get(Integer id) {
        Material material = new Material();
        String pa = "{call getMaterial(?)}";
        Connection cn = DBAccess.getInstance().getConnection();
        if (cn != null) {
            try {
                CallableStatement cs = cn.prepareCall(pa);
                cs.setInt(1, id);
                ResultSet rs = cs.executeQuery();
                if (rs.next()) {
                    material.setIdMaterial(rs.getInt("id"));
                    material.setTitleMaterial(rs.getString("titleMaterial"));
                    material.setDescription(rs.getString("descriptionMaterial"));

                }
            } catch (SQLException ex) {
            } finally {
                try {
                    cn.close();
                } catch (SQLException e) {
                }
            }
        }
        return material;
    }

    @Override
    public List<Material> getAll() {
        ArrayList<Material> lista = new ArrayList<>();
        String pa = "{CALL getAllMaterial()}";
        Connection cn = DBAccess.getInstance().getConnection();
        if (cn != null) {
            try {
                CallableStatement cs = cn.prepareCall(pa);
                ResultSet rs = cs.executeQuery();
                while (rs.next()) {
                    Material material = new Material();
                    material.setIdMaterial(rs.getInt("id"));
                    material.setTitleMaterial(rs.getString("titleMaterial"));
                    material.setDescription(rs.getString("descriptionMaterial"));
                    lista.add(material);
                }
            } catch (SQLException ex) {
            } finally {
                try {
                    cn.close();
                } catch (SQLException e) {
                }
            }
        }
        return lista;
    }

    @Override
    public void save(Material t) {
        Connection cn = DBAccess.getInstance().getConnection();
        String pa = "{call saveMaterial(?,?)}";
        if (cn != null) {
            try {
                CallableStatement cs = cn.prepareCall(pa);

                cs.setString(1, t.getTitleMaterial());
                cs.setString(2, t.getDescription());

                cs.executeUpdate();
            } catch (SQLException e) {

            } finally {
                try {
                    cn.close();
                } catch (SQLException e) {
                }
            }
        }
    }

    @Override
    public void update(Material t) {
        Connection cn = DBAccess.getInstance().getConnection();
        String pa = "{Call updateMaterial(?,?,?)}";
        if (cn != null) {
            try {
                CallableStatement cs = cn.prepareCall(pa);
                cs.setInt(1, t.getIdMaterial());
                cs.setString(2, t.getTitleMaterial());
                cs.setString(3, t.getDescription());
                cs.executeUpdate();
            } catch (SQLException e) {

            } finally {
                try {
                    cn.close();
                } catch (SQLException e) {

                }
            }
        }
    }

    @Override
    public void delete(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
