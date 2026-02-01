package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.j2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1422j2 extends AbstractC1440l4 implements Q4 {
    public static final /* synthetic */ int zza = 0;
    private static final C1422j2 zze;
    private boolean zzA;
    private long zzC;
    private int zzD;
    private boolean zzG;
    private int zzJ;
    private int zzK;
    private int zzL;
    private long zzN;
    private long zzO;
    private int zzR;
    private C1446m2 zzT;
    private long zzV;
    private long zzW;
    private int zzZ;
    private boolean zzaa;
    private boolean zzac;
    private C1382e2 zzad;
    private int zzf;
    private int zzg;
    private int zzh;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private int zzt;
    private long zzx;
    private long zzy;
    private InterfaceC1495s4 zzi = AbstractC1440l4.p();
    private InterfaceC1495s4 zzj = AbstractC1440l4.p();
    private String zzp = "";
    private String zzq = "";
    private String zzr = "";
    private String zzs = "";
    private String zzu = "";
    private String zzv = "";
    private String zzw = "";
    private String zzz = "";
    private String zzB = "";
    private String zzE = "";
    private String zzF = "";
    private InterfaceC1495s4 zzH = AbstractC1440l4.p();
    private String zzI = "";
    private String zzM = "";
    private String zzP = "";
    private String zzQ = "";
    private String zzS = "";
    private InterfaceC1480q4 zzU = AbstractC1440l4.l();
    private String zzX = "";
    private String zzY = "";
    private String zzab = "";
    private String zzae = "";
    private InterfaceC1495s4 zzaf = AbstractC1440l4.p();
    private String zzag = "";

    static {
        C1422j2 c1422j2 = new C1422j2();
        zze = c1422j2;
        AbstractC1440l4.t(C1422j2.class, c1422j2);
    }

    private C1422j2() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void B0(C1422j2 c1422j2, String str) {
        str.getClass();
        c1422j2.zzg |= 8192;
        c1422j2.zzae = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void C0(C1422j2 c1422j2) {
        c1422j2.zzg &= -8193;
        c1422j2.zzae = zze.zzae;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void D0(C1422j2 c1422j2, Iterable iterable) {
        InterfaceC1495s4 interfaceC1495s4 = c1422j2.zzaf;
        if (!interfaceC1495s4.zzc()) {
            c1422j2.zzaf = AbstractC1440l4.q(interfaceC1495s4);
        }
        AbstractC1518v3.i(iterable, c1422j2.zzaf);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void F0(C1422j2 c1422j2, String str) {
        str.getClass();
        c1422j2.zzg |= 16384;
        c1422j2.zzag = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void G0(C1422j2 c1422j2, int i4) {
        c1422j2.c1();
        c1422j2.zzi.remove(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void H0(C1422j2 c1422j2, int i4, C1493s2 c1493s2) {
        c1493s2.getClass();
        c1422j2.d1();
        c1422j2.zzj.set(i4, c1493s2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void I0(C1422j2 c1422j2, C1493s2 c1493s2) {
        c1493s2.getClass();
        c1422j2.d1();
        c1422j2.zzj.add(c1493s2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void J0(C1422j2 c1422j2, Iterable iterable) {
        c1422j2.d1();
        AbstractC1518v3.i(iterable, c1422j2.zzj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void K0(C1422j2 c1422j2, int i4) {
        c1422j2.d1();
        c1422j2.zzj.remove(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void L0(C1422j2 c1422j2, long j4) {
        c1422j2.zzf |= 2;
        c1422j2.zzk = j4;
    }

    public static C1414i2 L1() {
        return (C1414i2) zze.u();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void M0(C1422j2 c1422j2, long j4) {
        c1422j2.zzf |= 4;
        c1422j2.zzl = j4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void N0(C1422j2 c1422j2, long j4) {
        c1422j2.zzf |= 8;
        c1422j2.zzm = j4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void O0(C1422j2 c1422j2, long j4) {
        c1422j2.zzf |= 16;
        c1422j2.zzn = j4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void P(C1422j2 c1422j2) {
        c1422j2.zzf &= Integer.MAX_VALUE;
        c1422j2.zzP = zze.zzP;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void P0(C1422j2 c1422j2) {
        c1422j2.zzf &= -17;
        c1422j2.zzn = 0L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void Q(C1422j2 c1422j2, int i4) {
        c1422j2.zzg |= 2;
        c1422j2.zzR = i4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void Q0(C1422j2 c1422j2, long j4) {
        c1422j2.zzf |= 32;
        c1422j2.zzo = j4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void R(C1422j2 c1422j2, int i4, Y1 y12) {
        y12.getClass();
        c1422j2.c1();
        c1422j2.zzi.set(i4, y12);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void R0(C1422j2 c1422j2) {
        c1422j2.zzf &= -33;
        c1422j2.zzo = 0L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void S(C1422j2 c1422j2, String str) {
        str.getClass();
        c1422j2.zzg |= 4;
        c1422j2.zzS = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void S0(C1422j2 c1422j2, String str) {
        c1422j2.zzf |= 64;
        c1422j2.zzp = "android";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void T(C1422j2 c1422j2, C1446m2 c1446m2) {
        c1446m2.getClass();
        c1422j2.zzT = c1446m2;
        c1422j2.zzg |= 8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void T0(C1422j2 c1422j2, String str) {
        str.getClass();
        c1422j2.zzf |= 128;
        c1422j2.zzq = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void U(C1422j2 c1422j2, Iterable iterable) {
        int i4;
        InterfaceC1480q4 interfaceC1480q4 = c1422j2.zzU;
        if (!interfaceC1480q4.zzc()) {
            int size = interfaceC1480q4.size();
            if (size == 0) {
                i4 = 10;
            } else {
                i4 = size + size;
            }
            c1422j2.zzU = interfaceC1480q4.zzd(i4);
        }
        AbstractC1518v3.i(iterable, c1422j2.zzU);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void U0(C1422j2 c1422j2) {
        c1422j2.zzf &= -129;
        c1422j2.zzq = zze.zzq;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void V(C1422j2 c1422j2, Y1 y12) {
        y12.getClass();
        c1422j2.c1();
        c1422j2.zzi.add(y12);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void V0(C1422j2 c1422j2, String str) {
        str.getClass();
        c1422j2.zzf |= 256;
        c1422j2.zzr = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void W(C1422j2 c1422j2, long j4) {
        c1422j2.zzg |= 16;
        c1422j2.zzV = j4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void W0(C1422j2 c1422j2) {
        c1422j2.zzf &= -257;
        c1422j2.zzr = zze.zzr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void X(C1422j2 c1422j2, long j4) {
        c1422j2.zzg |= 32;
        c1422j2.zzW = j4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void X0(C1422j2 c1422j2, String str) {
        str.getClass();
        c1422j2.zzf |= 512;
        c1422j2.zzs = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void Y(C1422j2 c1422j2, String str) {
        c1422j2.zzg |= 128;
        c1422j2.zzY = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void Y0(C1422j2 c1422j2, int i4) {
        c1422j2.zzf |= 1024;
        c1422j2.zzt = i4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void Z(C1422j2 c1422j2, Iterable iterable) {
        c1422j2.c1();
        AbstractC1518v3.i(iterable, c1422j2.zzi);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void Z0(C1422j2 c1422j2, String str) {
        str.getClass();
        c1422j2.zzf |= 2048;
        c1422j2.zzu = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void a1(C1422j2 c1422j2, String str) {
        str.getClass();
        c1422j2.zzf |= 4096;
        c1422j2.zzv = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void b0(C1422j2 c1422j2, String str) {
        str.getClass();
        c1422j2.zzf |= 8192;
        c1422j2.zzw = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void c0(C1422j2 c1422j2, long j4) {
        c1422j2.zzf |= 16384;
        c1422j2.zzx = j4;
    }

    private final void c1() {
        InterfaceC1495s4 interfaceC1495s4 = this.zzi;
        if (!interfaceC1495s4.zzc()) {
            this.zzi = AbstractC1440l4.q(interfaceC1495s4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void d0(C1422j2 c1422j2, long j4) {
        c1422j2.zzf |= 32768;
        c1422j2.zzy = 73000L;
    }

    private final void d1() {
        InterfaceC1495s4 interfaceC1495s4 = this.zzj;
        if (!interfaceC1495s4.zzc()) {
            this.zzj = AbstractC1440l4.q(interfaceC1495s4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void e0(C1422j2 c1422j2, String str) {
        str.getClass();
        c1422j2.zzf |= 65536;
        c1422j2.zzz = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void f0(C1422j2 c1422j2) {
        c1422j2.zzf &= -65537;
        c1422j2.zzz = zze.zzz;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void g0(C1422j2 c1422j2, boolean z3) {
        c1422j2.zzf |= 131072;
        c1422j2.zzA = z3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void h0(C1422j2 c1422j2) {
        c1422j2.zzf &= -131073;
        c1422j2.zzA = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void i0(C1422j2 c1422j2, String str) {
        str.getClass();
        c1422j2.zzf |= 262144;
        c1422j2.zzB = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void j0(C1422j2 c1422j2) {
        c1422j2.zzf &= -262145;
        c1422j2.zzB = zze.zzB;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void k0(C1422j2 c1422j2, long j4) {
        c1422j2.zzf |= 524288;
        c1422j2.zzC = j4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void l0(C1422j2 c1422j2, int i4) {
        c1422j2.zzf |= 1048576;
        c1422j2.zzD = i4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void m0(C1422j2 c1422j2, String str) {
        c1422j2.zzf |= 2097152;
        c1422j2.zzE = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void n0(C1422j2 c1422j2) {
        c1422j2.zzf &= -2097153;
        c1422j2.zzE = zze.zzE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void o0(C1422j2 c1422j2, String str) {
        str.getClass();
        c1422j2.zzf |= 4194304;
        c1422j2.zzF = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void p0(C1422j2 c1422j2, boolean z3) {
        c1422j2.zzf |= 8388608;
        c1422j2.zzG = z3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void q0(C1422j2 c1422j2, Iterable iterable) {
        InterfaceC1495s4 interfaceC1495s4 = c1422j2.zzH;
        if (!interfaceC1495s4.zzc()) {
            c1422j2.zzH = AbstractC1440l4.q(interfaceC1495s4);
        }
        AbstractC1518v3.i(iterable, c1422j2.zzH);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void s0(C1422j2 c1422j2, String str) {
        str.getClass();
        c1422j2.zzf |= 16777216;
        c1422j2.zzI = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void t0(C1422j2 c1422j2, int i4) {
        c1422j2.zzf |= 33554432;
        c1422j2.zzJ = i4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void u0(C1422j2 c1422j2, int i4) {
        c1422j2.zzf |= 1;
        c1422j2.zzh = 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void v0(C1422j2 c1422j2) {
        c1422j2.zzf &= -268435457;
        c1422j2.zzM = zze.zzM;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void w0(C1422j2 c1422j2, long j4) {
        c1422j2.zzf |= 536870912;
        c1422j2.zzN = j4;
    }

    public final String A() {
        return this.zzw;
    }

    public final boolean A0() {
        return (this.zzf & 1048576) != 0;
    }

    public final long A1() {
        return this.zzN;
    }

    public final String B() {
        return this.zzY;
    }

    public final long B1() {
        return this.zzC;
    }

    public final String C() {
        return this.zzr;
    }

    public final long C1() {
        return this.zzV;
    }

    public final String D() {
        return this.zzP;
    }

    public final long D1() {
        return this.zzm;
    }

    public final String E() {
        return this.zzI;
    }

    public final long E1() {
        return this.zzx;
    }

    public final String F() {
        return this.zzF;
    }

    public final long F1() {
        return this.zzo;
    }

    public final String G() {
        return this.zzE;
    }

    public final long G1() {
        return this.zzn;
    }

    public final String H() {
        return this.zzq;
    }

    public final long H1() {
        return this.zzl;
    }

    public final String I() {
        return this.zzp;
    }

    public final long I1() {
        return this.zzk;
    }

    public final String J() {
        return this.zzz;
    }

    public final long J1() {
        return this.zzy;
    }

    public final String K() {
        return this.zzae;
    }

    public final Y1 K1(int i4) {
        return (Y1) this.zzi.get(i4);
    }

    public final String L() {
        return this.zzs;
    }

    public final List M() {
        return this.zzH;
    }

    public final List N() {
        return this.zzi;
    }

    public final C1493s2 N1(int i4) {
        return (C1493s2) this.zzj.get(i4);
    }

    public final List O() {
        return this.zzj;
    }

    public final String O1() {
        return this.zzS;
    }

    public final String P1() {
        return this.zzv;
    }

    public final String Q1() {
        return this.zzB;
    }

    public final String R1() {
        return this.zzu;
    }

    public final int a0() {
        return this.zzJ;
    }

    public final int b1() {
        return this.zzD;
    }

    public final boolean e1() {
        return (this.zzf & 536870912) != 0;
    }

    public final boolean f1() {
        return (this.zzg & 128) != 0;
    }

    public final boolean g1() {
        return (this.zzf & 524288) != 0;
    }

    public final boolean h1() {
        return (this.zzg & 16) != 0;
    }

    public final boolean i1() {
        return (this.zzf & 8) != 0;
    }

    public final boolean j1() {
        return (this.zzf & 16384) != 0;
    }

    public final boolean k1() {
        return (this.zzf & 131072) != 0;
    }

    public final boolean l1() {
        return (this.zzf & 32) != 0;
    }

    public final boolean m1() {
        return (this.zzf & 16) != 0;
    }

    public final boolean n1() {
        return (this.zzf & 1) != 0;
    }

    public final boolean o1() {
        return (this.zzg & 2) != 0;
    }

    public final boolean p1() {
        return (this.zzf & 8388608) != 0;
    }

    public final boolean q1() {
        return (this.zzg & 8192) != 0;
    }

    public final boolean r1() {
        return (this.zzf & 4) != 0;
    }

    public final boolean s1() {
        return (this.zzf & 1024) != 0;
    }

    public final boolean t1() {
        return (this.zzf & 2) != 0;
    }

    public final boolean u1() {
        return (this.zzf & 32768) != 0;
    }

    public final int v1() {
        return this.zzi.size();
    }

    public final int w1() {
        return this.zzh;
    }

    public final boolean x0() {
        return this.zzA;
    }

    public final int x1() {
        return this.zzR;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.AbstractC1440l4
    public final Object y(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 != 0) {
            if (i5 != 2) {
                if (i5 != 3) {
                    P1 p12 = null;
                    if (i5 != 4) {
                        if (i5 != 5) {
                            return null;
                        }
                        return zze;
                    }
                    return new C1414i2(p12);
                }
                return new C1422j2();
            }
            return AbstractC1440l4.s(zze, "\u00014\u0000\u0002\u0001A4\u0000\u0005\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဂ\u0001\u0005ဂ\u0002\u0006ဂ\u0003\u0007ဂ\u0005\bဈ\u0006\tဈ\u0007\nဈ\b\u000bဈ\t\fင\n\rဈ\u000b\u000eဈ\f\u0010ဈ\r\u0011ဂ\u000e\u0012ဂ\u000f\u0013ဈ\u0010\u0014ဇ\u0011\u0015ဈ\u0012\u0016ဂ\u0013\u0017င\u0014\u0018ဈ\u0015\u0019ဈ\u0016\u001aဂ\u0004\u001cဇ\u0017\u001d\u001b\u001eဈ\u0018\u001fင\u0019 င\u001a!င\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဈ\u001f&ဈ 'င!)ဈ\",ဉ#-\u001d.ဂ$/ဂ%2ဈ&4ဈ'5ဌ(7ဇ)9ဈ*:ဇ+;ဉ,?ဈ-@\u001aAဈ.", new Object[]{"zzf", "zzg", "zzh", "zzi", Y1.class, "zzj", C1493s2.class, "zzk", "zzl", "zzm", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", "zzE", "zzF", "zzn", "zzG", "zzH", U1.class, "zzI", "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", "zzQ", "zzR", "zzS", "zzT", "zzU", "zzV", "zzW", "zzX", "zzY", "zzZ", Q1.f29425a, "zzaa", "zzab", "zzac", "zzad", "zzae", "zzaf", "zzag"});
        }
        return (byte) 1;
    }

    public final boolean y0() {
        return this.zzG;
    }

    public final int y1() {
        return this.zzt;
    }

    public final boolean z0() {
        return (this.zzf & 33554432) != 0;
    }

    public final int z1() {
        return this.zzj.size();
    }
}
