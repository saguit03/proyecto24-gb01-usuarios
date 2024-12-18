// package io.swagger.api;

// import io.swagger.model.HttpsappSwaggerhubComapisdmocinhamedifliContent100swaggerYamlcomponentsschemasMoviepropertiesid;
// import io.swagger.model.ListaContent;
// import io.swagger.model.User;
// import com.fasterxml.jackson.databind.ObjectMapper;
// import io.swagger.v3.oas.annotations.Operation;
// import io.swagger.v3.oas.annotations.Parameter;
// import io.swagger.v3.oas.annotations.enums.ParameterIn;
// import io.swagger.v3.oas.annotations.responses.ApiResponses;
// import io.swagger.v3.oas.annotations.responses.ApiResponse;
// import io.swagger.v3.oas.annotations.media.ArraySchema;
// import io.swagger.v3.oas.annotations.media.Content;
// import io.swagger.v3.oas.annotations.media.Schema;
// import io.swagger.v3.oas.annotations.security.SecurityRequirement;
// import org.slf4j.Logger;
// import org.slf4j.LoggerFactory;
// import org.springframework.http.HttpStatus;
// import org.springframework.http.ResponseEntity;
// import org.springframework.web.bind.annotation.RestController;
// import org.springframework.web.bind.annotation.CookieValue;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RequestHeader;
// import org.springframework.web.bind.annotation.RequestParam;
// import org.springframework.web.bind.annotation.RequestPart;
// import org.springframework.web.bind.annotation.RestController;
// import org.springframework.web.multipart.MultipartFile;

// import javax.validation.Valid;
// import javax.validation.constraints.*;
// import javax.servlet.http.HttpServletRequest;
// import java.io.IOException;
// import java.util.List;
// import java.util.Map;

// @javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-10-18T10:29:32.211856553Z[GMT]")
// @RestController
// public class ListsApiController implements ListsApi {

//     private static final Logger log = LoggerFactory.getLogger(ListsApiController.class);

//     private final ObjectMapper objectMapper;

//     private final HttpServletRequest request;

//     @org.springframework.beans.factory.annotation.Autowired
//     public ListsApiController(ObjectMapper objectMapper, HttpServletRequest request) {
//         this.objectMapper = objectMapper;
//         this.request = request;
//     }

//     public ResponseEntity<Void> deleteContentByidContent(
// @Parameter(in = ParameterIn.COOKIE, description = "" ,required=true,schema=@Schema()) @CookieValue(value="SessionUserCookie", required=true) User sessionUserCookie,@Parameter(in = ParameterIn.PATH, description = "Id de la lista de content a la que se quiere acceder", required=true, schema=@Schema()) @PathVariable("idList") Long idList
// ,@Parameter(in = ParameterIn.PATH, description = "Id del content en la lista que se desea eliminar.", required=true, schema=@Schema()) @PathVariable("idContent") Long idContent
// ) {
//         String accept = request.getHeader("Accept");
//         return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
//     }

//     public ResponseEntity<ListaContent> deleteListById(
// @Parameter(in = ParameterIn.COOKIE, description = "" ,required=true,schema=@Schema()) @CookieValue(value="SessionUserCookie", required=true) User sessionUserCookie,@Parameter(in = ParameterIn.PATH, description = "Id de la lista que se quiere conseguir la información.", required=true, schema=@Schema()) @PathVariable("idList") Long idList
// ) {
//         String accept = request.getHeader("Accept");
//         if (accept != null && accept.contains("application/json")) {
//             try {
//                 return new ResponseEntity<ListaContent>(objectMapper.readValue("{\n  \"Name-lista\" : \"Mis favorites\",\n  \"contents\" : [ \"{}\", \"{}\" ],\n  \"idUser\" : 1,\n  \"id-lista\" : 1\n}", ListaContent.class), HttpStatus.NOT_IMPLEMENTED);
//             } catch (IOException e) {
//                 log.error("Couldn't serialize response for content type application/json", e);
//                 return new ResponseEntity<ListaContent>(HttpStatus.INTERNAL_SERVER_ERROR);
//             }
//         }

//         return new ResponseEntity<ListaContent>(HttpStatus.NOT_IMPLEMENTED);
//     }

//     public ResponseEntity<Void> getContentsByidContent(@Parameter(in = ParameterIn.PATH, description = "Id de la lista que se quiere conseguir la información.", required=true, schema=@Schema()) @PathVariable("idList") Long idList
// ,@Parameter(in = ParameterIn.PATH, description = "Id del content en la lista que se desea eliminar.", required=true, schema=@Schema()) @PathVariable("idContent") Long idContent
// ) {
//         String accept = request.getHeader("Accept");
//         return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
//     }

