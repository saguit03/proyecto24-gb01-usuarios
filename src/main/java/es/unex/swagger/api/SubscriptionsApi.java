/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.62).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package es.unex.swagger.api;


import es.unex.swagger.model.Subscription;
import es.unex.swagger.model.SubscriptionType;
import es.unex.swagger.model.User;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.CookieValue;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-10-18T10:29:32.211856553Z[GMT]")
@Validated
public interface SubscriptionsApi {

    @Operation(summary = "Elimina TODAS las suscripción de la base de datos", description = "Elimina TODAS las suscripción de la base de datos", security = {
        @SecurityRequirement(name = "cookieAuth"),
@SecurityRequirement(name = "medifli_auth", scopes = {
            "write:users",
"read:users"        })    }, tags={ "subscription" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "204", description = "Operación exitosa."),
        
        @ApiResponse(responseCode = "400", description = "Valor no soportado"),
        
        @ApiResponse(responseCode = "404", description = "Suscripción no encontrada") })
    @RequestMapping(value = "/subscriptions",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteAllSubscriptions(@Parameter(in = ParameterIn.COOKIE, description = "" ,required=true,schema=@Schema()) @CookieValue(value="SessionUserCookie", required=true) User sessionUserCookie
);


    @Operation(summary = "Elimina la suscripción de un user, dando la id de la suscripción", description = "Elimina la suscripción de un user, dando la id de la suscripción.", security = {
        @SecurityRequirement(name = "cookieAuth"),
@SecurityRequirement(name = "medifli_auth", scopes = {
            "write:users",
"read:users"        })    }, tags={ "subscription" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "204", description = "Operación exitosa."),
        
        @ApiResponse(responseCode = "400", description = "Valor no soportado"),
        
        @ApiResponse(responseCode = "404", description = "Suscripción no encontrada") })
    @RequestMapping(value = "/subscriptions/{idSubscription}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteSubscriptionByIdSubscription(@Parameter(in = ParameterIn.PATH, description = "Id de la suscripción.", required=true, schema=@Schema()) @PathVariable("idSubscription") Long idSubscription
, @Parameter(in = ParameterIn.COOKIE, description = "" ,required=true,schema=@Schema()) @CookieValue(value="User", required=true) String sessionUserCookie
);


    @Operation(summary = "Devuelve todas las subscriptiones realizadas por todos users.", description = "Devuelve todas las subscriptiones realizadas por todos users.", security = {
        @SecurityRequirement(name = "cookieAuth"),
@SecurityRequirement(name = "medifli_auth", scopes = {
            "write:users",
"read:users"        })    }, tags={ "subscription" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Operación exitosa", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = Subscription.class)))),
        
        @ApiResponse(responseCode = "400", description = "Valor no soportado"),
        
        @ApiResponse(responseCode = "404", description = "Subscriptiones no encontradas") })
    @RequestMapping(value = "/subscriptions",
        produces = { "application/json", "application/xml" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Subscription>> getAllSubscriptions();


    @Operation(summary = "Añade una nueva suscripción a la base de datos.", description = "Añade una nueva suscripción a la base de datos, realizado por un user, en el que el id vendrá en el cuerpo de la petición o se cogerá de la cookie de la sesión.", security = {
        @SecurityRequirement(name = "cookieAuth"),
@SecurityRequirement(name = "medifli_auth", scopes = {
            "write:users",
"read:users"        })    }, tags={ "subscription" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "201", description = "Operación exitosa", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Subscription.class))),
        
        @ApiResponse(responseCode = "400", description = "Valor no soportado"),
        
        @ApiResponse(responseCode = "404", description = "Subscription no encontradas") })
    @RequestMapping(value = "/subscriptions",
        produces = { "application/json", "application/xml" }, 
        consumes = { "application/json", "application/xml", "application/x-www-form-urlencoded" }, 
        method = RequestMethod.POST)
    ResponseEntity<Subscription> postSubscriptionByUser(@Parameter(in = ParameterIn.COOKIE, description = "" ,required=true,schema=@Schema()) @CookieValue(value="User", required=true) String sessionUserCookie
, @Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody Subscription body
);


    @Operation(summary = "Actualiza la suscripción de un user, dando la id de la suscripción", description = "Actualiza la suscripción de un user, dando la id de la suscripción.", security = {
        @SecurityRequirement(name = "cookieAuth"),
@SecurityRequirement(name = "medifli_auth", scopes = {
            "write:users",
"read:users"        })    }, tags={ "subscription" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "201", description = "Operación exitosa.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Subscription.class))),
        
        @ApiResponse(responseCode = "400", description = "Valor no soportado"),
        
        @ApiResponse(responseCode = "404", description = "Suscripción no encontrada") })
    @RequestMapping(value = "/subscriptions/{idSubscription}",
        produces = { "application/json", "application/xml", "application/x-www-form-urlencoded" }, 
        consumes = { "application/json", "application/xml", "application/x-www-form-urlencoded" }, 
        method = RequestMethod.PUT)
    ResponseEntity<Subscription> updateSubscriptionByIdSubscription(@Parameter(in = ParameterIn.PATH, description = "Id de la suscripción.", required=true, schema=@Schema()) @PathVariable("idSubscription") Integer idSubscription
, @Parameter(in = ParameterIn.COOKIE, description = "" ,required=true,schema=@Schema()) @CookieValue(value="SessionUserCookie", required=true) User sessionUserCookie
, @Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody Subscription body
);

}

