package es.unex.asee.gb01.contents.Mappers;

import es.unex.swagger.model.User;
import es.unex.swagger.model.UserLogIn;
import es.unex.swagger.model.PerfilUsuario;
import es.unex.asee.gb01.contents.Entities.UserEntity;

import es.unex.asee.gb01.contents.Entities.PerfilUsuarioEntity;
import es.unex.asee.gb01.contents.Entities.TarjetaCreditoEntity;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class UserMapper {

    // Convertir de modelo REST a entidad JPA
    public static UserEntity toEntity(User userModel) {
        if (userModel == null) return null;

        UserEntity userEntity = new UserEntity(
                userModel.getNombre(),
                userModel.getApellidos(),
                userModel.getUsername(),
                userModel.getEmail(),
                userModel.getPassword()
        );

        userEntity.setId(userModel.getId());
        userEntity.setFechaAltaReciente(userModel.getFechaAltaReciente());
        userEntity.setFotoPerfil(userModel.getFotoPerfil());
        userEntity.setFechaRegistro(userModel.getFechaRegistro());

        // Convertir perfiles de usuario
        if (userModel.getPerfilesUsuario() != null) {
            List<PerfilUsuarioEntity> lista = PerfilUsuarioMapper.toListEntity(userModel.getPerfilesUsuario());
            userEntity.setPerfilesUsuario(lista);
        }

        // Convertir tarjetas de crédito
        if (userModel.getTarjetasDeCredito() != null) {
            // userEntity.setTarjetasDeCredito(
            //     userModel.getTarjetasDeCredito().stream()
            //     .map(TarjetaCreditoMapper::toEntity)
            //     .collect(Collectors.toList())
            // );
            List<TarjetaCreditoEntity> lista = new ArrayList<>();
            for (int i = 0; i < userModel.getTarjetasDeCredito().size(); i++) {
                lista.add(TarjetaCreditoMapper.toEntity(userModel.getTarjetasDeCredito().get(i)));
            }
            userEntity.setTarjetasDeCredito(lista);
        }

        // Convertir idioma
        if (userModel.getIdioma() != null) {
            userEntity.setIdioma(LanguageMapper.toEntity(userModel.getIdioma()));
        }

        return userEntity;
    }

    // Convertir de entidad JPA a modelo REST
    public static User toModel(UserEntity userEntity) {
        if (userEntity == null) return null;

        User userModel = new User();
        userModel.setId(userEntity.getId());
        userModel.setNombre(userEntity.getNombre());
        userModel.setApellidos(userEntity.getApellidos());
        userModel.setUsername(userEntity.getUsername());
        userModel.setEmail(userEntity.getEmail());
        userModel.setPassword(userEntity.getPassword());
        userModel.setFechaAltaReciente(userEntity.getFechaAltaReciente());
        userModel.setFotoPerfil(userEntity.getFotoPerfil());
        userModel.setFechaRegistro(userEntity.getFechaRegistro());

        // // Convertir perfiles de usuario
        // if (userEntity.getPerfilesUsuario() != null) {
        //     userModel.setPerfilesUsuario(
        //         userEntity.getPerfilesUsuario().stream()
        //         .map(PerfilUsuarioMapper::toModel(this))
        //         .collect(Collectors.toList())
        //     );
        // }

        // // Convertir tarjetas de crédito
        // if (userEntity.getTarjetasDeCredito() != null) {
        //     userModel.setTarjetasDeCredito(
        //         userEntity.getTarjetasDeCredito().stream()
        //         .map(TarjetaCreditoMapper::toModel)
        //         .collect(Collectors.toList())
        //     );
        // }

        // Convertir idioma
        if (userEntity.getIdioma() != null) {
            userModel.setIdioma(LanguageMapper.toModel(userEntity.getIdioma()));
        }

        return userModel;
    }
    public static List<User> toListModel(List<UserEntity> listUserEntity) {
        if (listUserEntity.size() == 0) return null;
        List<User> listUserModel = new ArrayList<>();
        for (UserEntity userEntity : listUserEntity) {

            User userModel = new User();
            userModel.setId(userEntity.getId());
            userModel.setNombre(userEntity.getNombre());
            userModel.setApellidos(userEntity.getApellidos());
            userModel.setUsername(userEntity.getUsername());
            userModel.setEmail(userEntity.getEmail());
            userModel.setPassword(userEntity.getPassword());
            userModel.setFechaAltaReciente(userEntity.getFechaAltaReciente());
            userModel.setFotoPerfil(userEntity.getFotoPerfil());
            userModel.setFechaRegistro(userEntity.getFechaRegistro());

            // // Convertir perfiles de usuario
            // if (userEntity.getPerfilesUsuario() != null) {
            //     userModel.setPerfilesUsuario(
            //         userEntity.getPerfilesUsuario().stream()
            //         .map(PerfilUsuarioMapper::toModel(this))
            //         .collect(Collectors.toList())
            //     );
            // }

            // // Convertir tarjetas de crédito
            // if (userEntity.getTarjetasDeCredito() != null) {
            //     userModel.setTarjetasDeCredito(
            //         userEntity.getTarjetasDeCredito().stream()
            //         .map(TarjetaCreditoMapper::toModel)
            //         .collect(Collectors.toList())
            //     );
            // }

            // Convertir idioma
            if (userEntity.getIdioma() != null) {
                userModel.setIdioma(LanguageMapper.toModel(userEntity.getIdioma()));
            }


            listUserModel.add(userModel);
        }



        return listUserModel;
    }

    public User loginToUser (UserLogIn logIn){
        User user = new User(logIn.getUsername(), logIn.getPassword());
        return user;
    }

    public UserLogIn userToLogIn (User user){
        return new UserLogIn(user.getUsername(), user.getPassword());
    }
}

