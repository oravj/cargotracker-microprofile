
package com.ofss.gem.refapp.bookingms.infrastructure.routing;

import com.ofss.gem.refapp.bookingms.domain.model.cargo.Itinerary;
import com.ofss.gem.refapp.bookingms.domain.model.cargo.RouteSpecification;
import com.ofss.gem.refapp.bookingms.domain.services.RoutingService;
import java.util.ArrayList;
import java.util.List;

/**
 *  This class represents an example of a routing service which is across domain boundaries
 *  @author VIJNAIR
 */
public class ExternalRoutingService implements RoutingService{
    
    public List<Itinerary> fetchRoutesForSpecification(
            RouteSpecification routeSpecification){
        return new ArrayList<Itinerary>();
    }
    
}
