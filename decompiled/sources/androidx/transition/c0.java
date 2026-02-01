package androidx.transition;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.RestrictTo;
import androidx.core.view.C0823k0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class c0 implements e0 {

    /* renamed from: a, reason: collision with root package name */
    protected a f19995a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a extends ViewGroup {

        /* renamed from: J, reason: collision with root package name */
        static Method f19996J;

        /* renamed from: E, reason: collision with root package name */
        ViewGroup f19997E;

        /* renamed from: F, reason: collision with root package name */
        View f19998F;

        /* renamed from: G, reason: collision with root package name */
        ArrayList<Drawable> f19999G;

        /* renamed from: H, reason: collision with root package name */
        c0 f20000H;

        /* renamed from: I, reason: collision with root package name */
        private boolean f20001I;

        static {
            try {
                Class cls = Integer.TYPE;
                f19996J = ViewGroup.class.getDeclaredMethod("invalidateChildInParentFast", cls, cls, Rect.class);
            } catch (NoSuchMethodException unused) {
            }
        }

        a(Context context, ViewGroup viewGroup, View view, c0 c0Var) {
            super(context);
            this.f19999G = null;
            this.f19997E = viewGroup;
            this.f19998F = view;
            setRight(viewGroup.getWidth());
            setBottom(viewGroup.getHeight());
            viewGroup.addView(this);
            this.f20000H = c0Var;
        }

        private void c() {
            if (!this.f20001I) {
            } else {
                throw new IllegalStateException("This overlay was disposed already. Please use a new one via ViewGroupUtils.getOverlay()");
            }
        }

        private void d() {
            if (getChildCount() == 0) {
                ArrayList<Drawable> arrayList = this.f19999G;
                if (arrayList == null || arrayList.size() == 0) {
                    this.f20001I = true;
                    this.f19997E.removeView(this);
                }
            }
        }

        private void e(int[] iArr) {
            int[] iArr2 = new int[2];
            int[] iArr3 = new int[2];
            this.f19997E.getLocationOnScreen(iArr2);
            this.f19998F.getLocationOnScreen(iArr3);
            iArr[0] = iArr3[0] - iArr2[0];
            iArr[1] = iArr3[1] - iArr2[1];
        }

        public void a(Drawable drawable) {
            c();
            if (this.f19999G == null) {
                this.f19999G = new ArrayList<>();
            }
            if (!this.f19999G.contains(drawable)) {
                this.f19999G.add(drawable);
                invalidate(drawable.getBounds());
                drawable.setCallback(this);
            }
        }

        public void b(View view) {
            c();
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != this.f19997E && viewGroup.getParent() != null && C0823k0.O0(viewGroup)) {
                    int[] iArr = new int[2];
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationOnScreen(iArr);
                    this.f19997E.getLocationOnScreen(iArr2);
                    C0823k0.e1(view, iArr[0] - iArr2[0]);
                    C0823k0.f1(view, iArr[1] - iArr2[1]);
                }
                viewGroup.removeView(view);
                if (view.getParent() != null) {
                    viewGroup.removeView(view);
                }
            }
            super.addView(view);
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void dispatchDraw(Canvas canvas) {
            int size;
            this.f19997E.getLocationOnScreen(new int[2]);
            this.f19998F.getLocationOnScreen(new int[2]);
            canvas.translate(r0[0] - r1[0], r0[1] - r1[1]);
            canvas.clipRect(new Rect(0, 0, this.f19998F.getWidth(), this.f19998F.getHeight()));
            super.dispatchDraw(canvas);
            ArrayList<Drawable> arrayList = this.f19999G;
            if (arrayList == null) {
                size = 0;
            } else {
                size = arrayList.size();
            }
            for (int i4 = 0; i4 < size; i4++) {
                this.f19999G.get(i4).draw(canvas);
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            return false;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        protected ViewParent f(int i4, int i5, Rect rect) {
            if (this.f19997E != null && f19996J != null) {
                try {
                    e(new int[2]);
                    f19996J.invoke(this.f19997E, Integer.valueOf(i4), Integer.valueOf(i5), rect);
                    return null;
                } catch (IllegalAccessException e4) {
                    e4.printStackTrace();
                    return null;
                } catch (InvocationTargetException e5) {
                    e5.printStackTrace();
                    return null;
                }
            }
            return null;
        }

        public void g(Drawable drawable) {
            ArrayList<Drawable> arrayList = this.f19999G;
            if (arrayList != null) {
                arrayList.remove(drawable);
                invalidate(drawable.getBounds());
                drawable.setCallback(null);
                d();
            }
        }

        public void h(View view) {
            super.removeView(view);
            d();
        }

        @Override // android.view.ViewGroup, android.view.ViewParent
        public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
            if (this.f19997E != null) {
                rect.offset(iArr[0], iArr[1]);
                if (this.f19997E != null) {
                    iArr[0] = 0;
                    iArr[1] = 0;
                    int[] iArr2 = new int[2];
                    e(iArr2);
                    rect.offset(iArr2[0], iArr2[1]);
                    return super.invalidateChildInParent(iArr, rect);
                }
                invalidate(rect);
                return null;
            }
            return null;
        }

        @Override // android.view.View, android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(@androidx.annotation.N Drawable drawable) {
            invalidate(drawable.getBounds());
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
        }

        @Override // android.view.View
        protected boolean verifyDrawable(@androidx.annotation.N Drawable drawable) {
            ArrayList<Drawable> arrayList;
            if (!super.verifyDrawable(drawable) && ((arrayList = this.f19999G) == null || !arrayList.contains(drawable))) {
                return false;
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c0(Context context, ViewGroup viewGroup, View view) {
        this.f19995a = new a(context, viewGroup, view, this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static c0 e(View view) {
        ViewGroup f4 = f(view);
        if (f4 != null) {
            int childCount = f4.getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = f4.getChildAt(i4);
                if (childAt instanceof a) {
                    return ((a) childAt).f20000H;
                }
            }
            return new V(f4.getContext(), f4, view);
        }
        return null;
    }

    static ViewGroup f(View view) {
        while (view != null) {
            if (view.getId() == 16908290 && (view instanceof ViewGroup)) {
                return (ViewGroup) view;
            }
            if (view.getParent() instanceof ViewGroup) {
                view = (ViewGroup) view.getParent();
            }
        }
        return null;
    }

    @Override // androidx.transition.e0
    public void a(@androidx.annotation.N Drawable drawable) {
        this.f19995a.a(drawable);
    }

    @Override // androidx.transition.e0
    public void b(@androidx.annotation.N Drawable drawable) {
        this.f19995a.g(drawable);
    }
}