//     public ResponseEntity<List<HttpsappSwaggerhubComapisdmocinhamedifliContent100swaggerYamlcomponentsschemasMoviepropertiesid>> getContentsByidList(
// @Parameter(in = ParameterIn.COOKIE, description = "" ,required=true,schema=@Schema()) @CookieValue(value="SessionUserCookie", required=true) User sessionUserCookie,@Parameter(in = ParameterIn.PATH, description = "Id de la lista que se quiere conseguir la información.", required=true, schema=@Schema()) @PathVariable("idList") Long idList
// ) {
//         String accept = request.getHeader("Accept");
//         if (accept != null && accept.contains("application/json")) {
//             try {
//                 return new ResponseEntity<List<HttpsappSwaggerhubComapisdmocinhamedifliContent100swaggerYamlcomponentsschemasMoviepropertiesid>>(objectMapper.readValue("[ \"{}\", \"{}\" ]", List.class), HttpStatus.NOT_IMPLEMENTED);
//             } catch (IOException e) {
//                 log.error("Couldn't serialize response for content type application/json", e);
//                 return new ResponseEntity<List<HttpsappSwaggerhubComapisdmocinhamedifliContent100swaggerYamlcomponentsschemasMoviepropertiesid>>(HttpStatus.INTERNAL_SERVER_ERROR);
//             }
//         }

//         return new ResponseEntity<List<HttpsappSwaggerhubComapisdmocinhamedifliContent100swaggerYamlcomponentsschemasMoviepropertiesid>>(HttpStatus.NOT_IMPLEMENTED);
//     }

//     public ResponseEntity<ListaContent> getListById(
// @Parameter(in = ParameterIn.COOKIE, description = "" ,required=true,schema=@Schema()) @CookieValue(value="SessionUserCookie", required=true) User sessionUserCookie,@Parameter(in = ParameterIn.PATH, description = "Id de la lista que se quiere conseguir la información.", required=true, schema=@Schema()) @PathVariable("idList") Long idList
// ) {
//         String accept = request.getHeader("Accept");
//         if (accept != null && accept.contains("application/json")) {
//             try {
//                 return new ResponseEntity<ListaContent>(objectMapper.readValue("{\n  \"Name-lista\" : \"Mis favorites\",\n  \"contents\" : [ \"{}\", \"{}\" ],\n  \"idUser\" : 1,\n  \"id-lista\" : 1\n}", ListaContent.class), HttpStatus.NOT_IMPLEMENTED);
//             } catch (IOException e) {
//                 log.error("Couldn't serialize response for content type application/json", e);
//                 return new ResponseEntity<ListaContent>(HttpStatus.INTERNAL_SERVER_ERROR);
//             }
//         }

//         return new ResponseEntity<ListaContent>(HttpStatus.NOT_IMPLEMENTED);
//     }

//     public ResponseEntity<List<ListaContent>> getLists() {
//         String accept = request.getHeader("Accept");
//         if (accept != null && accept.contains("application/json")) {
//             try {
//                 return new ResponseEntity<List<ListaContent>>(objectMapper.readValue("[ {\n  \"Name-lista\" : \"Mis favorites\",\n  \"contents\" : [ \"{}\", \"{}\" ],\n  \"idUser\" : 1,\n  \"id-lista\" : 1\n}, {\n  \"Name-lista\" : \"Mis favorites\",\n  \"contents\" : [ \"{}\", \"{}\" ],\n  \"idUser\" : 1,\n  \"id-lista\" : 1\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
//             } catch (IOException e) {
//                 log.error("Couldn't serialize response for content type application/json", e);
//                 return new ResponseEntity<List<ListaContent>>(HttpStatus.INTERNAL_SERVER_ERROR);
//             }
//         }

//         return new ResponseEntity<List<ListaContent>>(HttpStatus.NOT_IMPLEMENTED);
//     }

//     public ResponseEntity<Void> postContentByidList(
// @Parameter(in = ParameterIn.COOKIE, description = "" ,required=true,schema=@Schema()) @CookieValue(value="SessionUserCookie", required=true) User sessionUserCookie,@Parameter(in = ParameterIn.PATH, description = "Id de la lista de content a la que se quiere acceder", required=true, schema=@Schema()) @PathVariable("idList") Long idList
// ) {
//         String accept = request.getHeader("Accept");
//         return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
//     }

//     public ResponseEntity<List<ListaContent>> postList(@Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody ListaContent body
// ) {
//         String accept = request.getHeader("Accept");
//         if (accept != null && accept.contains("application/json")) {
//             try {
//                 return new ResponseEntity<List<ListaContent>>(objectMapper.readValue("[ {\n  \"Name-lista\" : \"Mis favorites\",\n  \"contents\" : [ \"{}\", \"{}\" ],\n  \"idUser\" : 1,\n  \"id-lista\" : 1\n}, {\n  \"Name-lista\" : \"Mis favorites\",\n  \"contents\" : [ \"{}\", \"{}\" ],\n  \"idUser\" : 1,\n  \"id-lista\" : 1\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
//             } catch (IOException e) {
//                 log.error("Couldn't serialize response for content type application/json", e);
//                 return new ResponseEntity<List<ListaContent>>(HttpStatus.INTERNAL_SERVER_ERROR);
//             }
//         }

//         return new ResponseEntity<List<ListaContent>>(HttpStatus.NOT_IMPLEMENTED);
//     }

//     public ResponseEntity<Void> updateContentByidList(
// @Parameter(in = ParameterIn.COOKIE, description = "" ,required=true,schema=@Schema()) @CookieValue(value="SessionUserCookie", required=true) User sessionUserCookie,@Parameter(in = ParameterIn.PATH, description = "Id de la lista de content a la que se quiere acceder", required=true, schema=@Schema()) @PathVariable("idList") Long idList
// ) {
//         String accept = request.getHeader("Accept");
//         return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
//     }

// }
