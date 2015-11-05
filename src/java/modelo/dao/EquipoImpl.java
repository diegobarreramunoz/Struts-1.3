/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.dao;

import java.util.List;
import modelo.entidades.Equipo;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Diego
 */
public class EquipoImpl implements EquipoDAO{
    
    Transaction tr = null;
    Session sn = null;
    @Override
    public Equipo buscar(Equipo equipo) {
        try {
            sn = HibernateUtil.getSessionFactory().openSession();
            tr = sn.beginTransaction();
            equipo = (Equipo) sn.get(Equipo.class, equipo.getImei());
        } catch (Exception e) {
        } finally{
            sn.close();
        }
        return equipo;
    }

    @Override
    public List<Equipo> listar() {
        List<Equipo> lista = null;
        try {
            sn = HibernateUtil.getSessionFactory().openSession();
            tr = sn.beginTransaction();
            lista = sn.createQuery("from Equipo").list();
        } catch (Exception e) {
            lista=null;
        } finally{
            sn.close();
        }
        return lista;
    }

    @Override
    public boolean guardar(Equipo equipo) {
        boolean verifica = false;
        try {
            sn = HibernateUtil.getSessionFactory().openSession();
            tr = sn.beginTransaction();
            sn.saveOrUpdate(equipo);
            tr.commit();
            verifica = true;
        } catch (Exception e) {
            tr.rollback();
            verifica = false;
        } finally{
            sn.close();
        }
        return verifica;
    }
    
}
