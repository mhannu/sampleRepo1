package $package;

import io.swagger.annotations.ApiParam;

/*@Author Manoja Ku Sahu
 * 
 * This class is sample Spring boot Rest controller.Replace this class with your logic.
 * */

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.Authorization;
import io.swagger.annotations.AuthorizationScope;

@RestController
@RequestMapping("/api")
public class HelloController {

    private static final String template = "Hello, %s!";
    
    @ApiOperation(value = "Prints project name", notes = "Prints project name", response = Object.class,authorizations = {
	        @Authorization(value = "project_auth", scopes = {
	            @AuthorizationScope(scope = "write:name", description = "name"),
	            @AuthorizationScope(scope = "read:name", description = "name")
	            })
	    }, tags={ "name", })
	@ApiResponses(value = { 
	        @ApiResponse(code = 200, message = "successful operation", response = Object.class),
	        @ApiResponse(code = 400, message = "Invalid status value", response = Object.class) })
    
    @RequestMapping(value = "/project/{name}", method = RequestMethod.GET)
    public @ResponseBody String sayHello(@RequestParam(value="name", required=false, defaultValue="Matrix") String name) {
        return String.format(template, name);
    }

}
