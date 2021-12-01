package ru.mirea.task25;

import java.util.HashMap;

public class Campus {
    private HashMap<Integer,Student> students = new HashMap<>();
    private HashMap<String,TrainingSystem> ts = new HashMap<>();

    public void setStudents(int sID,String sName){
        students.put(sID,new Student(sID,sName));
    }

    public void setTrainingSystem(String sCode, String sname){
        ts.put(sCode,new TrainingSystem(sCode,sname));
    }

    public Student getStudent(int sID){
        return students.get(sID);
    }

    public TrainingSystem getTrainingSystem(String sCode){
        return ts.get(sCode);
    }
}
