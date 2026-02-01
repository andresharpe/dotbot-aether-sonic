package jar.model;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* loaded from: classes2.dex */
public class RequestPayloadDataAppAnalytics implements Serializable {

    /* renamed from: E, reason: collision with root package name */
    @SerializedName("appPlatform")
    private String f51060E = null;

    /* renamed from: F, reason: collision with root package name */
    @SerializedName("appPlatVer")
    private String f51061F = null;

    /* renamed from: G, reason: collision with root package name */
    @SerializedName("mobDevBrand")
    private String f51062G = null;

    /* renamed from: H, reason: collision with root package name */
    @SerializedName("mobModel")
    private String f51063H = null;

    public String a() {
        return this.f51061F;
    }

    public String b() {
        return this.f51060E;
    }

    public String c() {
        return this.f51062G;
    }

    public String d() {
        return this.f51063H;
    }

    public void e(String str) {
        this.f51061F = str;
    }

    public void f(String str) {
        this.f51060E = str;
    }

    public void g(String str) {
        this.f51062G = str;
    }

    public void h(String str) {
        this.f51063H = str;
    }
}
