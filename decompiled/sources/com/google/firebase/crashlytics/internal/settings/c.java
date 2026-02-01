package com.google.firebase.crashlytics.internal.settings;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.N;
import androidx.annotation.P;
import com.google.android.gms.tasks.AbstractC1770k;
import com.google.android.gms.tasks.C1771l;
import com.google.android.gms.tasks.C1773n;
import com.google.android.gms.tasks.InterfaceC1769j;
import com.google.firebase.crashlytics.internal.common.C1799g;
import com.google.firebase.crashlytics.internal.common.C1812u;
import com.google.firebase.crashlytics.internal.common.DeliveryMechanism;
import com.google.firebase.crashlytics.internal.common.InterfaceC1811t;
import com.google.firebase.crashlytics.internal.common.S;
import com.google.firebase.crashlytics.internal.common.x;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;
import q1.C2397b;

/* loaded from: classes2.dex */
public class c implements d {

    /* renamed from: j, reason: collision with root package name */
    private static final String f35653j = "existing_instance_identifier";

    /* renamed from: k, reason: collision with root package name */
    private static final String f35654k = "https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/%s/settings";

    /* renamed from: a, reason: collision with root package name */
    private final Context f35655a;

    /* renamed from: b, reason: collision with root package name */
    private final q1.g f35656b;

    /* renamed from: c, reason: collision with root package name */
    private final f f35657c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC1811t f35658d;

    /* renamed from: e, reason: collision with root package name */
    private final com.google.firebase.crashlytics.internal.settings.a f35659e;

    /* renamed from: f, reason: collision with root package name */
    private final com.google.firebase.crashlytics.internal.settings.network.b f35660f;

    /* renamed from: g, reason: collision with root package name */
    private final C1812u f35661g;

    /* renamed from: h, reason: collision with root package name */
    private final AtomicReference<q1.e> f35662h;

    /* renamed from: i, reason: collision with root package name */
    private final AtomicReference<C1771l<C2397b>> f35663i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a implements InterfaceC1769j<Void, Void> {
        a() {
        }

        @Override // com.google.android.gms.tasks.InterfaceC1769j
        @N
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public AbstractC1770k<Void> a(@P Void r5) throws Exception {
            JSONObject a4 = c.this.f35660f.a(c.this.f35656b, true);
            if (a4 != null) {
                q1.f b4 = c.this.f35657c.b(a4);
                c.this.f35659e.c(b4.b(), a4);
                c.this.q(a4, "Loaded settings: ");
                c cVar = c.this;
                cVar.r(cVar.f35656b.f57362f);
                c.this.f35662h.set(b4);
                ((C1771l) c.this.f35663i.get()).e(b4.g());
                C1771l c1771l = new C1771l();
                c1771l.e(b4.g());
                c.this.f35663i.set(c1771l);
            }
            return C1773n.g(null);
        }
    }

    c(Context context, q1.g gVar, InterfaceC1811t interfaceC1811t, f fVar, com.google.firebase.crashlytics.internal.settings.a aVar, com.google.firebase.crashlytics.internal.settings.network.b bVar, C1812u c1812u) {
        AtomicReference<q1.e> atomicReference = new AtomicReference<>();
        this.f35662h = atomicReference;
        this.f35663i = new AtomicReference<>(new C1771l());
        this.f35655a = context;
        this.f35656b = gVar;
        this.f35658d = interfaceC1811t;
        this.f35657c = fVar;
        this.f35659e = aVar;
        this.f35660f = bVar;
        this.f35661g = c1812u;
        atomicReference.set(b.f(interfaceC1811t));
    }

    public static c l(Context context, String str, x xVar, p1.b bVar, String str2, String str3, C1812u c1812u) {
        String g4 = xVar.g();
        S s4 = new S();
        return new c(context, new q1.g(str, xVar.h(), xVar.i(), xVar.j(), xVar, C1799g.h(C1799g.o(context), str, str3, str2), str3, str2, DeliveryMechanism.b(g4).e()), s4, new f(s4), new com.google.firebase.crashlytics.internal.settings.a(context), new com.google.firebase.crashlytics.internal.settings.network.a(String.format(Locale.US, f35654k, str), bVar), c1812u);
    }

    private q1.f m(SettingsCacheBehavior settingsCacheBehavior) {
        q1.f fVar = null;
        try {
            if (!SettingsCacheBehavior.SKIP_CACHE_LOOKUP.equals(settingsCacheBehavior)) {
                JSONObject b4 = this.f35659e.b();
                if (b4 != null) {
                    q1.f b5 = this.f35657c.b(b4);
                    if (b5 != null) {
                        q(b4, "Loaded cached settings: ");
                        long a4 = this.f35658d.a();
                        if (!SettingsCacheBehavior.IGNORE_CACHE_EXPIRATION.equals(settingsCacheBehavior) && b5.d(a4)) {
                            com.google.firebase.crashlytics.internal.f.f().k("Cached settings have expired.");
                        }
                        try {
                            com.google.firebase.crashlytics.internal.f.f().k("Returning cached settings.");
                            fVar = b5;
                        } catch (Exception e4) {
                            e = e4;
                            fVar = b5;
                            com.google.firebase.crashlytics.internal.f.f().e("Failed to get cached settings", e);
                            return fVar;
                        }
                    } else {
                        com.google.firebase.crashlytics.internal.f.f().e("Failed to parse cached settings data.", null);
                    }
                } else {
                    com.google.firebase.crashlytics.internal.f.f().b("No cached settings data found.");
                }
            }
        } catch (Exception e5) {
            e = e5;
        }
        return fVar;
    }

    private String n() {
        return C1799g.s(this.f35655a).getString(f35653j, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q(JSONObject jSONObject, String str) throws JSONException {
        com.google.firebase.crashlytics.internal.f.f().b(str + jSONObject.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"CommitPrefEdits"})
    public boolean r(String str) {
        SharedPreferences.Editor edit = C1799g.s(this.f35655a).edit();
        edit.putString(f35653j, str);
        edit.apply();
        return true;
    }

    @Override // com.google.firebase.crashlytics.internal.settings.d
    public AbstractC1770k<C2397b> a() {
        return this.f35663i.get().a();
    }

    @Override // com.google.firebase.crashlytics.internal.settings.d
    public q1.e b() {
        return this.f35662h.get();
    }

    boolean k() {
        return !n().equals(this.f35656b.f57362f);
    }

    public AbstractC1770k<Void> o(SettingsCacheBehavior settingsCacheBehavior, Executor executor) {
        q1.f m4;
        if (!k() && (m4 = m(settingsCacheBehavior)) != null) {
            this.f35662h.set(m4);
            this.f35663i.get().e(m4.g());
            return C1773n.g(null);
        }
        q1.f m5 = m(SettingsCacheBehavior.IGNORE_CACHE_EXPIRATION);
        if (m5 != null) {
            this.f35662h.set(m5);
            this.f35663i.get().e(m5.g());
        }
        return this.f35661g.j().x(executor, new a());
    }

    public AbstractC1770k<Void> p(Executor executor) {
        return o(SettingsCacheBehavior.USE_CACHE, executor);
    }
}
