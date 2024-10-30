package es.unex.swagger.api;


//import io.swagger.model.ComponentssecuritySchemescookieAuth;
import es.unex.swagger.model.Language;
import es.unex.swagger.model.PerfilUsuario;
import es.unex.swagger.model.Suscripcion;
import es.unex.swagger.model.TarjetaCredito;
import es.unex.swagger.model.TipoSuscripcion;
import es.unex.swagger.model.User;
import es.unex.swagger.model.UserLogIn;
import es.unex.asee.gb01.contents.Entities.UserEntity;
import es.unex.asee.gb01.contents.Mappers.UserMapper;
import es.unex.asee.gb01.contents.repositories.UserRepository;

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
import org.springframework.http.ResponseCookie;
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
import org.springframework.http.HttpHeaders;

import javax.validation.Valid;
import javax.validation.constraints.*;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
// import java.net.http.HttpHeaders;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-10-18T10:29:32.211856553Z[GMT]")
@RestController
public class UsersApiController implements UsersApi {
    

    private static final Logger log = LoggerFactory.getLogger(UsersApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;
    @Autowired UserRepository userRepository;

    @org.springframework.beans.factory.annotation.Autowired
    public UsersApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> deleteSubscriptionByUserCookie(
@Parameter(in = ParameterIn.COOKIE, description = "" ,required=true,schema=@Schema()) @CookieValue(value="SessionUserCookie", required=true) User sessionUserCookie) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<User> deleteUserById(@Parameter(in = ParameterIn.PATH, description = "El id del usuario que se desea buscar.", required=true, schema=@Schema()) @PathVariable("idUser") Integer idUser
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                UserEntity user = userRepository.findById(idUser.longValue()).orElse(null);
                ResponseEntity<User> respuesta = new ResponseEntity<User>(UserMapper.toModel(user) ,HttpStatus.ACCEPTED);
                userRepository.deleteById(idUser.longValue());

                return respuesta;
            } catch (Exception e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<User>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
        return new ResponseEntity<User>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<User>> getAllUsers() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<User>>(UserMapper.toListModel(userRepository.findAll()), HttpStatus.ACCEPTED);
            } catch (Exception e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<User>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<User>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Suscripcion> getSubscriptionByUserCookie(@Parameter(in = ParameterIn.COOKIE, description = "" ,required=true,schema=@Schema()) @CookieValue(value="SessionUserCookie", required=true) User sessionUserCookie) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Suscripcion>(objectMapper.readValue("{\n  \"id-suscripcion\" : 1,\n  \"tipo-suscripcion\" : {\n    \"Cantidad\" : 6.0274563,\n    \"id-tipo-suscripcion\" : 0,\n    \"Nombre-tipo-suscripcion\" : \"Nombre-tipo-suscripcion\"\n  },\n  \"Fecha-alta\" : \"08/10/2022\",\n  \"id-usuario\" : 0,\n  \"Fecha-baja\" : \"08/10/2024\"\n}", Suscripcion.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Suscripcion>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Suscripcion>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<User> getUserById(@Parameter(in = ParameterIn.PATH, description = "El id del usuario que se desea buscar.", required=true, schema=@Schema()) @PathVariable("idUser") Integer idUser
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<User>(UserMapper.toModel(userRepository.findById(idUser.longValue()).orElse(null)), HttpStatus.ACCEPTED);
            } catch (Exception e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<User>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<User>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<User> postUser(@Parameter(in = ParameterIn.DEFAULT, description = "Add a new user in the database", required=true, schema=@Schema()) @Valid @RequestBody User body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {

                userRepository.save(UserMapper.toEntity(body));
                return new ResponseEntity<User>(body, HttpStatus.CREATED);
            } catch (Exception e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<User>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<User>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<User> putUserById(@Parameter(in = ParameterIn.PATH, description = "El id del usuario que se desea buscar.", required=true, schema=@Schema()) @PathVariable("idUser") Integer idUser, @Valid @RequestBody User body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                userRepository.deleteById(body.getId().longValue());
                userRepository.save(UserMapper.toEntity(body));
                return new ResponseEntity<User>(body, HttpStatus.ACCEPTED);
            } catch (Exception e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<User>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<User>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Suscripcion> updateSubscriptionByUserCookie(
@Parameter(in = ParameterIn.COOKIE, description = "" ,required=true,schema=@Schema()) @CookieValue(value="SessionUserCookie", required=true) User sessionUserCookie,@Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody Suscripcion body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Suscripcion>(objectMapper.readValue("{\n  \"id-suscripcion\" : 1,\n  \"tipo-suscripcion\" : {\n    \"Cantidad\" : 6.0274563,\n    \"id-tipo-suscripcion\" : 0,\n    \"Nombre-tipo-suscripcion\" : \"Nombre-tipo-suscripcion\"\n  },\n  \"Fecha-alta\" : \"08/10/2022\",\n  \"id-usuario\" : 0,\n  \"Fecha-baja\" : \"08/10/2024\"\n}", Suscripcion.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Suscripcion>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Suscripcion>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<User> userLogIn(@Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody UserLogIn body, HttpServletResponse response
) {
        String accept = request.getHeader("Accept");
        
        // if (accept != null && accept.contains("application/json")) {
            try {
                User user = null;
                if(userRepository.findByUsername(body.getUsername()) != null){

                     user = UserMapper.toModel(userRepository.findByUsername(body.getUsername()));
                     if(user.getPassword() != body.getPassword().trim()){
                        log.error("La contraseña es incorrecta");
                        return new ResponseEntity<User>(HttpStatus.NO_CONTENT);
                     }
                }else{
                    log.error("El usuario no existe");
                    return new ResponseEntity<>(HttpStatus.NO_CONTENT);
                }
                

                Cookie cookieUser = new Cookie("User", user.toString());
                // cookieUser.setPath("/");
                // response.addCookie(cookieUser);
                
                return new ResponseEntity<User>(user, HttpStatus.ACCEPTED);
            } catch (Exception e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<User>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        // }

        // return new ResponseEntity<User>(HttpStatus.NOT_IMPLEMENTED);
    }

//     public ResponseEntity<Void> usersLogoutGet(
// @Parameter(in = ParameterIn.COOKIE, description = "" ,required=true,schema=@Schema()) @CookieValue(value="SessionCookie", required=true) ComponentssecuritySchemescookieAuth sessionCookie) {
//         String accept = request.getHeader("Accept");
//         return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
//     }

}
