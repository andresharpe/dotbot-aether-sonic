package androidx.navigation;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.AbstractC0899a;
import androidx.lifecycle.InterfaceC0919v;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.m0;
import androidx.lifecycle.p0;
import androidx.lifecycle.q0;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class r implements androidx.lifecycle.E, q0, InterfaceC0919v, androidx.savedstate.e {

    /* renamed from: R, reason: collision with root package name */
    @l3.d
    public static final a f16524R = new a(null);

    /* renamed from: E, reason: collision with root package name */
    @l3.e
    private final Context f16525E;

    /* renamed from: F, reason: collision with root package name */
    @l3.d
    private F f16526F;

    /* renamed from: G, reason: collision with root package name */
    @l3.e
    private final Bundle f16527G;

    /* renamed from: H, reason: collision with root package name */
    @l3.d
    private Lifecycle.State f16528H;

    /* renamed from: I, reason: collision with root package name */
    @l3.e
    private final Y f16529I;

    /* renamed from: J, reason: collision with root package name */
    @l3.d
    private final String f16530J;

    /* renamed from: K, reason: collision with root package name */
    @l3.e
    private final Bundle f16531K;

    /* renamed from: L, reason: collision with root package name */
    @l3.d
    private androidx.lifecycle.G f16532L;

    /* renamed from: M, reason: collision with root package name */
    @l3.d
    private final androidx.savedstate.d f16533M;

    /* renamed from: N, reason: collision with root package name */
    private boolean f16534N;

    /* renamed from: O, reason: collision with root package name */
    @l3.d
    private final kotlin.A f16535O;

    /* renamed from: P, reason: collision with root package name */
    @l3.d
    private final kotlin.A f16536P;

    /* renamed from: Q, reason: collision with root package name */
    @l3.d
    private Lifecycle.State f16537Q;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        public static /* synthetic */ r b(a aVar, Context context, F f4, Bundle bundle, Lifecycle.State state, Y y3, String str, Bundle bundle2, int i4, Object obj) {
            Bundle bundle3;
            Lifecycle.State state2;
            Y y4;
            String str2;
            Bundle bundle4;
            if ((i4 & 4) != 0) {
                bundle3 = null;
            } else {
                bundle3 = bundle;
            }
            if ((i4 & 8) != 0) {
                state2 = Lifecycle.State.CREATED;
            } else {
                state2 = state;
            }
            if ((i4 & 16) != 0) {
                y4 = null;
            } else {
                y4 = y3;
            }
            if ((i4 & 32) != 0) {
                String uuid = UUID.randomUUID().toString();
                kotlin.jvm.internal.F.o(uuid, "randomUUID().toString()");
                str2 = uuid;
            } else {
                str2 = str;
            }
            if ((i4 & 64) != 0) {
                bundle4 = null;
            } else {
                bundle4 = bundle2;
            }
            return aVar.a(context, f4, bundle3, state2, y4, str2, bundle4);
        }

        @l3.d
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public final r a(@l3.e Context context, @l3.d F destination, @l3.e Bundle bundle, @l3.d Lifecycle.State hostLifecycleState, @l3.e Y y3, @l3.d String id, @l3.e Bundle bundle2) {
            kotlin.jvm.internal.F.p(destination, "destination");
            kotlin.jvm.internal.F.p(hostLifecycleState, "hostLifecycleState");
            kotlin.jvm.internal.F.p(id, "id");
            return new r(context, destination, bundle, hostLifecycleState, y3, id, bundle2, null);
        }

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC0899a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@l3.d androidx.savedstate.e owner, @l3.e Bundle bundle) {
            super(owner, bundle);
            kotlin.jvm.internal.F.p(owner, "owner");
        }

        @Override // androidx.lifecycle.AbstractC0899a
        @l3.d
        protected <T extends androidx.lifecycle.j0> T f(@l3.d String key, @l3.d Class<T> modelClass, @l3.d androidx.lifecycle.a0 handle) {
            kotlin.jvm.internal.F.p(key, "key");
            kotlin.jvm.internal.F.p(modelClass, "modelClass");
            kotlin.jvm.internal.F.p(handle, "handle");
            return new c(handle);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class c extends androidx.lifecycle.j0 {

        /* renamed from: H, reason: collision with root package name */
        @l3.d
        private final androidx.lifecycle.a0 f16538H;

        public c(@l3.d androidx.lifecycle.a0 handle) {
            kotlin.jvm.internal.F.p(handle, "handle");
            this.f16538H = handle;
        }

        @l3.d
        public final androidx.lifecycle.a0 u() {
            return this.f16538H;
        }
    }

    /* loaded from: classes.dex */
    static final class d extends Lambda implements X2.a<androidx.lifecycle.e0> {
        d() {
            super(0);
        }

        @Override // X2.a
        @l3.d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final androidx.lifecycle.e0 n() {
            Context applicationContext;
            Context context = r.this.f16525E;
            Application application = null;
            if (context == null) {
                applicationContext = null;
            } else {
                applicationContext = context.getApplicationContext();
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
            }
            r rVar = r.this;
            return new androidx.lifecycle.e0(application, rVar, rVar.e());
        }
    }

    /* loaded from: classes.dex */
    static final class e extends Lambda implements X2.a<androidx.lifecycle.a0> {
        e() {
            super(0);
        }

        @Override // X2.a
        @l3.d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final androidx.lifecycle.a0 n() {
            if (r.this.f16534N) {
                if (r.this.f16532L.b() != Lifecycle.State.DESTROYED) {
                    return ((c) new m0(r.this, new b(r.this, null)).a(c.class)).u();
                }
                throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle after the NavBackStackEntry is destroyed.".toString());
            }
            throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).".toString());
        }
    }

    public /* synthetic */ r(Context context, F f4, Bundle bundle, Lifecycle.State state, Y y3, String str, Bundle bundle2, C2197u c2197u) {
        this(context, f4, bundle, state, y3, str, bundle2);
    }

    private final androidx.lifecycle.e0 f() {
        return (androidx.lifecycle.e0) this.f16535O.getValue();
    }

    @l3.e
    public final Bundle e() {
        return this.f16527G;
    }

    public boolean equals(@l3.e Object obj) {
        Set<String> keySet;
        Object obj2;
        if (obj == null || !(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (!kotlin.jvm.internal.F.g(this.f16530J, rVar.f16530J) || !kotlin.jvm.internal.F.g(this.f16526F, rVar.f16526F) || !kotlin.jvm.internal.F.g(this.f16532L, rVar.f16532L) || !kotlin.jvm.internal.F.g(getSavedStateRegistry(), rVar.getSavedStateRegistry())) {
            return false;
        }
        if (!kotlin.jvm.internal.F.g(this.f16527G, rVar.f16527G)) {
            Bundle bundle = this.f16527G;
            if (bundle == null || (keySet = bundle.keySet()) == null) {
                return false;
            }
            if (!keySet.isEmpty()) {
                for (String str : keySet) {
                    Object obj3 = e().get(str);
                    Bundle e4 = rVar.e();
                    if (e4 == null) {
                        obj2 = null;
                    } else {
                        obj2 = e4.get(str);
                    }
                    if (!kotlin.jvm.internal.F.g(obj3, obj2)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    @l3.d
    public final F g() {
        return this.f16526F;
    }

    @Override // androidx.lifecycle.InterfaceC0919v
    @l3.d
    public m0.b getDefaultViewModelProviderFactory() {
        return f();
    }

    @Override // androidx.lifecycle.E
    @l3.d
    public Lifecycle getLifecycle() {
        return this.f16532L;
    }

    @Override // androidx.savedstate.e
    @l3.d
    public androidx.savedstate.c getSavedStateRegistry() {
        androidx.savedstate.c b4 = this.f16533M.b();
        kotlin.jvm.internal.F.o(b4, "savedStateRegistryController.savedStateRegistry");
        return b4;
    }

    @Override // androidx.lifecycle.q0
    @l3.d
    public p0 getViewModelStore() {
        if (this.f16534N) {
            if (this.f16532L.b() != Lifecycle.State.DESTROYED) {
                Y y3 = this.f16529I;
                if (y3 != null) {
                    return y3.g(this.f16530J);
                }
                throw new IllegalStateException("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.".toString());
            }
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels after the NavBackStackEntry is destroyed.".toString());
        }
        throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).".toString());
    }

    @l3.d
    public final String h() {
        return this.f16530J;
    }

    public int hashCode() {
        Set<String> keySet;
        int hashCode;
        int hashCode2 = (this.f16530J.hashCode() * 31) + this.f16526F.hashCode();
        Bundle bundle = this.f16527G;
        if (bundle != null && (keySet = bundle.keySet()) != null) {
            Iterator<T> it = keySet.iterator();
            while (it.hasNext()) {
                int i4 = hashCode2 * 31;
                Object obj = e().get((String) it.next());
                if (obj == null) {
                    hashCode = 0;
                } else {
                    hashCode = obj.hashCode();
                }
                hashCode2 = i4 + hashCode;
            }
        }
        return (((hashCode2 * 31) + this.f16532L.hashCode()) * 31) + getSavedStateRegistry().hashCode();
    }

    @l3.d
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final Lifecycle.State i() {
        return this.f16537Q;
    }

    @l3.d
    public final androidx.lifecycle.a0 j() {
        return (androidx.lifecycle.a0) this.f16536P.getValue();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void k(@l3.d Lifecycle.Event event) {
        kotlin.jvm.internal.F.p(event, "event");
        Lifecycle.State g4 = event.g();
        kotlin.jvm.internal.F.o(g4, "event.targetState");
        this.f16528H = g4;
        p();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void m(@l3.d Bundle outBundle) {
        kotlin.jvm.internal.F.p(outBundle, "outBundle");
        this.f16533M.e(outBundle);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void n(@l3.d F f4) {
        kotlin.jvm.internal.F.p(f4, "<set-?>");
        this.f16526F = f4;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void o(@l3.d Lifecycle.State maxState) {
        kotlin.jvm.internal.F.p(maxState, "maxState");
        this.f16537Q = maxState;
        p();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void p() {
        if (!this.f16534N) {
            this.f16533M.d(this.f16531K);
            this.f16534N = true;
        }
        if (this.f16528H.ordinal() < this.f16537Q.ordinal()) {
            this.f16532L.s(this.f16528H);
        } else {
            this.f16532L.s(this.f16537Q);
        }
    }

    private r(Context context, F f4, Bundle bundle, Lifecycle.State state, Y y3, String str, Bundle bundle2) {
        kotlin.A a4;
        kotlin.A a5;
        this.f16525E = context;
        this.f16526F = f4;
        this.f16527G = bundle;
        this.f16528H = state;
        this.f16529I = y3;
        this.f16530J = str;
        this.f16531K = bundle2;
        this.f16532L = new androidx.lifecycle.G(this);
        androidx.savedstate.d a6 = androidx.savedstate.d.a(this);
        kotlin.jvm.internal.F.o(a6, "create(this)");
        this.f16533M = a6;
        a4 = kotlin.C.a(new d());
        this.f16535O = a4;
        a5 = kotlin.C.a(new e());
        this.f16536P = a5;
        this.f16537Q = Lifecycle.State.INITIALIZED;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    /* synthetic */ r(android.content.Context r11, androidx.navigation.F r12, android.os.Bundle r13, androidx.lifecycle.Lifecycle.State r14, androidx.navigation.Y r15, java.lang.String r16, android.os.Bundle r17, int r18, kotlin.jvm.internal.C2197u r19) {
        /*
            r10 = this;
            r0 = r18 & 4
            r1 = 0
            if (r0 == 0) goto L7
            r5 = r1
            goto L8
        L7:
            r5 = r13
        L8:
            r0 = r18 & 8
            if (r0 == 0) goto L10
            androidx.lifecycle.Lifecycle$State r0 = androidx.lifecycle.Lifecycle.State.CREATED
            r6 = r0
            goto L11
        L10:
            r6 = r14
        L11:
            r0 = r18 & 16
            if (r0 == 0) goto L17
            r7 = r1
            goto L18
        L17:
            r7 = r15
        L18:
            r0 = r18 & 32
            if (r0 == 0) goto L2b
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "randomUUID().toString()"
            kotlin.jvm.internal.F.o(r0, r2)
            r8 = r0
            goto L2d
        L2b:
            r8 = r16
        L2d:
            r0 = r18 & 64
            if (r0 == 0) goto L33
            r9 = r1
            goto L35
        L33:
            r9 = r17
        L35:
            r2 = r10
            r3 = r11
            r4 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.r.<init>(android.content.Context, androidx.navigation.F, android.os.Bundle, androidx.lifecycle.Lifecycle$State, androidx.navigation.Y, java.lang.String, android.os.Bundle, int, kotlin.jvm.internal.u):void");
    }

    public /* synthetic */ r(r rVar, Bundle bundle, int i4, C2197u c2197u) {
        this(rVar, (i4 & 2) != 0 ? rVar.f16527G : bundle);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public r(@l3.d r entry, @l3.e Bundle bundle) {
        this(entry.f16525E, entry.f16526F, bundle, entry.f16528H, entry.f16529I, entry.f16530J, entry.f16531K);
        kotlin.jvm.internal.F.p(entry, "entry");
        this.f16528H = entry.f16528H;
        o(entry.f16537Q);
    }
}
