package androidx.lifecycle;

import android.os.Bundle;
import androidx.savedstate.c;
import java.util.Map;
import kotlin.jvm.internal.Lambda;

@kotlin.jvm.internal.U({"SMAP\nSavedStateHandleSupport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateHandleSupport.kt\nandroidx/lifecycle/SavedStateHandlesProvider\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,221:1\n215#2,2:222\n*S KotlinDebug\n*F\n+ 1 SavedStateHandleSupport.kt\nandroidx/lifecycle/SavedStateHandlesProvider\n*L\n146#1:222,2\n*E\n"})
/* loaded from: classes.dex */
public final class c0 implements c.InterfaceC0173c {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    private final androidx.savedstate.c f15576a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f15577b;

    /* renamed from: c, reason: collision with root package name */
    @l3.e
    private Bundle f15578c;

    /* renamed from: d, reason: collision with root package name */
    @l3.d
    private final kotlin.A f15579d;

    /* loaded from: classes.dex */
    static final class a extends Lambda implements X2.a<d0> {

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ q0 f15580F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(q0 q0Var) {
            super(0);
            this.f15580F = q0Var;
        }

        @Override // X2.a
        @l3.d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final d0 n() {
            return b0.e(this.f15580F);
        }
    }

    public c0(@l3.d androidx.savedstate.c savedStateRegistry, @l3.d q0 viewModelStoreOwner) {
        kotlin.A a4;
        kotlin.jvm.internal.F.p(savedStateRegistry, "savedStateRegistry");
        kotlin.jvm.internal.F.p(viewModelStoreOwner, "viewModelStoreOwner");
        this.f15576a = savedStateRegistry;
        a4 = kotlin.C.a(new a(viewModelStoreOwner));
        this.f15579d = a4;
    }

    private final d0 c() {
        return (d0) this.f15579d.getValue();
    }

    @Override // androidx.savedstate.c.InterfaceC0173c
    @l3.d
    public Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f15578c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry<String, a0> entry : c().u().entrySet()) {
            String key = entry.getKey();
            Bundle a4 = entry.getValue().o().a();
            if (!kotlin.jvm.internal.F.g(a4, Bundle.EMPTY)) {
                bundle.putBundle(key, a4);
            }
        }
        this.f15577b = false;
        return bundle;
    }

    @l3.e
    public final Bundle b(@l3.d String key) {
        Bundle bundle;
        kotlin.jvm.internal.F.p(key, "key");
        d();
        Bundle bundle2 = this.f15578c;
        if (bundle2 != null) {
            bundle = bundle2.getBundle(key);
        } else {
            bundle = null;
        }
        Bundle bundle3 = this.f15578c;
        if (bundle3 != null) {
            bundle3.remove(key);
        }
        Bundle bundle4 = this.f15578c;
        if (bundle4 != null && bundle4.isEmpty()) {
            this.f15578c = null;
        }
        return bundle;
    }

    public final void d() {
        if (!this.f15577b) {
            this.f15578c = this.f15576a.b("androidx.lifecycle.internal.SavedStateHandlesProvider");
            this.f15577b = true;
            c();
        }
    }
}
