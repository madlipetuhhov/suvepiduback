package ee.valiit.suvepiduback.summerevent.eventcategory;

import ee.valiit.suvepiduback.summerevent.category.dto.CategoryInfo;
import ee.valiit.suvepiduback.summerevent.eventcategory.dto.EventCategoryInfo;
import io.swagger.v3.oas.annotations.Operation;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
public class EventCategoryController {
    private final EventCategoryService eventCategoryService;

    @PostMapping("/event/categories")
    @Operation(summary = "Uuele sündmusele kategooriate lisamine.",
            description = "Süsteemi lisatakse sündmusele juurde kategooriad mainEventId abil.")
    public void addNewCategory(@RequestParam Integer mainEventId, @RequestBody List<CategoryInfo> categoryInfos) {
        eventCategoryService.addNewCategory(mainEventId, categoryInfos);
    }

    @GetMapping("/event/categories")
    @Operation(summary = "Kõikide valitud kategooriate andmebaasist toomine vastava sündmuse kohta.",
            description = "Andmebaasist tuuakse vastava sündmuse kõik kategooriad mainEventId abil.")
    public List<EventCategoryInfo> getEventCategories(@RequestParam Integer mainEventId) {
        return eventCategoryService.getEventCategories(mainEventId);
    }




}
