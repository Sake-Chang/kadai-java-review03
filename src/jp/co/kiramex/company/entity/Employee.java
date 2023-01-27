package jp.co.kiramex.company.entity;

public class Employee {
    // フィールド
    private String employeeName;
    private String divisionName;
    private int vitality;

    // コンストラクタ
    public Employee() {
    }

    // 引数なしのコンストラクタ
    public Employee(String employeeName, String divisionName, int vitality) {
        System.out.println("初期化時に引数ありコンストラクタが呼ばれました");
        this.employeeName = employeeName;
        this.divisionName = divisionName;
        this.vitality = vitality;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getDivisionName() {
        return divisionName;
    }

    public void setDivisionName(String divisionName) {
        this.divisionName = divisionName;
    }

    public int getVitality( ) {
        return vitality;
    }

    public void getVitality(int vitality) {
        this.vitality = vitality;
    }

}
