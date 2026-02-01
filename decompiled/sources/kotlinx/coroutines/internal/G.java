package kotlinx.coroutines.internal;

import kotlin.H0;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.C2197u;
import kotlinx.coroutines.InterfaceC2241c0;
import kotlinx.coroutines.InterfaceC2328n0;
import kotlinx.coroutines.InterfaceC2333q;
import kotlinx.coroutines.W0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class G extends W0 implements InterfaceC2241c0 {

    /* renamed from: G, reason: collision with root package name */
    @l3.e
    private final Throwable f54441G;

    /* renamed from: H, reason: collision with root package name */
    @l3.e
    private final String f54442H;

    public /* synthetic */ G(Throwable th, String str, int i4, C2197u c2197u) {
        this(th, (i4 & 2) != 0 ? null : str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0023, code lost:
    
        if (r1 == null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Void p1() {
        /*
            r4 = this;
            java.lang.Throwable r0 = r4.f54441G
            if (r0 == 0) goto L36
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Module with the Main dispatcher had failed to initialize"
            r0.append(r1)
            java.lang.String r1 = r4.f54442H
            if (r1 == 0) goto L25
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = ". "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            if (r1 != 0) goto L27
        L25:
            java.lang.String r1 = ""
        L27:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.Throwable r2 = r4.f54441G
            r1.<init>(r0, r2)
            throw r1
        L36:
            kotlinx.coroutines.internal.F.e()
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.G.p1():java.lang.Void");
    }

    @Override // kotlinx.coroutines.N
    public boolean j1(@l3.d kotlin.coroutines.f fVar) {
        p1();
        throw new KotlinNothingValueException();
    }

    @Override // kotlinx.coroutines.W0, kotlinx.coroutines.N
    @l3.d
    public kotlinx.coroutines.N k1(int i4) {
        p1();
        throw new KotlinNothingValueException();
    }

    @Override // kotlinx.coroutines.W0
    @l3.d
    public W0 m1() {
        return this;
    }

    @Override // kotlinx.coroutines.N
    @l3.d
    /* renamed from: o1, reason: merged with bridge method [inline-methods] */
    public Void h1(@l3.d kotlin.coroutines.f fVar, @l3.d Runnable runnable) {
        p1();
        throw new KotlinNothingValueException();
    }

    @Override // kotlinx.coroutines.InterfaceC2241c0
    @l3.d
    /* renamed from: q1, reason: merged with bridge method [inline-methods] */
    public Void h(long j4, @l3.d InterfaceC2333q<? super H0> interfaceC2333q) {
        p1();
        throw new KotlinNothingValueException();
    }

    @Override // kotlinx.coroutines.W0, kotlinx.coroutines.N
    @l3.d
    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("Dispatchers.Main[missing");
        if (this.f54441G != null) {
            str = ", cause=" + this.f54441G;
        } else {
            str = "";
        }
        sb.append(str);
        sb.append(']');
        return sb.toString();
    }

    @Override // kotlinx.coroutines.InterfaceC2241c0
    @l3.d
    public InterfaceC2328n0 x0(long j4, @l3.d Runnable runnable, @l3.d kotlin.coroutines.f fVar) {
        p1();
        throw new KotlinNothingValueException();
    }

    @Override // kotlinx.coroutines.InterfaceC2241c0
    @l3.e
    public Object z0(long j4, @l3.d kotlin.coroutines.c<?> cVar) {
        p1();
        throw new KotlinNothingValueException();
    }

    public G(@l3.e Throwable th, @l3.e String str) {
        this.f54441G = th;
        this.f54442H = str;
    }
}
