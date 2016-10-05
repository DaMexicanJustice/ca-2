/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception.mapper;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import exception.error.CityNotFoundException;
import static exception.mapper.CompanyNotFoundMapper.gson;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;
import org.glassfish.jersey.internal.util.ExceptionUtils;

/**
 *
 * @author xboxm
 */
@Provider
public class CityNotFoundMapper implements ExceptionMapper<CityNotFoundException> {
    
    static Gson gson = new GsonBuilder().setPrettyPrinting().create();

    @Override
    public Response toResponse(CityNotFoundException exception) {
        com.google.gson.JsonObject job = new JsonObject();
        job.addProperty("status", 404);
        job.addProperty("msg", exception.getMessage());
        job.addProperty("stackTrace", ExceptionUtils.exceptionStackTraceAsString(exception));
        return Response.status(404).entity(gson.toJson(job)).build();
    }
    
}
