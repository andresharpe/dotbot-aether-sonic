package com.google.firebase.analytics.connector;

import android.os.Bundle;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.a0;
import androidx.annotation.j0;
import java.util.List;
import java.util.Map;
import java.util.Set;
import n1.InterfaceC2373a;

/* loaded from: classes2.dex */
public interface a {

    @I0.a
    /* renamed from: com.google.firebase.analytics.connector.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0309a {
        @I0.a
        void a();

        @I0.a
        void b();

        @I0.a
        void c(@N Set<String> set);
    }

    @I0.a
    /* loaded from: classes2.dex */
    public interface b {
        @I0.a
        void a(int i4, @P Bundle bundle);
    }

    @I0.a
    /* loaded from: classes2.dex */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        @I0.a
        @N
        public String f34823a;

        /* renamed from: b, reason: collision with root package name */
        @I0.a
        @N
        public String f34824b;

        /* renamed from: c, reason: collision with root package name */
        @P
        @I0.a
        public Object f34825c;

        /* renamed from: d, reason: collision with root package name */
        @P
        @I0.a
        public String f34826d;

        /* renamed from: e, reason: collision with root package name */
        @I0.a
        public long f34827e;

        /* renamed from: f, reason: collision with root package name */
        @P
        @I0.a
        public String f34828f;

        /* renamed from: g, reason: collision with root package name */
        @P
        @I0.a
        public Bundle f34829g;

        /* renamed from: h, reason: collision with root package name */
        @P
        @I0.a
        public String f34830h;

        /* renamed from: i, reason: collision with root package name */
        @P
        @I0.a
        public Bundle f34831i;

        /* renamed from: j, reason: collision with root package name */
        @I0.a
        public long f34832j;

        /* renamed from: k, reason: collision with root package name */
        @P
        @I0.a
        public String f34833k;

        /* renamed from: l, reason: collision with root package name */
        @P
        @I0.a
        public Bundle f34834l;

        /* renamed from: m, reason: collision with root package name */
        @I0.a
        public long f34835m;

        /* renamed from: n, reason: collision with root package name */
        @I0.a
        public boolean f34836n;

        /* renamed from: o, reason: collision with root package name */
        @I0.a
        public long f34837o;
    }

    @I0.a
    @j0
    @N
    Map<String, Object> a(boolean z3);

    @I0.a
    void b(@N c cVar);

    @I0.a
    void c(@N String str, @N String str2, @P Bundle bundle);

    @I0.a
    void clearConditionalUserProperty(@N @a0(max = 24, min = 1) String str, @P String str2, @P Bundle bundle);

    @I0.a
    @j0
    int d(@N @a0(min = 1) String str);

    @I0.a
    @j0
    @N
    List<c> e(@N String str, @P @a0(max = 23, min = 1) String str2);

    @I0.a
    void f(@N String str, @N String str2, @N Object obj);

    @P
    @I0.a
    @InterfaceC2373a
    InterfaceC0309a g(@N String str, @N b bVar);
}
