package t2;

import W2.n;
import com.google.android.gms.tasks.AbstractC1770k;
import com.google.android.gms.tasks.InterfaceC1764e;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigFetchThrottledException;
import com.google.firebase.remoteconfig.l;
import com.google.firebase.remoteconfig.n;
import com.harman.log.f;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;

/* renamed from: t2.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2418d {

    /* renamed from: c, reason: collision with root package name */
    @l3.d
    public static final a f57874c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    @l3.d
    private static final C2418d f57875d = new C2418d();

    /* renamed from: e, reason: collision with root package name */
    @l3.d
    public static final String f57876e = "RatingInAppAndroid";

    /* renamed from: f, reason: collision with root package name */
    @l3.d
    public static final String f57877f = "RemoteConfig";

    /* renamed from: a, reason: collision with root package name */
    @l3.e
    private InterfaceC2419e f57878a;

    /* renamed from: b, reason: collision with root package name */
    @l3.d
    private final Map<String, String> f57879b = new HashMap();

    /* renamed from: t2.d$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        @l3.d
        public final C2418d a() {
            return C2418d.f57875d;
        }

        private a() {
        }

        @n
        public static /* synthetic */ void b() {
        }
    }

    private C2418d() {
        l s4 = l.s();
        F.o(s4, "getInstance(...)");
        com.google.firebase.remoteconfig.n c4 = new n.b().c();
        F.o(c4, "build(...)");
        s4.J(c4);
        try {
            s4.n().e(new InterfaceC1764e() { // from class: t2.c
                @Override // com.google.android.gms.tasks.InterfaceC1764e
                public final void a(AbstractC1770k abstractC1770k) {
                    C2418d.b(C2418d.this, abstractC1770k);
                }
            });
        } catch (FirebaseRemoteConfigFetchThrottledException e4) {
            f.a(f57877f, String.valueOf(e4.getMessage()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C2418d this$0, AbstractC1770k task) {
        F.p(this$0, "this$0");
        F.p(task, "task");
        if (task.v()) {
            Map<String, String> map = this$0.f57879b;
            String w3 = l.s().w("RatingInAppAndroid");
            F.o(w3, "getString(...)");
            map.put("RatingInAppAndroid", w3);
            f.a(f57877f, "Successful, value is " + ((Object) this$0.f57879b.get("RatingInAppAndroid")));
            InterfaceC2419e interfaceC2419e = this$0.f57878a;
            if (interfaceC2419e != null) {
                interfaceC2419e.b();
                return;
            }
            return;
        }
        f.a(f57877f, "Failed");
        InterfaceC2419e interfaceC2419e2 = this$0.f57878a;
        if (interfaceC2419e2 != null) {
            interfaceC2419e2.a();
        }
    }

    @l3.d
    public static final C2418d d() {
        return f57874c.a();
    }

    @l3.d
    public final String e(@l3.d String key) {
        F.p(key, "key");
        String w3 = l.s().w(key);
        F.o(w3, "getString(...)");
        return w3;
    }

    public final void f(@l3.d InterfaceC2419e callback) {
        F.p(callback, "callback");
        this.f57878a = callback;
    }
}
