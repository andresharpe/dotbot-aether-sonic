package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.annotation.RestrictTo;
import androidx.annotation.i0;
import androidx.core.content.res.f;
import androidx.core.content.res.i;
import androidx.core.provider.h;

/* loaded from: classes.dex */
public class T {

    /* renamed from: a, reason: collision with root package name */
    private static final Z f12418a;

    /* renamed from: b, reason: collision with root package name */
    private static final androidx.collection.j<String, Typeface> f12419b;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* loaded from: classes.dex */
    public static class a extends h.d {

        /* renamed from: j, reason: collision with root package name */
        @androidx.annotation.P
        private i.g f12420j;

        public a(@androidx.annotation.P i.g gVar) {
            this.f12420j = gVar;
        }

        @Override // androidx.core.provider.h.d
        public void a(int i4) {
            i.g gVar = this.f12420j;
            if (gVar != null) {
                gVar.f(i4);
            }
        }

        @Override // androidx.core.provider.h.d
        public void b(@androidx.annotation.N Typeface typeface) {
            i.g gVar = this.f12420j;
            if (gVar != null) {
                gVar.g(typeface);
            }
        }
    }

    static {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 29) {
            f12418a = new Y();
        } else if (i4 >= 28) {
            f12418a = new X();
        } else if (i4 >= 26) {
            f12418a = new W();
        } else if (V.q()) {
            f12418a = new V();
        } else {
            f12418a = new U();
        }
        f12419b = new androidx.collection.j<>(16);
    }

    private T() {
    }

    @i0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static void a() {
        f12419b.d();
    }

    @androidx.annotation.N
    public static Typeface b(@androidx.annotation.N Context context, @androidx.annotation.P Typeface typeface, int i4) {
        if (context != null) {
            return Typeface.create(typeface, i4);
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    @androidx.annotation.N
    public static Typeface c(@androidx.annotation.N Context context, @androidx.annotation.P Typeface typeface, @androidx.annotation.F(from = 1, to = 1000) int i4, boolean z3) {
        if (context != null) {
            androidx.core.util.u.g(i4, 1, 1000, "weight");
            if (typeface == null) {
                typeface = Typeface.DEFAULT;
            }
            return f12418a.g(context, typeface, i4, z3);
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    @androidx.annotation.P
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static Typeface d(@androidx.annotation.N Context context, @androidx.annotation.P CancellationSignal cancellationSignal, @androidx.annotation.N h.c[] cVarArr, int i4) {
        return f12418a.d(context, cancellationSignal, cVarArr, i4);
    }

    @androidx.annotation.P
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public static Typeface e(@androidx.annotation.N Context context, @androidx.annotation.N f.b bVar, @androidx.annotation.N Resources resources, int i4, int i5, @androidx.annotation.P i.g gVar, @androidx.annotation.P Handler handler, boolean z3) {
        return f(context, bVar, resources, i4, null, 0, i5, gVar, handler, z3);
    }

    @androidx.annotation.P
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static Typeface f(@androidx.annotation.N Context context, @androidx.annotation.N f.b bVar, @androidx.annotation.N Resources resources, int i4, @androidx.annotation.P String str, int i5, int i6, @androidx.annotation.P i.g gVar, @androidx.annotation.P Handler handler, boolean z3) {
        Typeface b4;
        boolean z4;
        int i7;
        if (bVar instanceof f.C0083f) {
            f.C0083f c0083f = (f.C0083f) bVar;
            Typeface m4 = m(c0083f.c());
            if (m4 != null) {
                if (gVar != null) {
                    gVar.d(m4, handler);
                }
                return m4;
            }
            if (!z3 ? gVar == null : c0083f.a() == 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z3) {
                i7 = c0083f.d();
            } else {
                i7 = -1;
            }
            b4 = androidx.core.provider.h.f(context, c0083f.b(), i6, z4, i7, i.g.e(handler), new a(gVar));
        } else {
            b4 = f12418a.b(context, (f.d) bVar, resources, i6);
            if (gVar != null) {
                if (b4 != null) {
                    gVar.d(b4, handler);
                } else {
                    gVar.c(-3, handler);
                }
            }
        }
        if (b4 != null) {
            f12419b.j(i(resources, i4, str, i5, i6), b4);
        }
        return b4;
    }

    @androidx.annotation.P
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public static Typeface g(@androidx.annotation.N Context context, @androidx.annotation.N Resources resources, int i4, String str, int i5) {
        return h(context, resources, i4, str, 0, i5);
    }

    @androidx.annotation.P
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static Typeface h(@androidx.annotation.N Context context, @androidx.annotation.N Resources resources, int i4, String str, int i5, int i6) {
        Typeface f4 = f12418a.f(context, resources, i4, str, i6);
        if (f4 != null) {
            f12419b.j(i(resources, i4, str, i5, i6), f4);
        }
        return f4;
    }

    private static String i(Resources resources, int i4, String str, int i5, int i6) {
        return resources.getResourcePackageName(i4) + '-' + str + '-' + i5 + '-' + i4 + '-' + i6;
    }

    @androidx.annotation.P
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public static Typeface j(@androidx.annotation.N Resources resources, int i4, int i5) {
        return k(resources, i4, null, 0, i5);
    }

    @androidx.annotation.P
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static Typeface k(@androidx.annotation.N Resources resources, int i4, @androidx.annotation.P String str, int i5, int i6) {
        return f12419b.f(i(resources, i4, str, i5, i6));
    }

    @androidx.annotation.P
    private static Typeface l(Context context, Typeface typeface, int i4) {
        Z z3 = f12418a;
        f.d m4 = z3.m(typeface);
        if (m4 == null) {
            return null;
        }
        return z3.b(context, m4, context.getResources(), i4);
    }

    private static Typeface m(@androidx.annotation.P String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        Typeface create = Typeface.create(str, 0);
        Typeface create2 = Typeface.create(Typeface.DEFAULT, 0);
        if (create == null || create.equals(create2)) {
            return null;
        }
        return create;
    }
}
