/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.dao;

import java.util.List;
import modelo.entidades.Cliente;

/**
 *
 * @author Diego
 */
public interface ClienteDAO {
    public Cliente buscar (Cliente cliente);
    public List<Cliente> listar();
    public boolean guardar(Cliente cliente);
}
