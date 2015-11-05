/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.dao;

import java.util.List;
import modelo.entidades.Personal;

/**
 *
 * @author Diego
 */
public interface PersonalDAO {
    public Personal buscar (Personal personal);
    public List<Personal> listar();
    public boolean guardar(Personal personal);
}
