/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sismob;

import Sismob.SismobDAO;
import Sismob.Sismob;
import Controller.util.DAOFactory;
import java.util.List;

/**
 *
 * @author 1513 FOX
 */
public class SismobRN {

    private SismobDAO sismobDAO;

    public SismobRN() {
        this.sismobDAO = DAOFactory.criarSismobDAO();
    }

    public Sismob buscarPorCodigo(float lat, float lng) {
        return this.sismobDAO.buscarPorCoor(lat, lng);
    }

    public void salvar(Sismob sismob) {

        this.sismobDAO.salvar(sismob);

    }
    public void excluir(Sismob sismob) {
        this.sismobDAO.excluir(sismob);
    }

    public List<Sismob> listar() {
        return this.sismobDAO.listar();
    }
}
