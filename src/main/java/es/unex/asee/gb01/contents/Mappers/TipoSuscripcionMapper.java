package es.unex.asee.gb01.contents.Mappers;

import es.unex.asee.gb01.contents.Entities.TipoSuscripcionEntity;
import es.unex.swagger.model.TipoSuscripcion;
import java.util.List;
import java.util.stream.Collectors;

public class TipoSuscripcionMapper {

    /**
     * Convierte un TipoSuscripcionEntity a un TipoSuscripcion (API Model).
     */
    public static TipoSuscripcion toModel(TipoSuscripcionEntity entity) {
        if (entity == null) {
            return null;
        }

        TipoSuscripcion model = new TipoSuscripcion();
        model.setIdTipoSuscripcion(entity.getIdTipoSuscripcion());
        model.setNombreTipoSuscripcion(entity.getNombreTipoSuscripcion());
        model.setCantidad(entity.getCantidad());

        return model;
    }

    /**
     * Convierte un TipoSuscripcion (API Model) a un TipoSuscripcionEntity.
     */
    public static TipoSuscripcionEntity toEntity(TipoSuscripcion model) {
        if (model == null) {
            return null;
        }

        TipoSuscripcionEntity entity = new TipoSuscripcionEntity();
        entity.setIdTipoSuscripcion(model.getIdTipoSuscripcion());
        entity.setNombreTipoSuscripcion(model.getNombreTipoSuscripcion());
        entity.setCantidad(model.getCantidad());

        return entity;
    }

    /**
     * Convierte una lista de TipoSuscripcionEntity a una lista de TipoSuscripcion.
     */
    public static List<TipoSuscripcion> toModelList(List<TipoSuscripcionEntity> entities) {
        return entities.stream()
                .map(TipoSuscripcionMapper::toModel)
                .collect(Collectors.toList());
    }

    /**
     * Convierte una lista de TipoSuscripcion a una lista de TipoSuscripcionEntity.
     */
    public static List<TipoSuscripcionEntity> toEntityList(List<TipoSuscripcion> models) {
        return models.stream()
                .map(TipoSuscripcionMapper::toEntity)
                .collect(Collectors.toList());
    }
}
