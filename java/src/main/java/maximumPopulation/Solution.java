package maximumPopulation;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public int findYearOfMaximumPopulation(List<Person> personList) {

        // convert to list of events in the order of year
        List<Event> events = new ArrayList<>();
        personList.forEach( p -> {
            events.add( new Event(p.yearOfBirth, "birth"));
            events.add( new Event(p.yearOfDeath, "death"));
        });

        // sort the events
        events.sort((a, b) -> a.year - b.year);

        int maxYear = events.get(0).year;
        int maxPopulationCount = 0 ;
        int runningPopulationCount  = 0;

        for(Event e : events) {
            if(e.type.equals("birth")) {
                runningPopulationCount++;
            } else {
                runningPopulationCount--;
            }

            if(runningPopulationCount > maxPopulationCount) {
                maxPopulationCount = runningPopulationCount;
                maxYear = e.year;
            }
        }

        return maxYear;
    }
}
