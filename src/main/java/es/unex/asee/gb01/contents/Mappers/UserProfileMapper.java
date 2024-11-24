package es.unex.asee.gb01.contents.mappers;

import es.unex.asee.gb01.contents.entities.UserProfileEntity;
import es.unex.swagger.model.UserProfile;
import org.springframework.stereotype.Component;

@Component
public class UserProfileMapper {
    public static UserProfileEntity toEntity (UserProfile profile){
        UserProfileEntity entity = new UserProfileEntity();
        entity.setIdProfile(profile.getIdProfile());
        entity.setidUser(profile.getidUser());
        entity.setProfileName(profile.getProfileName());
        entity.setPin(profile.getPin());
        return entity;
    }
    public static UserProfile toModel (UserProfileEntity profileEntity) {
        UserProfile model = new UserProfile(); 
        model.setIdProfile(profileEntity.getIdProfile());
        model.setidUser(profileEntity.getidUser());
        model.setProfileName(profileEntity.getProfileName());
        model.setPin(profileEntity.getPin());
        return model;
    }
}
