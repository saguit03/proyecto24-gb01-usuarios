package es.unex.swagger.api;


import es.unex.swagger.model.UserProfile;
import es.unex.asee.gb01.contents.entities.UserEntity;
import es.unex.asee.gb01.contents.entities.UserProfileEntity;
import es.unex.asee.gb01.contents.mappers.UserMapper;
import es.unex.asee.gb01.contents.mappers.UserProfileMapper;
import es.unex.asee.gb01.contents.repositories.UserProfileRepository;
import es.unex.swagger.model.User;
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
import org.springframework.beans.factory.annotation.Autowired;
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
public class ProfilesApiController implements ProfilesApi {

    @Autowired
    private UserProfileMapper userProfileMapper;

    private static final Logger log = LoggerFactory.getLogger(ProfilesApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @Autowired
    private UserProfileRepository userProfileRepository;

    @org.springframework.beans.factory.annotation.Autowired
    public ProfilesApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<UserProfile> deleteUserProfileById(@Parameter(in = ParameterIn.PATH, description = "El id del profile de user que se desea eliminar.", required=true, schema=@Schema()) @PathVariable("idProfile") Long idProfile
,
@Parameter(in = ParameterIn.COOKIE, description = "" ,required=true,schema=@Schema()) @CookieValue(value="SessionUserCookie", required=true) User sessionUserCookie) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                UserProfileEntity userProfile = userProfileRepository.findById(idProfile.longValue()).orElse(null);
                ResponseEntity<UserProfile> respuesta = new ResponseEntity<UserProfile>(UserProfileMapper.toModel(userProfile) ,HttpStatus.OK);
                userProfileRepository.deleteById(idProfile.longValue());

                return respuesta;
            } catch (Exception e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<UserProfile>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
        return new ResponseEntity<UserProfile>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<UserProfile>> getAllUserProfileById(
@Parameter(in = ParameterIn.COOKIE, description = "" ,required=true,schema=@Schema()) @CookieValue(value="SessionUserCookie", required=true) User sessionUserCookie) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<UserProfile>>(objectMapper.readValue("[ {\n  \"Pin\" : \"1234\",\n  \"idUser\" : 1,\n  \"id-profile\" : 1,\n  \"profileName\" : \"Pablito\"\n}, {\n  \"Pin\" : \"1234\",\n  \"idUser\" : 1,\n  \"id-profile\" : 1,\n  \"profileName\" : \"Pablito\"\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<UserProfile>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<UserProfile>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<UserProfile> getUserProfileById(@Parameter(in = ParameterIn.PATH, description = "El id del profile de user que se desea buscar.", required=true, schema=@Schema()) @PathVariable("idProfile") Long idProfile
        , @Parameter(in = ParameterIn.COOKIE, description = "" ,required=true,schema=@Schema()) @CookieValue(value="SessionUserCookie", required=true) User sessionUserCookie) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<UserProfile>(UserProfileMapper.toModel(userProfileRepository.findById(idProfile.longValue()).orElse(null)), HttpStatus.OK);
            } catch (Exception e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<UserProfile>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
        return new ResponseEntity<UserProfile>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<UserProfile> postUserProfile(@Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody UserProfile body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                userProfileRepository.save(UserProfileMapper.toEntity(body));
                return new ResponseEntity<UserProfile>(body, HttpStatus.CREATED);
            } catch (Exception e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<UserProfile>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<UserProfile>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<UserProfile> putUserProfileById(@Parameter(in = ParameterIn.PATH, description = "El id del profile de user que se desea eliminar.", required=true, schema=@Schema()) @PathVariable("idProfile") Long idProfile
,
@Parameter(in = ParameterIn.COOKIE, description = "" ,required=true,schema=@Schema()) @CookieValue(value="SessionUserCookie", required=true) User sessionUserCookie,@Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody UserProfile body
) {
    String accept = request.getHeader("Accept");
    if (accept != null && accept.contains("application/json")) {
        try {
            userProfileRepository.deleteById(body.getIdProfile().longValue());
            userProfileRepository.save(UserProfileMapper.toEntity(body));
            return new ResponseEntity<UserProfile>(body, HttpStatus.OK);
        } catch (Exception e) {
            log.error("Couldn't serialize response for content type application/json", e);
            return new ResponseEntity<UserProfile>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    return new ResponseEntity<UserProfile>(HttpStatus.NOT_IMPLEMENTED);
    }

}
