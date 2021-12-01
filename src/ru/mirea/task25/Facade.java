package ru.mirea.task25;

import java.util.HashMap;
import java.util.List;
import java.util.Vector;

//Instead of manipulating the above 4 classes to complete the operations of students registering, creating courses, building classes and viewing the list of students in the class.
//I'll push the other quests into a Facade class
public class Facade {
    private HashMap<String,Team> teams = new HashMap<>();
    private Campus campus;

    public void buildCampus(){
        campus = new Campus();

        campus.setTrainingSystem("09.03.01","Informatics and computer engineering");
        campus.setTrainingSystem("09.03.03","Applied Informatics");
        campus.setTrainingSystem("09.03.04","Software engineering");

        campus.setStudents(01,"James Gosling");
        campus.setStudents(02,"Jennie Kim");
        campus.setStudents(03,"Thanh Hien");
    }

    public void buildTeam(String teamName, String ts){
        Team team = new Team(teamName);
        team.setTs(campus.getTrainingSystem(ts));
        teams.put(team.getName(),team);
    }

    public void enroll(int studentID, String teamName){
        teams.get(teamName).addStudent(campus.getStudent(studentID));
    }

    public Vector display(String teamName){
        Vector vector = new Vector();
        Team team = teams.get(teamName);
        vector.addElement(team.getName());
        vector.addElement(team.getTs().getName());
        List<Student> students = team.getStudents();
        for (Student s : students){
            vector.addElement(s.getName());
        }
        return vector;
    }
}
