package com.josebigio.digitalturbine.models;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.List;

/**
 * <h1>ListModel</h1>
 */
@Root(name = "ads", strict = false)
public class ListModel {

    @ElementList(name="ad",inline = true)
    List<DetailModel> details;

    public List<DetailModel> getDetails() {
        return details;
    }

}
