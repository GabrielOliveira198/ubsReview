/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManagedBeans;

import Sismob.Sismob;
import Sismob.SismobDAOHibernate;
import Sismob.SismobRN;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.view.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import org.primefaces.event.map.OverlaySelectEvent;
import org.primefaces.model.map.DefaultMapModel;
import org.primefaces.model.map.LatLng;
import org.primefaces.model.map.MapModel;
import org.primefaces.model.map.Marker;

/**
 *
 * @author olive
 */
@Named
@ViewScoped
public class MarkerSelectionView implements Serializable {
     
    private MapModel simpleModel;
 
    private Marker marker;
    private List<Sismob> sismobs;
 
    @PostConstruct
    public void init() {
        simpleModel = new DefaultMapModel();
        sismobs = new SismobRN().listar();

        for (Sismob sismob1 : sismobs) {
        //Shared coordinates
        LatLng coord1 = new LatLng(sismob1.getVlrLatitude(),sismob1.getVlrLongitude());
        //Basic marker
        simpleModel.addOverlay(new Marker(coord1,sismob1.getEstabelecimento()));
        }
    }
     
    public MapModel getSimpleModel() {
        return simpleModel;
    }
     
    public void onMarkerSelect(OverlaySelectEvent event) {
        marker = (Marker) event.getOverlay();
         
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Nome da unidade clicada", marker.getTitle()));
    }
     
    public Marker getMarker() {
        return marker;
    }
}
