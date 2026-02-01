package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;

@kotlin.E(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Landroidx/lifecycle/CompositeGeneratedAdaptersObserver;", "Landroidx/lifecycle/A;", "Landroidx/lifecycle/E;", "source", "Landroidx/lifecycle/Lifecycle$Event;", "event", "Lkotlin/H0;", "f", "(Landroidx/lifecycle/E;Landroidx/lifecycle/Lifecycle$Event;)V", "", "Landroidx/lifecycle/t;", androidx.exifinterface.media.a.U4, "[Landroidx/lifecycle/t;", "generatedAdapters", "<init>", "([Landroidx/lifecycle/t;)V", "lifecycle-common"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class CompositeGeneratedAdaptersObserver implements A {

    /* renamed from: E, reason: collision with root package name */
    @l3.d
    private final InterfaceC0917t[] f15411E;

    public CompositeGeneratedAdaptersObserver(@l3.d InterfaceC0917t[] generatedAdapters) {
        kotlin.jvm.internal.F.p(generatedAdapters, "generatedAdapters");
        this.f15411E = generatedAdapters;
    }

    @Override // androidx.lifecycle.A
    public void f(@l3.d E source, @l3.d Lifecycle.Event event) {
        kotlin.jvm.internal.F.p(source, "source");
        kotlin.jvm.internal.F.p(event, "event");
        O o4 = new O();
        for (InterfaceC0917t interfaceC0917t : this.f15411E) {
            interfaceC0917t.a(source, event, false, o4);
        }
        for (InterfaceC0917t interfaceC0917t2 : this.f15411E) {
            interfaceC0917t2.a(source, event, true, o4);
        }
    }
}
