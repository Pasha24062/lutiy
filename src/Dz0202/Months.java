package Dz0202;

public enum Months {
    СІЧЕНЬ(31, Seasons.ЗИМА),
    ЛЮТИЙ(28, Seasons.ЗИМА),
    БЕРЕЗЕНЬ(31, Seasons.ВЕСНА),
    КВІТЕНЬ(30, Seasons.ВЕСНА),
    ТРАВЕНЬ(31, Seasons.ВЕСНА),
    ЧЕРВЕНЬ(30, Seasons.ЛІТО),
    ЛИПЕНЬ(31, Seasons.ЛІТО),
    СЕРПЕНЬ(31, Seasons.ЛІТО),
    ВЕРЕСЕНЬ(30, Seasons.ЛІТО),
    ЖОВТЕНЬ(31, Seasons.ОСІНЬ),
    ЛИСТОПАД(30, Seasons.ОСІНЬ),
    ГРУДЕНЬ(31, Seasons.ЗИМА);
    private int дні;
    private Seasons сезон;


    Months(int дні, Seasons сезон) {
        this.дні = дні;
        this.сезон = сезон;
    }

    public int getДні() {
        return дні;
    }

    public void setДні(int дні) {
        this.дні = дні;
    }

    public Seasons getСезон() {
        return сезон;
    }

    public void setСезон(Seasons сезон) {
        this.сезон = сезон;
    }
}
