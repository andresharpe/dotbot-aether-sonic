package jar.model_new;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.Map;

/* loaded from: classes2.dex */
public class RequestPayloadDataNew implements Serializable {

    /* renamed from: E, reason: collision with root package name */
    @SerializedName("general")
    private RequestPayloadDataGeneral f51478E = null;

    /* renamed from: F, reason: collision with root package name */
    @SerializedName("partybox")
    private Map<String, Object> f51479F = null;

    public Map<String, Object> a() {
        return this.f51479F;
    }

    public RequestPayloadDataGeneral b() {
        return this.f51478E;
    }

    public void c(Map<String, Object> map) {
        this.f51479F = map;
    }

    public void d(RequestPayloadDataGeneral requestPayloadDataGeneral) {
        this.f51478E = requestPayloadDataGeneral;
    }
}
