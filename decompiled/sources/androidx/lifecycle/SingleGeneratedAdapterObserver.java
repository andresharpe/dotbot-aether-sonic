package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;

@kotlin.E(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Landroidx/lifecycle/SingleGeneratedAdapterObserver;", "Landroidx/lifecycle/A;", "Landroidx/lifecycle/E;", "source", "Landroidx/lifecycle/Lifecycle$Event;", "event", "Lkotlin/H0;", "f", "(Landroidx/lifecycle/E;Landroidx/lifecycle/Lifecycle$Event;)V", "Landroidx/lifecycle/t;", androidx.exifinterface.media.a.U4, "Landroidx/lifecycle/t;", "generatedAdapter", "<init>", "(Landroidx/lifecycle/t;)V", "lifecycle-common"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class SingleGeneratedAdapterObserver implements A {

    /* renamed from: E, reason: collision with root package name */
    @l3.d
    private final InterfaceC0917t f15515E;

    public SingleGeneratedAdapterObserver(@l3.d InterfaceC0917t generatedAdapter) {
        kotlin.jvm.internal.F.p(generatedAdapter, "generatedAdapter");
        this.f15515E = generatedAdapter;
    }

    @Override // androidx.lifecycle.A
    public void f(@l3.d E source, @l3.d Lifecycle.Event event) {
        kotlin.jvm.internal.F.p(source, "source");
        kotlin.jvm.internal.F.p(event, "event");
        this.f15515E.a(source, event, false, null);
        this.f15515E.a(source, event, true, null);
    }
}
