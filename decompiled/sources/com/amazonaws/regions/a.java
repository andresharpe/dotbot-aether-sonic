package com.amazonaws.regions;

import com.amazonaws.auth.InterfaceC1030h;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: f, reason: collision with root package name */
    private static final String f23859f = "amazonaws.com";

    /* renamed from: a, reason: collision with root package name */
    private final String f23860a;

    /* renamed from: b, reason: collision with root package name */
    private final String f23861b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, String> f23862c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private final Map<String, Boolean> f23863d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    private final Map<String, Boolean> f23864e = new HashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(String str, String str2) {
        this.f23860a = str;
        if (str2 != null && !str2.isEmpty()) {
            this.f23861b = str2;
        } else {
            this.f23861b = f23859f;
        }
    }

    public static a f(Regions regions) {
        return e.a(regions.e());
    }

    public static a g(String str) {
        return e.a(str);
    }

    public <T extends com.amazonaws.a> T a(Class<T> cls, InterfaceC1030h interfaceC1030h, com.amazonaws.d dVar) {
        T newInstance;
        try {
            if (interfaceC1030h == null && dVar == null) {
                newInstance = cls.getConstructor(new Class[0]).newInstance(new Object[0]);
            } else if (interfaceC1030h == null) {
                newInstance = cls.getConstructor(com.amazonaws.d.class).newInstance(dVar);
            } else if (dVar == null) {
                newInstance = cls.getConstructor(InterfaceC1030h.class).newInstance(interfaceC1030h);
            } else {
                newInstance = cls.getConstructor(InterfaceC1030h.class, com.amazonaws.d.class).newInstance(interfaceC1030h, dVar);
            }
            newInstance.a(this);
            return newInstance;
        } catch (Exception e4) {
            throw new RuntimeException("Couldn't instantiate instance of " + cls, e4);
        }
    }

    public String b() {
        return this.f23861b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Map<String, Boolean> c() {
        return this.f23863d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Map<String, Boolean> d() {
        return this.f23864e;
    }

    public String e() {
        return this.f23860a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        return e().equals(((a) obj).e());
    }

    public String h(String str) {
        return this.f23862c.get(str);
    }

    public int hashCode() {
        return e().hashCode();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Map<String, String> i() {
        return this.f23862c;
    }

    public boolean j(String str) {
        if (this.f23863d.containsKey(str) && this.f23863d.get(str).booleanValue()) {
            return true;
        }
        return false;
    }

    public boolean k(String str) {
        if (this.f23864e.containsKey(str) && this.f23864e.get(str).booleanValue()) {
            return true;
        }
        return false;
    }

    public boolean l(String str) {
        return this.f23862c.containsKey(str);
    }

    public String toString() {
        return e();
    }
}
