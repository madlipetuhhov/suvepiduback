package ee.valiit.suvepiduback.domain.event.mainevent.eventcategory;

import ee.valiit.suvepiduback.summerevent.category.dto.CategoryInfo;
import ee.valiit.suvepiduback.summerevent.eventcategory.dto.EventCategoryInfo;
import org.mapstruct.*;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface EventCategoryMapper {

    @Mapping(source = "mainEvent.id", target = "mainEventId")
    @Mapping(source = "category.id", target = "categoryId")
    @Mapping(source = "category.name", target = "categoryName")
    EventCategoryInfo toEventCategoryInfo(EventCategory eventCategory);

    List<EventCategoryInfo> toEventCategoryInfos(List<EventCategory> eventCategories);

//    @Mapping(source = "categoryId", target = "category.id")
//    @Mapping(source = "categoryName", target = "")
//    @Mapping(source = "isAvailable", target = "")
//    @Mapping(source = "isAvailable", target = "")
//    void editEventCategories(CategoryInfo categoryInfo, @MappingTarget EventCategory eventCategory);

}