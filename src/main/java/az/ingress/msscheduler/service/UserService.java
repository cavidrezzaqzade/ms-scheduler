package az.ingress.msscheduler.service;

import az.ingress.msscheduler.model.UserDetails;
import az.ingress.msscheduler.model.UserDto;
import az.ingress.msscheduler.model.criteria.PageCriteria;
import az.ingress.msscheduler.model.criteria.UserCriteria;
import az.ingress.msscheduler.model.response.PageableUserResponse;

import java.util.List;

/**
 * @author caci
 */

public interface UserService {

    List<UserDto> getAll();

    UserDto add(UserDto userDto);

    void delete(Long id);

    UserDto update(UserDto dto, Long id);

    UserDto update(UserDetails userDetails);

    PageableUserResponse getUsers(PageCriteria pageCriteria, UserCriteria userCriteria);
}
