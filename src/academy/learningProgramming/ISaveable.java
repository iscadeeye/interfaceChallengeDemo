package academy.learningProgramming;


import java.util.List;

public interface ISaveable {
    //use List instead of arrayList to complete abstraction. because you have to the class that
    //implements the interface to use certain list. interface defines what needs be to implemented not how.
    List<String> write();
    void read(List<String> savedValues);
}
