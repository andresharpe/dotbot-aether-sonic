package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.LegacySavedStateHandleController;
import androidx.lifecycle.Lifecycle;
import androidx.savedstate.c;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class LegacySavedStateHandleController {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    public static final LegacySavedStateHandleController f15433a = new LegacySavedStateHandleController();

    /* renamed from: b, reason: collision with root package name */
    @l3.d
    public static final String f15434b = "androidx.lifecycle.savedstate.vm.tag";

    /* loaded from: classes.dex */
    public static final class a implements c.a {
        @Override // androidx.savedstate.c.a
        public void a(@l3.d androidx.savedstate.e owner) {
            kotlin.jvm.internal.F.p(owner, "owner");
            if (owner instanceof q0) {
                p0 viewModelStore = ((q0) owner).getViewModelStore();
                androidx.savedstate.c savedStateRegistry = owner.getSavedStateRegistry();
                Iterator<String> it = viewModelStore.c().iterator();
                while (it.hasNext()) {
                    j0 b4 = viewModelStore.b(it.next());
                    kotlin.jvm.internal.F.m(b4);
                    LegacySavedStateHandleController.a(b4, savedStateRegistry, owner.getLifecycle());
                }
                if (!viewModelStore.c().isEmpty()) {
                    savedStateRegistry.k(a.class);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner".toString());
        }
    }

    private LegacySavedStateHandleController() {
    }

    @W2.n
    public static final void a(@l3.d j0 viewModel, @l3.d androidx.savedstate.c registry, @l3.d Lifecycle lifecycle) {
        kotlin.jvm.internal.F.p(viewModel, "viewModel");
        kotlin.jvm.internal.F.p(registry, "registry");
        kotlin.jvm.internal.F.p(lifecycle, "lifecycle");
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) viewModel.r("androidx.lifecycle.savedstate.vm.tag");
        if (savedStateHandleController != null && !savedStateHandleController.e()) {
            savedStateHandleController.a(registry, lifecycle);
            f15433a.c(registry, lifecycle);
        }
    }

    @W2.n
    @l3.d
    public static final SavedStateHandleController b(@l3.d androidx.savedstate.c registry, @l3.d Lifecycle lifecycle, @l3.e String str, @l3.e Bundle bundle) {
        kotlin.jvm.internal.F.p(registry, "registry");
        kotlin.jvm.internal.F.p(lifecycle, "lifecycle");
        kotlin.jvm.internal.F.m(str);
        SavedStateHandleController savedStateHandleController = new SavedStateHandleController(str, a0.f15557f.a(registry.b(str), bundle));
        savedStateHandleController.a(registry, lifecycle);
        f15433a.c(registry, lifecycle);
        return savedStateHandleController;
    }

    private final void c(final androidx.savedstate.c cVar, final Lifecycle lifecycle) {
        Lifecycle.State b4 = lifecycle.b();
        if (b4 != Lifecycle.State.INITIALIZED && !b4.e(Lifecycle.State.STARTED)) {
            lifecycle.a(new A() { // from class: androidx.lifecycle.LegacySavedStateHandleController$tryToAddRecreator$1
                @Override // androidx.lifecycle.A
                public void f(@l3.d E source, @l3.d Lifecycle.Event event) {
                    kotlin.jvm.internal.F.p(source, "source");
                    kotlin.jvm.internal.F.p(event, "event");
                    if (event == Lifecycle.Event.ON_START) {
                        Lifecycle.this.d(this);
                        cVar.k(LegacySavedStateHandleController.a.class);
                    }
                }
            });
        } else {
            cVar.k(a.class);
        }
    }
}
