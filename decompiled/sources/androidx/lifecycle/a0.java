package androidx.lifecycle;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import androidx.annotation.RestrictTo;
import androidx.core.os.C0741d;
import androidx.savedstate.c;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.C2122h0;
import kotlin.jvm.internal.C2197u;
import kotlinx.coroutines.flow.C2284k;

@kotlin.jvm.internal.U({"SMAP\nSavedStateHandle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateHandle.kt\nandroidx/lifecycle/SavedStateHandle\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,450:1\n361#2,3:451\n364#2,4:455\n1#3:454\n*S KotlinDebug\n*F\n+ 1 SavedStateHandle.kt\nandroidx/lifecycle/SavedStateHandle\n*L\n198#1:451,3\n198#1:455,4\n*E\n"})
/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: g, reason: collision with root package name */
    @l3.d
    private static final String f15558g = "values";

    /* renamed from: h, reason: collision with root package name */
    @l3.d
    private static final String f15559h = "keys";

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    private final Map<String, Object> f15561a;

    /* renamed from: b, reason: collision with root package name */
    @l3.d
    private final Map<String, c.InterfaceC0173c> f15562b;

    /* renamed from: c, reason: collision with root package name */
    @l3.d
    private final Map<String, b<?>> f15563c;

    /* renamed from: d, reason: collision with root package name */
    @l3.d
    private final Map<String, kotlinx.coroutines.flow.t<Object>> f15564d;

    /* renamed from: e, reason: collision with root package name */
    @l3.d
    private final c.InterfaceC0173c f15565e;

    /* renamed from: f, reason: collision with root package name */
    @l3.d
    public static final a f15557f = new a(null);

    /* renamed from: i, reason: collision with root package name */
    @l3.d
    private static final Class<? extends Object>[] f15560i = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};

    /* loaded from: classes.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        @W2.n
        @l3.d
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public final a0 a(@l3.e Bundle bundle, @l3.e Bundle bundle2) {
            if (bundle == null) {
                if (bundle2 == null) {
                    return new a0();
                }
                HashMap hashMap = new HashMap();
                for (String key : bundle2.keySet()) {
                    kotlin.jvm.internal.F.o(key, "key");
                    hashMap.put(key, bundle2.get(key));
                }
                return new a0(hashMap);
            }
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(a0.f15559h);
            ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(a0.f15558g);
            if (parcelableArrayList != null && parcelableArrayList2 != null && parcelableArrayList.size() == parcelableArrayList2.size()) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                int size = parcelableArrayList.size();
                for (int i4 = 0; i4 < size; i4++) {
                    Object obj = parcelableArrayList.get(i4);
                    kotlin.jvm.internal.F.n(obj, "null cannot be cast to non-null type kotlin.String");
                    linkedHashMap.put((String) obj, parcelableArrayList2.get(i4));
                }
                return new a0(linkedHashMap);
            }
            throw new IllegalStateException("Invalid bundle passed as restored state".toString());
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public final boolean b(@l3.e Object obj) {
            if (obj == null) {
                return true;
            }
            for (Class cls : a0.f15560i) {
                kotlin.jvm.internal.F.m(cls);
                if (cls.isInstance(obj)) {
                    return true;
                }
            }
            return false;
        }

        private a() {
        }
    }

    public a0(@l3.d Map<String, ? extends Object> initialState) {
        kotlin.jvm.internal.F.p(initialState, "initialState");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f15561a = linkedHashMap;
        this.f15562b = new LinkedHashMap();
        this.f15563c = new LinkedHashMap();
        this.f15564d = new LinkedHashMap();
        this.f15565e = new c.InterfaceC0173c() { // from class: androidx.lifecycle.Z
            @Override // androidx.savedstate.c.InterfaceC0173c
            public final Bundle a() {
                Bundle p4;
                p4 = a0.p(a0.this);
                return p4;
            }
        };
        linkedHashMap.putAll(initialState);
    }

    @W2.n
    @l3.d
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final a0 g(@l3.e Bundle bundle, @l3.e Bundle bundle2) {
        return f15557f.a(bundle, bundle2);
    }

    private final <T> P<T> k(String str, boolean z3, T t3) {
        b<?> bVar;
        b<?> bVar2;
        b<?> bVar3 = this.f15563c.get(str);
        if (bVar3 instanceof P) {
            bVar = bVar3;
        } else {
            bVar = null;
        }
        if (bVar != null) {
            return bVar;
        }
        if (this.f15561a.containsKey(str)) {
            bVar2 = new b<>(this, str, this.f15561a.get(str));
        } else if (z3) {
            this.f15561a.put(str, t3);
            bVar2 = new b<>(this, str, t3);
        } else {
            bVar2 = new b<>(this, str);
        }
        this.f15563c.put(str, bVar2);
        return bVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle p(a0 this$0) {
        Map D02;
        kotlin.jvm.internal.F.p(this$0, "this$0");
        D02 = kotlin.collections.Y.D0(this$0.f15562b);
        for (Map.Entry entry : D02.entrySet()) {
            this$0.q((String) entry.getKey(), ((c.InterfaceC0173c) entry.getValue()).a());
        }
        Set<String> keySet = this$0.f15561a.keySet();
        ArrayList arrayList = new ArrayList(keySet.size());
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (String str : keySet) {
            arrayList.add(str);
            arrayList2.add(this$0.f15561a.get(str));
        }
        return C0741d.b(C2122h0.a(f15559h, arrayList), C2122h0.a(f15558g, arrayList2));
    }

    @androidx.annotation.K
    public final void e(@l3.d String key) {
        kotlin.jvm.internal.F.p(key, "key");
        this.f15562b.remove(key);
    }

    @androidx.annotation.K
    public final boolean f(@l3.d String key) {
        kotlin.jvm.internal.F.p(key, "key");
        return this.f15561a.containsKey(key);
    }

    @l3.e
    @androidx.annotation.K
    public final <T> T h(@l3.d String key) {
        kotlin.jvm.internal.F.p(key, "key");
        try {
            return (T) this.f15561a.get(key);
        } catch (ClassCastException unused) {
            n(key);
            return null;
        }
    }

    @l3.d
    @androidx.annotation.K
    public final <T> P<T> i(@l3.d String key) {
        kotlin.jvm.internal.F.p(key, "key");
        P<T> k4 = k(key, false, null);
        kotlin.jvm.internal.F.n(k4, "null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<T of androidx.lifecycle.SavedStateHandle.getLiveData>");
        return k4;
    }

    @l3.d
    @androidx.annotation.K
    public final <T> P<T> j(@l3.d String key, T t3) {
        kotlin.jvm.internal.F.p(key, "key");
        return k(key, true, t3);
    }

    @l3.d
    @androidx.annotation.K
    public final <T> kotlinx.coroutines.flow.H<T> l(@l3.d String key, T t3) {
        kotlin.jvm.internal.F.p(key, "key");
        Map<String, kotlinx.coroutines.flow.t<Object>> map = this.f15564d;
        kotlinx.coroutines.flow.t<Object> tVar = map.get(key);
        if (tVar == null) {
            if (!this.f15561a.containsKey(key)) {
                this.f15561a.put(key, t3);
            }
            tVar = kotlinx.coroutines.flow.J.a(this.f15561a.get(key));
            this.f15564d.put(key, tVar);
            map.put(key, tVar);
        }
        kotlinx.coroutines.flow.H<T> m4 = C2284k.m(tVar);
        kotlin.jvm.internal.F.n(m4, "null cannot be cast to non-null type kotlinx.coroutines.flow.StateFlow<T of androidx.lifecycle.SavedStateHandle.getStateFlow>");
        return m4;
    }

    @l3.d
    @androidx.annotation.K
    public final Set<String> m() {
        Set C3;
        Set<String> C4;
        C3 = kotlin.collections.k0.C(this.f15561a.keySet(), this.f15562b.keySet());
        C4 = kotlin.collections.k0.C(C3, this.f15563c.keySet());
        return C4;
    }

    @l3.e
    @androidx.annotation.K
    public final <T> T n(@l3.d String key) {
        kotlin.jvm.internal.F.p(key, "key");
        T t3 = (T) this.f15561a.remove(key);
        b<?> remove = this.f15563c.remove(key);
        if (remove != null) {
            remove.s();
        }
        this.f15564d.remove(key);
        return t3;
    }

    @l3.d
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final c.InterfaceC0173c o() {
        return this.f15565e;
    }

    @androidx.annotation.K
    public final <T> void q(@l3.d String key, @l3.e T t3) {
        b<?> bVar;
        kotlin.jvm.internal.F.p(key, "key");
        if (f15557f.b(t3)) {
            b<?> bVar2 = this.f15563c.get(key);
            if (bVar2 instanceof P) {
                bVar = bVar2;
            } else {
                bVar = null;
            }
            if (bVar != null) {
                bVar.r(t3);
            } else {
                this.f15561a.put(key, t3);
            }
            kotlinx.coroutines.flow.t<Object> tVar = this.f15564d.get(key);
            if (tVar != null) {
                tVar.setValue(t3);
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't put value with type ");
        kotlin.jvm.internal.F.m(t3);
        sb.append(t3.getClass());
        sb.append(" into saved state");
        throw new IllegalArgumentException(sb.toString());
    }

    @androidx.annotation.K
    public final void r(@l3.d String key, @l3.d c.InterfaceC0173c provider) {
        kotlin.jvm.internal.F.p(key, "key");
        kotlin.jvm.internal.F.p(provider, "provider");
        this.f15562b.put(key, provider);
    }

    /* loaded from: classes.dex */
    public static final class b<T> extends P<T> {

        /* renamed from: m, reason: collision with root package name */
        @l3.d
        private String f15566m;

        /* renamed from: n, reason: collision with root package name */
        @l3.e
        private a0 f15567n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@l3.e a0 a0Var, @l3.d String key, T t3) {
            super(t3);
            kotlin.jvm.internal.F.p(key, "key");
            this.f15566m = key;
            this.f15567n = a0Var;
        }

        @Override // androidx.lifecycle.P, androidx.lifecycle.LiveData
        public void r(T t3) {
            a0 a0Var = this.f15567n;
            if (a0Var != null) {
                a0Var.f15561a.put(this.f15566m, t3);
                kotlinx.coroutines.flow.t tVar = (kotlinx.coroutines.flow.t) a0Var.f15564d.get(this.f15566m);
                if (tVar != null) {
                    tVar.setValue(t3);
                }
            }
            super.r(t3);
        }

        public final void s() {
            this.f15567n = null;
        }

        public b(@l3.e a0 a0Var, @l3.d String key) {
            kotlin.jvm.internal.F.p(key, "key");
            this.f15566m = key;
            this.f15567n = a0Var;
        }
    }

    public a0() {
        this.f15561a = new LinkedHashMap();
        this.f15562b = new LinkedHashMap();
        this.f15563c = new LinkedHashMap();
        this.f15564d = new LinkedHashMap();
        this.f15565e = new c.InterfaceC0173c() { // from class: androidx.lifecycle.Z
            @Override // androidx.savedstate.c.InterfaceC0173c
            public final Bundle a() {
                Bundle p4;
                p4 = a0.p(a0.this);
                return p4;
            }
        };
    }
}
