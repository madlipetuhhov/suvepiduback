package ee.valiit.suvepiduback.summerevent.eventcategory;

import ee.valiit.suvepiduback.summerevent.category.dto.CategoryInfo;
import io.swagger.v3.oas.annotations.Operation;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
public class EventCategoryController {
    private final EventCategoryService eventCategoryService;
    @PostMapping("/event/features/")
    @Operation(summary = "Uuele sündmusele kategooriate lisamine. Tagastab mainEventId??. ",
            description = "Süsteemi lisatakse sündmusele juurde kategooriad mainEventId abil.")
    public void addNewCategory(@RequestParam Integer mainEventId, @RequestBody List<CategoryInfo> categoryInfos) {
        eventCategoryService.addNewCategory(mainEventId, categoryInfos);
    }

}
