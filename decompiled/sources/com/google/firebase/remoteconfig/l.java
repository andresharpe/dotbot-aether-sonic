package com.google.firebase.remoteconfig;

import android.content.Context;
import android.util.Log;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.i0;
import androidx.annotation.k0;
import com.google.android.gms.tasks.AbstractC1770k;
import com.google.android.gms.tasks.C1773n;
import com.google.android.gms.tasks.InterfaceC1762c;
import com.google.android.gms.tasks.InterfaceC1769j;
import com.google.firebase.abt.AbtException;
import com.google.firebase.remoteconfig.internal.k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class l {

    /* renamed from: l, reason: collision with root package name */
    public static final String f37522l = "";

    /* renamed from: m, reason: collision with root package name */
    public static final long f37523m = 0;

    /* renamed from: n, reason: collision with root package name */
    public static final double f37524n = 0.0d;

    /* renamed from: o, reason: collision with root package name */
    public static final boolean f37525o = false;

    /* renamed from: p, reason: collision with root package name */
    public static final byte[] f37526p = new byte[0];

    /* renamed from: q, reason: collision with root package name */
    public static final int f37527q = 0;

    /* renamed from: r, reason: collision with root package name */
    public static final int f37528r = 1;

    /* renamed from: s, reason: collision with root package name */
    public static final int f37529s = 2;

    /* renamed from: t, reason: collision with root package name */
    public static final int f37530t = -1;

    /* renamed from: u, reason: collision with root package name */
    public static final int f37531u = 0;

    /* renamed from: v, reason: collision with root package name */
    public static final int f37532v = 1;

    /* renamed from: w, reason: collision with root package name */
    public static final int f37533w = 2;

    /* renamed from: x, reason: collision with root package name */
    public static final String f37534x = "FirebaseRemoteConfig";

    /* renamed from: a, reason: collision with root package name */
    private final Context f37535a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.firebase.e f37536b;

    /* renamed from: c, reason: collision with root package name */
    @P
    private final com.google.firebase.abt.c f37537c;

    /* renamed from: d, reason: collision with root package name */
    private final Executor f37538d;

    /* renamed from: e, reason: collision with root package name */
    private final com.google.firebase.remoteconfig.internal.e f37539e;

    /* renamed from: f, reason: collision with root package name */
    private final com.google.firebase.remoteconfig.internal.e f37540f;

    /* renamed from: g, reason: collision with root package name */
    private final com.google.firebase.remoteconfig.internal.e f37541g;

    /* renamed from: h, reason: collision with root package name */
    private final com.google.firebase.remoteconfig.internal.k f37542h;

    /* renamed from: i, reason: collision with root package name */
    private final com.google.firebase.remoteconfig.internal.m f37543i;

    /* renamed from: j, reason: collision with root package name */
    private final com.google.firebase.remoteconfig.internal.n f37544j;

    /* renamed from: k, reason: collision with root package name */
    private final com.google.firebase.installations.j f37545k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l(Context context, com.google.firebase.e eVar, com.google.firebase.installations.j jVar, @P com.google.firebase.abt.c cVar, Executor executor, com.google.firebase.remoteconfig.internal.e eVar2, com.google.firebase.remoteconfig.internal.e eVar3, com.google.firebase.remoteconfig.internal.e eVar4, com.google.firebase.remoteconfig.internal.k kVar, com.google.firebase.remoteconfig.internal.m mVar, com.google.firebase.remoteconfig.internal.n nVar) {
        this.f37535a = context;
        this.f37536b = eVar;
        this.f37545k = jVar;
        this.f37537c = cVar;
        this.f37538d = executor;
        this.f37539e = eVar2;
        this.f37540f = eVar3;
        this.f37541g = eVar4;
        this.f37542h = kVar;
        this.f37543i = mVar;
        this.f37544j = nVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ m A(AbstractC1770k abstractC1770k, AbstractC1770k abstractC1770k2) throws Exception {
        return (m) abstractC1770k.r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ AbstractC1770k B(k.a aVar) throws Exception {
        return C1773n.g(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ AbstractC1770k C(k.a aVar) throws Exception {
        return C1773n.g(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ AbstractC1770k D(Void r12) throws Exception {
        return j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void E() throws Exception {
        this.f37540f.d();
        this.f37539e.d();
        this.f37541g.d();
        this.f37544j.a();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void F(n nVar) throws Exception {
        this.f37544j.k(nVar);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ AbstractC1770k G(com.google.firebase.remoteconfig.internal.f fVar) throws Exception {
        return C1773n.g(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean H(AbstractC1770k<com.google.firebase.remoteconfig.internal.f> abstractC1770k) {
        if (abstractC1770k.v()) {
            this.f37539e.d();
            if (abstractC1770k.r() != null) {
                P(abstractC1770k.r().c());
                return true;
            }
            Log.e(f37534x, "Activated configs written to disk are null.");
            return true;
        }
        return false;
    }

    private AbstractC1770k<Void> M(Map<String, String> map) {
        try {
            return this.f37541g.m(com.google.firebase.remoteconfig.internal.f.g().b(map).a()).w(new InterfaceC1769j() { // from class: com.google.firebase.remoteconfig.c
                @Override // com.google.android.gms.tasks.InterfaceC1769j
                public final AbstractC1770k a(Object obj) {
                    AbstractC1770k G3;
                    G3 = l.G((com.google.firebase.remoteconfig.internal.f) obj);
                    return G3;
                }
            });
        } catch (JSONException e4) {
            Log.e(f37534x, "The provided defaults map could not be processed.", e4);
            return C1773n.g(null);
        }
    }

    @i0
    static List<Map<String, String>> O(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < jSONArray.length(); i4++) {
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = jSONArray.getJSONObject(i4);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.getString(next));
            }
            arrayList.add(hashMap);
        }
        return arrayList;
    }

    @N
    public static l s() {
        return t(com.google.firebase.e.p());
    }

    @N
    public static l t(@N com.google.firebase.e eVar) {
        return ((t) eVar.l(t.class)).e();
    }

    private static boolean y(com.google.firebase.remoteconfig.internal.f fVar, @P com.google.firebase.remoteconfig.internal.f fVar2) {
        if (fVar2 != null && fVar.e().equals(fVar2.e())) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ AbstractC1770k z(AbstractC1770k abstractC1770k, AbstractC1770k abstractC1770k2, AbstractC1770k abstractC1770k3) throws Exception {
        if (abstractC1770k.v() && abstractC1770k.r() != null) {
            com.google.firebase.remoteconfig.internal.f fVar = (com.google.firebase.remoteconfig.internal.f) abstractC1770k.r();
            if (abstractC1770k2.v() && !y(fVar, (com.google.firebase.remoteconfig.internal.f) abstractC1770k2.r())) {
                return C1773n.g(Boolean.FALSE);
            }
            return this.f37540f.m(fVar).n(this.f37538d, new InterfaceC1762c() { // from class: com.google.firebase.remoteconfig.d
                @Override // com.google.android.gms.tasks.InterfaceC1762c
                public final Object a(AbstractC1770k abstractC1770k4) {
                    boolean H3;
                    H3 = l.this.H(abstractC1770k4);
                    return Boolean.valueOf(H3);
                }
            });
        }
        return C1773n.g(Boolean.FALSE);
    }

    @N
    public AbstractC1770k<Void> I() {
        return C1773n.d(this.f37538d, new Callable() { // from class: com.google.firebase.remoteconfig.f
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Void E3;
                E3 = l.this.E();
                return E3;
            }
        });
    }

    @N
    public AbstractC1770k<Void> J(@N final n nVar) {
        return C1773n.d(this.f37538d, new Callable() { // from class: com.google.firebase.remoteconfig.g
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Void F3;
                F3 = l.this.F(nVar);
                return F3;
            }
        });
    }

    @N
    public AbstractC1770k<Void> K(@k0 int i4) {
        return M(com.google.firebase.remoteconfig.internal.p.a(this.f37535a, i4));
    }

    @N
    public AbstractC1770k<Void> L(@N Map<String, Object> map) {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                hashMap.put(entry.getKey(), new String((byte[]) value));
            } else {
                hashMap.put(entry.getKey(), value.toString());
            }
        }
        return M(hashMap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void N() {
        this.f37540f.f();
        this.f37541g.f();
        this.f37539e.f();
    }

    @i0
    void P(@N JSONArray jSONArray) {
        if (this.f37537c == null) {
            return;
        }
        try {
            this.f37537c.l(O(jSONArray));
        } catch (AbtException e4) {
            Log.w(f37534x, "Could not update ABT experiments.", e4);
        } catch (JSONException e5) {
            Log.e(f37534x, "Could not parse ABT experiments from the JSON response.", e5);
        }
    }

    @N
    public AbstractC1770k<Boolean> j() {
        final AbstractC1770k<com.google.firebase.remoteconfig.internal.f> f4 = this.f37539e.f();
        final AbstractC1770k<com.google.firebase.remoteconfig.internal.f> f5 = this.f37540f.f();
        return C1773n.k(f4, f5).p(this.f37538d, new InterfaceC1762c() { // from class: com.google.firebase.remoteconfig.b
            @Override // com.google.android.gms.tasks.InterfaceC1762c
            public final Object a(AbstractC1770k abstractC1770k) {
                AbstractC1770k z3;
                z3 = l.this.z(f4, f5, abstractC1770k);
                return z3;
            }
        });
    }

    @N
    public AbstractC1770k<m> k() {
        AbstractC1770k<com.google.firebase.remoteconfig.internal.f> f4 = this.f37540f.f();
        AbstractC1770k<com.google.firebase.remoteconfig.internal.f> f5 = this.f37541g.f();
        AbstractC1770k<com.google.firebase.remoteconfig.internal.f> f6 = this.f37539e.f();
        final AbstractC1770k d4 = C1773n.d(this.f37538d, new Callable() { // from class: com.google.firebase.remoteconfig.h
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return l.this.r();
            }
        });
        return C1773n.k(f4, f5, f6, d4, this.f37545k.getId(), this.f37545k.a(false)).n(this.f37538d, new InterfaceC1762c() { // from class: com.google.firebase.remoteconfig.i
            @Override // com.google.android.gms.tasks.InterfaceC1762c
            public final Object a(AbstractC1770k abstractC1770k) {
                m A3;
                A3 = l.A(AbstractC1770k.this, abstractC1770k);
                return A3;
            }
        });
    }

    @N
    public AbstractC1770k<Void> l() {
        return this.f37542h.h().w(new InterfaceC1769j() { // from class: com.google.firebase.remoteconfig.k
            @Override // com.google.android.gms.tasks.InterfaceC1769j
            public final AbstractC1770k a(Object obj) {
                AbstractC1770k B3;
                B3 = l.B((k.a) obj);
                return B3;
            }
        });
    }

    @N
    public AbstractC1770k<Void> m(long j4) {
        return this.f37542h.i(j4).w(new InterfaceC1769j() { // from class: com.google.firebase.remoteconfig.e
            @Override // com.google.android.gms.tasks.InterfaceC1769j
            public final AbstractC1770k a(Object obj) {
                AbstractC1770k C3;
                C3 = l.C((k.a) obj);
                return C3;
            }
        });
    }

    @N
    public AbstractC1770k<Boolean> n() {
        return l().x(this.f37538d, new InterfaceC1769j() { // from class: com.google.firebase.remoteconfig.j
            @Override // com.google.android.gms.tasks.InterfaceC1769j
            public final AbstractC1770k a(Object obj) {
                AbstractC1770k D3;
                D3 = l.this.D((Void) obj);
                return D3;
            }
        });
    }

    @N
    public Map<String, o> o() {
        return this.f37543i.d();
    }

    public boolean p(@N String str) {
        return this.f37543i.e(str);
    }

    public double q(@N String str) {
        return this.f37543i.h(str);
    }

    @N
    public m r() {
        return this.f37544j.d();
    }

    @N
    public Set<String> u(@N String str) {
        return this.f37543i.k(str);
    }

    public long v(@N String str) {
        return this.f37543i.m(str);
    }

    @N
    public String w(@N String str) {
        return this.f37543i.o(str);
    }

    @N
    public o x(@N String str) {
        return this.f37543i.q(str);
    }
}
