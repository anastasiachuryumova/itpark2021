package lesson22.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties
public class WeatherDto {

    @JsonProperty("main")
    private MainDto main;

    @Data
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class MainDto {
        private Double temp;
    }
}
