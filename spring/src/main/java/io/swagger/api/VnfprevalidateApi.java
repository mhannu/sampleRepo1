package io.swagger.api;

import io.swagger.model.BaseResponse;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-10-12T08:46:27.641Z")

@Api(value = "vnfprevalidate", description = "the vnfprevalidate API")
public interface VnfprevalidateApi {

    @ApiOperation(value = "Does the prevalidation for VNF", notes = "Does the prevalidation for VNF", response = BaseResponse.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "VNF Prevalidation status", response = BaseResponse.class) })
    @RequestMapping(value = "/vnfprevalidate",
        produces = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<BaseResponse> vnfprevalidatePost(@ApiParam(value = "Execution jenkins job id", required = true) @RequestParam(value = "uid", required = true) String uid);

}
