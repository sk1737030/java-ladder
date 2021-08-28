package nextstep.ladder.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PlayerTest {

    @Test
    void getPlayerPosition() {
        Position givenStartPosition = Position.from(1);
        Player player = Player.of(Person.of("Phobi"), givenStartPosition);
        Position position = player.position();
        assertThat(position).isEqualTo(Position.from(1));
    }
}