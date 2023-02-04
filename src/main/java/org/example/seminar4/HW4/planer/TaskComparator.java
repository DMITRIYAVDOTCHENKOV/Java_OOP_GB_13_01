package org.example.seminar4.HW4.planer;

import java.util.Comparator;

public class TaskComparator implements Comparator <Task> {

    @Override
    public int compare(Task o1, Task o2) {
       return o2.getPriorCode()- o1.getPriorCode();
    }
}
