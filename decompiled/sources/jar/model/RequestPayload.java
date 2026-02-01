package jar.model;

import com.google.firebase.messaging.C1821f;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* loaded from: classes2.dex */
public class RequestPayload implements Serializable {

    /* renamed from: E, reason: collision with root package name */
    @SerializedName("streamName")
    private String f51052E = null;

    /* renamed from: F, reason: collision with root package name */
    @SerializedName("partitionKey")
    private String f51053F = null;

    /* renamed from: G, reason: collision with root package name */
    @SerializedName(C1821f.C0339f.a.f37006R)
    private RequestPayloadData f51054G = null;

    public RequestPayloadData a() {
        return this.f51054G;
    }

    public String b() {
        return this.f51053F;
    }

    public String c() {
        return this.f51052E;
    }

    public void d(RequestPayloadData requestPayloadData) {
        this.f51054G = requestPayloadData;
    }

    public void e(String str) {
        this.f51053F = str;
    }

    public void f(String str) {
        this.f51052E = str;
    }
}
