package melio.megan.dashboardserver.domain.weather.services;

import melio.megan.dashboardserver.domain.weather.models.WeatherApiResponse;

import java.util.Optional;

public interface WeatherService {
        Optional<WeatherApiResponse> requestDataFromApi(String lat, String lon);
}
