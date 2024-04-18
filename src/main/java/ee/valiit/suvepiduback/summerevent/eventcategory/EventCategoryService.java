package ee.valiit.suvepiduback.summerevent.eventcategory;

import ee.valiit.suvepiduback.domain.event.mainevent.eventcategory.EventCategory;
import ee.valiit.suvepiduback.domain.event.mainevent.eventcategory.EventCategoryMapper;
import ee.valiit.suvepiduback.domain.event.mainevent.eventcategory.EventCategoryRepository;
import ee.valiit.suvepiduback.summerevent.eventcategory.dto.EventCategoryInfo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EventCategoryService {
    private final EventCategoryMapper eventCategoryMapper;

    private final EventCategoryRepository eventcategoryRepository;


    public void addNewCategory(EventCategoryInfo eventCategoryInfo) {
        EventCategory eventCategory = eventCategoryMapper.toEventCategory(eventCategoryInfo);
        eventcategoryRepository.save(eventCategory);
    }
}
