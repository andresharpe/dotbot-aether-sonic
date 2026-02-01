package com.harman.analytics.deviceAws;

import com.google.gson.Gson;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.E;
import kotlin.jvm.internal.F;
import kotlin.text.z;
import l3.d;

@E(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0010%\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0011\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b2\u00103J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\"\u0010\f\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\"\u0010\u0010\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0007\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000bR>\u0010\u0019\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00020\u0011j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0002`\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R4\u0010\"\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u001b0\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010)\u001a\u00020#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u0010-\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010\u0007\u001a\u0004\b+\u0010\t\"\u0004\b,\u0010\u000bR(\u00101\u001a\b\u0012\u0004\u0012\u00020\u00020\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010\u001d\u001a\u0004\b/\u0010\u001f\"\u0004\b0\u0010!¨\u00064"}, d2 = {"Lcom/harman/analytics/deviceAws/PlayAnalytics;", "Ljava/io/Serializable;", "", "o", "()Ljava/lang/String;", "", androidx.exifinterface.media.a.U4, "I", com.harman.log.b.f47574c, "()I", "i", "(I)V", "deviceIdxToken", "F", "e", "l", "packageTotal", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "G", "Ljava/util/HashMap;", "f", "()Ljava/util/HashMap;", "m", "(Ljava/util/HashMap;)V", "packages", "", "", "H", "Ljava/util/List;", "c", "()Ljava/util/List;", "j", "(Ljava/util/List;)V", "features", "", "Z", "a", "()Z", "h", "(Z)V", "ackSendToDUT", "J", "g", "n", "totalDataParsed", "K", "d", "k", "keyArray", "<init>", "()V", "analytics_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class PlayAnalytics implements Serializable {

    /* renamed from: E, reason: collision with root package name */
    private int f37812E;

    /* renamed from: F, reason: collision with root package name */
    private int f37813F;

    /* renamed from: G, reason: collision with root package name */
    @d
    private HashMap<Integer, String> f37814G = new HashMap<>();

    /* renamed from: H, reason: collision with root package name */
    @d
    private List<Map<String, Integer>> f37815H = new ArrayList();

    /* renamed from: I, reason: collision with root package name */
    private boolean f37816I;

    /* renamed from: J, reason: collision with root package name */
    private int f37817J;

    /* renamed from: K, reason: collision with root package name */
    @d
    private List<String> f37818K;

    public PlayAnalytics() {
        ArrayList arrayList = new ArrayList();
        this.f37818K = arrayList;
        arrayList.add("playNumber");
        this.f37818K.add("chargingStatus");
        this.f37818K.add("volumeLevel");
        this.f37818K.add("twsStatus");
        this.f37818K.add("auracastStatus");
        this.f37818K.add("audioInStatus");
        this.f37818K.add("bassBoost");
        this.f37818K.add("lightShow");
        this.f37818K.add("karaok");
        this.f37818K.add("source");
        this.f37818K.add("eqCategoryID");
        this.f37818K.add("playDuration");
    }

    public final boolean a() {
        return this.f37816I;
    }

    public final int b() {
        return this.f37812E;
    }

    @d
    public final List<Map<String, Integer>> c() {
        return this.f37815H;
    }

    @d
    public final List<String> d() {
        return this.f37818K;
    }

    public final int e() {
        return this.f37813F;
    }

    @d
    public final HashMap<Integer, String> f() {
        return this.f37814G;
    }

    public final int g() {
        return this.f37817J;
    }

    public final void h(boolean z3) {
        this.f37816I = z3;
    }

    public final void i(int i4) {
        this.f37812E = i4;
    }

    public final void j(@d List<Map<String, Integer>> list) {
        F.p(list, "<set-?>");
        this.f37815H = list;
    }

    public final void k(@d List<String> list) {
        F.p(list, "<set-?>");
        this.f37818K = list;
    }

    public final void l(int i4) {
        this.f37813F = i4;
    }

    public final void m(@d HashMap<Integer, String> hashMap) {
        F.p(hashMap, "<set-?>");
        this.f37814G = hashMap;
    }

    public final void n(int i4) {
        this.f37817J = i4;
    }

    @d
    public final String o() {
        String i22;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\"PlayAnalytics\":{");
        stringBuffer.append("\n\"list\" : " + new Gson().toJson(this.f37815H) + ",");
        stringBuffer.append("}");
        String stringBuffer2 = stringBuffer.toString();
        F.o(stringBuffer2, "toString(...)");
        i22 = z.i2(stringBuffer2, ",}", "}", false, 4, null);
        return i22;
    }
}
