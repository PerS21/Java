
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "now",
        "now_dt",
        "info",
        "fact",
        "forecasts"
})
public class JSparce {

    @JsonProperty("now")
    private Integer now;
    @JsonProperty("now_dt")
    private String nowDt;
    @JsonProperty("info")
    private Info info;
//    @JsonProperty("fact")
//    private Fact fact;
//    @JsonProperty("forecasts")
//    private List<Forecast> forecasts = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("now")
    public Integer getNow() {
        return now;
    }

    @JsonProperty("now")
    public void setNow(Integer now) {
        this.now = now;
    }

    @JsonProperty("now_dt")
    public String getNowDt() {
        return nowDt;
    }

    @JsonProperty("now_dt")
    public void setNowDt(String nowDt) {
        this.nowDt = nowDt;
    }

    @JsonProperty("info")
    public Info getInfo() {
        return info;
    }

    @JsonProperty("info")
    public void setInfo(Info info) {
        this.info = info;
    }

//    @JsonProperty("fact")
//    public Fact getFact() {
//        return fact;
//    }

//    @JsonProperty("fact")
//    public void setFact(Fact fact) {
//        this.fact = fact;
//    }

//    @JsonProperty("forecasts")
//    public List<Forecast> getForecasts() {
//        return forecasts;
//    }

//    @JsonProperty("forecasts")
//    public void setForecasts(List<Forecast> forecasts) {
//        this.forecasts = forecasts;
//    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}