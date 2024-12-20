package pe.edu.upc.hardko.store.IAM.interfaces.rest.resoruces;

import java.util.List;

public record UserResource(
        String userId,
        String firstName,
        String lastName,
        String email,
        String password,
        UserAddressResource address,
        List<String> favoriteProducts
) {
}
