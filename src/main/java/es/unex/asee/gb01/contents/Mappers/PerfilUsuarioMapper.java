package es.unex.asee.gb01.contents.Mappers;

import es.unex.asee.gb01.contents.Entities.PerfilUsuarioEntity;
import es.unex.swagger.model.PerfilUsuario;

public class PerfilUsuarioMapper {
    public static PerfilUsuarioEntity toEntity (PerfilUsuario perfil){
        PerfilUsuarioEntity entity = new PerfilUsuarioEntity();
        entity.setIdPerfil(perfil.getIdPerfil());
        entity.setIdUsuario(perfil.getIdUsuario());
        entity.setNombrePerfil(perfil.getNombrePerfil());
        entity.setPin(perfil.getPin());
        return entity;
    }
    public static PerfilUsuario toModel (PerfilUsuarioEntity perfilEntity) {
        PerfilUsuario model = new PerfilUsuario(); 
        model.setIdPerfil(perfilEntity.getIdPerfil());
        model.setIdUsuario(perfilEntity.getIdUsuario());
        model.setNombrePerfil(perfilEntity.getNombrePerfil());
        model.setPin(perfilEntity.getPin());
        return model;
    }
}
