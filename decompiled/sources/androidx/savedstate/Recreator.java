package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.A;
import androidx.lifecycle.Lifecycle;
import androidx.savedstate.c;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.E;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;

@E(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \u00132\u00020\u0001:\u0002\u0005\u0014B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0015"}, d2 = {"Landroidx/savedstate/Recreator;", "Landroidx/lifecycle/A;", "", "className", "Lkotlin/H0;", "a", "(Ljava/lang/String;)V", "Landroidx/lifecycle/E;", "source", "Landroidx/lifecycle/Lifecycle$Event;", "event", "f", "(Landroidx/lifecycle/E;Landroidx/lifecycle/Lifecycle$Event;)V", "Landroidx/savedstate/e;", androidx.exifinterface.media.a.U4, "Landroidx/savedstate/e;", "owner", "<init>", "(Landroidx/savedstate/e;)V", "F", com.harman.log.b.f47574c, "savedstate_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class Recreator implements A {

    /* renamed from: F, reason: collision with root package name */
    @l3.d
    public static final a f18367F = new a(null);

    /* renamed from: G, reason: collision with root package name */
    @l3.d
    public static final String f18368G = "classes_to_restore";

    /* renamed from: H, reason: collision with root package name */
    @l3.d
    public static final String f18369H = "androidx.savedstate.Restarter";

    /* renamed from: E, reason: collision with root package name */
    @l3.d
    private final e f18370E;

    /* loaded from: classes.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        private a() {
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements c.InterfaceC0173c {

        /* renamed from: a, reason: collision with root package name */
        @l3.d
        private final Set<String> f18371a;

        public b(@l3.d c registry) {
            F.p(registry, "registry");
            this.f18371a = new LinkedHashSet();
            registry.j(Recreator.f18369H, this);
        }

        @Override // androidx.savedstate.c.InterfaceC0173c
        @l3.d
        public Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList(Recreator.f18368G, new ArrayList<>(this.f18371a));
            return bundle;
        }

        public final void b(@l3.d String className) {
            F.p(className, "className");
            this.f18371a.add(className);
        }
    }

    public Recreator(@l3.d e owner) {
        F.p(owner, "owner");
        this.f18370E = owner;
    }

    private final void a(String str) {
        try {
            Class<? extends U> asSubclass = Class.forName(str, false, Recreator.class.getClassLoader()).asSubclass(c.a.class);
            F.o(asSubclass, "{\n                Class.…class.java)\n            }");
            try {
                Constructor declaredConstructor = asSubclass.getDeclaredConstructor(new Class[0]);
                declaredConstructor.setAccessible(true);
                try {
                    Object newInstance = declaredConstructor.newInstance(new Object[0]);
                    F.o(newInstance, "{\n                constr…wInstance()\n            }");
                    ((c.a) newInstance).a(this.f18370E);
                } catch (Exception e4) {
                    throw new RuntimeException("Failed to instantiate " + str, e4);
                }
            } catch (NoSuchMethodException e5) {
                throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e5);
            }
        } catch (ClassNotFoundException e6) {
            throw new RuntimeException("Class " + str + " wasn't found", e6);
        }
    }

    @Override // androidx.lifecycle.A
    public void f(@l3.d androidx.lifecycle.E source, @l3.d Lifecycle.Event event) {
        F.p(source, "source");
        F.p(event, "event");
        if (event == Lifecycle.Event.ON_CREATE) {
            source.getLifecycle().d(this);
            Bundle b4 = this.f18370E.getSavedStateRegistry().b(f18369H);
            if (b4 == null) {
                return;
            }
            ArrayList<String> stringArrayList = b4.getStringArrayList(f18368G);
            if (stringArrayList != null) {
                Iterator<String> it = stringArrayList.iterator();
                while (it.hasNext()) {
                    a(it.next());
                }
                return;
            }
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        throw new AssertionError("Next event must be ON_CREATE");
    }
}
