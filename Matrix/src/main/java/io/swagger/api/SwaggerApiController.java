package io.swagger.api;

import io.swagger.model.Pet;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-10-12T09:09:42.985Z")

@Controller
public class SwaggerApiController implements SwaggerApi {

    public ResponseEntity<List<Pet>> swaggerGet() {
        // do some magic!
        return new ResponseEntity<List<Pet>>(HttpStatus.OK);
    }

}