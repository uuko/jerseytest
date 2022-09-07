package com.test.jersey;




import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


public class HelloWorld {
    @GET  @Path("/")
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        return "working...";
    }
    //GET註解設置接受請求類型爲GET

    @GET
    @Path("/hello")
    //Produces表明發送出去的數據類型爲text/plain
    // 與Produces對應的是@Consumes，表示接受的數據類型爲text/plain
    @Produces("text/plain")
    public String getMessage() {
        return "Hello world!";
    }
}