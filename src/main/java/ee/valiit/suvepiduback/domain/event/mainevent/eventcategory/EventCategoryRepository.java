package ee.valiit.suvepiduback.domain.event.mainevent.eventcategory;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EventCategoryRepository extends JpaRepository<EventCategory, Integer> {
}