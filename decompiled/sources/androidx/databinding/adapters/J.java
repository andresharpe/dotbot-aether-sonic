package androidx.databinding.adapters;

import android.annotation.TargetApi;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.RestrictTo;
import androidx.databinding.InterfaceC0879d;
import androidx.databinding.library.baseAdapters.b;

@androidx.databinding.h({@androidx.databinding.g(attribute = "android:backgroundTint", method = "setBackgroundTintList", type = View.class), @androidx.databinding.g(attribute = "android:fadeScrollbars", method = "setScrollbarFadingEnabled", type = View.class), @androidx.databinding.g(attribute = "android:getOutline", method = "setOutlineProvider", type = View.class), @androidx.databinding.g(attribute = "android:nextFocusForward", method = "setNextFocusForwardId", type = View.class), @androidx.databinding.g(attribute = "android:nextFocusLeft", method = "setNextFocusLeftId", type = View.class), @androidx.databinding.g(attribute = "android:nextFocusRight", method = "setNextFocusRightId", type = View.class), @androidx.databinding.g(attribute = "android:nextFocusUp", method = "setNextFocusUpId", type = View.class), @androidx.databinding.g(attribute = "android:nextFocusDown", method = "setNextFocusDownId", type = View.class), @androidx.databinding.g(attribute = "android:requiresFadingEdge", method = "setVerticalFadingEdgeEnabled", type = View.class), @androidx.databinding.g(attribute = "android:scrollbarDefaultDelayBeforeFade", method = "setScrollBarDefaultDelayBeforeFade", type = View.class), @androidx.databinding.g(attribute = "android:scrollbarFadeDuration", method = "setScrollBarFadeDuration", type = View.class), @androidx.databinding.g(attribute = "android:scrollbarSize", method = "setScrollBarSize", type = View.class), @androidx.databinding.g(attribute = "android:scrollbarStyle", method = "setScrollBarStyle", type = View.class), @androidx.databinding.g(attribute = "android:transformPivotX", method = "setPivotX", type = View.class), @androidx.databinding.g(attribute = "android:transformPivotY", method = "setPivotY", type = View.class), @androidx.databinding.g(attribute = "android:onDrag", method = "setOnDragListener", type = View.class), @androidx.databinding.g(attribute = "android:onClick", method = "setOnClickListener", type = View.class), @androidx.databinding.g(attribute = "android:onApplyWindowInsets", method = "setOnApplyWindowInsetsListener", type = View.class), @androidx.databinding.g(attribute = "android:onCreateContextMenu", method = "setOnCreateContextMenuListener", type = View.class), @androidx.databinding.g(attribute = "android:onFocusChange", method = "setOnFocusChangeListener", type = View.class), @androidx.databinding.g(attribute = "android:onGenericMotion", method = "setOnGenericMotionListener", type = View.class), @androidx.databinding.g(attribute = "android:onHover", method = "setOnHoverListener", type = View.class), @androidx.databinding.g(attribute = "android:onKey", method = "setOnKeyListener", type = View.class), @androidx.databinding.g(attribute = "android:onLongClick", method = "setOnLongClickListener", type = View.class), @androidx.databinding.g(attribute = "android:onSystemUiVisibilityChange", method = "setOnSystemUiVisibilityChangeListener", type = View.class), @androidx.databinding.g(attribute = "android:onTouch", method = "setOnTouchListener", type = View.class)})
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes.dex */
public class J {

    /* renamed from: a, reason: collision with root package name */
    public static final int f14036a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final int f14037b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f14038c = 2;

    /* loaded from: classes.dex */
    class a implements View.OnAttachStateChangeListener {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ b f14039E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ c f14040F;

        a(b bVar, c cVar) {
            this.f14039E = bVar;
            this.f14040F = cVar;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            b bVar = this.f14039E;
            if (bVar != null) {
                bVar.onViewAttachedToWindow(view);
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            c cVar = this.f14040F;
            if (cVar != null) {
                cVar.onViewDetachedFromWindow(view);
            }
        }
    }

    @TargetApi(12)
    /* loaded from: classes.dex */
    public interface b {
        void onViewAttachedToWindow(View view);
    }

    @TargetApi(12)
    /* loaded from: classes.dex */
    public interface c {
        void onViewDetachedFromWindow(View view);
    }

