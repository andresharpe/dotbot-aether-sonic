package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;

@kotlin.E(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0013¢\u0006\u0004\b \u0010!J\u001d\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0018\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R$\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00198\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\""}, d2 = {"Landroidx/lifecycle/SavedStateHandleController;", "Landroidx/lifecycle/A;", "Landroidx/savedstate/c;", "registry", "Landroidx/lifecycle/Lifecycle;", "lifecycle", "Lkotlin/H0;", "a", "(Landroidx/savedstate/c;Landroidx/lifecycle/Lifecycle;)V", "Landroidx/lifecycle/E;", "source", "Landroidx/lifecycle/Lifecycle$Event;", "event", "f", "(Landroidx/lifecycle/E;Landroidx/lifecycle/Lifecycle$Event;)V", "", androidx.exifinterface.media.a.U4, "Ljava/lang/String;", "key", "Landroidx/lifecycle/a0;", "F", "Landroidx/lifecycle/a0;", "d", "()Landroidx/lifecycle/a0;", "handle", "", "<set-?>", "G", "Z", "e", "()Z", "isAttached", "<init>", "(Ljava/lang/String;Landroidx/lifecycle/a0;)V", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0})
@kotlin.jvm.internal.U({"SMAP\nSavedStateHandleController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateHandleController.kt\nandroidx/lifecycle/SavedStateHandleController\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,41:1\n1#2:42\n*E\n"})
/* loaded from: classes.dex */
public final class SavedStateHandleController implements A {

    /* renamed from: E, reason: collision with root package name */
    @l3.d
    private final String f15512E;

    /* renamed from: F, reason: collision with root package name */
    @l3.d
    private final a0 f15513F;

    /* renamed from: G, reason: collision with root package name */
    private boolean f15514G;

    public SavedStateHandleController(@l3.d String key, @l3.d a0 handle) {
        kotlin.jvm.internal.F.p(key, "key");
        kotlin.jvm.internal.F.p(handle, "handle");
        this.f15512E = key;
        this.f15513F = handle;
    }

    public final void a(@l3.d androidx.savedstate.c registry, @l3.d Lifecycle lifecycle) {
        kotlin.jvm.internal.F.p(registry, "registry");
        kotlin.jvm.internal.F.p(lifecycle, "lifecycle");
        if (!this.f15514G) {
            this.f15514G = true;
            lifecycle.a(this);
            registry.j(this.f15512E, this.f15513F.o());
            return;
        }
        throw new IllegalStateException("Already attached to lifecycleOwner".toString());
    }

    @l3.d
    public final a0 d() {
        return this.f15513F;
    }

    public final boolean e() {
        return this.f15514G;
    }

    @Override // androidx.lifecycle.A
    public void f(@l3.d E source, @l3.d Lifecycle.Event event) {
        kotlin.jvm.internal.F.p(source, "source");
        kotlin.jvm.internal.F.p(event, "event");
        if (event == Lifecycle.Event.ON_DESTROY) {
            this.f15514G = false;
            source.getLifecycle().d(this);
        }
    }
}
