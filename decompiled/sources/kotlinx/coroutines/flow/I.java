package kotlinx.coroutines.flow;

import androidx.constraintlayout.core.motion.utils.v;
import java.util.List;
import kotlin.H0;
import kotlin.collections.C2108v;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.internal.S;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class I<T> extends kotlinx.coroutines.flow.internal.a<K> implements t<T>, InterfaceC2276c<T>, kotlinx.coroutines.flow.internal.p<T> {

    /* renamed from: I, reason: collision with root package name */
    private int f54061I;

    @l3.d
    private volatile /* synthetic */ Object _state;

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.StateFlowImpl", f = "StateFlow.kt", i = {0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2}, l = {386, 398, v.c.f7438d}, m = "collect", n = {"this", "collector", "slot", "this", "collector", "slot", "collectorJob", "newState", "this", "collector", "slot", "collectorJob", "oldState"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4"})
    /* loaded from: classes2.dex */
    public static final class a extends ContinuationImpl {

        /* renamed from: H, reason: collision with root package name */
        Object f54062H;

        /* renamed from: I, reason: collision with root package name */
        Object f54063I;

        /* renamed from: J, reason: collision with root package name */
        Object f54064J;

        /* renamed from: K, reason: collision with root package name */
        Object f54065K;

        /* renamed from: L, reason: collision with root package name */
        Object f54066L;

        /* renamed from: M, reason: collision with root package name */
        /* synthetic */ Object f54067M;

        /* renamed from: N, reason: collision with root package name */
        final /* synthetic */ I<T> f54068N;

        /* renamed from: O, reason: collision with root package name */
        int f54069O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(I<T> i4, kotlin.coroutines.c<? super a> cVar) {
            super(cVar);
            this.f54068N = i4;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            this.f54067M = obj;
            this.f54069O |= Integer.MIN_VALUE;
            return this.f54068N.a(null, this);
        }
    }

    public I(@l3.d Object obj) {
        this._state = obj;
    }

    public static /* synthetic */ void u() {
    }

    private final boolean v(Object obj, Object obj2) {
        int i4;
        K[] q4;
        q();
        synchronized (this) {
            Object obj3 = this._state;
            if (obj != null && !kotlin.jvm.internal.F.g(obj3, obj)) {
                return false;
            }
            if (kotlin.jvm.internal.F.g(obj3, obj2)) {
                return true;
            }
            this._state = obj2;
            int i5 = this.f54061I;
            if ((i5 & 1) == 0) {
                int i6 = i5 + 1;
                this.f54061I = i6;
                K[] q5 = q();
                H0 h02 = H0.f51801a;
                while (true) {
                    K[] kArr = q5;
                    if (kArr != null) {
                        for (K k4 : kArr) {
                            if (k4 != null) {
                                k4.f();
                            }
                        }
                    }
                    synchronized (this) {
                        i4 = this.f54061I;
                        if (i4 == i6) {
                            this.f54061I = i6 + 1;
                            return true;
                        }
                        q4 = q();
                        H0 h03 = H0.f51801a;
                    }
                    q5 = q4;
                    i6 = i4;
                }
            } else {
                this.f54061I = i5 + 2;
                return true;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00b8, code lost:
    
        if (kotlin.jvm.internal.F.g(r11, r12) == false) goto L42;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00af A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:13:0x003e, B:14:0x00ab, B:16:0x00af, B:18:0x00b4, B:20:0x00d5, B:22:0x00db, B:26:0x00ba, B:29:0x00c1, B:38:0x0060, B:40:0x0073, B:41:0x009c), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b4 A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:13:0x003e, B:14:0x00ab, B:16:0x00af, B:18:0x00b4, B:20:0x00d5, B:22:0x00db, B:26:0x00ba, B:29:0x00c1, B:38:0x0060, B:40:0x0073, B:41:0x009c), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00db A[Catch: all -> 0x0043, TRY_LEAVE, TryCatch #0 {all -> 0x0043, blocks: (B:13:0x003e, B:14:0x00ab, B:16:0x00af, B:18:0x00b4, B:20:0x00d5, B:22:0x00db, B:26:0x00ba, B:29:0x00c1, B:38:0x0060, B:40:0x0073, B:41:0x009c), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Type inference failed for: r12v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v2, types: [kotlinx.coroutines.flow.internal.c] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x00d9 -> B:14:0x00ab). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00eb -> B:14:0x00ab). Please report as a decompilation issue!!! */
    @Override // kotlinx.coroutines.flow.x, kotlinx.coroutines.flow.InterfaceC2282i
    @l3.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(@l3.d kotlinx.coroutines.flow.InterfaceC2283j<? super T> r11, @l3.d kotlin.coroutines.c<?> r12) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.I.a(kotlinx.coroutines.flow.j, kotlin.coroutines.c):java.lang.Object");
    }

    @Override // kotlinx.coroutines.flow.x
    @l3.d
    public List<T> b() {
        List<T> k4;
        k4 = C2108v.k(getValue());
        return k4;
    }

    @Override // kotlinx.coroutines.flow.internal.p
    @l3.d
    public InterfaceC2282i<T> c(@l3.d kotlin.coroutines.f fVar, int i4, @l3.d BufferOverflow bufferOverflow) {
        return J.d(this, fVar, i4, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.s, kotlinx.coroutines.flow.InterfaceC2283j
    @l3.e
    public Object f(T t3, @l3.d kotlin.coroutines.c<? super H0> cVar) {
        setValue(t3);
        return H0.f51801a;
    }

    @Override // kotlinx.coroutines.flow.t, kotlinx.coroutines.flow.H
    public T getValue() {
        S s4 = kotlinx.coroutines.flow.internal.s.f54253a;
        T t3 = (T) this._state;
        if (t3 == s4) {
            return null;
        }
        return t3;
    }

    @Override // kotlinx.coroutines.flow.t
    public boolean h(T t3, T t4) {
        if (t3 == null) {
            t3 = (T) kotlinx.coroutines.flow.internal.s.f54253a;
        }
        if (t4 == null) {
            t4 = (T) kotlinx.coroutines.flow.internal.s.f54253a;
        }
        return v(t3, t4);
    }

    @Override // kotlinx.coroutines.flow.s
    public void i() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    @Override // kotlinx.coroutines.flow.s
    public boolean j(T t3) {
        setValue(t3);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.flow.internal.a
    @l3.d
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public K l() {
        return new K();
    }

    @Override // kotlinx.coroutines.flow.t
    public void setValue(T t3) {
        if (t3 == null) {
            t3 = (T) kotlinx.coroutines.flow.internal.s.f54253a;
        }
        v(null, t3);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.flow.internal.a
    @l3.d
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public K[] m(int i4) {
        return new K[i4];
    }
}
