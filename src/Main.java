//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;
        var togetherWeight = firstBoxerWeight + secondBoxerWeight;
        System.out.println(togetherWeight);

        var differenceWeight = secondBoxerWeight - firstBoxerWeight;
        System.out.println(differenceWeight);

        var remainder =  secondBoxerWeight % firstBoxerWeight;
        System.out.println(remainder);

        var totalWorkingHours = 640;
        var workingHoursOneEmployee = 8;
        var totalEmployeesCompany = totalWorkingHours / workingHoursOneEmployee;
        System.out.println("Всего работников в компании - " + totalEmployeesCompany + " человек ");

        totalEmployeesCompany = totalEmployeesCompany + 94;
        workingHoursOneEmployee = totalWorkingHours / totalEmployeesCompany;
        System.out.println("Если в компании работает "+totalEmployeesCompany +" человек, то всего "+ workingHoursOneEmployee +" часов работы может быть поделено между ними");
    }
}