package com.epam.mjc.collections.combined;

import java.util.Set;
import java.util.List;
import java.util.Map;
import java.util.HashSet;

public class LessonsGetter {
    public Set<String> getLessons(Map<String, List<String>> timetable) {
        Set<String> lessons = new HashSet<>();
        for(List<String> lessonList : timetable.values()){
            lessons.addAll(lessonList);
        }
        return lessons;
    }
}
