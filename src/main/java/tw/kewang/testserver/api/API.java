package tw.kewang.testserver.api;

import com.google.gson.Gson;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

@Path("Username")
public class API {
    private static final Gson GSON = new Gson();

    @POST
    @Path("Add_User_Response")
    public Response addStudent(String body) {
        Add_User_Response add_user_response = new Add_User_Response();
        Username username = new Username();
        username = GSON.fromJson(body, Username.class);
        System.out.println(username.getName());
        add_user_response.setRsp_code(0);
        add_user_response.setRsp_msg("Success");

        return Response.ok().entity(GSON.toJson(add_user_response)).build();//entity回覆
    }

}
