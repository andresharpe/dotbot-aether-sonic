package com.harman.jbl.partybox.firmware;

import java.util.Map;
import kotlin.text.A;
import kotlin.text.z;

/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @W2.f
    @l3.e
    public String f40545a;

    /* renamed from: b, reason: collision with root package name */
    @W2.f
    @l3.e
    public String f40546b;

    /* renamed from: c, reason: collision with root package name */
    @W2.f
    @l3.e
    public String f40547c;

    /* renamed from: d, reason: collision with root package name */
    @W2.f
    @l3.e
    public String f40548d;

    /* renamed from: e, reason: collision with root package name */
    @W2.f
    @l3.e
    public String f40549e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f40550f;

    /* renamed from: g, reason: collision with root package name */
    @l3.e
    private Map<String, h> f40551g;

    @l3.e
    public final Map<String, h> a() {
        return this.f40551g;
    }

    public final boolean b() {
        boolean S12;
        boolean S13;
        boolean T22;
        String str = this.f40545a;
        String str2 = this.f40549e;
        if (str != null) {
            S12 = z.S1(str);
            if (!S12 && str2 != null) {
                S13 = z.S1(str2);
                if (!S13) {
                    T22 = A.T2(str2, str, false, 2, null);
                    if (!T22) {
                        return false;
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final boolean c() {
        return this.f40550f;
    }

    public final void d(boolean z3) {
        this.f40550f = z3;
    }

    public final void e(@l3.e Map<String, h> map) {
        this.f40551g = map;
    }

    @l3.d
    public String toString() {
        return "RemoteUpdateModel {md5 = " + this.f40545a + ", releaseId = " + this.f40546b + ", URL = " + this.f40548d + ", localFilePath = " + this.f40549e + ", isUpdateAvailable = " + this.f40550f + ", whatsNewMap = " + this.f40551g + "}";
    }
}
