package androidx.navigation;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import androidx.navigation.C0926c;
import kotlin.InterfaceC2205l;

@H
/* renamed from: androidx.navigation.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0927d extends G<C0926c.b> {

    /* renamed from: h, reason: collision with root package name */
    @l3.d
    private Context f16415h;

    /* renamed from: i, reason: collision with root package name */
    @l3.e
    private String f16416i;

    /* renamed from: j, reason: collision with root package name */
    @l3.e
    private kotlin.reflect.d<? extends Activity> f16417j;

    /* renamed from: k, reason: collision with root package name */
    @l3.e
    private String f16418k;

    /* renamed from: l, reason: collision with root package name */
    @l3.e
    private Uri f16419l;

    /* renamed from: m, reason: collision with root package name */
    @l3.e
    private String f16420m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @InterfaceC2205l(message = "Use routes to create your ActivityNavigatorDestinationBuilder instead", replaceWith = @kotlin.V(expression = "ActivityNavigatorDestinationBuilder(navigator, route = id.toString())", imports = {}))
    public C0927d(@l3.d C0926c navigator, @androidx.annotation.D int i4) {
        super(navigator, i4);
        kotlin.jvm.internal.F.p(navigator, "navigator");
        this.f16415h = navigator.n();
    }

    @Override // androidx.navigation.G
    @l3.d
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public C0926c.b c() {
        C0926c.b bVar = (C0926c.b) super.c();
        bVar.b0(p());
        kotlin.reflect.d<? extends Activity> m4 = m();
        if (m4 != null) {
            bVar.X(new ComponentName(this.f16415h, (Class<?>) W2.b.e(m4)));
        }
        bVar.W(l());
        bVar.Y(n());
        bVar.Z(o());
        return bVar;
    }

    @l3.e
    public final String l() {
        return this.f16418k;
    }

    @l3.e
    public final kotlin.reflect.d<? extends Activity> m() {
        return this.f16417j;
    }

    @l3.e
    public final Uri n() {
        return this.f16419l;
    }

    @l3.e
    public final String o() {
        return this.f16420m;
    }

    @l3.e
    public final String p() {
        return this.f16416i;
    }

    public final void q(@l3.e String str) {
        this.f16418k = str;
    }

    public final void r(@l3.e kotlin.reflect.d<? extends Activity> dVar) {
        this.f16417j = dVar;
    }

    public final void s(@l3.e Uri uri) {
        this.f16419l = uri;
    }

    public final void t(@l3.e String str) {
        this.f16420m = str;
    }

    public final void u(@l3.e String str) {
        this.f16416i = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0927d(@l3.d C0926c navigator, @l3.d String route) {
        super(navigator, route);
        kotlin.jvm.internal.F.p(navigator, "navigator");
        kotlin.jvm.internal.F.p(route, "route");
        this.f16415h = navigator.n();
    }
}
