package ee.valiit.suvepiduback.domain.event.mainevent.eventcategory;

import ee.valiit.suvepiduback.summerevent.eventcategory.dto.EventCategoryInfo;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface EventCategoryMapper {

    @Mapping(source = "mainEventId", target = "mainEvent.id")
    @Mapping(source = "categoryId", target = "category.id")
    EventCategory toEventCategory(EventCategoryInfo eventCategoryInfo);



}