package ee.valiit.suvepiduback.domain.event.mainevent;

import ee.valiit.suvepiduback.summerevent.Status;
import ee.valiit.suvepiduback.summerevent.mainevent.dto.MainEventInfo;
import ee.valiit.suvepiduback.summerevent.mainevent.dto.MainEventInfoExtended;
import ee.valiit.suvepiduback.util.StringConverter;
import org.mapstruct.*;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING, imports = {StringConverter.class})
public interface MainEventMapper {

    @Mapping(source = "title", target = "title")
    @Mapping(source = "description", target = "description")
    @Mapping(expression = "java(StringConverter.stringToBytes(mainEventInfo.getImageData()))", target = "imageData")
    @Mapping(constant = Status.ACTIVE, target = "status")
    MainEvent toMainEvent(MainEventInfo mainEventInfo);

    @Mapping(source = "id", target = "mainEventId")
    @Mapping(source = "business.id", target = "businessId")
    @Mapping(source = "title", target = "title")
    @Mapping(source = "description", target = "description")
    @Mapping(expression = "java(StringConverter.bytesToString(mainEvent.getImageData()))", target = "imageData")
    MainEventInfoExtended toMainEventInfo(MainEvent mainEvent);

    List<MainEventInfoExtended> toMainEventInfos(List<MainEvent> mainEvents);


}