package bai_tap_lam_them_arraylist_va_oop.candidate_management;

public interface FunctionsCandidate {
    void createCandidate(int choice);
    void updateCandidate(int select, int id);
    void searchCandidate(int select, String name);
    void deleteCandidate(int select, int id);
}
