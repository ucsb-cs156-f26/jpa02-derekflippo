package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TeamTest {

    Team team;

    @BeforeEach
    public void setup() {
        team = new Team("test-team");
    }

    @Test
    public void getName_returns_correct_name() {
        assert (team.getName().equals("test-team"));
    }

    @Test
    public void toString_returns_correct_string() {
        assertEquals("Team(name=test-team, members=[])", team.toString());
    }

    @Test
    public void equals_returns_true_for_same_object() {
        assertEquals(team, team);
    }

    @Test
    public void equals_returns_false_for_different_object() {
        Team otherTeam = new Team("other-team");
        assert (!team.equals(otherTeam));
    }

    @Test
    void equals_returns_true_for_same_name_and_members() {
        Team otherTeam = new Team("test-team");
        assertEquals(team, otherTeam);
    }

    @Test
    void hashcode_is_same_for_same_name_and_members() {
        Team t1 = new Team();
        t1.setName("foo");
        t1.addMember("bar");
        Team t2 = new Team();
        t2.setName("foo");
        t2.addMember("bar");
        assertEquals(t1.hashCode(), t2.hashCode());
    }

    @Test
    void testHashCode() {
        Team t = new Team();

        int result = t.hashCode();
        int expectedResult = 60;
        assertEquals(expectedResult, result);
    }
}
