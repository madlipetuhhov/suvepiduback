package ee.valiit.suvepiduback.domain.event.eventdetail.county;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class CountyService {

    public final CountyMapper countyMapper;
    public final CountyRepository countyRepository;

    public List<CountyInfo> executeCountyList() {
        List<County> counties = countyRepository.findAll();

        return countyMapper.toCountyInfos(counties);
    }
}
