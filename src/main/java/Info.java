import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "f",
        "n",
        "nr",
        "ns",
        "nsr",
        "p",
        "lat",
        "lon",
        "tzinfo",
        "def_pressure_mm",
        "def_pressure_pa",
        "_h",
        "url"
})
public class Info {

    @JsonProperty("f")
    private Boolean f;
    @JsonProperty("n")
    private Boolean n;
    @JsonProperty("nr")
    private Boolean nr;
    @JsonProperty("ns")
    private Boolean ns;
    @JsonProperty("nsr")
    private Boolean nsr;
    @JsonProperty("p")
    private Boolean p;
    @JsonProperty("lat")
    private Double lat;
    @JsonProperty("lon")
    private Double lon;
//    @JsonProperty("tzinfo")
//    private Tzinfo tzinfo;
    @JsonProperty("def_pressure_mm")
    private Integer defPressureMm;
    @JsonProperty("def_pressure_pa")
    private Integer defPressurePa;
    @JsonProperty("_h")
    private Boolean h;
    @JsonProperty("url")
    private String url;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("f")
    public Boolean getF() {
        return f;
    }

    @JsonProperty("f")
    public void setF(Boolean f) {
        this.f = f;
    }

    @JsonProperty("n")
    public Boolean getN() {
        return n;
    }

    @JsonProperty("n")
    public void setN(Boolean n) {
        this.n = n;
    }

    @JsonProperty("nr")
    public Boolean getNr() {
        return nr;
    }

    @JsonProperty("nr")
    public void setNr(Boolean nr) {
        this.nr = nr;
    }

    @JsonProperty("ns")
    public Boolean getNs() {
        return ns;
    }

    @JsonProperty("ns")
    public void setNs(Boolean ns) {
        this.ns = ns;
    }

    @JsonProperty("nsr")
    public Boolean getNsr() {
        return nsr;
    }

    @JsonProperty("nsr")
    public void setNsr(Boolean nsr) {
        this.nsr = nsr;
    }

    @JsonProperty("p")
    public Boolean getP() {
        return p;
    }

    @JsonProperty("p")
    public void setP(Boolean p) {
        this.p = p;
    }

    @JsonProperty("lat")
    public Double getLat() {
        return lat;
    }

    @JsonProperty("lat")
    public void setLat(Double lat) {
        this.lat = lat;
    }

    @JsonProperty("lon")
    public Double getLon() {
        return lon;
    }

    @JsonProperty("lon")
    public void setLon(Double lon) {
        this.lon = lon;
    }

//    @JsonProperty("tzinfo")
//    public Tzinfo getTzinfo() {
//        return tzinfo;
//    }

//    @JsonProperty("tzinfo")
//    public void setTzinfo(Tzinfo tzinfo) {
//        this.tzinfo = tzinfo;
//    }

    @JsonProperty("def_pressure_mm")
    public Integer getDefPressureMm() {
        return defPressureMm;
    }

    @JsonProperty("def_pressure_mm")
    public void setDefPressureMm(Integer defPressureMm) {
        this.defPressureMm = defPressureMm;
    }

    @JsonProperty("def_pressure_pa")
    public Integer getDefPressurePa() {
        return defPressurePa;
    }

    @JsonProperty("def_pressure_pa")
    public void setDefPressurePa(Integer defPressurePa) {
        this.defPressurePa = defPressurePa;
    }

    @JsonProperty("_h")
    public Boolean getH() {
        return h;
    }

    @JsonProperty("_h")
    public void setH(Boolean h) {
        this.h = h;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}