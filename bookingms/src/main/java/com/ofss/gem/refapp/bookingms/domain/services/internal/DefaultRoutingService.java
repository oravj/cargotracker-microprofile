package com.ofss.gem.refapp.bookingms.domain.services.internal;

import com.ofss.gem.refapp.bookingms.domain.model.cargo.Itinerary;
import com.ofss.gem.refapp.bookingms.domain.model.cargo.RouteSpecification;
import com.ofss.gem.refapp.bookingms.domain.services.RoutingService;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author VIJNAIR
 */
public class DefaultRoutingService implements RoutingService{
 
    public List<Itinerary> fetchRoutesForSpecification(
            RouteSpecification routeSpecification){
        return new ArrayList<Itinerary>();
    }
}
