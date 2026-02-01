package N0;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.Y;
import androidx.annotation.a0;
import androidx.annotation.j0;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.internal.measurement.C1421j1;
import com.google.android.gms.measurement.internal.G2;
import com.google.android.gms.measurement.internal.H2;
import java.util.List;
import java.util.Map;

@D
@I0.a
/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final C1421j1 f1686a;

    @I0.a
    /* renamed from: N0.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0015a {

        /* renamed from: a, reason: collision with root package name */
        @I0.a
        @N
        public static final String f1687a = "origin";

        /* renamed from: b, reason: collision with root package name */
        @I0.a
        @N
        public static final String f1688b = "name";

        /* renamed from: c, reason: collision with root package name */
        @I0.a
        @N
        public static final String f1689c = "value";

        /* renamed from: d, reason: collision with root package name */
        @I0.a
        @N
        public static final String f1690d = "trigger_event_name";

        /* renamed from: e, reason: collision with root package name */
        @I0.a
        @N
        public static final String f1691e = "trigger_timeout";

        /* renamed from: f, reason: collision with root package name */
        @I0.a
        @N
        public static final String f1692f = "timed_out_event_name";

        /* renamed from: g, reason: collision with root package name */
        @I0.a
        @N
        public static final String f1693g = "timed_out_event_params";

        /* renamed from: h, reason: collision with root package name */
        @I0.a
        @N
        public static final String f1694h = "triggered_event_name";

        /* renamed from: i, reason: collision with root package name */
        @I0.a
        @N
        public static final String f1695i = "triggered_event_params";

        /* renamed from: j, reason: collision with root package name */
        @I0.a
        @N
        public static final String f1696j = "time_to_live";

        /* renamed from: k, reason: collision with root package name */
        @I0.a
        @N
        public static final String f1697k = "expired_event_name";

        /* renamed from: l, reason: collision with root package name */
        @I0.a
        @N
        public static final String f1698l = "expired_event_params";

        /* renamed from: m, reason: collision with root package name */
        @I0.a
        @N
        public static final String f1699m = "creation_timestamp";

        /* renamed from: n, reason: collision with root package name */
        @I0.a
        @N
        public static final String f1700n = "active";

        /* renamed from: o, reason: collision with root package name */
        @I0.a
        @N
        public static final String f1701o = "triggered_timestamp";

        private C0015a() {
        }
    }

    @D
    @I0.a
    /* loaded from: classes2.dex */
    public interface b extends G2 {
        @Override // com.google.android.gms.measurement.internal.G2
        @D
        @I0.a
        @j0
        void a(@N String str, @N String str2, @N Bundle bundle, long j4);
    }

    @D
    @I0.a
    /* loaded from: classes2.dex */
    public interface c extends H2 {
        @Override // com.google.android.gms.measurement.internal.H2
        @D
        @I0.a
        @j0
        void a(@N String str, @N String str2, @N Bundle bundle, long j4);
    }

    public a(C1421j1 c1421j1) {
        this.f1686a = c1421j1;
    }

    @D
    @Y(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE", "android.permission.WAKE_LOCK"})
    @N
    @I0.a
    public static a k(@N Context context) {
        return C1421j1.C(context, null, null, null, null).z();
    }

    @I0.a
    @Y(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE", "android.permission.WAKE_LOCK"})
    @N
    public static a l(@N Context context, @N String str, @N String str2, @P String str3, @N Bundle bundle) {
        return C1421j1.C(context, str, str2, str3, bundle).z();
    }

    @D
    @I0.a
    public void A(@N c cVar) {
        this.f1686a.o(cVar);
    }

    public final void B(boolean z3) {
        this.f1686a.h(z3);
    }

    @I0.a
    public void a(@N @a0(min = 1) String str) {
        this.f1686a.Q(str);
    }

    @I0.a
    public void b(@N @a0(max = 24, min = 1) String str, @P String str2, @P Bundle bundle) {
        this.f1686a.R(str, str2, bundle);
    }

    @I0.a
    public void c(@N @a0(min = 1) String str) {
        this.f1686a.S(str);
    }

    @I0.a
    public long d() {
        return this.f1686a.x();
    }

    @P
    @I0.a
    public String e() {
        return this.f1686a.F();
    }

    @P
    @I0.a
    public String f() {
        return this.f1686a.H();
    }

    @I0.a
    @j0
    @N
    public List<Bundle> g(@P String str, @P @a0(max = 23, min = 1) String str2) {
        return this.f1686a.L(str, str2);
    }

    @P
    @I0.a
    public String h() {
        return this.f1686a.I();
    }

    @P
    @I0.a
    public String i() {
        return this.f1686a.J();
    }

    @P
    @I0.a
    public String j() {
        return this.f1686a.K();
    }

    @I0.a
    @j0
    public int m(@N @a0(min = 1) String str) {
        return this.f1686a.w(str);
    }

    @I0.a
    @j0
    @N
    public Map<String, Object> n(@P String str, @P @a0(max = 24, min = 1) String str2, boolean z3) {
        return this.f1686a.M(str, str2, z3);
    }

    @I0.a
    public void o(@N String str, @N String str2, @N Bundle bundle) {
        this.f1686a.U(str, str2, bundle);
    }

    @I0.a
    public void p(@N String str, @N String str2, @N Bundle bundle, long j4) {
        this.f1686a.V(str, str2, bundle, j4);
    }

    @P
    @I0.a
    public void q(@N Bundle bundle) {
        this.f1686a.y(bundle, false);
    }

    @P
    @I0.a
    public Bundle r(@N Bundle bundle) {
        return this.f1686a.y(bundle, true);
    }

    @D
    @I0.a
    public void s(@N c cVar) {
        this.f1686a.b(cVar);
    }

    @I0.a
    public void t(@N Bundle bundle) {
        this.f1686a.d(bundle);
    }

    @I0.a
    public void u(@N Bundle bundle) {
        this.f1686a.e(bundle);
    }

    @I0.a
    public void v(@N Activity activity, @P @a0(max = 36, min = 1) String str, @P @a0(max = 36, min = 1) String str2) {
        this.f1686a.g(activity, str, str2);
    }

    @D
    @I0.a
    @j0
    public void w(@N b bVar) {
        this.f1686a.j(bVar);
    }

    @I0.a
    public void x(@P Boolean bool) {
        this.f1686a.k(bool);
    }

    @I0.a
    public void y(boolean z3) {
        this.f1686a.k(Boolean.valueOf(z3));
    }

    @I0.a
    public void z(@N String str, @N String str2, @N Object obj) {
        this.f1686a.n(str, str2, obj, true);
    }
}
