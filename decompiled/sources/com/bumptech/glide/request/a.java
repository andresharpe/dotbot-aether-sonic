package com.bumptech.glide.request;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.F;
import androidx.annotation.InterfaceC0567j;
import androidx.annotation.InterfaceC0578v;
import androidx.annotation.InterfaceC0580x;
import androidx.annotation.N;
import androidx.annotation.P;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.resource.bitmap.C1120e;
import com.bumptech.glide.load.resource.bitmap.C1128m;
import com.bumptech.glide.load.resource.bitmap.C1129n;
import com.bumptech.glide.load.resource.bitmap.C1130o;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import com.bumptech.glide.load.resource.bitmap.O;
import com.bumptech.glide.load.resource.bitmap.u;
import com.bumptech.glide.load.resource.bitmap.w;
import com.bumptech.glide.load.resource.bitmap.y;
import com.bumptech.glide.request.a;
import com.bumptech.glide.util.l;
import com.bumptech.glide.util.n;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class a<T extends a<T>> implements Cloneable {

    /* renamed from: e0, reason: collision with root package name */
    private static final int f26723e0 = -1;

    /* renamed from: f0, reason: collision with root package name */
    private static final int f26724f0 = 2;

    /* renamed from: g0, reason: collision with root package name */
    private static final int f26725g0 = 4;

    /* renamed from: h0, reason: collision with root package name */
    private static final int f26726h0 = 8;

    /* renamed from: i0, reason: collision with root package name */
    private static final int f26727i0 = 16;

    /* renamed from: j0, reason: collision with root package name */
    private static final int f26728j0 = 32;

    /* renamed from: k0, reason: collision with root package name */
    private static final int f26729k0 = 64;

    /* renamed from: l0, reason: collision with root package name */
    private static final int f26730l0 = 128;

    /* renamed from: m0, reason: collision with root package name */
    private static final int f26731m0 = 256;

    /* renamed from: n0, reason: collision with root package name */
    private static final int f26732n0 = 512;

    /* renamed from: o0, reason: collision with root package name */
    private static final int f26733o0 = 1024;

    /* renamed from: p0, reason: collision with root package name */
    private static final int f26734p0 = 2048;

    /* renamed from: q0, reason: collision with root package name */
    private static final int f26735q0 = 4096;

    /* renamed from: r0, reason: collision with root package name */
    private static final int f26736r0 = 8192;

    /* renamed from: s0, reason: collision with root package name */
    private static final int f26737s0 = 16384;

    /* renamed from: t0, reason: collision with root package name */
    private static final int f26738t0 = 32768;

    /* renamed from: u0, reason: collision with root package name */
    private static final int f26739u0 = 65536;

    /* renamed from: v0, reason: collision with root package name */
    private static final int f26740v0 = 131072;

    /* renamed from: w0, reason: collision with root package name */
    private static final int f26741w0 = 262144;

    /* renamed from: x0, reason: collision with root package name */
    private static final int f26742x0 = 524288;

    /* renamed from: y0, reason: collision with root package name */
    private static final int f26743y0 = 1048576;

    /* renamed from: E, reason: collision with root package name */
    private int f26744E;

    /* renamed from: I, reason: collision with root package name */
    @P
    private Drawable f26748I;

    /* renamed from: J, reason: collision with root package name */
    private int f26749J;

    /* renamed from: K, reason: collision with root package name */
    @P
    private Drawable f26750K;

    /* renamed from: L, reason: collision with root package name */
    private int f26751L;

    /* renamed from: Q, reason: collision with root package name */
    private boolean f26756Q;

    /* renamed from: S, reason: collision with root package name */
    @P
    private Drawable f26758S;

    /* renamed from: T, reason: collision with root package name */
    private int f26759T;

    /* renamed from: X, reason: collision with root package name */
    private boolean f26763X;

    /* renamed from: Y, reason: collision with root package name */
    @P
    private Resources.Theme f26764Y;

    /* renamed from: Z, reason: collision with root package name */
    private boolean f26765Z;

    /* renamed from: a0, reason: collision with root package name */
    private boolean f26766a0;

    /* renamed from: b0, reason: collision with root package name */
    private boolean f26767b0;

    /* renamed from: d0, reason: collision with root package name */
    private boolean f26769d0;

    /* renamed from: F, reason: collision with root package name */
    private float f26745F = 1.0f;

    /* renamed from: G, reason: collision with root package name */
    @N
    private com.bumptech.glide.load.engine.j f26746G = com.bumptech.glide.load.engine.j.f26113e;

    /* renamed from: H, reason: collision with root package name */
    @N
    private Priority f26747H = Priority.NORMAL;

    /* renamed from: M, reason: collision with root package name */
    private boolean f26752M = true;

    /* renamed from: N, reason: collision with root package name */
    private int f26753N = -1;

    /* renamed from: O, reason: collision with root package name */
    private int f26754O = -1;

    /* renamed from: P, reason: collision with root package name */
    @N
    private com.bumptech.glide.load.c f26755P = com.bumptech.glide.signature.c.c();

    /* renamed from: R, reason: collision with root package name */
    private boolean f26757R = true;

    /* renamed from: U, reason: collision with root package name */
    @N
    private com.bumptech.glide.load.f f26760U = new com.bumptech.glide.load.f();

    /* renamed from: V, reason: collision with root package name */
    @N
    private Map<Class<?>, com.bumptech.glide.load.i<?>> f26761V = new com.bumptech.glide.util.b();

    /* renamed from: W, reason: collision with root package name */
    @N
    private Class<?> f26762W = Object.class;

    /* renamed from: c0, reason: collision with root package name */
    private boolean f26768c0 = true;

    @N
    private T D0(@N DownsampleStrategy downsampleStrategy, @N com.bumptech.glide.load.i<Bitmap> iVar) {
        return E0(downsampleStrategy, iVar, true);
    }

    @N
    private T E0(@N DownsampleStrategy downsampleStrategy, @N com.bumptech.glide.load.i<Bitmap> iVar, boolean z3) {
        T w02;
        if (z3) {
            w02 = P0(downsampleStrategy, iVar);
        } else {
            w02 = w0(downsampleStrategy, iVar);
        }
        w02.f26768c0 = true;
        return w02;
    }

    private T F0() {
        return this;
    }

    private boolean h0(int i4) {
        return i0(this.f26744E, i4);
    }

    private static boolean i0(int i4, int i5) {
        return (i4 & i5) != 0;
    }

    @N
    private T u0(@N DownsampleStrategy downsampleStrategy, @N com.bumptech.glide.load.i<Bitmap> iVar) {
        return E0(downsampleStrategy, iVar, false);
    }

    @N
    @InterfaceC0567j
    public T A(@F(from = 0, to = 100) int i4) {
        return H0(C1120e.f26515b, Integer.valueOf(i4));
    }

    @N
    @InterfaceC0567j
    public T A0(@InterfaceC0578v int i4) {
        if (this.f26765Z) {
            return (T) p().A0(i4);
        }
        this.f26751L = i4;
        int i5 = this.f26744E | 128;
        this.f26750K = null;
        this.f26744E = i5 & (-65);
        return G0();
    }

    @N
    @InterfaceC0567j
    public T B(@InterfaceC0578v int i4) {
        if (this.f26765Z) {
            return (T) p().B(i4);
        }
        this.f26749J = i4;
        int i5 = this.f26744E | 32;
        this.f26748I = null;
        this.f26744E = i5 & (-17);
        return G0();
    }

    @N
    @InterfaceC0567j
    public T B0(@P Drawable drawable) {
        if (this.f26765Z) {
            return (T) p().B0(drawable);
        }
        this.f26750K = drawable;
        int i4 = this.f26744E | 64;
        this.f26751L = 0;
        this.f26744E = i4 & (-129);
        return G0();
    }

    @N
    @InterfaceC0567j
    public T C(@P Drawable drawable) {
        if (this.f26765Z) {
            return (T) p().C(drawable);
        }
        this.f26748I = drawable;
        int i4 = this.f26744E | 16;
        this.f26749J = 0;
        this.f26744E = i4 & (-33);
        return G0();
    }

    @N
    @InterfaceC0567j
    public T C0(@N Priority priority) {
        if (this.f26765Z) {
            return (T) p().C0(priority);
        }
        this.f26747H = (Priority) l.d(priority);
        this.f26744E |= 8;
        return G0();
    }

    @N
    @InterfaceC0567j
    public T D(@InterfaceC0578v int i4) {
        if (this.f26765Z) {
            return (T) p().D(i4);
        }
        this.f26759T = i4;
        int i5 = this.f26744E | 16384;
        this.f26758S = null;
        this.f26744E = i5 & (-8193);
        return G0();
    }

    @N
    @InterfaceC0567j
    public T E(@P Drawable drawable) {
        if (this.f26765Z) {
            return (T) p().E(drawable);
        }
        this.f26758S = drawable;
        int i4 = this.f26744E | 8192;
        this.f26759T = 0;
        this.f26744E = i4 & (-16385);
        return G0();
    }

    @N
    @InterfaceC0567j
    public T F() {
        return D0(DownsampleStrategy.f26454c, new y());
    }

    @N
    @InterfaceC0567j
    public T G(@N DecodeFormat decodeFormat) {
        l.d(decodeFormat);
        return (T) H0(u.f26533g, decodeFormat).H0(com.bumptech.glide.load.resource.gif.i.f26626a, decodeFormat);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @N
    public final T G0() {
        if (!this.f26763X) {
            return F0();
        }
        throw new IllegalStateException("You cannot modify locked T, consider clone()");
    }

    @N
    @InterfaceC0567j
    public T H(@F(from = 0) long j4) {
        return H0(O.f26498g, Long.valueOf(j4));
    }

    @N
    @InterfaceC0567j
    public <Y> T H0(@N com.bumptech.glide.load.e<Y> eVar, @N Y y3) {
        if (this.f26765Z) {
            return (T) p().H0(eVar, y3);
        }
        l.d(eVar);
        l.d(y3);
        this.f26760U.e(eVar, y3);
        return G0();
    }

    @N
    public final com.bumptech.glide.load.engine.j I() {
        return this.f26746G;
    }

    @N
    @InterfaceC0567j
    public T I0(@N com.bumptech.glide.load.c cVar) {
        if (this.f26765Z) {
            return (T) p().I0(cVar);
        }
        this.f26755P = (com.bumptech.glide.load.c) l.d(cVar);
        this.f26744E |= 1024;
        return G0();
    }

    public final int J() {
        return this.f26749J;
    }

    @N
    @InterfaceC0567j
    public T J0(@InterfaceC0580x(from = 0.0d, to = 1.0d) float f4) {
        if (this.f26765Z) {
            return (T) p().J0(f4);
        }
        if (f4 >= 0.0f && f4 <= 1.0f) {
            this.f26745F = f4;
            this.f26744E |= 2;
            return G0();
        }
        throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
    }

    @P
    public final Drawable K() {
        return this.f26748I;
    }

    @N
    @InterfaceC0567j
    public T K0(boolean z3) {
        if (this.f26765Z) {
            return (T) p().K0(true);
        }
        this.f26752M = !z3;
        this.f26744E |= 256;
        return G0();
    }

    @P
    public final Drawable L() {
        return this.f26758S;
    }

    @N
    @InterfaceC0567j
    public T L0(@P Resources.Theme theme) {
        if (this.f26765Z) {
            return (T) p().L0(theme);
        }
        this.f26764Y = theme;
        this.f26744E |= 32768;
        return G0();
    }

    public final int M() {
        return this.f26759T;
    }

    @N
    @InterfaceC0567j
    public T M0(@F(from = 0) int i4) {
        return H0(com.bumptech.glide.load.model.stream.b.f26360b, Integer.valueOf(i4));
    }

    public final boolean N() {
        return this.f26767b0;
    }

    @N
    @InterfaceC0567j
    public T N0(@N com.bumptech.glide.load.i<Bitmap> iVar) {
        return O0(iVar, true);
    }

    @N
    public final com.bumptech.glide.load.f O() {
        return this.f26760U;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @N
    T O0(@N com.bumptech.glide.load.i<Bitmap> iVar, boolean z3) {
        if (this.f26765Z) {
            return (T) p().O0(iVar, z3);
        }
        w wVar = new w(iVar, z3);
        R0(Bitmap.class, iVar, z3);
        R0(Drawable.class, wVar, z3);
        R0(BitmapDrawable.class, wVar.c(), z3);
        R0(com.bumptech.glide.load.resource.gif.c.class, new com.bumptech.glide.load.resource.gif.f(iVar), z3);
        return G0();
    }

    public final int P() {
        return this.f26753N;
    }

    @N
    @InterfaceC0567j
    final T P0(@N DownsampleStrategy downsampleStrategy, @N com.bumptech.glide.load.i<Bitmap> iVar) {
        if (this.f26765Z) {
            return (T) p().P0(downsampleStrategy, iVar);
        }
        x(downsampleStrategy);
        return N0(iVar);
    }

    public final int Q() {
        return this.f26754O;
    }

    @N
    @InterfaceC0567j
    public <Y> T Q0(@N Class<Y> cls, @N com.bumptech.glide.load.i<Y> iVar) {
        return R0(cls, iVar, true);
    }

    @P
    public final Drawable R() {
        return this.f26750K;
    }

    @N
    <Y> T R0(@N Class<Y> cls, @N com.bumptech.glide.load.i<Y> iVar, boolean z3) {
        if (this.f26765Z) {
            return (T) p().R0(cls, iVar, z3);
        }
        l.d(cls);
        l.d(iVar);
        this.f26761V.put(cls, iVar);
        int i4 = this.f26744E;
        this.f26757R = true;
        this.f26744E = 67584 | i4;
        this.f26768c0 = false;
        if (z3) {
            this.f26744E = i4 | 198656;
            this.f26756Q = true;
        }
        return G0();
    }

    public final int S() {
        return this.f26751L;
    }

    @N
    @InterfaceC0567j
    public T S0(@N com.bumptech.glide.load.i<Bitmap>... iVarArr) {
        if (iVarArr.length > 1) {
            return O0(new com.bumptech.glide.load.d(iVarArr), true);
        }
        if (iVarArr.length == 1) {
            return N0(iVarArr[0]);
        }
        return G0();
    }

    @N
    public final Priority T() {
        return this.f26747H;
    }

    @N
    @InterfaceC0567j
    @Deprecated
    public T T0(@N com.bumptech.glide.load.i<Bitmap>... iVarArr) {
        return O0(new com.bumptech.glide.load.d(iVarArr), true);
    }

    @N
    public final Class<?> U() {
        return this.f26762W;
    }

    @N
    @InterfaceC0567j
    public T U0(boolean z3) {
        if (this.f26765Z) {
            return (T) p().U0(z3);
        }
        this.f26769d0 = z3;
        this.f26744E |= 1048576;
        return G0();
    }

    @N
    public final com.bumptech.glide.load.c V() {
        return this.f26755P;
    }

    @N
    @InterfaceC0567j
    public T V0(boolean z3) {
        if (this.f26765Z) {
            return (T) p().V0(z3);
        }
        this.f26766a0 = z3;
        this.f26744E |= 262144;
        return G0();
    }

    public final float W() {
        return this.f26745F;
    }

    @P
    public final Resources.Theme X() {
        return this.f26764Y;
    }

    @N
    public final Map<Class<?>, com.bumptech.glide.load.i<?>> Y() {
        return this.f26761V;
    }

    public final boolean Z() {
        return this.f26769d0;
    }

    @N
    @InterfaceC0567j
    public T a(@N a<?> aVar) {
        if (this.f26765Z) {
            return (T) p().a(aVar);
        }
        if (i0(aVar.f26744E, 2)) {
            this.f26745F = aVar.f26745F;
        }
        if (i0(aVar.f26744E, 262144)) {
            this.f26766a0 = aVar.f26766a0;
        }
        if (i0(aVar.f26744E, 1048576)) {
            this.f26769d0 = aVar.f26769d0;
        }
        if (i0(aVar.f26744E, 4)) {
            this.f26746G = aVar.f26746G;
        }
        if (i0(aVar.f26744E, 8)) {
            this.f26747H = aVar.f26747H;
        }
        if (i0(aVar.f26744E, 16)) {
            this.f26748I = aVar.f26748I;
            this.f26749J = 0;
            this.f26744E &= -33;
        }
        if (i0(aVar.f26744E, 32)) {
            this.f26749J = aVar.f26749J;
            this.f26748I = null;
            this.f26744E &= -17;
        }
        if (i0(aVar.f26744E, 64)) {
            this.f26750K = aVar.f26750K;
            this.f26751L = 0;
            this.f26744E &= -129;
        }
        if (i0(aVar.f26744E, 128)) {
            this.f26751L = aVar.f26751L;
            this.f26750K = null;
            this.f26744E &= -65;
        }
        if (i0(aVar.f26744E, 256)) {
            this.f26752M = aVar.f26752M;
        }
        if (i0(aVar.f26744E, 512)) {
            this.f26754O = aVar.f26754O;
            this.f26753N = aVar.f26753N;
        }
        if (i0(aVar.f26744E, 1024)) {
            this.f26755P = aVar.f26755P;
        }
        if (i0(aVar.f26744E, 4096)) {
            this.f26762W = aVar.f26762W;
        }
        if (i0(aVar.f26744E, 8192)) {
            this.f26758S = aVar.f26758S;
            this.f26759T = 0;
            this.f26744E &= -16385;
        }
        if (i0(aVar.f26744E, 16384)) {
            this.f26759T = aVar.f26759T;
            this.f26758S = null;
            this.f26744E &= -8193;
        }
        if (i0(aVar.f26744E, 32768)) {
            this.f26764Y = aVar.f26764Y;
        }
        if (i0(aVar.f26744E, 65536)) {
            this.f26757R = aVar.f26757R;
        }
        if (i0(aVar.f26744E, 131072)) {
            this.f26756Q = aVar.f26756Q;
        }
        if (i0(aVar.f26744E, 2048)) {
            this.f26761V.putAll(aVar.f26761V);
            this.f26768c0 = aVar.f26768c0;
        }
        if (i0(aVar.f26744E, 524288)) {
            this.f26767b0 = aVar.f26767b0;
        }
        if (!this.f26757R) {
            this.f26761V.clear();
            int i4 = this.f26744E;
            this.f26756Q = false;
            this.f26744E = i4 & (-133121);
            this.f26768c0 = true;
        }
        this.f26744E |= aVar.f26744E;
        this.f26760U.d(aVar.f26760U);
        return G0();
    }

    public final boolean a0() {
        return this.f26766a0;
    }

    @N
    public T b() {
        if (this.f26763X && !this.f26765Z) {
            throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
        }
        this.f26765Z = true;
        return o0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean b0() {
        return this.f26765Z;
    }

    public final boolean c0() {
        return h0(4);
    }

    @N
    @InterfaceC0567j
    public T d() {
        return P0(DownsampleStrategy.f26456e, new C1128m());
    }

    public final boolean d0() {
        return this.f26763X;
    }

    @N
    @InterfaceC0567j
    public T e() {
        return D0(DownsampleStrategy.f26455d, new C1129n());
    }

    public final boolean e0() {
        return this.f26752M;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (Float.compare(aVar.f26745F, this.f26745F) != 0 || this.f26749J != aVar.f26749J || !n.d(this.f26748I, aVar.f26748I) || this.f26751L != aVar.f26751L || !n.d(this.f26750K, aVar.f26750K) || this.f26759T != aVar.f26759T || !n.d(this.f26758S, aVar.f26758S) || this.f26752M != aVar.f26752M || this.f26753N != aVar.f26753N || this.f26754O != aVar.f26754O || this.f26756Q != aVar.f26756Q || this.f26757R != aVar.f26757R || this.f26766a0 != aVar.f26766a0 || this.f26767b0 != aVar.f26767b0 || !this.f26746G.equals(aVar.f26746G) || this.f26747H != aVar.f26747H || !this.f26760U.equals(aVar.f26760U) || !this.f26761V.equals(aVar.f26761V) || !this.f26762W.equals(aVar.f26762W) || !n.d(this.f26755P, aVar.f26755P) || !n.d(this.f26764Y, aVar.f26764Y)) {
            return false;
        }
        return true;
    }

    public final boolean f0() {
        return h0(8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean g0() {
        return this.f26768c0;
    }

    public int hashCode() {
        return n.q(this.f26764Y, n.q(this.f26755P, n.q(this.f26762W, n.q(this.f26761V, n.q(this.f26760U, n.q(this.f26747H, n.q(this.f26746G, n.s(this.f26767b0, n.s(this.f26766a0, n.s(this.f26757R, n.s(this.f26756Q, n.p(this.f26754O, n.p(this.f26753N, n.s(this.f26752M, n.q(this.f26758S, n.p(this.f26759T, n.q(this.f26750K, n.p(this.f26751L, n.q(this.f26748I, n.p(this.f26749J, n.m(this.f26745F)))))))))))))))))))));
    }

    public final boolean j0() {
        return h0(256);
    }

    public final boolean k0() {
        return this.f26757R;
    }

    @N
    @InterfaceC0567j
    public T l() {
        return P0(DownsampleStrategy.f26455d, new C1130o());
    }

    public final boolean l0() {
        return this.f26756Q;
    }

    public final boolean m0() {
        return h0(2048);
    }

    public final boolean n0() {
        return n.w(this.f26754O, this.f26753N);
    }

    @N
    public T o0() {
        this.f26763X = true;
        return F0();
    }

    @Override // 
    @InterfaceC0567j
    public T p() {
        try {
            T t3 = (T) super.clone();
            com.bumptech.glide.load.f fVar = new com.bumptech.glide.load.f();
            t3.f26760U = fVar;
            fVar.d(this.f26760U);
            com.bumptech.glide.util.b bVar = new com.bumptech.glide.util.b();
            t3.f26761V = bVar;
            bVar.putAll(this.f26761V);
            t3.f26763X = false;
            t3.f26765Z = false;
            return t3;
        } catch (CloneNotSupportedException e4) {
            throw new RuntimeException(e4);
        }
    }

    @N
    @InterfaceC0567j
    public T p0(boolean z3) {
        if (this.f26765Z) {
            return (T) p().p0(z3);
        }
        this.f26767b0 = z3;
        this.f26744E |= 524288;
        return G0();
    }

    @N
    @InterfaceC0567j
    public T q(@N Class<?> cls) {
        if (this.f26765Z) {
            return (T) p().q(cls);
        }
        this.f26762W = (Class) l.d(cls);
        this.f26744E |= 4096;
        return G0();
    }

    @N
    @InterfaceC0567j
    public T q0() {
        return w0(DownsampleStrategy.f26456e, new C1128m());
    }

    @N
    @InterfaceC0567j
    public T r() {
        return H0(u.f26537k, Boolean.FALSE);
    }

    @N
    @InterfaceC0567j
    public T r0() {
        return u0(DownsampleStrategy.f26455d, new C1129n());
    }

    @N
    @InterfaceC0567j
    public T s(@N com.bumptech.glide.load.engine.j jVar) {
        if (this.f26765Z) {
            return (T) p().s(jVar);
        }
        this.f26746G = (com.bumptech.glide.load.engine.j) l.d(jVar);
        this.f26744E |= 4;
        return G0();
    }

    @N
    @InterfaceC0567j
    public T s0() {
        return w0(DownsampleStrategy.f26456e, new C1130o());
    }

    @N
    @InterfaceC0567j
    public T t0() {
        return u0(DownsampleStrategy.f26454c, new y());
    }

    @N
    @InterfaceC0567j
    public T u() {
        return H0(com.bumptech.glide.load.resource.gif.i.f26627b, Boolean.TRUE);
    }

    @N
    @InterfaceC0567j
    public T v0(@N com.bumptech.glide.load.i<Bitmap> iVar) {
        return O0(iVar, false);
    }

    @N
    @InterfaceC0567j
    public T w() {
        if (this.f26765Z) {
            return (T) p().w();
        }
        this.f26761V.clear();
        int i4 = this.f26744E;
        this.f26756Q = false;
        this.f26757R = false;
        this.f26744E = (i4 & (-133121)) | 65536;
        this.f26768c0 = true;
        return G0();
    }

    @N
    final T w0(@N DownsampleStrategy downsampleStrategy, @N com.bumptech.glide.load.i<Bitmap> iVar) {
        if (this.f26765Z) {
            return (T) p().w0(downsampleStrategy, iVar);
        }
        x(downsampleStrategy);
        return O0(iVar, false);
    }

    @N
    @InterfaceC0567j
    public T x(@N DownsampleStrategy downsampleStrategy) {
        return H0(DownsampleStrategy.f26459h, l.d(downsampleStrategy));
    }

    @N
    @InterfaceC0567j
    public <Y> T x0(@N Class<Y> cls, @N com.bumptech.glide.load.i<Y> iVar) {
        return R0(cls, iVar, false);
    }

    @N
    @InterfaceC0567j
    public T y(@N Bitmap.CompressFormat compressFormat) {
        return H0(C1120e.f26516c, l.d(compressFormat));
    }

    @N
    @InterfaceC0567j
    public T y0(int i4) {
        return z0(i4, i4);
    }

    @N
    @InterfaceC0567j
    public T z0(int i4, int i5) {
        if (this.f26765Z) {
            return (T) p().z0(i4, i5);
        }
        this.f26754O = i4;
        this.f26753N = i5;
        this.f26744E |= 512;
        return G0();
    }
}
