package com.bumptech.glide.request;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import androidx.annotation.F;
import androidx.annotation.InterfaceC0567j;
import androidx.annotation.InterfaceC0578v;
import androidx.annotation.InterfaceC0580x;
import androidx.annotation.N;
import androidx.annotation.P;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;

/* loaded from: classes.dex */
public class h extends a<h> {

    /* renamed from: A0, reason: collision with root package name */
    @P
    private static h f26787A0;

    /* renamed from: B0, reason: collision with root package name */
    @P
    private static h f26788B0;

    /* renamed from: C0, reason: collision with root package name */
    @P
    private static h f26789C0;

    /* renamed from: D0, reason: collision with root package name */
    @P
    private static h f26790D0;

    /* renamed from: E0, reason: collision with root package name */
    @P
    private static h f26791E0;

    /* renamed from: F0, reason: collision with root package name */
    @P
    private static h f26792F0;

    /* renamed from: G0, reason: collision with root package name */
    @P
    private static h f26793G0;

    /* renamed from: z0, reason: collision with root package name */
    @P
    private static h f26794z0;

    @N
    @InterfaceC0567j
    public static h W0(@N com.bumptech.glide.load.i<Bitmap> iVar) {
        return new h().N0(iVar);
    }

    @N
    @InterfaceC0567j
    public static h X0() {
        if (f26790D0 == null) {
            f26790D0 = new h().d().b();
        }
        return f26790D0;
    }

    @N
    @InterfaceC0567j
    public static h Y0() {
        if (f26789C0 == null) {
            f26789C0 = new h().e().b();
        }
        return f26789C0;
    }

    @N
    @InterfaceC0567j
    public static h Z0() {
        if (f26791E0 == null) {
            f26791E0 = new h().l().b();
        }
        return f26791E0;
    }

    @N
    @InterfaceC0567j
    public static h a1(@N Class<?> cls) {
        return new h().q(cls);
    }

    @N
    @InterfaceC0567j
    public static h b1(@N com.bumptech.glide.load.engine.j jVar) {
        return new h().s(jVar);
    }

    @N
    @InterfaceC0567j
    public static h c1(@N DownsampleStrategy downsampleStrategy) {
        return new h().x(downsampleStrategy);
    }

    @N
    @InterfaceC0567j
    public static h d1(@N Bitmap.CompressFormat compressFormat) {
        return new h().y(compressFormat);
    }

    @N
    @InterfaceC0567j
    public static h e1(@F(from = 0, to = 100) int i4) {
        return new h().A(i4);
    }

    @N
    @InterfaceC0567j
    public static h f1(@InterfaceC0578v int i4) {
        return new h().B(i4);
    }

    @N
    @InterfaceC0567j
    public static h g1(@P Drawable drawable) {
        return new h().C(drawable);
    }

    @N
    @InterfaceC0567j
    public static h h1() {
        if (f26788B0 == null) {
            f26788B0 = new h().F().b();
        }
        return f26788B0;
    }

    @N
    @InterfaceC0567j
    public static h i1(@N DecodeFormat decodeFormat) {
        return new h().G(decodeFormat);
    }

    @N
    @InterfaceC0567j
    public static h j1(@F(from = 0) long j4) {
        return new h().H(j4);
    }

    @N
    @InterfaceC0567j
    public static h k1() {
        if (f26793G0 == null) {
            f26793G0 = new h().u().b();
        }
        return f26793G0;
    }

    @N
    @InterfaceC0567j
    public static h l1() {
        if (f26792F0 == null) {
            f26792F0 = new h().w().b();
        }
        return f26792F0;
    }

    @N
    @InterfaceC0567j
    public static <T> h m1(@N com.bumptech.glide.load.e<T> eVar, @N T t3) {
        return new h().H0(eVar, t3);
    }

    @N
    @InterfaceC0567j
    public static h n1(int i4) {
        return o1(i4, i4);
    }

    @N
    @InterfaceC0567j
    public static h o1(int i4, int i5) {
        return new h().z0(i4, i5);
    }

    @N
    @InterfaceC0567j
    public static h p1(@InterfaceC0578v int i4) {
        return new h().A0(i4);
    }

    @N
    @InterfaceC0567j
    public static h q1(@P Drawable drawable) {
        return new h().B0(drawable);
    }

    @N
    @InterfaceC0567j
    public static h r1(@N Priority priority) {
        return new h().C0(priority);
    }

    @N
    @InterfaceC0567j
    public static h s1(@N com.bumptech.glide.load.c cVar) {
        return new h().I0(cVar);
    }

    @N
    @InterfaceC0567j
    public static h t1(@InterfaceC0580x(from = 0.0d, to = 1.0d) float f4) {
        return new h().J0(f4);
    }

    @N
    @InterfaceC0567j
    public static h u1(boolean z3) {
        if (z3) {
            if (f26794z0 == null) {
                f26794z0 = new h().K0(true).b();
            }
            return f26794z0;
        }
        if (f26787A0 == null) {
            f26787A0 = new h().K0(false).b();
        }
        return f26787A0;
    }

    @N
    @InterfaceC0567j
    public static h v1(@F(from = 0) int i4) {
        return new h().M0(i4);
    }
}
