package jar.model_new;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* loaded from: classes2.dex */
public class RequestPayloadNew implements Serializable {

    /* renamed from: E, reason: collision with root package name */
    @SerializedName("partition_key")
    private String f51480E = null;

    /* renamed from: F, reason: collision with root package name */
    @SerializedName("analytics_payload")
    private RequestPayloadDataNew f51481F = null;

    public RequestPayloadDataNew a() {
        return this.f51481F;
    }

    public String b() {
        return this.f51480E;
    }

    public void c(RequestPayloadDataNew requestPayloadDataNew) {
        this.f51481F = requestPayloadDataNew;
    }

    public void d(String str) {
        this.f51480E = str;
    }
}
