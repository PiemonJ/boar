package com.mmb.boar.srv.service;

import com.mmb.boar.srv.dao.WebuserDao;
import com.mmb.boar.srv.entities.Webuser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * 
 * Service class that handles REST requests
 * @author amacoder
 *
 */
@Component
@Path("/webuser")
public class WebuserRestService {
	
	@Autowired
	private WebuserDao webuserdao;

	/**
	 *  This is required to create WebuseDao, if no, error will happen.
	 */
	public void setWebuserdao(WebuserDao webuserdao) {
		this.webuserdao = webuserdao;
	}

	@GET @Path("{id}")
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public Response findById(@PathParam("id") Integer id) {
		Webuser podcastById = webuserdao.selectByPrimaryKey(id);
		if(podcastById != null) {
			return Response.status(200).entity(podcastById).build(); 
		} else {
			return Response.status(404).entity("The podcast with the id " + id + " does not exist").build();
		}
	}
}
