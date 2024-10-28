package es.unex.asee.gb01.contents.Mappers;

import es.unex.asee.gb01.contents.Entities.LanguageEntity;
import es.unex.swagger.model.Language;

public class LanguageMapper {

    public static LanguageEntity toEntity(Language language) {

        return new LanguageEntity(language.getId(),language.getName());
        
    }
    public static Language toModel(LanguageEntity languageEntity){
        Language model = new Language();
        model.setId(languageEntity.getId());
        model.setName(languageEntity.getName());
        return model;
    }

}
