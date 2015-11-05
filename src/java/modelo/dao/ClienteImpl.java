/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.dao;

import java.util.List;
import modelo.entidades.Cliente;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Diego
 */
public class ClienteImpl implements ClienteDAO{

    Transaction tr = null;
    Session sn = null;
    @Override
    public Cliente buscar(Cliente cliente) {
        try {
            sn = HibernateUtil.getSessionFactory().openSession();
            tr = sn.beginTransaction();
            cliente = (Cliente) sn.get(Cliente.class, cliente.getRutC());
        } catch (Exception e) {
        } finally{
            sn.close();
        }
        return cliente;
    }

    @Override
    public List<Cliente> listar() {
        List<Cliente> lista = null;
        try {
            sn = HibernateUtil.getSessionFactory().openSession();
            tr = sn.beginTransaction();
            lista = sn.createQuery("from Cliente").list();
        } catch (Exception e) {
            lista=null;
        } finally{
            sn.close();
        }
        return lista;
    }

    @Override
    public boolean guardar(Cliente cliente) {
        boolean verifica = false;
        try {
            sn = HibernateUtil.getSessionFactory().openSession();
            tr = sn.beginTransaction();
            sn.saveOrUpdate(cliente);
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
