/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.dao;

import java.util.List;
import modelo.entidades.Personal;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Diego
 */
public class PersonalImpl implements PersonalDAO{
    
    Transaction tr = null;
    Session sn = null;
    @Override
    public Personal buscar(Personal personal) {
        try {
            sn = HibernateUtil.getSessionFactory().openSession();
            tr = sn.beginTransaction();
            personal = (Personal) sn.get(Personal.class, personal.getRutP());
        } catch (Exception e) {
        } finally{
            sn.close();
        }
        return personal;
    }

    @Override
    public List<Personal> listar() {
        List<Personal> lista = null;
        try {
            sn = HibernateUtil.getSessionFactory().openSession();
            tr = sn.beginTransaction();
            lista = sn.createQuery("from Personal").list();
        } catch (Exception e) {
            lista=null;
        } finally{
            sn.close();
        }
        return lista;
    }

    @Override
    public boolean guardar(Personal personal) {
        boolean verifica = false;
        try {
            sn = HibernateUtil.getSessionFactory().openSession();
            tr = sn.beginTransaction();
            sn.saveOrUpdate(personal);
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
