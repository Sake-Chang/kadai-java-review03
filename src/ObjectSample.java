
public class ObjectSample {

    public static void main(String[] args) {
        Employee emp01 = new Employee();
        //emp01.employeeName = "大島";
        //emp01.divisionName = "営業部";
        //emp01.vitality = 150;
        emp01.introduce();
        emp01.showVitality();
        
        Employee emp02 = new Employee("原川", "営業部", 250);
        //emp02.employeeName = "原川";
        //emp02.divisionName = "営業部";
        //emp02.vitality = 250;
        emp02.introduce();
        System.out.println("残HP：" + emp02.vitality);
        emp02.greeting();
        System.out.println("残HP：" + emp02.vitality);
        emp02.report();
        System.out.println("残HP：" + emp02.vitality);
        emp02.showVitality();

    }

}
