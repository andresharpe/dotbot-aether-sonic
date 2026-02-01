package kotlinx.coroutines;

@kotlin.U
/* loaded from: classes2.dex */
public class N0 extends S0 implements C {

    /* renamed from: F, reason: collision with root package name */
    private final boolean f52950F;

    public N0(@l3.e L0 l02) {
        super(true);
        S0(l02);
        this.f52950F = E1();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
    
        r0 = r0.O0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0025, code lost:
    
        if ((r0 instanceof kotlinx.coroutines.C2346x) == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0027, code lost:
    
        r0 = (kotlinx.coroutines.C2346x) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
    
        if (r0 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
    
        r0 = r0.Y0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
    
        if (r0 != null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002a, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x001d, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0014, code lost:
    
        if (r0 != null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        if (r0.K0() == false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean E1() {
        /*
            r4 = this;
            kotlinx.coroutines.w r0 = r4.O0()
            boolean r1 = r0 instanceof kotlinx.coroutines.C2346x
            r2 = 0
            if (r1 == 0) goto Lc
            kotlinx.coroutines.x r0 = (kotlinx.coroutines.C2346x) r0
            goto Ld
        Lc:
            r0 = r2
        Ld:
            r1 = 0
            if (r0 == 0) goto L33
            kotlinx.coroutines.S0 r0 = r0.Y0()
            if (r0 != 0) goto L17
            goto L33
        L17:
            boolean r3 = r0.K0()
            if (r3 == 0) goto L1f
            r0 = 1
            return r0
        L1f:
            kotlinx.coroutines.w r0 = r0.O0()
            boolean r3 = r0 instanceof kotlinx.coroutines.C2346x
            if (r3 == 0) goto L2a
            kotlinx.coroutines.x r0 = (kotlinx.coroutines.C2346x) r0
            goto L2b
        L2a:
            r0 = r2
        L2b:
            if (r0 == 0) goto L33
            kotlinx.coroutines.S0 r0 = r0.Y0()
            if (r0 != 0) goto L17
        L33:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.N0.E1():boolean");
    }

    @Override // kotlinx.coroutines.S0
    public boolean K0() {
        return this.f52950F;
    }

    @Override // kotlinx.coroutines.S0
    public boolean L0() {
        return true;
    }

    @Override // kotlinx.coroutines.C
    public boolean j() {
        return c1(kotlin.H0.f51801a);
    }

    @Override // kotlinx.coroutines.C
    public boolean k(@l3.d Throwable th) {
        return c1(new E(th, false, 2, null));
    }
}
