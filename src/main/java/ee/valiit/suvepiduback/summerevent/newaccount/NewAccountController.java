package ee.valiit.suvepiduback.summerevent.newaccount;

import ee.valiit.suvepiduback.summerevent.newaccount.dto.RolesDropdownInfo;
import ee.valiit.suvepiduback.summerevent.newaccount.dto.UserInfo;
import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class NewAccountController {
    private final NewAccountService newAccountService;

    @PostMapping("/new-user")
    @Operation(summary = "Uue kasutaja lisamine.",
            description = "Süsteemi lisatakse uus kasutaja roleId, username ja password abil.")
    public void addNewUser(@RequestBody @Valid UserInfo userInfo) {
        newAccountService.addNewUser(userInfo);
    }


    @GetMapping("/roles")
    @Operation(summary = "Rollide valiku loomine. Tagastab roleId.",
            description = "Süsteemist otsitakse roleId abil rollid.")
    public List<RolesDropdownInfo> executeRolesDropdown() {
        return newAccountService.executeRolesDropdown();
    }


}
