/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.dao;

import java.util.List;
import modelo.entidades.OrdenTrabajo;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Diego
 */
public class OrdenTrabajoImpl implements OrdenTrabajoDAO{
    
    Transaction tr = null;
    Session sn = null;
    @Override
    public OrdenTrabajo buscar(OrdenTrabajo ordentrabajo) {
        try {
            sn = HibernateUtil.getSessionFactory().openSession();
            tr = sn.beginTransaction();
            ordentrabajo = (OrdenTrabajo) sn.get(OrdenTrabajo.class, ordentrabajo.getNumOrden());
        } catch (Exception e) {
        } finally{
            sn.close();
        }
        return ordentrabajo;
    }

    @Override
    public List<OrdenTrabajo> listar() {
        List<OrdenTrabajo> lista = null;
        try {
            sn = HibernateUtil.getSessionFactory().openSession();
            tr = sn.beginTransaction();
            lista = sn.createQuery("from OrdenTrabajo").list();
        } catch (Exception e) {
            lista=null;
        } finally{
            sn.close();
        }
        return lista;
    }

    @Override
    public boolean guardar(OrdenTrabajo ordentrabajo) {
        boolean verifica = false;
        try {
            sn = HibernateUtil.getSessionFactory().openSession();
            tr = sn.beginTransaction();
            sn.saveOrUpdate(ordentrabajo);
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
