/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.dao;

import java.util.List;
import modelo.entidades.Tienda;

/**
 *
 * @author Diego
 */
public interface TiendaDAO {
    public Tienda buscar (Tienda tienda);
    public List<Tienda> listar();
    public boolean guardar(Tienda tienda);
}
