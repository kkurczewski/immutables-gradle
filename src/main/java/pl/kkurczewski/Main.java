package pl.kkurczewski;

import pl.kkurczewski.dto.User;

public class Main {
    public static void main(String[] args) {
        User user = User.builder()
                .name("Bob")
                .surname("Ross")
                .age(21)
                .email("bob-ross@mail.org")
                .build();

        User copy = user
                .withName("Jack")
                .withSurname("Sparrow");

        System.out.println(user.hello());
        System.out.println(copy.hello());

    }
}
