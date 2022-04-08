package melio.megan.dashboardserver.domain.weather.repo;

import melio.megan.dashboardserver.domain.weather.models.WeatherApiResponse;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface WeatherRepo  {
    Optional<WeatherApiResponse> findByLatAndLon(String lat, String lon);
}