    private static int a(float f4) {
        int i4 = (int) (0.5f + f4);
        if (i4 != 0) {
            return i4;
        }
        if (f4 == 0.0f) {
            return 0;
        }
        return f4 > 0.0f ? 1 : -1;
    }

    @InterfaceC0879d({"android:background"})
    public static void b(View view, Drawable drawable) {
        view.setBackground(drawable);
    }

    @InterfaceC0879d({"android:onClickListener", "android:clickable"})
    public static void c(View view, View.OnClickListener onClickListener, boolean z3) {
        view.setOnClickListener(onClickListener);
        view.setClickable(z3);
    }

    @InterfaceC0879d(requireAll = false, value = {"android:onViewDetachedFromWindow", "android:onViewAttachedToWindow"})
    public static void d(View view, c cVar, b bVar) {
        a aVar;
        if (cVar == null && bVar == null) {
            aVar = null;
        } else {
            aVar = new a(bVar, cVar);
        }
        View.OnAttachStateChangeListener onAttachStateChangeListener = (View.OnAttachStateChangeListener) r.b(view, aVar, b.a.f14107a);
        if (onAttachStateChangeListener != null) {
            view.removeOnAttachStateChangeListener(onAttachStateChangeListener);
        }
        if (aVar != null) {
            view.addOnAttachStateChangeListener(aVar);
        }
    }

    @InterfaceC0879d({"android:onClick", "android:clickable"})
    public static void e(View view, View.OnClickListener onClickListener, boolean z3) {
        view.setOnClickListener(onClickListener);
        view.setClickable(z3);
    }

    @InterfaceC0879d({"android:onLayoutChange"})
    public static void f(View view, View.OnLayoutChangeListener onLayoutChangeListener, View.OnLayoutChangeListener onLayoutChangeListener2) {
        if (onLayoutChangeListener != null) {
            view.removeOnLayoutChangeListener(onLayoutChangeListener);
        }
        if (onLayoutChangeListener2 != null) {
            view.addOnLayoutChangeListener(onLayoutChangeListener2);
        }
    }

    @InterfaceC0879d({"android:onLongClick", "android:longClickable"})
    public static void g(View view, View.OnLongClickListener onLongClickListener, boolean z3) {
        view.setOnLongClickListener(onLongClickListener);
        view.setLongClickable(z3);
    }

    @InterfaceC0879d({"android:onLongClickListener", "android:longClickable"})
    public static void h(View view, View.OnLongClickListener onLongClickListener, boolean z3) {
        view.setOnLongClickListener(onLongClickListener);
        view.setLongClickable(z3);
    }

    @InterfaceC0879d({"android:padding"})
    public static void i(View view, float f4) {
        int a4 = a(f4);
        view.setPadding(a4, a4, a4, a4);
    }

    @InterfaceC0879d({"android:paddingBottom"})
    public static void j(View view, float f4) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), a(f4));
    }

    @InterfaceC0879d({"android:paddingEnd"})
    public static void k(View view, float f4) {
        view.setPaddingRelative(view.getPaddingStart(), view.getPaddingTop(), a(f4), view.getPaddingBottom());
    }

    @InterfaceC0879d({"android:paddingLeft"})
    public static void l(View view, float f4) {
        view.setPadding(a(f4), view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom());
    }

    @InterfaceC0879d({"android:paddingRight"})
    public static void m(View view, float f4) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), a(f4), view.getPaddingBottom());
    }

    @InterfaceC0879d({"android:paddingStart"})
    public static void n(View view, float f4) {
        view.setPaddingRelative(a(f4), view.getPaddingTop(), view.getPaddingEnd(), view.getPaddingBottom());
    }

    @InterfaceC0879d({"android:paddingTop"})
    public static void o(View view, float f4) {
        view.setPadding(view.getPaddingLeft(), a(f4), view.getPaddingRight(), view.getPaddingBottom());
    }

    @InterfaceC0879d({"android:requiresFadingEdge"})
    public static void p(View view, int i4) {
        boolean z3;
        boolean z4 = false;
        if ((i4 & 2) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if ((i4 & 1) != 0) {
            z4 = true;
        }
        view.setVerticalFadingEdgeEnabled(z3);
        view.setHorizontalFadingEdgeEnabled(z4);
    }
}
