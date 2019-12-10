/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dao;

import com.mycompany.models.HealthReport;
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
public class HealthReportDao implements Dao<HealthReport>{

    @Override
    public HealthReport get(Integer id) {
        HealthReport report = new HealthReport();
        String pa = "{call getHealthReport(?)}";
        Connection cn = DBAccess.getInstance().getConnection();
        if (cn != null) {
            try {
                CallableStatement cs = cn.prepareCall(pa);
                cs.setInt(1, id);
                ResultSet rs = cs.executeQuery();
                if (rs.next()) {
                    report.setIdHealthReport(rs.getInt("id"));
                    report.setTitleHealthReport(rs.getString("titleHealthReport"));
                    report.setDescription(rs.getString("description"));
                    report.setDate(rs.getDate("date"));
                    report.setIdEmployee(rs.getInt("idEmployee"));

                }
            } catch (SQLException ex) {
            } finally {
                try {
                    cn.close();
                } catch (SQLException e) {
                }
            }
        }
        return report;
    }

    @Override
    public List<HealthReport> getAll() {
        ArrayList<HealthReport> lista = new ArrayList<>();
        String pa = "{CALL getAllHealthReport()}";
        Connection cn = DBAccess.getInstance().getConnection();
        if (cn != null) {
            try {
                CallableStatement cs = cn.prepareCall(pa);
                ResultSet rs = cs.executeQuery();
                while (rs.next()) {
                    HealthReport report = new HealthReport();
                    report.setIdHealthReport(rs.getInt("id"));
                    report.setTitleHealthReport(rs.getString("titleHealthReport"));
                    report.setDescription(rs.getString("description"));
                    report.setDate(rs.getDate("date"));
                    report.setIdEmployee(rs.getInt("idEmployee"));
                    lista.add(report);
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
    public void save(HealthReport t) {
        Connection cn = DBAccess.getInstance().getConnection();
        String pa = "{call saveHealthReport(?,?,?,?)}";
        if (cn != null) {
            try {
                CallableStatement cs = cn.prepareCall(pa);

                cs.setString(1, t.getTitleHealthReport());
                cs.setString(2, t.getDescription());
                cs.setDate(3, t.getDate());
                cs.setInt(4, t.getIdEmployee());

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
    public void update(HealthReport t) {
        Connection cn = DBAccess.getInstance().getConnection();
        String pa = "{Call updateHealthReport(?,?,?,?)}";
        if (cn != null) {
            try {
                CallableStatement cs = cn.prepareCall(pa);
                cs.setInt(1, t.getIdHealthReport());
                cs.setString(2, t.getTitleHealthReport());
                cs.setString(3, t.getDescription());
                cs.setDate(4, t.getDate());
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
