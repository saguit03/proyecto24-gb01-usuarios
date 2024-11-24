// package es.unex.swagger.api;


// import es.unex.swagger.model.History;
// import es.unex.swagger.model.User;
// import com.fasterxml.jackson.databind.ObjectMapper;
// import io.swagger.v3.oas.annotations.Parameter;
// import io.swagger.v3.oas.annotations.enums.ParameterIn;
// import io.swagger.v3.oas.annotations.media.Schema;
// import org.slf4j.Logger;
// import org.slf4j.LoggerFactory;
// import org.springframework.http.HttpStatus;
// import org.springframework.http.ResponseEntity;
// import org.springframework.web.bind.annotation.RestController;
// import org.springframework.web.bind.annotation.CookieValue;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.RequestBody;

// import javax.validation.Valid;
// import javax.servlet.http.HttpServletRequest;
// import java.io.IOException;
// import java.util.List;

// @javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-10-18T10:29:32.211856553Z[GMT]")
// @RestController
// public class HistoryApiController implements HistoryApi {

//     private static final Logger log = LoggerFactory.getLogger(HistoryApiController.class);

//     private final ObjectMapper objectMapper;

//     private final HttpServletRequest request;

//     public HistoryApiController(ObjectMapper objectMapper, HttpServletRequest request) {
//         this.objectMapper = objectMapper;
//         this.request = request;
//     }

//     public ResponseEntity<History> deleteHistoryByIdVisualize(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("idVisualize") Integer idVisualize
// ,
// @Parameter(in = ParameterIn.COOKIE, description = "" ,required=true,schema=@Schema()) @CookieValue(value="SessionUserCookie", required=true) User sessionUserCookie) {
//         String accept = request.getHeader("Accept");
//         if (accept != null && accept.contains("application/json")) {
//             try {
//                 return new ResponseEntity<History>(objectMapper.readValue("{\n  \"idView\" : 6,\n  \"idUser\" : 0\n}", History.class), HttpStatus.NOT_IMPLEMENTED);
//             } catch (IOException e) {
//                 log.error("Couldn't serialize response for content type application/json", e);
//                 return new ResponseEntity<History>(HttpStatus.INTERNAL_SERVER_ERROR);
//             }
//         }

//         return new ResponseEntity<History>(HttpStatus.NOT_IMPLEMENTED);
//     }

//     public ResponseEntity<List<History>> getHistoryByidContent(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("idVisualize") Integer idVisualize
// ,
// @Parameter(in = ParameterIn.COOKIE, description = "" ,required=true,schema=@Schema()) @CookieValue(value="SessionUserCookie", required=true) User sessionUserCookie) {
//         String accept = request.getHeader("Accept");
//         if (accept != null && accept.contains("application/json")) {
//             try {
//                 return new ResponseEntity<List<History>>(objectMapper.readValue("[ {\n  \"idView\" : 6,\n  \"idUser\" : 0\n}, {\n  \"idView\" : 6,\n  \"idUser\" : 0\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
//             } catch (IOException e) {
//                 log.error("Couldn't serialize response for content type application/json", e);
//                 return new ResponseEntity<List<History>>(HttpStatus.INTERNAL_SERVER_ERROR);
//             }
//         }

//         return new ResponseEntity<List<History>>(HttpStatus.NOT_IMPLEMENTED);
//     }

//     public ResponseEntity<List<History>> getHistoryByUserCookie(
// @Parameter(in = ParameterIn.COOKIE, description = "" ,required=true,schema=@Schema()) @CookieValue(value="SessionUserCookie", required=true) User sessionUserCookie) {
//         String accept = request.getHeader("Accept");
//         if (accept != null && accept.contains("application/json")) {
//             try {
//                 return new ResponseEntity<List<History>>(objectMapper.readValue("[ {\n  \"idView\" : 6,\n  \"idUser\" : 0\n}, {\n  \"idView\" : 6,\n  \"idUser\" : 0\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
//             } catch (IOException e) {
//                 log.error("Couldn't serialize response for content type application/json", e);
//                 return new ResponseEntity<List<History>>(HttpStatus.INTERNAL_SERVER_ERROR);
//             }
//         }

//         return new ResponseEntity<List<History>>(HttpStatus.NOT_IMPLEMENTED);
//     }

//     public ResponseEntity<History> postHistoryContentByIdVisualize(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("idVisualize") Integer idVisualize
// ,
// @Parameter(in = ParameterIn.COOKIE, description = "" ,required=true,schema=@Schema()) @CookieValue(value="SessionUserCookie", required=true) User sessionUserCookie,@Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody History body
// ) {
//         String accept = request.getHeader("Accept");
//         if (accept != null && accept.contains("application/json")) {
//             try {
//                 return new ResponseEntity<History>(objectMapper.readValue("{\n  \"idView\" : 6,\n  \"idUser\" : 0\n}", History.class), HttpStatus.NOT_IMPLEMENTED);
//             } catch (IOException e) {
//                 log.error("Couldn't serialize response for content type application/json", e);
//                 return new ResponseEntity<History>(HttpStatus.INTERNAL_SERVER_ERROR);
//             }
//         }

//         return new ResponseEntity<History>(HttpStatus.NOT_IMPLEMENTED);
//     }

//     public ResponseEntity<History> postHistoryContentByUserCookie(
// @Parameter(in = ParameterIn.COOKIE, description = "" ,required=true,schema=@Schema()) @CookieValue(value="SessionUserCookie", required=true) User sessionUserCookie,@Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody History body
// ) {
//         String accept = request.getHeader("Accept");
//         if (accept != null && accept.contains("application/json")) {
//             try {
//                 return new ResponseEntity<History>(objectMapper.readValue("{\n  \"idView\" : 6,\n  \"idUser\" : 0\n}", History.class), HttpStatus.NOT_IMPLEMENTED);
//             } catch (IOException e) {
//                 log.error("Couldn't serialize response for content type application/json", e);
//                 return new ResponseEntity<History>(HttpStatus.INTERNAL_SERVER_ERROR);
//             }
//         }

//         return new ResponseEntity<History>(HttpStatus.NOT_IMPLEMENTED);
//     }

// }
