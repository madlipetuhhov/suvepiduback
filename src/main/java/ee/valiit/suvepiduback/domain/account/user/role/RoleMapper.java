package ee.valiit.suvepiduback.domain.account.user.role;

import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface RoleMapper {
    @Mapping(source = "id", target = "roleId")
    @Mapping(source = "name", target = "roleName")
    RolesDropdownResponse toRolesDropdownResponse(Role role);
}