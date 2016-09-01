package web.service.rest;

import javax.ejb.Stateless;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Stateless
@Path("/oauth")
public class OAuthCallbackService {

    private static final Logger LOG = LoggerFactory.getLogger(OAuthCallbackService.class);
    
    @GET
    @Produces("application/json")
    @Path("update/{id:[0-9][0-9]*}")
    public Response update(@Context HttpServletRequest request, @PathParam("id") Long id) {
        LOG.info("--> update({}).", id);
        LOG.info("<-- update().");
        return Response.noContent().build();
    }

}
