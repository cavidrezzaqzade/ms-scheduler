package az.ingress.msscheduler.scheduler;

import az.ingress.msscheduler.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import net.javacrumbs.shedlock.spring.annotation.SchedulerLock;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author caci
 */

@Component
@RequiredArgsConstructor
public class UserScheduler {

    private final UserService userService;

//    @SneakyThrows
//    @Scheduled(fixedDelayString = "PT2S")
//    @SchedulerLock(name = "printUsersInfo", lockAtLeastFor = "PT1M", lockAtMostFor = "PT5M")
//    public void printUsersInfo(){
//        Thread.sleep(4000);
//        userService.getAll().forEach(System.out::println);
//    }

    @SneakyThrows
    @Scheduled(fixedRateString = "PT2S")
//    @SchedulerLock(name = "printUsersInfo", lockAtLeastFor = "PT1M", lockAtMostFor = "PT5M")
    public void printUsersInfoFixedRate(){
        System.out.println("aaa");
        Thread.sleep(5000);
        userService.getAll().forEach(System.out::println);
    }

}
