
public class Character {
    // フィールド
    public String name;
    public int hp;
    public int offence;
    public int defense;

    // 引数なしのコンストラクタ
    public Character() {
    }

    // 引数ありのコンストラクタ
    public Character(String name, int hp, int offense, int defense) {
        this.name = name;
        this.hp = hp;
        this.offence = offense;
        this.defense = defense;
    }

    // 相手に攻撃するメソッド（引数には攻撃する相手のオブジェクトを指定）
    public void attack(Character opponent) {
        // 自分の攻撃力と相手の防御力の差をダメージ量とする
        int damage = this.offence - opponent.defense;

        // ダメージ量の計算結果がプラスかどうか
        if(damage > 0) {
            // ダメージ量がプラスならダメージを与える
            opponent.hp = opponent.hp - damage;
            System.out.println(this.name + "は" + opponent.name + "に" + damage + "のダメージを与えた！！");
        } else {
            // ダメージ量が0以下ならミスにする
            System.out.println("ミス！ " + this.name + "は" + opponent.name + "にダメージを与えられない…");
        }
    }

}
