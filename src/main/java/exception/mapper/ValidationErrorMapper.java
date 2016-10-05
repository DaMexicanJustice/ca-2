/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception.mapper;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import exception.error.ValidationErrorException;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import org.glassfish.jersey.internal.util.ExceptionUtils;

/**
 *
 * @author xboxm
 */
public class ValidationErrorMapper implements ExceptionMapper<ValidationErrorException> {
    
    static Gson gson = new GsonBuilder().setPrettyPrinting().create();

    @Override
    public Response toResponse(ValidationErrorException exception) {
        com.google.gson.JsonObject job = new JsonObject();
        job.addProperty("status", 400);
        job.addProperty("msg", exception.getMessage());
        job.addProperty("stackTrace", ExceptionUtils.exceptionStackTraceAsString(exception));
        return Response.status(400).entity(gson.toJson(job)).build();
    }
    
}
