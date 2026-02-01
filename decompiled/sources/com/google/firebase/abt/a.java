package com.google.firebase.abt;

import android.text.TextUtils;
import androidx.annotation.i0;
import com.google.firebase.analytics.connector.a;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: g, reason: collision with root package name */
    @i0
    static final String f34481g = "experimentId";

    /* renamed from: h, reason: collision with root package name */
    @i0
    static final String f34482h = "variantId";

    /* renamed from: i, reason: collision with root package name */
    @i0
    static final String f34483i = "triggerEvent";

    /* renamed from: a, reason: collision with root package name */
    private final String f34489a;

    /* renamed from: b, reason: collision with root package name */
    private final String f34490b;

    /* renamed from: c, reason: collision with root package name */
    private final String f34491c;

    /* renamed from: d, reason: collision with root package name */
    private final Date f34492d;

    /* renamed from: e, reason: collision with root package name */
    private final long f34493e;

    /* renamed from: f, reason: collision with root package name */
    private final long f34494f;

    /* renamed from: j, reason: collision with root package name */
    @i0
    static final String f34484j = "experimentStartTime";

    /* renamed from: l, reason: collision with root package name */
    @i0
    static final String f34486l = "timeToLiveMillis";

    /* renamed from: k, reason: collision with root package name */
    @i0
    static final String f34485k = "triggerTimeoutMillis";

    /* renamed from: m, reason: collision with root package name */
    private static final String[] f34487m = {"experimentId", f34484j, f34486l, f34485k, "variantId"};

    /* renamed from: n, reason: collision with root package name */
    @i0
    static final DateFormat f34488n = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);

    public a(String str, String str2, String str3, Date date, long j4, long j5) {
        this.f34489a = str;
        this.f34490b = str2;
        this.f34491c = str3;
        this.f34492d = date;
        this.f34493e = j4;
        this.f34494f = j5;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static a a(a.c cVar) {
        String str = cVar.f34826d;
        if (str == null) {
            str = "";
        }
        return new a(cVar.f34824b, String.valueOf(cVar.f34825c), str, new Date(cVar.f34835m), cVar.f34827e, cVar.f34832j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static a b(Map<String, String> map) throws AbtException {
        String str;
        l(map);
        try {
            Date parse = f34488n.parse(map.get(f34484j));
            long parseLong = Long.parseLong(map.get(f34485k));
            long parseLong2 = Long.parseLong(map.get(f34486l));
            String str2 = map.get("experimentId");
            String str3 = map.get("variantId");
            if (map.containsKey(f34483i)) {
                str = map.get(f34483i);
            } else {
                str = "";
            }
            return new a(str2, str3, str, parse, parseLong, parseLong2);
        } catch (NumberFormatException e4) {
            throw new AbtException("Could not process experiment: one of the durations could not be converted into a long.", e4);
        } catch (ParseException e5) {
            throw new AbtException("Could not process experiment: parsing experiment start time failed.", e5);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void k(a aVar) throws AbtException {
        l(aVar.j());
    }

    private static void l(Map<String, String> map) throws AbtException {
        ArrayList arrayList = new ArrayList();
        for (String str : f34487m) {
            if (!map.containsKey(str)) {
                arrayList.add(str);
            }
        }
        if (!arrayList.isEmpty()) {
            throw new AbtException(String.format("The following keys are missing from the experiment info map: %s", arrayList));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String c() {
        return this.f34489a;
    }

    long d() {
        return this.f34492d.getTime();
    }

    long e() {
        return this.f34494f;
    }

    String f() {
        return this.f34491c;
    }

    long g() {
        return this.f34493e;
    }

    String h() {
        return this.f34490b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a.c i(String str) {
        String str2;
        a.c cVar = new a.c();
        cVar.f34823a = str;
        cVar.f34835m = d();
        cVar.f34824b = this.f34489a;
        cVar.f34825c = this.f34490b;
        if (TextUtils.isEmpty(this.f34491c)) {
            str2 = null;
        } else {
            str2 = this.f34491c;
        }
        cVar.f34826d = str2;
        cVar.f34827e = this.f34493e;
        cVar.f34832j = this.f34494f;
        return cVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0
    public Map<String, String> j() {
        HashMap hashMap = new HashMap();
        hashMap.put("experimentId", this.f34489a);
        hashMap.put("variantId", this.f34490b);
        hashMap.put(f34483i, this.f34491c);
        hashMap.put(f34484j, f34488n.format(this.f34492d));
        hashMap.put(f34485k, Long.toString(this.f34493e));
        hashMap.put(f34486l, Long.toString(this.f34494f));
        return hashMap;
    }
}
