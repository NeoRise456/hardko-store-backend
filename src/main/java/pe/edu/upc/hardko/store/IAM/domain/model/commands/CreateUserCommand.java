package pe.edu.upc.hardko.store.IAM.domain.model.commands;

public record CreateUserCommand(
        String firstName,
        String lastName,
        String email,
        String password,
        String country,
        String city,
        String street,
        String zip
) {
}
