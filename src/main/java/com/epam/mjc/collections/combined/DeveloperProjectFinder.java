package com.epam.mjc.collections.combined;

import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.Map;
import java.util.Comparator;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String> developerProjects = new ArrayList<>();
        for(Map.Entry<String, Set<String>> entry : projects.entrySet()){
            if(entry.getValue().contains(developer)){
                developerProjects.add(entry.getKey());
            }
        }
        developerProjects.sort(new Comparator<>() {
            @Override
            public int compare(String o1, String o2) {
                int result = Integer.compare(o2.length(), o1.length());
                return result == 0 ? o2.compareTo(o1) : result;
            }
        });
        return developerProjects;
    }
}
