package task_5;

import java.util.Objects;

public class FootballPlayer {
    private String name;
    private int skill;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSkill() {
        return skill;
    }

    public void setSkill(int skill) {
        this.skill = skill;
    }

    public FootballPlayer(String name, int skill) {
        if (name == null) throw new NullPointerException("Name is null!");
        this.name = name;
        this.skill = skill;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FootballPlayer footballPlayer = (FootballPlayer) o;
        return getSkill() == footballPlayer.getSkill() &&
                getName().equals(footballPlayer.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSkill());
    }

    @Override
    public String toString() {
        return "name = " + name +
                " | skill = " + skill;
    }
}
