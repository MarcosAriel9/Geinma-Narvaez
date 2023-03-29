package mx.edu.utez.geinma.Service;

import mx.edu.utez.geinma.Model.TimeTable;
import mx.edu.utez.geinma.Repository.TimeTableRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TimeTableServiceImpl  implements TimeTableService{
    @Autowired
    TimeTableRepo timeTableRepository;

    @Override

    public Iterable<TimeTable> findAll() {
        return timeTableRepository.findAll();
    }

    @Override
    public Optional<TimeTable> findById(Long id) {
        return timeTableRepository.findById(id);
    }

    @Override

    public TimeTable save(TimeTable timeTable) {
        return timeTableRepository.save(timeTable);
    }

    @Override

    public void deleteById(Long id) {
        timeTableRepository.deleteById(id);
    }




}
