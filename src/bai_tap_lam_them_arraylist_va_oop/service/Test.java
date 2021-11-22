package bai_tap_lam_them_arraylist_va_oop.service;

import bai_tap_lam_them_arraylist_va_oop.model.Candidate;
import bai_tap_lam_them_arraylist_va_oop.model.ExperienceCandiDate;
import bai_tap_lam_them_arraylist_va_oop.model.FresherCandidate;
import bai_tap_lam_them_arraylist_va_oop.model.InternCandidate;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
         List<Candidate> candidateList = new ArrayList<>();
         {
            candidateList.add(new ExperienceCandiDate(1, "manh hung", "nguyen", 2000, "le thi tinh",
                    012312732122, "hung@gmail.com", 0, 1, "java"));
            candidateList.add(new ExperienceCandiDate(2, "viet hoang", "le ", 2001, "le thi toan",
                    01231431231, "hoang@gmail.com", 0, 2, "c#"));
            candidateList.add(new ExperienceCandiDate(3, "van nha", "duong", 2002, "le thi tam",
                    0231431231, "nha@gmail.com", 0, 3, "c++"));
            candidateList.add(new FresherCandidate(1, "thanh", "nguyen", 1989, "le thi tu",
                    1231431231, "hung@gmail.com", 1, 2, "fair", "DTU"));
            candidateList.add(new FresherCandidate(2, "thang", "le", 1999, "le thi rieng",
                    1231431231, "hung@gmail.com", 1, 3, "excilent", "science"));
            candidateList.add(new FresherCandidate(3, "tuan", "nguyen", 2001, "le thi ba",
                    1231431231, "hung@gmail.com", 1, 4, "good", "military academy"));
            candidateList.add(new InternCandidate(1, "hung", "nguyen", 2000, "le thi tinh",
                    1231431231, "hung@gmail.com", 2, "information", 8, "havert"));
            candidateList.add(new InternCandidate(2, "hoang", "nguyen", 2000, "le thi tinh",
                    1231431231, "hung@gmail.com", 2, "ìnorr", 9, "hanoiu"));
            candidateList.add(new InternCandidate(7, "nha", "nguyen", 2000, "le thi tinh",
                    1231431231, "hung@gmail.com", 2, "ìnnformationt", 10, "duy tan"));
        }
        for (Candidate candidate:candidateList) {
            if (candidate.getCandidateId()==7){
                if (candidate instanceof InternCandidate){
                    System.out.println(true);
                }
            }
        }
    }
}
