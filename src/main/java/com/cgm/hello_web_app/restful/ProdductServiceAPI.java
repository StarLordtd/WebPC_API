package com.cgm.hello_web_app.restful;

import java.util.List;
import java.net.URI;
import java.net.URISyntaxException;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;

import javax.ws.rs.core.Response.ResponseBuilder;
import javax.ws.rs.core.Response;

import com.cgm.hello_web_app.dao.ProductDAO;
import com.cgm.hello_web_app.eitities.Product;
@Path("/products")
public class ProdductServiceAPI {	
	private final ProductDAO dao = new ProductDAO();
	//http://localhost:8080/HelloWebApp/rest/products
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Product> getProducts_JSON() {
		List<Product> list = null;
		ProductDAO productDAO = new ProductDAO();
		list = productDAO.getLatestProductList();
		return list;
	}
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response add(Product product) {
		int productId = dao.addProduct(product);
        return Response.created(URI.create("/products/" + productId)).build();
    }
	@GET
	@Path("{id}")
	public Response get(@PathParam("id")int id) {
		Product product = dao. getProductById(id);
		if(product != null) {
			return Response.ok(product,
					MediaType.APPLICATION_JSON).build();
		}else {
			return Response.status(Response.Status.NOT_FOUND).build();
		}	
	}
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("{id}")
	public Response update(@PathParam("id")int id,Product product)
	{
		product.setId(id);
		if(dao.updateProduct(product)) {
			return Response.ok().build();
		}else {
			return Response.notModified().build();
		}
	}
	@DELETE
	@Path("{id}")
	public Response delete(@PathParam("id")int id) {
		if(dao.deleteProduct(id)) {
			return Response.ok().build();
		}else {
			return Response.notModified().build();
		}
	}
}
 