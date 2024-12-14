package ru.vsu.cs.salomatova;

import ru.vsu.cs.salomatova.classes.Faculty;
import ru.vsu.cs.salomatova.classes.Institute;
import ru.vsu.cs.salomatova.classes.ResearchAssociate;


public class Main {

    public static void main(String[] args) {
        Faculty fkn = new Faculty("ФКН");
        Institute toizi = new Institute("Кафедра1", "кабинет1");
        Institute is = new Institute("Кафедра2", "кабинет2");
        Institute tst = new Institute("Кафедра3", "кабинет3");
        Institute itu = new Institute("Кафедра4", "кабинет4");
        Institute piit = new Institute("Кафедра5", "кабинет5");
        fkn.setInstitutes(new Institute[]{toizi, is, tst, itu, piit});
        ResearchAssociate emp1 = new ResearchAssociate(1234, "Преподаватель1",
                "предмет1");
        ResearchAssociate emp2 = new ResearchAssociate(1234, "Преподаватель2",
                "предмет1");
        ResearchAssociate emp3 = new ResearchAssociate(1234, "Преподаватель3",
                "предмет1");
        ResearchAssociate emp4 = new ResearchAssociate(1234, "Преподаватель4",
                "рпредмет1");
        ResearchAssociate emp5 = new ResearchAssociate(1234, "Преподаватель5",
                "предмет1");
        toizi.setEmployees(new ResearchAssociate[]{emp1, emp2, emp3, emp4, emp5});
        Institute[] fkn_institutes = fkn.getInstitutes();
        System.out.println("Кафедры на факультете " + fkn.getName() + ": \n");
        for (int i = 0; i < fkn_institutes.length; i++) {
            System.out.println(fkn_institutes[i].getName());
        }
        System.out.println("\n");
        ResearchAssociate[] toizi_employees = toizi.getEmployees();
        System.out.println("Сотрудники кафедры " + toizi.getName() + ": \n");
        for (int i = 0; i < toizi_employees.length; i++) {
            System.out.println(toizi_employees[i].getName());
        }
        //System.out.println(Arrays.toString(fkn.getInstitutes()));
    }
}
