package androidx.savedstate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.annotation.K;
import androidx.lifecycle.A;
import androidx.lifecycle.E;
import androidx.lifecycle.Lifecycle;
import androidx.savedstate.Recreator;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.U;

@SuppressLint({"RestrictedApi"})
@U({"SMAP\nSavedStateRegistry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateRegistry.kt\nandroidx/savedstate/SavedStateRegistry\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,272:1\n1#2:273\n*E\n"})
/* loaded from: classes.dex */
public final class c {

    /* renamed from: g, reason: collision with root package name */
    @l3.d
    private static final b f18374g = new b(null);

    /* renamed from: h, reason: collision with root package name */
    @l3.d
    @Deprecated
    private static final String f18375h = "androidx.lifecycle.BundlableSavedStateRegistry.key";

    /* renamed from: b, reason: collision with root package name */
    private boolean f18377b;

    /* renamed from: c, reason: collision with root package name */
    @l3.e
    private Bundle f18378c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f18379d;

    /* renamed from: e, reason: collision with root package name */
    @l3.e
    private Recreator.b f18380e;

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    private final androidx.arch.core.internal.b<String, InterfaceC0173c> f18376a = new androidx.arch.core.internal.b<>();

    /* renamed from: f, reason: collision with root package name */
    private boolean f18381f = true;

    /* loaded from: classes.dex */
    public interface a {
        void a(@l3.d e eVar);
    }

    /* loaded from: classes.dex */
    private static final class b {
        public /* synthetic */ b(C2197u c2197u) {
            this();
        }

        private b() {
        }
    }

    /* renamed from: androidx.savedstate.c$c, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0173c {
        @l3.d
        Bundle a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(c this$0, E e4, Lifecycle.Event event) {
        F.p(this$0, "this$0");
        F.p(e4, "<anonymous parameter 0>");
        F.p(event, "event");
        if (event == Lifecycle.Event.ON_START) {
            this$0.f18381f = true;
        } else if (event == Lifecycle.Event.ON_STOP) {
            this$0.f18381f = false;
        }
    }

    @l3.e
    @K
    public final Bundle b(@l3.d String key) {
        Bundle bundle;
        F.p(key, "key");
        if (this.f18379d) {
            Bundle bundle2 = this.f18378c;
            if (bundle2 == null) {
                return null;
            }
            if (bundle2 != null) {
                bundle = bundle2.getBundle(key);
            } else {
                bundle = null;
            }
            Bundle bundle3 = this.f18378c;
            if (bundle3 != null) {
                bundle3.remove(key);
            }
            Bundle bundle4 = this.f18378c;
            if (bundle4 == null || bundle4.isEmpty()) {
                this.f18378c = null;
            }
            return bundle;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component".toString());
    }

    @l3.e
    public final InterfaceC0173c c(@l3.d String key) {
        F.p(key, "key");
        Iterator<Map.Entry<String, InterfaceC0173c>> it = this.f18376a.iterator();
        while (it.hasNext()) {
            Map.Entry<String, InterfaceC0173c> components = it.next();
            F.o(components, "components");
            String key2 = components.getKey();
            InterfaceC0173c value = components.getValue();
            if (F.g(key2, key)) {
                return value;
            }
        }
        return null;
    }

    public final boolean d() {
        return this.f18381f;
    }

    @K
    public final boolean e() {
        return this.f18379d;
    }

    @K
    public final void g(@l3.d Lifecycle lifecycle) {
        F.p(lifecycle, "lifecycle");
        if (!this.f18377b) {
            lifecycle.a(new A() { // from class: androidx.savedstate.b
                @Override // androidx.lifecycle.A
                public final void f(E e4, Lifecycle.Event event) {
                    c.f(c.this, e4, event);
                }
            });
            this.f18377b = true;
            return;
        }
        throw new IllegalStateException("SavedStateRegistry was already attached.".toString());
    }

    @K
    public final void h(@l3.e Bundle bundle) {
        Bundle bundle2;
        if (this.f18377b) {
            if (!this.f18379d) {
                if (bundle != null) {
                    bundle2 = bundle.getBundle(f18375h);
                } else {
                    bundle2 = null;
                }
                this.f18378c = bundle2;
                this.f18379d = true;
                return;
            }
            throw new IllegalStateException("SavedStateRegistry was already restored.".toString());
        }
        throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).".toString());
    }

    @K
    public final void i(@l3.d Bundle outBundle) {
        F.p(outBundle, "outBundle");
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f18378c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        androidx.arch.core.internal.b<String, InterfaceC0173c>.d f4 = this.f18376a.f();
        F.o(f4, "this.components.iteratorWithAdditions()");
        while (f4.hasNext()) {
            Map.Entry next = f4.next();
            bundle.putBundle((String) next.getKey(), ((InterfaceC0173c) next.getValue()).a());
        }
        if (!bundle.isEmpty()) {
            outBundle.putBundle(f18375h, bundle);
        }
    }

    @K
    public final void j(@l3.d String key, @l3.d InterfaceC0173c provider) {
        F.p(key, "key");
        F.p(provider, "provider");
        if (this.f18376a.k(key, provider) == null) {
        } else {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered".toString());
        }
    }

    @K
    public final void k(@l3.d Class<? extends a> clazz) {
        F.p(clazz, "clazz");
        if (this.f18381f) {
            Recreator.b bVar = this.f18380e;
            if (bVar == null) {
                bVar = new Recreator.b(this);
            }
            this.f18380e = bVar;
            try {
                clazz.getDeclaredConstructor(new Class[0]);
                Recreator.b bVar2 = this.f18380e;
                if (bVar2 != null) {
                    String name = clazz.getName();
                    F.o(name, "clazz.name");
                    bVar2.b(name);
                    return;
                }
                return;
            } catch (NoSuchMethodException e4) {
                throw new IllegalArgumentException("Class " + clazz.getSimpleName() + " must have default constructor in order to be automatically recreated", e4);
            }
        }
        throw new IllegalStateException("Can not perform this action after onSaveInstanceState".toString());
    }

    public final void l(boolean z3) {
        this.f18381f = z3;
    }

    @K
    public final void m(@l3.d String key) {
        F.p(key, "key");
        this.f18376a.l(key);
    }
}
