package com.google.android.material.transition;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.TypedValue;
import android.view.View;
import androidx.annotation.D;
import androidx.annotation.InterfaceC0563f;
import androidx.annotation.InterfaceC0569l;
import androidx.annotation.InterfaceC0580x;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.transition.AbstractC0991z;
import androidx.transition.B;
import androidx.transition.J;
import androidx.transition.O;
import c1.C1007a;
import com.google.android.material.shape.o;

/* loaded from: classes2.dex */
class u {

    /* renamed from: a, reason: collision with root package name */
    static final int f34398a = -1;

    /* renamed from: b, reason: collision with root package name */
    @InterfaceC0563f
    static final int f34399b = 0;

    /* renamed from: c, reason: collision with root package name */
    private static final int f34400c = 0;

    /* renamed from: d, reason: collision with root package name */
    private static final int f34401d = 1;

    /* renamed from: e, reason: collision with root package name */
    private static final RectF f34402e = new RectF();

    /* loaded from: classes2.dex */
    class a implements o.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ RectF f34403a;

        a(RectF rectF) {
            this.f34403a = rectF;
        }

        @Override // com.google.android.material.shape.o.c
        @N
        public com.google.android.material.shape.d a(@N com.google.android.material.shape.d dVar) {
            if (!(dVar instanceof com.google.android.material.shape.m)) {
                return new com.google.android.material.shape.m(dVar.a(this.f34403a) / this.f34403a.height());
            }
            return dVar;
        }
    }

    /* loaded from: classes2.dex */
    class b implements d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ RectF f34404a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ RectF f34405b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f34406c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f34407d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ float f34408e;

        b(RectF rectF, RectF rectF2, float f4, float f5, float f6) {
            this.f34404a = rectF;
            this.f34405b = rectF2;
            this.f34406c = f4;
            this.f34407d = f5;
            this.f34408e = f6;
        }

        @Override // com.google.android.material.transition.u.d
        @N
        public com.google.android.material.shape.d a(@N com.google.android.material.shape.d dVar, @N com.google.android.material.shape.d dVar2) {
            return new com.google.android.material.shape.a(u.l(dVar.a(this.f34404a), dVar2.a(this.f34405b), this.f34406c, this.f34407d, this.f34408e));
        }
    }

    /* loaded from: classes2.dex */
    interface c {
        void a(Canvas canvas);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public interface d {
        @N
        com.google.android.material.shape.d a(@N com.google.android.material.shape.d dVar, @N com.google.android.material.shape.d dVar2);
    }

    private u() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float a(@N RectF rectF) {
        return rectF.width() * rectF.height();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static com.google.android.material.shape.o b(com.google.android.material.shape.o oVar, RectF rectF) {
        return oVar.y(new a(rectF));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Shader c(@InterfaceC0569l int i4) {
        return new LinearGradient(0.0f, 0.0f, 0.0f, 0.0f, i4, i4, Shader.TileMode.CLAMP);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @N
    public static <T> T d(@P T t3, @N T t4) {
        return t3 != null ? t3 : t4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static View e(View view, @D int i4) {
        String resourceName = view.getResources().getResourceName(i4);
        while (view != null) {
            if (view.getId() == i4) {
                return view;
            }
            Object parent = view.getParent();
            if (!(parent instanceof View)) {
                break;
            }
            view = (View) parent;
        }
        throw new IllegalArgumentException(resourceName + " is not a valid ancestor");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static View f(View view, @D int i4) {
        View findViewById = view.findViewById(i4);
        if (findViewById != null) {
            return findViewById;
        }
        return e(view, i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static RectF g(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return new RectF(iArr[0], iArr[1], view.getWidth() + r1, view.getHeight() + r0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static RectF h(View view) {
        return new RectF(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    static Rect i(View view) {
        return new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    private static boolean j(com.google.android.material.shape.o oVar, RectF rectF) {
        if (oVar.r().a(rectF) == 0.0f && oVar.t().a(rectF) == 0.0f && oVar.l().a(rectF) == 0.0f && oVar.j().a(rectF) == 0.0f) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float k(float f4, float f5, float f6) {
        return f4 + (f6 * (f5 - f4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float l(float f4, float f5, @InterfaceC0580x(from = 0.0d, to = 1.0d) float f6, @InterfaceC0580x(from = 0.0d, to = 1.0d) float f7, @InterfaceC0580x(from = 0.0d, to = 1.0d) float f8) {
        return m(f4, f5, f6, f7, f8, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float m(float f4, float f5, @InterfaceC0580x(from = 0.0d, to = 1.0d) float f6, @InterfaceC0580x(from = 0.0d, to = 1.0d) float f7, @InterfaceC0580x(from = 0.0d) float f8, boolean z3) {
        if (z3 && (f8 < 0.0f || f8 > 1.0f)) {
            return k(f4, f5, f8);
        }
        if (f8 < f6) {
            return f4;
        }
        if (f8 > f7) {
            return f5;
        }
        return k(f4, f5, (f8 - f6) / (f7 - f6));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int n(int i4, int i5, @InterfaceC0580x(from = 0.0d, to = 1.0d) float f4, @InterfaceC0580x(from = 0.0d, to = 1.0d) float f5, @InterfaceC0580x(from = 0.0d, to = 1.0d) float f6) {
        if (f6 < f4) {
            return i4;
        }
        if (f6 > f5) {
            return i5;
        }
        return (int) k(i4, i5, (f6 - f4) / (f5 - f4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static com.google.android.material.shape.o o(com.google.android.material.shape.o oVar, com.google.android.material.shape.o oVar2, RectF rectF, RectF rectF2, @InterfaceC0580x(from = 0.0d, to = 1.0d) float f4, @InterfaceC0580x(from = 0.0d, to = 1.0d) float f5, @InterfaceC0580x(from = 0.0d, to = 1.0d) float f6) {
        if (f6 < f4) {
            return oVar;
        }
        if (f6 > f5) {
            return oVar2;
        }
        return x(oVar, oVar2, rectF, new b(rectF, rectF2, f4, f5, f6));
    }

    static void p(O o4, @P J j4) {
        if (j4 != null) {
            o4.J0(j4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean q(J j4, Context context, @InterfaceC0563f int i4) {
        int d4;
        if (i4 != 0 && j4.K() == -1 && (d4 = C1007a.d(context, i4, -1)) != -1) {
            j4.v0(d4);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean r(J j4, Context context, @InterfaceC0563f int i4, TimeInterpolator timeInterpolator) {
        if (i4 != 0 && j4.N() == null) {
            j4.x0(C1007a.e(context, i4, timeInterpolator));
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean s(J j4, Context context, @InterfaceC0563f int i4) {
        AbstractC0991z u3;
        if (i4 != 0 && (u3 = u(context, i4)) != null) {
            j4.z0(u3);
            return true;
        }
        return false;
    }

    static void t(O o4, @P J j4) {
        if (j4 != null) {
            o4.T0(j4);
        }
    }

    @P
    static AbstractC0991z u(Context context, @InterfaceC0563f int i4) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i4, typedValue, true)) {
            return null;
        }
        int i5 = typedValue.type;
        if (i5 == 16) {
            int i6 = typedValue.data;
            if (i6 == 0) {
                return null;
            }
            if (i6 == 1) {
                return new k();
            }
            throw new IllegalArgumentException("Invalid motion path type: " + i6);
        }
        if (i5 == 3) {
            return new B(androidx.core.graphics.J.e(String.valueOf(typedValue.string)));
        }
        throw new IllegalArgumentException("Motion path theme attribute must either be an enum value or path data string");
    }

    private static int v(Canvas canvas, Rect rect, int i4) {
        RectF rectF = f34402e;
        rectF.set(rect);
        return canvas.saveLayerAlpha(rectF, i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void w(Canvas canvas, Rect rect, float f4, float f5, float f6, int i4, c cVar) {
        if (i4 <= 0) {
            return;
        }
        int save = canvas.save();
        canvas.translate(f4, f5);
        canvas.scale(f6, f6);
        if (i4 < 255) {
            v(canvas, rect, i4);
        }
        cVar.a(canvas);
        canvas.restoreToCount(save);
    }

    static com.google.android.material.shape.o x(com.google.android.material.shape.o oVar, com.google.android.material.shape.o oVar2, RectF rectF, d dVar) {
        com.google.android.material.shape.o oVar3;
        if (j(oVar, rectF)) {
            oVar3 = oVar;
        } else {
            oVar3 = oVar2;
        }
        return oVar3.v().L(dVar.a(oVar.r(), oVar2.r())).Q(dVar.a(oVar.t(), oVar2.t())).y(dVar.a(oVar.j(), oVar2.j())).D(dVar.a(oVar.l(), oVar2.l())).m();
    }
}
