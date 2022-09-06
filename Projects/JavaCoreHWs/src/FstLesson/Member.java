package FstLesson;

public class Member {
    private String name;
    private int age;
    private int runningTime;
    private int swimmingTime;
    private int jumpDistance;
    private int numberOfPullUps;

    public Member(String name, int age, int runningTime,
                  int swimmingTime, int jumpDistance, int numberOfPullUps) {
        this.name = name;
        this.age = age;
        this.runningTime = runningTime;
        this.swimmingTime = swimmingTime;
        this.jumpDistance = jumpDistance;
        this.numberOfPullUps = numberOfPullUps;
    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", runningTime=" + runningTime +
                ", swimmingTime=" + swimmingTime +
                ", jumpDistance=" + jumpDistance +
                ", numberOfPullUps=" + numberOfPullUps +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getRunningTime() {
        return runningTime;
    }

    public int getSwimmingTime() {
        return swimmingTime;
    }

    public int getJumpDistance() {
        return jumpDistance;
    }

    public int getNumberOfPullUps() {
        return numberOfPullUps;
    }


}