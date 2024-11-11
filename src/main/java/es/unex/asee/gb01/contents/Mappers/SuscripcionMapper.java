package es.unex.asee.gb01.contents.Mappers;


import es.unex.asee.gb01.contents.Entities.SuscripcionEntity;
import es.unex.asee.gb01.contents.Mappers.TipoSuscripcionMapper;
import es.unex.swagger.model.Suscripcion;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;

public class SuscripcionMapper {

    private static final DateTimeFormatter DATE_FORMAT = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    /**
     * Convierte un SuscripcionEntity a un Suscripcion (API Model).
     */
    public static Suscripcion toModel(SuscripcionEntity entity) {
        if (entity == null) {
            return null;
        }

        Suscripcion suscripcion = new Suscripcion();
        suscripcion.setIdSuscripcion(entity.getIdSuscripcion());
        suscripcion.setIdUsuario(entity.getIdUsuario());
        suscripcion.setTipoSuscripcion(TipoSuscripcionMapper.toModel(entity.getTipoSuscripcion()));
        suscripcion.setFechaAlta(entity.getFechaAlta().format(DATE_FORMAT));
        suscripcion.setFechaBaja(entity.getFechaBaja() != null ? entity.getFechaBaja().format(DATE_FORMAT) : null);

        return suscripcion;
    }

    /**
     * Convierte un Suscripcion (API Model) a un SuscripcionEntity.
     */
    public static SuscripcionEntity toEntity(Suscripcion model) {
        if (model == null) {
            return null;
        }

        SuscripcionEntity entity = new SuscripcionEntity();
        entity.setIdSuscripcion(model.getIdSuscripcion());
        entity.setIdUsuario(model.getIdUsuario());
        entity.setTipoSuscripcion(TipoSuscripcionMapper.toEntity(model.getTipoSuscripcion()));
        entity.setFechaAlta(LocalDate.parse(model.getFechaAlta(), DATE_FORMAT));
        entity.setFechaBaja(model.getFechaBaja() != null ? LocalDate.parse(model.getFechaBaja(), DATE_FORMAT) : null);

        return entity;
    }

    /**
     * Convierte una lista de SuscripcionEntity a una lista de Suscripcion.
     */
    public static List<Suscripcion> toModelList(List<SuscripcionEntity> entities) {
        return entities.stream()
                .map(SuscripcionMapper::toModel)
                .collect(Collectors.toList());
    }

    /**
     * Convierte una lista de Suscripcion a una lista de SuscripcionEntity.
     */
    public static List<SuscripcionEntity> toEntityList(List<Suscripcion> models) {
        return models.stream()
                .map(SuscripcionMapper::toEntity)
                .collect(Collectors.toList());
    }
}

