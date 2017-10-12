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

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-10-12T08:47:39.419Z")

@Api(value = "vnftest", description = "the vnftest API")
public interface VnftestApi {

    @ApiOperation(value = "Inovke the jenkins vnf testing job", notes = "Inovke the jenkins vnf testing job", response = BaseResponse.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "jenkins job status", response = BaseResponse.class) })
    @RequestMapping(value = "/vnftest",
        method = RequestMethod.POST)
    ResponseEntity<BaseResponse> vnftestPost(@ApiParam(value = "Execution jenkins job id") @RequestParam(value = "uid", required = false) String uid);

}
