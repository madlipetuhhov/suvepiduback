package ee.valiit.suvepiduback.domain.event.eventdetail;

import ee.valiit.suvepiduback.summerevent.eventdetail.dto.EventDetailInfo;
import ee.valiit.suvepiduback.util.LocalTimeConverter;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING, imports = {LocalTimeConverter.class})
public interface EventDetailMapper {

    @Mapping(expression = "java(LocalTimeConverter.stringToLocalTime(eventDetailInfo.getStartTime()))",target = "startTime")
    @Mapping(expression = "java(LocalTimeConverter.stringToLocalTime(eventDetailInfo.getEndTime()))",target = "endTime")

//    @Mapping(source = "countyId", target = "county.id")
//    @Mapping(source = "mainEventId", target = "mainEvent.id")

    @Mapping(source = "date", target = "date")
//    @Mapping(source = "startTime", target = "startTime")
//    @Mapping(source = "endTime", target = "endTime")
    @Mapping(source = "address", target = "address")
    @Mapping(source = "longitude", target = "longitude")
    @Mapping(source = "latitude", target = "latitude")
    EventDetail toEventDetail(EventDetailInfo eventDetailInfo);

}