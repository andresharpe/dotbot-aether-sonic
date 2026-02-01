package jar.model;

import com.google.firebase.remoteconfig.u;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* loaded from: classes2.dex */
public class RequestPayloadDataHarmanDevice implements Serializable {

    /* renamed from: E, reason: collision with root package name */
    @SerializedName("macAddress")
    private String f51261E = null;

    /* renamed from: F, reason: collision with root package name */
    @SerializedName("productId")
    private Integer f51262F = null;

    /* renamed from: G, reason: collision with root package name */
    @SerializedName("productName")
    private String f51263G = null;

    /* renamed from: H, reason: collision with root package name */
    @SerializedName("firmwareVersion")
    private String f51264H = null;

    /* renamed from: I, reason: collision with root package name */
    @SerializedName(u.b.f37785c0)
    private String f51265I = null;

    /* renamed from: J, reason: collision with root package name */
    @SerializedName("appUploadTime")
    private String f51266J = null;

    /* renamed from: K, reason: collision with root package name */
    @SerializedName("source")
    private String f51267K = null;

    public String a() {
        return this.f51266J;
    }

    public String b() {
        return this.f51265I;
    }

    public String c() {
        return this.f51264H;
    }

    public String d() {
        return this.f51261E;
    }

    public Integer e() {
        return this.f51262F;
    }

    public String f() {
        return this.f51263G;
    }

    public String g() {
        return this.f51267K;
    }

    public void h(String str) {
        this.f51266J = str;
    }

    public void i(String str) {
        this.f51265I = str;
    }

    public void j(String str) {
        this.f51264H = str;
    }

    public void k(String str) {
        this.f51261E = str;
    }

    public void l(Integer num) {
        this.f51262F = num;
    }

    public void m(String str) {
        this.f51263G = str;
    }

    public void n(String str) {
        this.f51267K = str;
    }
}
