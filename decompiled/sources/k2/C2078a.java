package k2;

import android.graphics.Color;
import com.harman.jbl.partylight.lib.biz.LightInfo;
import com.harman.jbl.partylight.lib.g;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.C2197u;
import l2.C2355a;
import l3.d;

/* renamed from: k2.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2078a {

    /* renamed from: h, reason: collision with root package name */
    @d
    public static final C0453a f51780h = new C0453a(null);

    /* renamed from: i, reason: collision with root package name */
    @d
    private static final String f51781i = "LightShowCardProvider";

    /* renamed from: a, reason: collision with root package name */
    @d
    private final C2355a f51782a = new C2355a(LightInfo.Pattern.NEON, g.l.f47075H, g.i.f47039m, 0, new int[]{Color.parseColor("#1E1F23"), Color.parseColor("#1E1F23")}, false, 32, null);

    /* renamed from: b, reason: collision with root package name */
    @d
    private final C2355a f51783b = new C2355a(LightInfo.Pattern.LOOP, g.l.f47073G, g.i.f47038l, 0, new int[]{Color.parseColor("#1E1F23"), Color.parseColor("#1E1F23")}, false, 32, null);

    /* renamed from: c, reason: collision with root package name */
    @d
    private final C2355a f51784c = new C2355a(LightInfo.Pattern.BOUNCE, g.l.f47069E, g.i.f47036j, 0, new int[]{Color.parseColor("#1E1F23"), Color.parseColor("#1E1F23")}, false, 32, null);

    /* renamed from: d, reason: collision with root package name */
    @d
    private final C2355a f51785d = new C2355a(LightInfo.Pattern.TRIM, g.l.f47081K, g.i.f47042p, 0, new int[]{Color.parseColor("#1E1F23"), Color.parseColor("#1E1F23")}, false, 32, null);

    /* renamed from: e, reason: collision with root package name */
    @d
    private final C2355a f51786e = new C2355a(LightInfo.Pattern.SWITCH, g.l.f47079J, g.i.f47041o, 0, new int[]{Color.parseColor("#1E1F23"), Color.parseColor("#1E1F23")}, false, 32, null);

    /* renamed from: f, reason: collision with root package name */
    @d
    private final C2355a f51787f = new C2355a(LightInfo.Pattern.FREEZE, g.l.f47071F, g.i.f47037k, 0, new int[]{Color.parseColor("#1E1F23"), Color.parseColor("#1E1F23")}, false, 32, null);

    /* renamed from: g, reason: collision with root package name */
    @d
    private final C2355a f51788g = new C2355a(LightInfo.Pattern.RANDOM, g.l.f47077I, g.i.f47040n, 0, new int[]{Color.parseColor("#1E1F23"), Color.parseColor("#1E1F23")}, false, 32, null);

    /* renamed from: k2.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0453a {
        public /* synthetic */ C0453a(C2197u c2197u) {
            this();
        }

        private C0453a() {
        }
    }

    @d
    public final List<C2355a> a() {
        List<C2355a> O3;
        O3 = CollectionsKt__CollectionsKt.O(this.f51782a, this.f51783b, this.f51784c, this.f51785d, this.f51786e, this.f51787f, this.f51788g);
        return O3;
    }
}
