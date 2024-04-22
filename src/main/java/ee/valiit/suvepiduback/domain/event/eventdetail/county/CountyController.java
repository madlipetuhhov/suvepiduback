package ee.valiit.suvepiduback.domain.event.eventdetail.county;

import io.swagger.v3.oas.annotations.Operation;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
public class CountyController {

    private final CountyService countyService;

    @GetMapping("/counties")
    @Operation(summary = "Maakondade valiku loomine",
            description = "Süsteemist otsitakse võimalused (countyName) ja tagastab county massiivi.")
    public List<CountyInfo> executeCountyList() {

        return countyService.executeCountyList();

    }
}
