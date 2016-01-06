package rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import object.Product;

@Path("/json/product")
public class JsonService {

	@GET
	@Path("/get")
	@Produces("application/json")
	public Product getProductInJSON() {

		Product product = new Product();
		product.setName("iPasd 3");
		product.setQty(999);
		
		return product; 

	}

	@POST
	@Path("/postJson")
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public Product createProductInJSON(Product product) {

		String result = "Product created : " + product;
		return /*Response.status(201).entity(product).build()*/product;
		
	}
	
	@POST
	@Path("/postString")
	@Consumes({MediaType.APPLICATION_JSON})
	public Response createProductInStringJSON(Product product) {

		String result = "Product created : " + product;
		return Response.status(201).entity(result).build();
		
	}
	
}