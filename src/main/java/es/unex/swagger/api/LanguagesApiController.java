package es.unex.swagger.api;


import es.unex.swagger.model.Language;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-10-18T10:29:32.211856553Z[GMT]")
@RestController
public class LanguagesApiController implements LanguagesApi {

    private static final Logger log = LoggerFactory.getLogger(LanguagesApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public LanguagesApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Language> deleteLanguageById(@Parameter(in = ParameterIn.PATH, description = "El id del language que se desea buscar.", required=true, schema=@Schema()) @PathVariable("idLanguage") Integer idLanguage
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Language>(objectMapper.readValue("{\n  \"name\" : \"Spanish\",\n  \"id\" : 123456789\n}", Language.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Language>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Language>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Language>> getAllLanguages() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Language>>(objectMapper.readValue("[ {\n  \"name\" : \"Spanish\",\n  \"id\" : 123456789\n}, {\n  \"name\" : \"Spanish\",\n  \"id\" : 123456789\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Language>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Language>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Language> getLanguageById(@Parameter(in = ParameterIn.PATH, description = "El id del language que se desea buscar.", required=true, schema=@Schema()) @PathVariable("idLanguage") Integer idLanguage
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Language>(objectMapper.readValue("{\n  \"name\" : \"Spanish\",\n  \"id\" : 123456789\n}", Language.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Language>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Language>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Language> postLanguage(@Parameter(in = ParameterIn.DEFAULT, description = "Add a new kind of language in the database", required=true, schema=@Schema()) @Valid @RequestBody Language body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Language>(objectMapper.readValue("{\n  \"name\" : \"Spanish\",\n  \"id\" : 123456789\n}", Language.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Language>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Language>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Language> putLanguageById(@Parameter(in = ParameterIn.PATH, description = "El id del language que se desea buscar.", required=true, schema=@Schema()) @PathVariable("idLanguage") Integer idLanguage
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Language>(objectMapper.readValue("{\n  \"name\" : \"Spanish\",\n  \"id\" : 123456789\n}", Language.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Language>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Language>(HttpStatus.NOT_IMPLEMENTED);
    }

}
