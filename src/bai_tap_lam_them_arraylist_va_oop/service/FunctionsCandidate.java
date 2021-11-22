package bai_tap_lam_them_arraylist_va_oop.service;

public interface FunctionsCandidate {
    void createCandidate(int choice);
    void updateCandidate(int id);
    void searchCandidate( String name, int type);
    void deleteCandidate(int id);
}
