package FstLesson;

public class Course {
    String result;
    private String courseName;
    private int runHundred;
    private int swimHundred;
    private int jumping;
    private int pullUps;

    public Course(String courseName, int runHundred, int swimHundred, int jumping, int pullUps) {
        this.courseName = courseName;
        this.runHundred = runHundred;
        this.swimHundred = swimHundred;
        this.jumping = jumping;
        this.pullUps = pullUps;
    }

    public String competition(Team team){
        result = "Название команды: "+ team.getTeamName()+ " " + '\n';
        for(Member member: team.getTeamMembers()){
            result += "Участник: " + member.getName()+ ", " + member.getAge() + " лет" + '\n';
            int run = member.getRunningTime();
            tryRun(run);

            int swim = member.getSwimmingTime();
            trySwim(swim);

            int jump = member.getJumpDistance();
            tryJump(jump);

            int pullUp = member.getNumberOfPullUps();
            tryPullUp(pullUp);

        }

        return result;
    }

    private void tryRun(int run){
        if(run < runHundred) result = result + "Пробежал 100м успешно "+ '\n';
        else result += "Не пробежал дистанцию "+ '\n';


    }
    private void trySwim(int swim){
        if(swim < swimHundred) result = result + "Проплыл 100м успешно "+ '\n';
        else result += "Не проплыл дистанцию "+ '\n';


    }

    private void tryJump(int jump){
        if(jump > jumping) result = result + "Прыгнул успешно "+ '\n';
        else result += "Не допрыгнул "+ '\n';
        System.out.println();

    }

    private void tryPullUp(int pullUp){
        if(pullUp > pullUps) result = result + "Подтянулся успешно "+ '\n';
        else result += "Не прошел испытание подтягиваний "+ '\n';

    }

    public String getCourseName() {
        return courseName;
    }

    public int getRunHundred() {
        return runHundred;
    }

    public int getSwimHundred() {
        return swimHundred;
    }

    public int getJumping() {
        return jumping;
    }

    public int getPullUps() {
        return pullUps;
    }
}
