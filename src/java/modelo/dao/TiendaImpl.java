/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.dao;

import java.util.List;
import modelo.entidades.Tienda;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Diego
 */
public class TiendaImpl implements TiendaDAO{
    
    Transaction tr = null;
    Session sn = null;
    @Override
    public Tienda buscar(Tienda tienda) {
        try {
            sn = HibernateUtil.getSessionFactory().openSession();
            tr = sn.beginTransaction();
            tienda = (Tienda) sn.get(Tienda.class, tienda.getCodTienda());
        } catch (Exception e) {
        } finally{
            sn.close();
        }
        return tienda;
    }

    @Override
    public List<Tienda> listar() {
        List<Tienda> lista = null;
        try {
            sn = HibernateUtil.getSessionFactory().openSession();
            tr = sn.beginTransaction();
            lista = sn.createQuery("from Tienda").list();
        } catch (Exception e) {
            lista=null;
        } finally{
            sn.close();
        }
        return lista;
    }

    @Override
    public boolean guardar(Tienda tienda) {
        boolean verifica = false;
        try {
            sn = HibernateUtil.getSessionFactory().openSession();
            tr = sn.beginTransaction();
            sn.saveOrUpdate(tienda);
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
