package melio.megan.dashboardserver.domain.weather.models;

public class WeatherMain {
    private Double temp;
    private Double feels_like;
    private Double max;
    private Double min;
    private Integer pressure;
    private Integer humidity;

    public Double getTemp() {
        return temp;
    }

    public void setTemp(Double temp) {
        this.temp = temp;
    }

    public Double getFeels_like() {
        return feels_like;
    }

    public void setFeels_like(Double feels_like) {
        this.feels_like = feels_like;
    }

    public Double getMax() {
        return max;
    }

    public void setMax(Double max) {
        this.max = max;
    }

    public Double getMin() {
        return min;
    }

    public void setMin(Double min) {
        this.min = min;
    }

    public Integer getPressure() {
        return pressure;
    }

    public void setPressure(Integer pressure) {
        this.pressure = pressure;
    }

    public Integer getHumidity() {
        return humidity;
    }

    public void setHumidity(Integer humidity) {
        this.humidity = humidity;
    }


    @Override
    public String toString() {
        return "WeatherMain{" +
                "temp=" + temp +
                ", feels_like=" + feels_like +
                ", max=" + max +
                ", min=" + min +
                ", pressure=" + pressure +
                ", humidity=" + humidity +
                '}';
    }
}
