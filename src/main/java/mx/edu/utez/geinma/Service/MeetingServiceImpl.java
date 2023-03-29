package mx.edu.utez.geinma.Service;

import mx.edu.utez.geinma.Model.Meeting;
import mx.edu.utez.geinma.Repository.MeetingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MeetingServiceImpl implements MeetingService {

    @Autowired
    MeetingRepo meetingRepository;

    @Override

    public Iterable<Meeting> findAll() {
        return meetingRepository.findAll();
    }

    @Override

    public Optional<Meeting> findById(Long id) {
        return meetingRepository.findById(id);
    }

    @Override

    public Meeting save(Meeting meeting) {
        return meetingRepository.save(meeting);
    }

    @Override

    public void deleteById(Long id) {
        meetingRepository.deleteById(id);
    }

}
