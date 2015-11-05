/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.dao;

import java.util.List;
import modelo.entidades.OrdenTrabajo;

/**
 *
 * @author Diego
 */
public interface OrdenTrabajoDAO {
    public OrdenTrabajo buscar (OrdenTrabajo ordentrabajo);
    public List<OrdenTrabajo> listar();
    public boolean guardar(OrdenTrabajo ordentrabajo);
}
