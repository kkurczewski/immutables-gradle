package pl.kkurczewski.dto;

import org.immutables.value.Value;

@Value.Immutable
@Value.Style(
        // naming conventions
        typeAbstract = {"*Blueprint"}, // ignore parent postfix
        typeImmutable = "*" // disable 'Immutable' prefix
)
public interface UserBlueprint {
    String name();
    String surname();
    String email();
    int age();

    default String hello() {
        return String.format("Hello, my name is %s %s", name(), surname());
    }
}
