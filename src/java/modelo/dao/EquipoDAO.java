/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.dao;

import java.util.List;
import modelo.entidades.Equipo;

/**
 *
 * @author Diego
 */
public interface EquipoDAO {
    public Equipo buscar (Equipo equipo);
    public List<Equipo> listar();
    public boolean guardar(Equipo equipo);
}
