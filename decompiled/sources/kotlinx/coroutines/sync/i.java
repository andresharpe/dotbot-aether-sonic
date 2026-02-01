package kotlinx.coroutines.sync;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlinx.coroutines.internal.O;
import kotlinx.coroutines.internal.S;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class i extends O<i> {

    /* renamed from: e, reason: collision with root package name */
    @l3.d
    /* synthetic */ AtomicReferenceArray f54739e;

    public i(long j4, @l3.e i iVar, int i4) {
        super(j4, iVar, i4);
        int i5;
        i5 = h.f54734f;
        this.f54739e = new AtomicReferenceArray(i5);
    }

    @Override // kotlinx.coroutines.internal.O
    public int p() {
        int i4;
        i4 = h.f54734f;
        return i4;
    }

    public final void s(int i4) {
        S s4;
        s4 = h.f54733e;
        this.f54739e.set(i4, s4);
        q();
    }

    public final boolean t(int i4, @l3.e Object obj, @l3.e Object obj2) {
        return kotlinx.coroutines.debug.internal.b.a(this.f54739e, i4, obj, obj2);
    }

    @l3.d
    public String toString() {
        return "SemaphoreSegment[id=" + o() + ", hashCode=" + hashCode() + ']';
    }

    @l3.e
    public final Object u(int i4) {
        return this.f54739e.get(i4);
    }

    @l3.e
    public final Object v(int i4, @l3.e Object obj) {
        return this.f54739e.getAndSet(i4, obj);
    }

    public final void w(int i4, @l3.e Object obj) {
        this.f54739e.set(i4, obj);
    }
}
