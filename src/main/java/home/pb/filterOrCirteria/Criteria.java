package home.pb.filterOrCirteria;

import java.util.List;

public interface Criteria {
    List<Person> meetCriteria(List<Person> persons);
}
