package ee.valiit.suvepiduback.domain.event.mainevent.eventcategory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EventCategoryRepository extends JpaRepository<EventCategory, Integer> {
    @Query("select e from EventCategory e where e.mainEvent.id = :mainEventId order by e.category.name")
    List<EventCategory> findEventCategoriesBy(Integer mainEventId);
}