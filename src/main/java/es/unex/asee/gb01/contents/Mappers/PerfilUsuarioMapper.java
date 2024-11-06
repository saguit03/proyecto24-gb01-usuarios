package es.unex.asee.gb01.contents.Mappers;

import java.util.ArrayList;
import java.util.List;

import es.unex.asee.gb01.contents.Entities.PerfilUsuarioEntity;
import es.unex.swagger.model.PerfilUsuario;

public class PerfilUsuarioMapper {
    public static PerfilUsuarioEntity toEntity (PerfilUsuario perfil){
        PerfilUsuarioEntity entity = new PerfilUsuarioEntity();
        entity.setIdPerfil(perfil.getIdPerfil());
        entity.setIdUsuario(perfil.getIdUsuario());
        entity.setNombrePerfil(perfil.getNombrePerfil());
        entity.setPin(perfil.getPin());
        System.out.println("Perfil usuario: "+ entity);
        return entity;
    }

    public static List<PerfilUsuarioEntity> toListEntity(List<PerfilUsuario> listaPerfiles){
        List<PerfilUsuarioEntity> lista = new ArrayList<>();
        for (int i = 0; i < listaPerfiles.size(); i++) {
            lista.add(PerfilUsuarioMapper.toEntity(listaPerfiles.get(i)));
        }
        return lista;
    }
    public static PerfilUsuario toModel (PerfilUsuarioEntity perfilEntity) {
        PerfilUsuario model = new PerfilUsuario();
        model.setIdPerfil(perfilEntity.getIdPerfil());
        model.setIdUsuario(perfilEntity.getIdUsuario());
        model.setNombrePerfil(perfilEntity.getNombrePerfil());
        model.setPin(perfilEntity.getPin());
        return model;
    }

    public static List<PerfilUsuario> toListModel(List<PerfilUsuarioEntity> listaPerfiles){
        List<PerfilUsuario> lista = new ArrayList<>();
        for (int i = 0; i < listaPerfiles.size(); i++) {
            lista.add(PerfilUsuarioMapper.toModel(listaPerfiles.get(i)));
        }
        return lista;
    }
}
