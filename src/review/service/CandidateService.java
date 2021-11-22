package review.service;

public interface CandidateService {
    void createCandidate(int choice);
    void updateCandidate(int id);
    void searchCandidate( String name, int type);
    void deleteCandidate(int id);
}
