package es.unex.asee.gb01.contents.Mappers;

import es.unex.asee.gb01.contents.Entities.TarjetaCreditoEntity;
import es.unex.swagger.model.TarjetaCredito;

public class TarjetaCreditoMapper {
    public static TarjetaCreditoEntity toEntity (TarjetaCredito tarjetaCredito) {
        TarjetaCreditoEntity entity = new TarjetaCreditoEntity();
        
        entity.setIBAN(tarjetaCredito.getIBAN());
        entity.setBanco(tarjetaCredito.getBanco());
        entity.setCVC(tarjetaCredito.getCVC());
        entity.setIdUsuario(tarjetaCredito.getIdUsuario());
        return entity;
    }

    public static TarjetaCredito toModel(TarjetaCreditoEntity tarjetaCreditoEntity){
        TarjetaCredito model = new TarjetaCredito();
        model.setIBAN(tarjetaCreditoEntity.getIBAN());
        model.setBanco(tarjetaCreditoEntity.getBanco());
        model.setCVC(tarjetaCreditoEntity.getCVC());
        model.setIdUsuario(tarjetaCreditoEntity.getIdUsuario());
        return model;
    }

}
