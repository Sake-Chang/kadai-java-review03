package baseball;

public class BaseBallTeam {

    // フィールド
    private String name;
    private int win;
    private int lose;
    private int draw;

    // コンストラクタ（引数なし）
    public BaseBallTeam() {
    }

    // コンストラクタ（引数あり）
    public BaseBallTeam(String name, int win, int lose, int draw) {
        this.name = name;
        this.win = win;
        this.lose = lose;
        this.draw = draw;
    }

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }

    public int getWin() {
        return win;
    }

    public void setWin() {
        this.win = win;
    }

    public int getLose() {
        return lose;
    }

    public void setLose() {
        this.lose =lose;
    }

    public int getDraw() {
        return draw;
    }

    public void setDraw() {
        this.draw = draw;
    }

    // 勝率の計算メソッド
    public double getRate() {
        double rate = (double) win / ( win + lose );
        return rate;
    }

    // 表示メソッド
    public void report() {
        double rate = getRate();
        System.out.println( name + "　の2022年の成績は　" + win + "勝　" + lose + "敗　" + draw + "分、勝率は　" + rate + "です。");
    }

}
