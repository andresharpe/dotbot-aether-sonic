package jar.model;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class RequestPayloadData implements Serializable {

    /* renamed from: E, reason: collision with root package name */
    @SerializedName("cmd")
    private String f51055E = null;

    /* renamed from: F, reason: collision with root package name */
    @SerializedName("harmanDevice")
    private RequestPayloadDataHarmanDevice f51056F = null;

    /* renamed from: G, reason: collision with root package name */
    @SerializedName("deviceAnalytics")
    private RequestPayloadDataDeviceAnalytics f51057G = null;

    /* renamed from: H, reason: collision with root package name */
    @SerializedName("playAnalytics")
    private List<Map<String, Integer>> f51058H = null;

    /* renamed from: I, reason: collision with root package name */
    @SerializedName("appAnalytics")
    private RequestPayloadDataAppAnalytics f51059I = null;

    public RequestPayloadDataAppAnalytics a() {
        return this.f51059I;
    }

    public String b() {
        return this.f51055E;
    }

    public RequestPayloadDataDeviceAnalytics c() {
        return this.f51057G;
    }

    public RequestPayloadDataHarmanDevice d() {
        return this.f51056F;
    }

    public List<Map<String, Integer>> e() {
        return this.f51058H;
    }

    public void f(RequestPayloadDataAppAnalytics requestPayloadDataAppAnalytics) {
        this.f51059I = requestPayloadDataAppAnalytics;
    }

    public void g(String str) {
        this.f51055E = str;
    }

    public void h(RequestPayloadDataDeviceAnalytics requestPayloadDataDeviceAnalytics) {
        this.f51057G = requestPayloadDataDeviceAnalytics;
    }

    public void i(RequestPayloadDataHarmanDevice requestPayloadDataHarmanDevice) {
        this.f51056F = requestPayloadDataHarmanDevice;
    }

    public void j(List<Map<String, Integer>> list) {
        this.f51058H = list;
    }
}
