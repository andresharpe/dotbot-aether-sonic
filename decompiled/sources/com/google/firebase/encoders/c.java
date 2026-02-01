package com.google.firebase.encoders;

import androidx.annotation.N;
import androidx.annotation.P;
import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final String f35905a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<Class<?>, Object> f35906b;

    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final String f35907a;

        /* renamed from: b, reason: collision with root package name */
        private Map<Class<?>, Object> f35908b = null;

        b(String str) {
            this.f35907a = str;
        }

        @N
        public c a() {
            Map unmodifiableMap;
            String str = this.f35907a;
            if (this.f35908b == null) {
                unmodifiableMap = Collections.emptyMap();
            } else {
                unmodifiableMap = Collections.unmodifiableMap(new HashMap(this.f35908b));
            }
            return new c(str, unmodifiableMap);
        }

        @N
        public <T extends Annotation> b b(@N T t3) {
            if (this.f35908b == null) {
                this.f35908b = new HashMap();
            }
            this.f35908b.put(t3.annotationType(), t3);
            return this;
        }
    }

    @N
    public static b a(@N String str) {
        return new b(str);
    }

    @N
    public static c d(@N String str) {
        return new c(str, Collections.emptyMap());
    }

    @N
    public String b() {
        return this.f35905a;
    }

    @P
    public <T extends Annotation> T c(@N Class<T> cls) {
        return (T) this.f35906b.get(cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f35905a.equals(cVar.f35905a) && this.f35906b.equals(cVar.f35906b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f35905a.hashCode() * 31) + this.f35906b.hashCode();
    }

    @N
    public String toString() {
        return "FieldDescriptor{name=" + this.f35905a + ", properties=" + this.f35906b.values() + "}";
    }

    private c(String str, Map<Class<?>, Object> map) {
        this.f35905a = str;
        this.f35906b = map;
    }
}
