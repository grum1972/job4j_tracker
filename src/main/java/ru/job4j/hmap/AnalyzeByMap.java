package ru.job4j.hmap;

import java.util.*;

public class AnalyzeByMap {
    public static double averageScore(List<Pupil> pupils) {
        double sum = 0;
        int count = 0;
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                sum += subject.score();
                count++;
            }
        }
        return sum / count;
    }

    public static List<Label> averageScoreByPupil(List<Pupil> pupils) {
        List<Label> labels = new ArrayList<>();
        for (Pupil pupil : pupils) {
            double sum = 0;
            for (Subject subject : pupil.subjects()) {
                sum += subject.score();
            }
            labels.add(new Label(pupil.name(), sum / pupil.subjects().size()));
        }
        return labels;
    }

    public static List<Label> averageScoreBySubject(List<Pupil> pupils) {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                if (map.containsKey(subject.name())) {
                    int oldValue = map.get(subject.name());
                    map.put(subject.name(), oldValue + subject.score());
                } else {
                    map.put(subject.name(), subject.score());
                }
            }
        }
        List<Label> labels = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            int count = 0;
            for (Pupil pupil : pupils) {
                for (Subject subject : pupil.subjects()) {
                    if (subject.name().equals(entry.getKey())) {
                        count++;
                    }
                }
            }
            double avgScore = entry.getValue() / (double) count;
            labels.add(new Label(entry.getKey(), avgScore));
        }
        return labels;
    }

    public static Label bestStudent(List<Pupil> pupils) {
        List<Label> labels = new ArrayList<>();
        for (Pupil pupil : pupils) {
            double sum = 0;
            for (Subject subject : pupil.subjects()) {
                sum += subject.score();
            }
            labels.add(new Label(pupil.name(), sum));
        }
        Collections.sort(labels);
        return labels.get(labels.size() - 1);
    }

    public static Label bestSubject(List<Pupil> pupils) {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                if (map.containsKey(subject.name())) {
                    int oldValue = map.get(subject.name());
                    map.put(subject.name(), oldValue + subject.score());
                } else {
                    map.put(subject.name(), subject.score());
                }
            }
        }
        List<Label> labels = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            labels.add(new Label(entry.getKey(), entry.getValue()));
        }
        Collections.sort(labels);
        return labels.get(labels.size() - 1);
    }
}
