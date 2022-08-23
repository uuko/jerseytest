package com.test.jersey;


import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;

@Path("/hello")
public class HelloWorld {
    //GET註解設置接受請求類型爲GET
    @GET
    //Produces表明發送出去的數據類型爲text/plain
    // 與Produces對應的是@Consumes，表示接受的數據類型爲text/plain
    @Produces("text/plain")
    public String getMessage() {
        return "Hello world!";
    }
}