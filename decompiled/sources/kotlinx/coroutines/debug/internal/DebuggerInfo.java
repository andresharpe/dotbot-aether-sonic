package kotlinx.coroutines.debug.internal;

import N0.a;
import java.io.Serializable;
import java.lang.Thread;
import java.util.List;
import kotlin.E;
import kotlin.U;
import kotlinx.coroutines.S;
import kotlinx.coroutines.T;

@E(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010&\u001a\u00020%\u0012\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\r\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\fR\u0017\u0010\u0013\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\u0012\u0010\fR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\n\u001a\u0004\b\u0015\u0010\fR\u0019\u0010\u0019\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\n\u001a\u0004\b\u0018\u0010\fR\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010$\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u0017\u001a\u0004\b\"\u0010#¨\u0006+"}, d2 = {"Lkotlinx/coroutines/debug/internal/DebuggerInfo;", "Ljava/io/Serializable;", "", androidx.exifinterface.media.a.U4, "Ljava/lang/Long;", "a", "()Ljava/lang/Long;", "coroutineId", "", "F", "Ljava/lang/String;", com.harman.log.b.f47574c, "()Ljava/lang/String;", "dispatcher", "G", "f", a.C0015a.f1688b, "H", "h", "state", "I", "e", "lastObservedThreadState", "J", "d", "lastObservedThreadName", "", "Ljava/lang/StackTraceElement;", "K", "Ljava/util/List;", "c", "()Ljava/util/List;", "lastObservedStackTrace", "L", "g", "()J", "sequenceNumber", "Lkotlinx/coroutines/debug/internal/f;", "source", "Lkotlin/coroutines/f;", "context", "<init>", "(Lkotlinx/coroutines/debug/internal/f;Lkotlin/coroutines/f;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
@U
/* loaded from: classes2.dex */
public final class DebuggerInfo implements Serializable {

    /* renamed from: E, reason: collision with root package name */
    @l3.e
    private final Long f53389E;

    /* renamed from: F, reason: collision with root package name */
    @l3.e
    private final String f53390F;

    /* renamed from: G, reason: collision with root package name */
    @l3.e
    private final String f53391G;

    /* renamed from: H, reason: collision with root package name */
    @l3.d
    private final String f53392H;

    /* renamed from: I, reason: collision with root package name */
    @l3.e
    private final String f53393I;

    /* renamed from: J, reason: collision with root package name */
    @l3.e
    private final String f53394J;

    /* renamed from: K, reason: collision with root package name */
    @l3.d
    private final List<StackTraceElement> f53395K;

    /* renamed from: L, reason: collision with root package name */
    private final long f53396L;

    public DebuggerInfo(@l3.d f fVar, @l3.d kotlin.coroutines.f fVar2) {
        Long l4;
        String str;
        String str2;
        String str3;
        Thread.State state;
        S s4 = (S) fVar2.a(S.f52956G);
        if (s4 != null) {
            l4 = Long.valueOf(s4.k1());
        } else {
            l4 = null;
        }
        this.f53389E = l4;
        kotlin.coroutines.d dVar = (kotlin.coroutines.d) fVar2.a(kotlin.coroutines.d.f52046u);
        if (dVar != null) {
            str = dVar.toString();
        } else {
            str = null;
        }
        this.f53390F = str;
        T t3 = (T) fVar2.a(T.f52972G);
        if (t3 != null) {
            str2 = t3.k1();
        } else {
            str2 = null;
        }
        this.f53391G = str2;
        this.f53392H = fVar.g();
        Thread thread = fVar.f53436e;
        if (thread != null && (state = thread.getState()) != null) {
            str3 = state.toString();
        } else {
            str3 = null;
        }
        this.f53393I = str3;
        Thread thread2 = fVar.f53436e;
        this.f53394J = thread2 != null ? thread2.getName() : null;
        this.f53395K = fVar.h();
        this.f53396L = fVar.f53433b;
    }

    @l3.e
    public final Long a() {
        return this.f53389E;
    }

    @l3.e
    public final String b() {
        return this.f53390F;
    }

    @l3.d
    public final List<StackTraceElement> c() {
        return this.f53395K;
    }

    @l3.e
    public final String d() {
        return this.f53394J;
    }

    @l3.e
    public final String e() {
        return this.f53393I;
    }

    @l3.e
    public final String f() {
        return this.f53391G;
    }

    public final long g() {
        return this.f53396L;
    }

    @l3.d
    public final String h() {
        return this.f53392H;
    }
}
