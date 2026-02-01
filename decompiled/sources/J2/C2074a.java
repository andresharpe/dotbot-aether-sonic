package j2;

import W2.n;
import android.content.Context;
import android.content.SharedPreferences;
import kotlin.jvm.internal.F;

/* renamed from: j2.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2074a {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    public static final C2074a f51023a = new C2074a();

    /* renamed from: b, reason: collision with root package name */
    @l3.d
    public static final String f51024b = "com.jbl.partylight_lib";

    /* renamed from: c, reason: collision with root package name */
    @l3.d
    public static final String f51025c = "IS_DASHBOARD_TUTORIAL_SHOWN";

    /* renamed from: d, reason: collision with root package name */
    @l3.d
    public static final String f51026d = "auto_ota_test";

    /* renamed from: e, reason: collision with root package name */
    @l3.d
    public static final String f51027e = "ENABLE_SHOW_MAC";

    /* renamed from: f, reason: collision with root package name */
    @l3.d
    public static final String f51028f = "LIGHT_SHOW_CUSTOM_PATTERN_KEY";

    /* renamed from: g, reason: collision with root package name */
    @l3.d
    public static final String f51029g = "PREFERENCE_KEY_AURACAST_PARTYLIGHT";

    /* renamed from: h, reason: collision with root package name */
    @l3.d
    public static final String f51030h = "PREFERENCE_KEY_STAGE_PARTYLIGHT";

    private C2074a() {
    }

    @n
    public static final boolean b(@l3.e String str) {
        return N1.a.f1702a.a(str, false);
    }

    @n
    public static final void f(@l3.d String key, boolean z3) {
        F.p(key, "key");
        N1.a.f1702a.g(key, z3);
    }

    public final boolean a() {
        return N1.a.f1702a.a(f51029g, false);
    }

    public final boolean c() {
        return N1.a.f1702a.a(f51030h, false);
    }

    public final void d(@l3.d Context context) {
        F.p(context, "context");
        N1.a aVar = N1.a.f1702a;
        SharedPreferences sharedPreferences = context.getSharedPreferences(f51024b, 0);
        F.o(sharedPreferences, "getSharedPreferences(...)");
        aVar.m(sharedPreferences);
    }

    public final void e(boolean z3) {
        N1.a.f1702a.g(f51029g, z3);
    }

    public final void g(boolean z3) {
        N1.a.f1702a.g(f51030h, z3);
    }
}
