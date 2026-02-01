package com.google.firebase.remoteconfig.internal;

import android.text.format.DateUtils;
import androidx.annotation.P;
import androidx.annotation.i0;
import androidx.annotation.j0;
import androidx.constraintlayout.core.motion.utils.v;
import com.google.android.gms.common.util.InterfaceC1306g;
import com.google.android.gms.tasks.AbstractC1770k;
import com.google.android.gms.tasks.C1773n;
import com.google.android.gms.tasks.InterfaceC1762c;
import com.google.android.gms.tasks.InterfaceC1769j;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigFetchThrottledException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import com.google.firebase.remoteconfig.internal.k;
import com.google.firebase.remoteconfig.internal.n;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class k {

    /* renamed from: j, reason: collision with root package name */
    public static final long f37443j = TimeUnit.HOURS.toSeconds(12);

    /* renamed from: k, reason: collision with root package name */
    @i0
    static final int[] f37444k = {2, 4, 8, 16, 32, 64, 128, 256};

    /* renamed from: l, reason: collision with root package name */
    @i0
    static final int f37445l = 429;

    /* renamed from: m, reason: collision with root package name */
    @i0
    static final String f37446m = "_fot";

    /* renamed from: a, reason: collision with root package name */
    private final com.google.firebase.installations.j f37447a;

    /* renamed from: b, reason: collision with root package name */
    private final C1.b<com.google.firebase.analytics.connector.a> f37448b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f37449c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC1306g f37450d;

    /* renamed from: e, reason: collision with root package name */
    private final Random f37451e;

    /* renamed from: f, reason: collision with root package name */
    private final e f37452f;

    /* renamed from: g, reason: collision with root package name */
    private final ConfigFetchHttpClient f37453g;

    /* renamed from: h, reason: collision with root package name */
    private final n f37454h;

    /* renamed from: i, reason: collision with root package name */
    private final Map<String, String> f37455i;

    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final Date f37456a;

        /* renamed from: b, reason: collision with root package name */
        private final int f37457b;

        /* renamed from: c, reason: collision with root package name */
        private final f f37458c;

        /* renamed from: d, reason: collision with root package name */
        @P
        private final String f37459d;

        @Retention(RetentionPolicy.SOURCE)
        /* renamed from: com.google.firebase.remoteconfig.internal.k$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public @interface InterfaceC0342a {

            /* renamed from: D0, reason: collision with root package name */
            public static final int f37460D0 = 0;

            /* renamed from: E0, reason: collision with root package name */
            public static final int f37461E0 = 1;

            /* renamed from: F0, reason: collision with root package name */
            public static final int f37462F0 = 2;
        }

        private a(Date date, int i4, f fVar, @P String str) {
            this.f37456a = date;
            this.f37457b = i4;
            this.f37458c = fVar;
            this.f37459d = str;
        }

        public static a a(Date date) {
            return new a(date, 1, null, null);
        }

        public static a b(f fVar, String str) {
            return new a(fVar.e(), 0, fVar, str);
        }

        public static a c(Date date) {
            return new a(date, 2, null, null);
        }

        Date d() {
            return this.f37456a;
        }

        public f e() {
            return this.f37458c;
        }

        @P
        String f() {
            return this.f37459d;
        }

        int g() {
            return this.f37457b;
        }
    }

    public k(com.google.firebase.installations.j jVar, C1.b<com.google.firebase.analytics.connector.a> bVar, Executor executor, InterfaceC1306g interfaceC1306g, Random random, e eVar, ConfigFetchHttpClient configFetchHttpClient, n nVar, Map<String, String> map) {
        this.f37447a = jVar;
        this.f37448b = bVar;
        this.f37449c = executor;
        this.f37450d = interfaceC1306g;
        this.f37451e = random;
        this.f37452f = eVar;
        this.f37453g = configFetchHttpClient;
        this.f37454h = nVar;
        this.f37455i = map;
    }

    private boolean e(long j4, Date date) {
        Date g4 = this.f37454h.g();
        if (g4.equals(n.f37474e)) {
            return false;
        }
        return date.before(new Date(g4.getTime() + TimeUnit.SECONDS.toMillis(j4)));
    }

    private FirebaseRemoteConfigServerException f(FirebaseRemoteConfigServerException firebaseRemoteConfigServerException) throws FirebaseRemoteConfigClientException {
        String str;
        int a4 = firebaseRemoteConfigServerException.a();
        if (a4 != 401) {
            if (a4 != 403) {
                if (a4 != f37445l) {
                    if (a4 != 500) {
                        switch (a4) {
                            case v.g.f7527j /* 502 */:
                            case v.g.f7528k /* 503 */:
                            case v.g.f7529l /* 504 */:
                                str = "The server is unavailable. Please try again later.";
                                break;
                            default:
                                str = "The server returned an unexpected error.";
                                break;
                        }
                    } else {
                        str = "There was an internal server error.";
                    }
                } else {
                    throw new FirebaseRemoteConfigClientException("The throttled response from the server was not handled correctly by the FRC SDK.");
                }
            } else {
                str = "The user is not authorized to access the project. Please make sure you are using the API key that corresponds to your Firebase project.";
            }
        } else {
            str = "The request did not have the required credentials. Please make sure your google-services.json is valid.";
        }
        return new FirebaseRemoteConfigServerException(firebaseRemoteConfigServerException.a(), "Fetch failed: " + str, firebaseRemoteConfigServerException);
    }

    private String g(long j4) {
        return String.format("Fetch is throttled. Please wait before calling fetch again: %s", DateUtils.formatElapsedTime(TimeUnit.MILLISECONDS.toSeconds(j4)));
    }

    @j0
    private a j(String str, String str2, Date date) throws FirebaseRemoteConfigException {
        try {
            a fetch = this.f37453g.fetch(this.f37453g.d(), str, str2, q(), this.f37454h.e(), this.f37455i, o(), date);
            if (fetch.f() != null) {
                this.f37454h.m(fetch.f());
            }
            this.f37454h.i();
            return fetch;
        } catch (FirebaseRemoteConfigServerException e4) {
            n.a x3 = x(e4.a(), date);
            if (w(x3, e4.a())) {
                throw new FirebaseRemoteConfigFetchThrottledException(x3.a().getTime());
            }
            throw f(e4);
        }
    }

    private AbstractC1770k<a> k(String str, String str2, Date date) {
        try {
            final a j4 = j(str, str2, date);
            if (j4.g() != 0) {
                return C1773n.g(j4);
            }
            return this.f37452f.m(j4.e()).x(this.f37449c, new InterfaceC1769j() { // from class: com.google.firebase.remoteconfig.internal.h
                @Override // com.google.android.gms.tasks.InterfaceC1769j
                public final AbstractC1770k a(Object obj) {
                    AbstractC1770k g4;
                    g4 = C1773n.g(k.a.this);
                    return g4;
                }
            });
        } catch (FirebaseRemoteConfigException e4) {
            return C1773n.f(e4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public AbstractC1770k<a> s(AbstractC1770k<f> abstractC1770k, long j4) {
        AbstractC1770k p4;
        final Date date = new Date(this.f37450d.a());
        if (abstractC1770k.v() && e(j4, date)) {
            return C1773n.g(a.c(date));
        }
        Date n4 = n(date);
        if (n4 != null) {
            p4 = C1773n.f(new FirebaseRemoteConfigFetchThrottledException(g(n4.getTime() - date.getTime()), n4.getTime()));
        } else {
            final AbstractC1770k<String> id = this.f37447a.getId();
            final AbstractC1770k<com.google.firebase.installations.n> a4 = this.f37447a.a(false);
            p4 = C1773n.k(id, a4).p(this.f37449c, new InterfaceC1762c() { // from class: com.google.firebase.remoteconfig.internal.i
                @Override // com.google.android.gms.tasks.InterfaceC1762c
                public final Object a(AbstractC1770k abstractC1770k2) {
                    AbstractC1770k u3;
                    u3 = k.this.u(id, a4, date, abstractC1770k2);
                    return u3;
                }
            });
        }
        return p4.p(this.f37449c, new InterfaceC1762c() { // from class: com.google.firebase.remoteconfig.internal.j
            @Override // com.google.android.gms.tasks.InterfaceC1762c
            public final Object a(AbstractC1770k abstractC1770k2) {
                AbstractC1770k v3;
                v3 = k.this.v(date, abstractC1770k2);
                return v3;
            }
        });
    }

    @P
    private Date n(Date date) {
        Date a4 = this.f37454h.b().a();
        if (date.before(a4)) {
            return a4;
        }
        return null;
    }

    @j0
    private Long o() {
        com.google.firebase.analytics.connector.a aVar = this.f37448b.get();
        if (aVar == null) {
            return null;
        }
        return (Long) aVar.a(true).get(f37446m);
    }

    private long p(int i4) {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        int[] iArr = f37444k;
        return (timeUnit.toMillis(iArr[Math.min(i4, iArr.length) - 1]) / 2) + this.f37451e.nextInt((int) r0);
    }

    @j0
    private Map<String, String> q() {
        HashMap hashMap = new HashMap();
        com.google.firebase.analytics.connector.a aVar = this.f37448b.get();
        if (aVar == null) {
            return hashMap;
        }
        for (Map.Entry<String, Object> entry : aVar.a(false).entrySet()) {
            hashMap.put(entry.getKey(), entry.getValue().toString());
        }
        return hashMap;
    }

    private boolean r(int i4) {
        return i4 == f37445l || i4 == 502 || i4 == 503 || i4 == 504;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ AbstractC1770k u(AbstractC1770k abstractC1770k, AbstractC1770k abstractC1770k2, Date date, AbstractC1770k abstractC1770k3) throws Exception {
        if (!abstractC1770k.v()) {
            return C1773n.f(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation ID for fetch.", abstractC1770k.q()));
        }
        if (!abstractC1770k2.v()) {
            return C1773n.f(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation auth token for fetch.", abstractC1770k2.q()));
        }
        return k((String) abstractC1770k.r(), ((com.google.firebase.installations.n) abstractC1770k2.r()).b(), date);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ AbstractC1770k v(Date date, AbstractC1770k abstractC1770k) throws Exception {
        z(abstractC1770k, date);
        return abstractC1770k;
    }

    private boolean w(n.a aVar, int i4) {
        if (aVar.b() > 1 || i4 == f37445l) {
            return true;
        }
        return false;
    }

    private n.a x(int i4, Date date) {
        if (r(i4)) {
            y(date);
        }
        return this.f37454h.b();
    }

    private void y(Date date) {
        int b4 = this.f37454h.b().b() + 1;
        this.f37454h.j(b4, new Date(date.getTime() + p(b4)));
    }

    private void z(AbstractC1770k<a> abstractC1770k, Date date) {
        if (abstractC1770k.v()) {
            this.f37454h.o(date);
            return;
        }
        Exception q4 = abstractC1770k.q();
        if (q4 == null) {
            return;
        }
        if (q4 instanceof FirebaseRemoteConfigFetchThrottledException) {
            this.f37454h.p();
        } else {
            this.f37454h.n();
        }
    }

    public AbstractC1770k<a> h() {
        return i(this.f37454h.h());
    }

    public AbstractC1770k<a> i(final long j4) {
        return this.f37452f.f().p(this.f37449c, new InterfaceC1762c() { // from class: com.google.firebase.remoteconfig.internal.g
            @Override // com.google.android.gms.tasks.InterfaceC1762c
            public final Object a(AbstractC1770k abstractC1770k) {
                AbstractC1770k s4;
                s4 = k.this.s(j4, abstractC1770k);
                return s4;
            }
        });
    }

    @i0
    public C1.b<com.google.firebase.analytics.connector.a> m() {
        return this.f37448b;
    }
}
