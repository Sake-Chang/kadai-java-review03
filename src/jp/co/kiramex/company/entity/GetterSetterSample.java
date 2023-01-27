package jp.co.kiramex.company.entity;

public class GetterSetterSample {

    public static void main(String[] args) {
        Employee employee01 = new Employee();
        //employee.employeeName = "大島";カプセル化でコンパイルエラー
        employee01.setEmployeeName("大島"); // setterを経由して値を設定
        
        String empName = employee01.getEmployeeName(); // getterを経由して値を取得
        System.out.println(empName);

    }

}
