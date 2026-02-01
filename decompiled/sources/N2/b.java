package N2;

import androidx.core.app.C0;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    @SerializedName("SequenceNumber")
    private String f1707a = null;

    /* renamed from: b, reason: collision with root package name */
    @SerializedName("ShardId")
    private String f1708b = null;

    /* renamed from: c, reason: collision with root package name */
    @SerializedName(C0.f11537F0)
    private Integer f1709c = null;

    /* renamed from: d, reason: collision with root package name */
    @SerializedName("cmd")
    private String f1710d = null;

    public String a() {
        return this.f1710d;
    }

    public String b() {
        return this.f1707a;
    }

    public String c() {
        return this.f1708b;
    }

    public Integer d() {
        return this.f1709c;
    }

    public void e(String str) {
        this.f1710d = str;
    }

    public void f(String str) {
        this.f1707a = str;
    }

    public void g(String str) {
        this.f1708b = str;
    }

    public void h(Integer num) {
        this.f1709c = num;
    }
}
