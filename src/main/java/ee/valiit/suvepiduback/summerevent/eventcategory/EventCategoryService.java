package ee.valiit.suvepiduback.summerevent.eventcategory;

import ee.valiit.suvepiduback.domain.event.mainevent.MainEvent;
import ee.valiit.suvepiduback.domain.event.mainevent.MainEventRepository;
import ee.valiit.suvepiduback.domain.event.mainevent.eventcategory.EventCategory;
import ee.valiit.suvepiduback.domain.event.mainevent.eventcategory.EventCategoryRepository;
import ee.valiit.suvepiduback.domain.event.mainevent.eventcategory.category.Category;
import ee.valiit.suvepiduback.domain.event.mainevent.eventcategory.category.CategoryRepository;
import ee.valiit.suvepiduback.summerevent.category.dto.CategoryInfo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class EventCategoryService {
    private final EventCategoryRepository eventCategoryRepository;
    private final MainEventRepository mainEventRepository;
    private final CategoryRepository categoryRepository;


    public void addNewCategory(Integer mainEvnetId, List<CategoryInfo> categoryInfos) {
        MainEvent mainEvent = mainEventRepository.getReferenceById(mainEvnetId);
        createAndSaveEventCategories(mainEvent, categoryInfos);
    }

    private void createAndSaveEventCategories(MainEvent mainEvent, List<CategoryInfo> categoryInfos) {
        List<EventCategory> eventCategories = createEventCategories(categoryInfos, mainEvent);
        eventCategoryRepository.saveAll(eventCategories);
    }

    private List<EventCategory> createEventCategories(List<CategoryInfo> categoryInfos, MainEvent mainEvent) {
        List<EventCategory> eventCategories = new ArrayList<>();
        for (CategoryInfo categoryInfo : categoryInfos) {
            if (categoryInfo.getIsAvailable()) {
                Category category = categoryRepository.getReferenceById(categoryInfo.getCategoryId());
                EventCategory eventCategory = new EventCategory();
                eventCategory.setMainEvent(mainEvent);
                eventCategory.setCategory(category);
                eventCategories.add(eventCategory);
            }
        }
        return eventCategories;
    }
}
