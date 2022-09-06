package FstLesson;

import java.util.Arrays;

public class Team {
    private String teamName;
    private Member[] teamMembers;


    public Team(String teamName, Member[] teamMembers) {
        this.teamName = teamName;
        this.teamMembers = teamMembers;
    }

    public String getTeamName() {
        return teamName;
    }

    public Member[] getTeamMembers() {
        return teamMembers;
    }


}
