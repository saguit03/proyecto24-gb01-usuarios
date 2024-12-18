// package es.unex.swagger.api;


// import es.unex.swagger.model.CreditCard;
// import es.unex.swagger.model.User;
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
// public class CreditsCardApiController implements CreditsCardApi {

//     private static final Logger log = LoggerFactory.getLogger(CreditsCardApiController.class);

//     private final ObjectMapper objectMapper;

//     private final HttpServletRequest request;

//     @org.springframework.beans.factory.annotation.Autowired
//     public CreditsCardApiController(ObjectMapper objectMapper, HttpServletRequest request) {
//         this.objectMapper = objectMapper;
//         this.request = request;
//     }

//     public ResponseEntity<Void> addCreditCard(
// @Parameter(in = ParameterIn.COOKIE, description = "" ,required=true,schema=@Schema()) @CookieValue(value="SessionUserCookie", required=true) User sessionUserCookie,@Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody CreditCard body
// ) {
//         String accept = request.getHeader("Accept");
//         return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
//     }

//     public ResponseEntity<CreditCard> deleteCreditCardByIBAN(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("IBAN") String IBAN
// ) {
//         String accept = request.getHeader("Accept");
//         if (accept != null && accept.contains("application/json")) {
//             try {
//                 return new ResponseEntity<CreditCard>(objectMapper.readValue("{\n  \"CVC\" : \"123\",\n  \"IBAN\" : \"ES11111111111111111\",\n  \"Bank\" : \"Santander\",\n  \"idUser\" : 1\n}", CreditCard.class), HttpStatus.NOT_IMPLEMENTED);
//             } catch (IOException e) {
//                 log.error("Couldn't serialize response for content type application/json", e);
//                 return new ResponseEntity<CreditCard>(HttpStatus.INTERNAL_SERVER_ERROR);
//             }
//         }

//         return new ResponseEntity<CreditCard>(HttpStatus.NOT_IMPLEMENTED);
//     }

//     public ResponseEntity<CreditCard> getCreditCardByIBAN(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("IBAN") String IBAN
// ) {
//         String accept = request.getHeader("Accept");
//         if (accept != null && accept.contains("application/json")) {
//             try {
//                 return new ResponseEntity<CreditCard>(objectMapper.readValue("{\n  \"CVC\" : \"123\",\n  \"IBAN\" : \"ES11111111111111111\",\n  \"Bank\" : \"Santander\",\n  \"idUser\" : 1\n}", CreditCard.class), HttpStatus.NOT_IMPLEMENTED);
//             } catch (IOException e) {
//                 log.error("Couldn't serialize response for content type application/json", e);
//                 return new ResponseEntity<CreditCard>(HttpStatus.INTERNAL_SERVER_ERROR);
//             }
//         }

//         return new ResponseEntity<CreditCard>(HttpStatus.NOT_IMPLEMENTED);
//     }

//     public ResponseEntity<List<CreditCard>> getMyCreditsCard() {
//         String accept = request.getHeader("Accept");
//         if (accept != null && accept.contains("application/json")) {
//             try {
//                 return new ResponseEntity<List<CreditCard>>(objectMapper.readValue("[ {\n  \"CVC\" : \"123\",\n  \"IBAN\" : \"ES11111111111111111\",\n  \"Bank\" : \"Santander\",\n  \"idUser\" : 1\n}, {\n  \"CVC\" : \"123\",\n  \"IBAN\" : \"ES11111111111111111\",\n  \"Bank\" : \"Santander\",\n  \"idUser\" : 1\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
//             } catch (IOException e) {
//                 log.error("Couldn't serialize response for content type application/json", e);
//                 return new ResponseEntity<List<CreditCard>>(HttpStatus.INTERNAL_SERVER_ERROR);
//             }
//         }

//         return new ResponseEntity<List<CreditCard>>(HttpStatus.NOT_IMPLEMENTED);
//     }

//     public ResponseEntity<CreditCard> updateCreditCardByIBAN(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("IBAN") String IBAN
// ) {
//         String accept = request.getHeader("Accept");
//         if (accept != null && accept.contains("application/json")) {
//             try {
//                 return new ResponseEntity<CreditCard>(objectMapper.readValue("{\n  \"CVC\" : \"123\",\n  \"IBAN\" : \"ES11111111111111111\",\n  \"Bank\" : \"Santander\",\n  \"idUser\" : 1\n}", CreditCard.class), HttpStatus.NOT_IMPLEMENTED);
//             } catch (IOException e) {
//                 log.error("Couldn't serialize response for content type application/json", e);
//                 return new ResponseEntity<CreditCard>(HttpStatus.INTERNAL_SERVER_ERROR);
//             }
//         }

//         return new ResponseEntity<CreditCard>(HttpStatus.NOT_IMPLEMENTED);
//     }

// }
