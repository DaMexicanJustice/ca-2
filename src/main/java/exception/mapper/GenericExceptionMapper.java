/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception.mapper;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import exception.error.GenericException;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;

/**
 *
 * @author xboxm
 */
public class GenericExceptionMapper implements ExceptionMapper<GenericException> {
    
    static Gson gson = new GsonBuilder().setPrettyPrinting().create();

    @Override
    public Response toResponse(GenericException exception) {
        JsonObject job = new JsonObject();
        job.addProperty("status", 500);
        job.addProperty("msg", "The requested service does not exist");
        return Response.status(500).entity(gson.toJson(job)).build();
    }
    
}
