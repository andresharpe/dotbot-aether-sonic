package q2;

import W2.n;
import android.content.Context;
import androidx.annotation.N;
import com.harman.rating.model.RatingEventStorage;
import com.harman.rating.model.RatingGuideType;
import com.harman.rating.model.RatingRemoteConfig;
import com.harman.rating.model.UserAction;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import l3.d;
import l3.e;
import r2.C2405a;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: e, reason: collision with root package name */
    @d
    private static final String f57367e = "RatingInAppMgr";

    /* renamed from: a, reason: collision with root package name */
    @e
    private InterfaceC2399a f57369a;

    /* renamed from: b, reason: collision with root package name */
    @d
    private final AtomicBoolean f57370b = new AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    @e
    private Context f57371c;

    /* renamed from: d, reason: collision with root package name */
    @d
    public static final a f57366d = new a(null);

    /* renamed from: f, reason: collision with root package name */
    @d
    private static final b f57368f = new b();

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        @d
        public final b a() {
            return b.f57368f;
        }

        private a() {
        }

        @n
        public static /* synthetic */ void b() {
        }
    }

    private b() {
    }

    @d
    public static final b c() {
        return f57366d.a();
    }

    public static /* synthetic */ void g(b bVar, Context context, InterfaceC2399a interfaceC2399a, String str, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            interfaceC2399a = null;
        }
        bVar.f(context, interfaceC2399a, str);
    }

    @d
    public final RatingGuideType b(@d @N String devicePid) {
        RatingGuideType j4;
        F.p(devicePid, "devicePid");
        InterfaceC2399a interfaceC2399a = this.f57369a;
        if (interfaceC2399a == null || (j4 = interfaceC2399a.j(devicePid)) == null) {
            return RatingGuideType.RATING_NONE;
        }
        return j4;
    }

    @e
    public final RatingEventStorage d() {
        InterfaceC2399a interfaceC2399a = this.f57369a;
        if (interfaceC2399a != null) {
            return interfaceC2399a.f();
        }
        return null;
    }

    @e
    public final RatingRemoteConfig e() {
        InterfaceC2399a interfaceC2399a = this.f57369a;
        if (interfaceC2399a != null) {
            return interfaceC2399a.d();
        }
        return null;
    }

    public final void f(@d @N Context context, @e InterfaceC2399a interfaceC2399a, @d @N String remoteConfigStr) {
        F.p(context, "context");
        F.p(remoteConfigStr, "remoteConfigStr");
        if (this.f57370b.getAndSet(true)) {
            return;
        }
        if (interfaceC2399a == null) {
            interfaceC2399a = new C2405a(context, remoteConfigStr);
        }
        this.f57369a = interfaceC2399a;
        this.f57371c = context;
    }

    public final boolean h(@d @N String devicePid) {
        F.p(devicePid, "devicePid");
        InterfaceC2399a interfaceC2399a = this.f57369a;
        if (interfaceC2399a == null || !interfaceC2399a.k(devicePid)) {
            return false;
        }
        return true;
    }

    public final void i(@d @N String devicePid, @d @N String eventName) {
        F.p(devicePid, "devicePid");
        F.p(eventName, "eventName");
        InterfaceC2399a interfaceC2399a = this.f57369a;
        if (interfaceC2399a != null) {
            interfaceC2399a.e(devicePid, eventName);
        }
    }

    public final void j(@d @N UserAction userAction) {
        F.p(userAction, "userAction");
        InterfaceC2399a interfaceC2399a = this.f57369a;
        if (interfaceC2399a != null) {
            interfaceC2399a.a(userAction);
        }
    }

    public final void k() {
        InterfaceC2399a interfaceC2399a = this.f57369a;
        if (interfaceC2399a != null) {
            interfaceC2399a.g();
        }
    }
}
