package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;

@kotlin.E(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\f\u001a\u00020\t\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Landroidx/lifecycle/DefaultLifecycleObserverAdapter;", "Landroidx/lifecycle/A;", "Landroidx/lifecycle/E;", "source", "Landroidx/lifecycle/Lifecycle$Event;", "event", "Lkotlin/H0;", "f", "(Landroidx/lifecycle/E;Landroidx/lifecycle/Lifecycle$Event;)V", "Landroidx/lifecycle/l;", androidx.exifinterface.media.a.U4, "Landroidx/lifecycle/l;", "defaultLifecycleObserver", "F", "Landroidx/lifecycle/A;", "lifecycleEventObserver", "<init>", "(Landroidx/lifecycle/l;Landroidx/lifecycle/A;)V", "lifecycle-common"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class DefaultLifecycleObserverAdapter implements A {

    /* renamed from: E, reason: collision with root package name */
    @l3.d
    private final InterfaceC0910l f15412E;

    /* renamed from: F, reason: collision with root package name */
    @l3.e
    private final A f15413F;

    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15414a;

        static {
            int[] iArr = new int[Lifecycle.Event.values().length];
            try {
                iArr[Lifecycle.Event.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Lifecycle.Event.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Lifecycle.Event.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Lifecycle.Event.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Lifecycle.Event.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[Lifecycle.Event.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f15414a = iArr;
        }
    }

    public DefaultLifecycleObserverAdapter(@l3.d InterfaceC0910l defaultLifecycleObserver, @l3.e A a4) {
        kotlin.jvm.internal.F.p(defaultLifecycleObserver, "defaultLifecycleObserver");
        this.f15412E = defaultLifecycleObserver;
        this.f15413F = a4;
    }

    @Override // androidx.lifecycle.A
    public void f(@l3.d E source, @l3.d Lifecycle.Event event) {
        kotlin.jvm.internal.F.p(source, "source");
        kotlin.jvm.internal.F.p(event, "event");
        switch (a.f15414a[event.ordinal()]) {
            case 1:
                this.f15412E.c(source);
                break;
            case 2:
                this.f15412E.n(source);
                break;
            case 3:
                this.f15412E.b(source);
                break;
            case 4:
                this.f15412E.i(source);
                break;
            case 5:
                this.f15412E.j(source);
                break;
            case 6:
                this.f15412E.l(source);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        A a4 = this.f15413F;
        if (a4 != null) {
            a4.f(source, event);
        }
    }
}
