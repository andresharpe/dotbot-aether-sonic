package com.google.android.material.transition.platform;

import T0.a;
import android.app.Activity;
import android.app.SharedElementCallback;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.transition.Transition;
import android.view.View;
import android.view.Window;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.W;
import androidx.core.graphics.BlendModeCompat;
import androidx.core.graphics.C0715f;
import com.google.android.material.internal.C1782c;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;

@W(21)
/* loaded from: classes2.dex */
public class m extends SharedElementCallback {

    /* renamed from: f, reason: collision with root package name */
    @P
    private static WeakReference<View> f34320f;

    /* renamed from: d, reason: collision with root package name */
    @P
    private Rect f34324d;

    /* renamed from: a, reason: collision with root package name */
    private boolean f34321a = true;

    /* renamed from: b, reason: collision with root package name */
    private boolean f34322b = true;

    /* renamed from: c, reason: collision with root package name */
    private boolean f34323c = false;

    /* renamed from: e, reason: collision with root package name */
    @P
    private d f34325e = new e();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a extends u {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Window f34326a;

        a(Window window) {
            this.f34326a = window;
        }

        @Override // com.google.android.material.transition.platform.u, android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            m.j(this.f34326a);
        }

        @Override // com.google.android.material.transition.platform.u, android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
            m.i(this.f34326a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class b extends u {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Activity f34328a;

        b(Activity activity) {
            this.f34328a = activity;
        }

        @Override // com.google.android.material.transition.platform.u, android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            View view;
            if (m.f34320f != null && (view = (View) m.f34320f.get()) != null) {
                view.setAlpha(1.0f);
                WeakReference unused = m.f34320f = null;
            }
            this.f34328a.finish();
            this.f34328a.overridePendingTransition(0, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class c extends u {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Window f34330a;

        c(Window window) {
            this.f34330a = window;
        }

        @Override // com.google.android.material.transition.platform.u, android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
            m.i(this.f34330a);
        }
    }

    /* loaded from: classes2.dex */
    public interface d {
        @P
        com.google.android.material.shape.o a(@N View view);
    }

    /* loaded from: classes2.dex */
    public static class e implements d {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.material.transition.platform.m.d
        @P
        public com.google.android.material.shape.o a(@N View view) {
            if (view instanceof com.google.android.material.shape.s) {
                return ((com.google.android.material.shape.s) view).getShapeAppearanceModel();
            }
            return null;
        }
    }

    @P
    private static Drawable f(Window window) {
        return window.getDecorView().getBackground();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void i(Window window) {
        Drawable f4 = f(window);
        if (f4 == null) {
            return;
        }
        f4.mutate().setColorFilter(C0715f.a(0, BlendModeCompat.CLEAR));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void j(Window window) {
        Drawable f4 = f(window);
        if (f4 == null) {
            return;
        }
        f4.mutate().clearColorFilter();
    }

    private void n(Window window) {
        Transition sharedElementEnterTransition = window.getSharedElementEnterTransition();
        if (sharedElementEnterTransition instanceof l) {
            l lVar = (l) sharedElementEnterTransition;
            if (!this.f34323c) {
                window.setSharedElementReenterTransition(null);
            }
            if (this.f34322b) {
                p(window, lVar);
                lVar.addListener(new a(window));
            }
        }
    }

    private void o(Activity activity, Window window) {
        Transition sharedElementReturnTransition = window.getSharedElementReturnTransition();
        if (sharedElementReturnTransition instanceof l) {
            l lVar = (l) sharedElementReturnTransition;
            lVar.Z(true);
            lVar.addListener(new b(activity));
            if (this.f34322b) {
                p(window, lVar);
                lVar.addListener(new c(window));
            }
        }
    }

    private static void p(Window window, l lVar) {
        if (lVar.getDuration() >= 0) {
            window.setTransitionBackgroundFadeDuration(lVar.getDuration());
        }
    }

    @P
    public d e() {
        return this.f34325e;
    }

    public boolean g() {
        return this.f34323c;
    }

    public boolean h() {
        return this.f34322b;
    }

    public void k(@P d dVar) {
        this.f34325e = dVar;
    }

    public void l(boolean z3) {
        this.f34323c = z3;
    }

    public void m(boolean z3) {
        this.f34322b = z3;
    }

    @Override // android.app.SharedElementCallback
    @P
    public Parcelable onCaptureSharedElementSnapshot(@N View view, @N Matrix matrix, @N RectF rectF) {
        f34320f = new WeakReference<>(view);
        return super.onCaptureSharedElementSnapshot(view, matrix, rectF);
    }

    @Override // android.app.SharedElementCallback
    @P
    public View onCreateSnapshotView(@N Context context, @P Parcelable parcelable) {
        WeakReference<View> weakReference;
        View view;
        com.google.android.material.shape.o a4;
        View onCreateSnapshotView = super.onCreateSnapshotView(context, parcelable);
        if (onCreateSnapshotView != null && (weakReference = f34320f) != null && this.f34325e != null && (view = weakReference.get()) != null && (a4 = this.f34325e.a(view)) != null) {
            onCreateSnapshotView.setTag(a.h.f2820r3, a4);
        }
        return onCreateSnapshotView;
    }

    @Override // android.app.SharedElementCallback
    public void onMapSharedElements(@N List<String> list, @N Map<String, View> map) {
        View view;
        Activity a4;
        if (!list.isEmpty() && !map.isEmpty() && (view = map.get(list.get(0))) != null && (a4 = C1782c.a(view.getContext())) != null) {
            Window window = a4.getWindow();
            if (this.f34321a) {
                n(window);
            } else {
                o(a4, window);
            }
        }
    }

    @Override // android.app.SharedElementCallback
    public void onSharedElementEnd(@N List<String> list, @N List<View> list2, @N List<View> list3) {
        if (!list2.isEmpty() && (list2.get(0).getTag(a.h.f2820r3) instanceof View)) {
            list2.get(0).setTag(a.h.f2820r3, null);
        }
        if (!this.f34321a && !list2.isEmpty()) {
            this.f34324d = v.i(list2.get(0));
        }
        this.f34321a = false;
    }

    @Override // android.app.SharedElementCallback
    public void onSharedElementStart(@N List<String> list, @N List<View> list2, @N List<View> list3) {
        if (!list2.isEmpty() && !list3.isEmpty()) {
            list2.get(0).setTag(a.h.f2820r3, list3.get(0));
        }
        if (!this.f34321a && !list2.isEmpty() && this.f34324d != null) {
            View view = list2.get(0);
            view.measure(View.MeasureSpec.makeMeasureSpec(this.f34324d.width(), 1073741824), View.MeasureSpec.makeMeasureSpec(this.f34324d.height(), 1073741824));
            Rect rect = this.f34324d;
            view.layout(rect.left, rect.top, rect.right, rect.bottom);
        }
    }
}
