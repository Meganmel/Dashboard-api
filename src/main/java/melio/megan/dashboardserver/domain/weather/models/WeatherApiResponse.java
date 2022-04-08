package melio.megan.dashboardserver.domain.weather.models;

import java.util.List;

public class WeatherApiResponse {

    private Coordinate coord;
    private List<Weather> weather;
    private String base;
    private WeatherMain main;
    private Integer visibility;
    private Wind wind;
    private Cloud cloudiness;
    private Long dt;
    private WeatherSys sys;
    private Long timeZone;
    private Long id;
    private String name;
    private Integer cod;

    public Coordinate getCoord() {
        return coord;
    }

    public void setCoord(Coordinate coordinate) {
        this.coord = coordinate;
    }

    public List<Weather> getWeather() {
        return weather;
    }

    public void setWeather(List<Weather> weather) {
        this.weather = weather;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public WeatherMain getMain() {
        return main;
    }

    public void setMain(WeatherMain main) {
        this.main = main;
    }

    public Integer getVisibility() {
        return visibility;
    }

    public void setVisibility(Integer visibility) {
        this.visibility = visibility;
    }

    public Wind getWind() {
        return wind;
    }

    public void setWind(Wind wind) {
        this.wind = wind;
    }

    public Cloud getCloudiness() {
        return cloudiness;
    }

    public void setCloudiness(Cloud cloudiness) {
        this.cloudiness = cloudiness;
    }

    public Long getDt() {
        return dt;
    }

    public void setDt(Long dt) {
        this.dt = dt;
    }

    public WeatherSys getSys() {
        return sys;
    }

    public void setSys(WeatherSys sys) {
        this.sys = sys;
    }

    public Long getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(Long timeZone) {
        this.timeZone = timeZone;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCod() {
        return cod;
    }

    public void setCod(Integer cod) {
        this.cod = cod;
    }


    @Override
    public String toString() {
        return "WeatherApiResponse{" +
                "coord=" + coord +
                ", weather=" + weather +
                ", base='" + base + '\'' +
                ", main=" + main +
                ", visibility=" + visibility +
                ", wind=" + wind +
                ", cloudiness=" + cloudiness +
                ", dt=" + dt +
                ", sys=" + sys +
                ", timeZone=" + timeZone +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", cod=" + cod +
                '}';
    }
}
