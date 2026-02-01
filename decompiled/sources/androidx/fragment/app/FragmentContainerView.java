package androidx.fragment.app;

import A.a;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.annotation.W;
import androidx.core.view.C0823k0;
import androidx.core.view.Y0;
import com.google.android.gms.common.internal.C;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C2197u;

@kotlin.E(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0005B\u0011\b\u0016\u0012\u0006\u0010D\u001a\u00020C¢\u0006\u0004\bE\u0010FB%\b\u0017\u0012\u0006\u0010D\u001a\u00020C\u0012\b\u0010H\u001a\u0004\u0018\u00010G\u0012\b\b\u0002\u0010I\u001a\u00020$¢\u0006\u0004\bE\u0010JB!\b\u0010\u0012\u0006\u0010D\u001a\u00020C\u0012\u0006\u0010H\u001a\u00020G\u0012\u0006\u0010L\u001a\u00020K¢\u0006\u0004\bE\u0010MJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0017¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0017¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0019H\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001f\u0010\u0006J\u0017\u0010 \u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b \u0010\u0006J\u0017\u0010\"\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u001bH\u0001¢\u0006\u0004\b\"\u0010#J)\u0010(\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010%\u001a\u00020$2\b\u0010'\u001a\u0004\u0018\u00010&H\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\u00042\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b,\u0010\u0006J\u0017\u0010-\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b-\u0010\u0006J\u001f\u00100\u001a\u00020\u00042\u0006\u0010.\u001a\u00020$2\u0006\u0010/\u001a\u00020$H\u0016¢\u0006\u0004\b0\u00101J\u001f\u00102\u001a\u00020\u00042\u0006\u0010.\u001a\u00020$2\u0006\u0010/\u001a\u00020$H\u0016¢\u0006\u0004\b2\u00101J\u000f\u00103\u001a\u00020\u0004H\u0016¢\u0006\u0004\b3\u00104J\u0019\u00107\u001a\u00028\u0000\"\n\b\u0000\u00106*\u0004\u0018\u000105¢\u0006\u0004\b7\u00108R\u001a\u0010<\u001a\b\u0012\u0004\u0012\u00020\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010;R\u0018\u0010@\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010!\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010B¨\u0006N"}, d2 = {"Landroidx/fragment/app/FragmentContainerView;", "Landroid/widget/FrameLayout;", "Landroid/view/View;", "v", "Lkotlin/H0;", "a", "(Landroid/view/View;)V", "Landroid/animation/LayoutTransition;", "transition", "setLayoutTransition", "(Landroid/animation/LayoutTransition;)V", "Landroid/view/View$OnApplyWindowInsetsListener;", C.a.f28602a, "setOnApplyWindowInsetsListener", "(Landroid/view/View$OnApplyWindowInsetsListener;)V", "Landroid/view/WindowInsets;", "insets", "onApplyWindowInsets", "(Landroid/view/WindowInsets;)Landroid/view/WindowInsets;", "dispatchApplyWindowInsets", "Landroid/graphics/Canvas;", "canvas", "dispatchDraw", "(Landroid/graphics/Canvas;)V", "child", "", "drawingTime", "", "drawChild", "(Landroid/graphics/Canvas;Landroid/view/View;J)Z", com.google.android.gms.analytics.ecommerce.c.f27782c, "startViewTransition", "endViewTransition", "drawDisappearingViewsFirst", "setDrawDisappearingViewsLast", "(Z)V", "", FirebaseAnalytics.b.f34777X, "Landroid/view/ViewGroup$LayoutParams;", "params", "addView", "(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V", "removeViewAt", "(I)V", "removeViewInLayout", "removeView", "start", "count", "removeViews", "(II)V", "removeViewsInLayout", "removeAllViewsInLayout", "()V", "Landroidx/fragment/app/Fragment;", "F", "getFragment", "()Landroidx/fragment/app/Fragment;", "", androidx.exifinterface.media.a.U4, "Ljava/util/List;", "disappearingFragmentChildren", "transitioningFragmentViews", "G", "Landroid/view/View$OnApplyWindowInsetsListener;", "applyWindowInsetsListener", "H", "Z", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroidx/fragment/app/FragmentManager;", "fm", "(Landroid/content/Context;Landroid/util/AttributeSet;Landroidx/fragment/app/FragmentManager;)V", "fragment_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class FragmentContainerView extends FrameLayout {

    /* renamed from: E, reason: collision with root package name */
    @l3.d
    private final List<View> f15080E;

    /* renamed from: F, reason: collision with root package name */
    @l3.d
    private final List<View> f15081F;

    /* renamed from: G, reason: collision with root package name */
    @l3.e
    private View.OnApplyWindowInsetsListener f15082G;

    /* renamed from: H, reason: collision with root package name */
    private boolean f15083H;

    @W(20)
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @l3.d
        public static final a f15084a = new a();

        private a() {
        }

        @l3.d
        public final WindowInsets a(@l3.d View.OnApplyWindowInsetsListener onApplyWindowInsetsListener, @l3.d View v3, @l3.d WindowInsets insets) {
            kotlin.jvm.internal.F.p(onApplyWindowInsetsListener, "onApplyWindowInsetsListener");
            kotlin.jvm.internal.F.p(v3, "v");
            kotlin.jvm.internal.F.p(insets, "insets");
            WindowInsets onApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(v3, insets);
            kotlin.jvm.internal.F.o(onApplyWindowInsets, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            return onApplyWindowInsets;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @W2.j
    public FragmentContainerView(@l3.d Context context, @l3.e AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.F.p(context, "context");
    }

    private final void a(View view) {
        if (this.f15081F.contains(view)) {
            this.f15080E.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(@l3.d View child, int i4, @l3.e ViewGroup.LayoutParams layoutParams) {
        kotlin.jvm.internal.F.p(child, "child");
        if (FragmentManager.M0(child) != null) {
            super.addView(child, i4, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + child + " is not associated with a Fragment.").toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    @l3.d
    @W(20)
    public WindowInsets dispatchApplyWindowInsets(@l3.d WindowInsets insets) {
        Y0 g12;
        int childCount;
        kotlin.jvm.internal.F.p(insets, "insets");
        Y0 K3 = Y0.K(insets);
        kotlin.jvm.internal.F.o(K3, "toWindowInsetsCompat(insets)");
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f15082G;
        if (onApplyWindowInsetsListener != null) {
            a aVar = a.f15084a;
            kotlin.jvm.internal.F.m(onApplyWindowInsetsListener);
            g12 = Y0.K(aVar.a(onApplyWindowInsetsListener, this, insets));
        } else {
            g12 = C0823k0.g1(this, K3);
        }
        if (!g12.A() && (childCount = getChildCount()) > 0) {
            int i4 = 0;
            while (true) {
                int i5 = i4 + 1;
                C0823k0.p(getChildAt(i4), g12);
                if (i5 >= childCount) {
                    break;
                }
                i4 = i5;
            }
        }
        return insets;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(@l3.d Canvas canvas) {
        kotlin.jvm.internal.F.p(canvas, "canvas");
        if (this.f15083H) {
            Iterator<T> it = this.f15080E.iterator();
            while (it.hasNext()) {
                super.drawChild(canvas, (View) it.next(), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(@l3.d Canvas canvas, @l3.d View child, long j4) {
        kotlin.jvm.internal.F.p(canvas, "canvas");
        kotlin.jvm.internal.F.p(child, "child");
        if (this.f15083H && (!this.f15080E.isEmpty()) && this.f15080E.contains(child)) {
            return false;
        }
        return super.drawChild(canvas, child, j4);
    }

    @Override // android.view.ViewGroup
    public void endViewTransition(@l3.d View view) {
        kotlin.jvm.internal.F.p(view, "view");
        this.f15081F.remove(view);
        if (this.f15080E.remove(view)) {
            this.f15083H = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends Fragment> F getFragment() {
        return (F) FragmentManager.q0(this).n0(getId());
    }

    @Override // android.view.View
    @l3.d
    @W(20)
    public WindowInsets onApplyWindowInsets(@l3.d WindowInsets insets) {
        kotlin.jvm.internal.F.p(insets, "insets");
        return insets;
    }

    @Override // android.view.ViewGroup
    public void removeAllViewsInLayout() {
        int childCount = getChildCount() - 1;
        if (childCount >= 0) {
            while (true) {
                int i4 = childCount - 1;
                View view = getChildAt(childCount);
                kotlin.jvm.internal.F.o(view, "view");
                a(view);
                if (i4 < 0) {
                    break;
                } else {
                    childCount = i4;
                }
            }
        }
        super.removeAllViewsInLayout();
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(@l3.d View view) {
        kotlin.jvm.internal.F.p(view, "view");
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int i4) {
        View view = getChildAt(i4);
        kotlin.jvm.internal.F.o(view, "view");
        a(view);
        super.removeViewAt(i4);
    }

    @Override // android.view.ViewGroup
    public void removeViewInLayout(@l3.d View view) {
        kotlin.jvm.internal.F.p(view, "view");
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public void removeViews(int i4, int i5) {
        int i6 = i4 + i5;
        if (i4 < i6) {
            int i7 = i4;
            while (true) {
                int i8 = i7 + 1;
                View view = getChildAt(i7);
                kotlin.jvm.internal.F.o(view, "view");
                a(view);
                if (i8 >= i6) {
                    break;
                } else {
                    i7 = i8;
                }
            }
        }
        super.removeViews(i4, i5);
    }

    @Override // android.view.ViewGroup
    public void removeViewsInLayout(int i4, int i5) {
        int i6 = i4 + i5;
        if (i4 < i6) {
            int i7 = i4;
            while (true) {
                int i8 = i7 + 1;
                View view = getChildAt(i7);
                kotlin.jvm.internal.F.o(view, "view");
                a(view);
                if (i8 >= i6) {
                    break;
                } else {
                    i7 = i8;
                }
            }
        }
        super.removeViewsInLayout(i4, i5);
    }

    @W2.i(name = "setDrawDisappearingViewsLast")
    public final void setDrawDisappearingViewsLast(boolean z3) {
        this.f15083H = z3;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(@l3.e LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(@l3.d View.OnApplyWindowInsetsListener listener) {
        kotlin.jvm.internal.F.p(listener, "listener");
        this.f15082G = listener;
    }

    @Override // android.view.ViewGroup
    public void startViewTransition(@l3.d View view) {
        kotlin.jvm.internal.F.p(view, "view");
        if (view.getParent() == this) {
            this.f15081F.add(view);
        }
        super.startViewTransition(view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(@l3.d Context context) {
        super(context);
        kotlin.jvm.internal.F.p(context, "context");
        this.f15080E = new ArrayList();
        this.f15081F = new ArrayList();
        this.f15083H = true;
    }

    public /* synthetic */ FragmentContainerView(Context context, AttributeSet attributeSet, int i4, int i5, C2197u c2197u) {
        this(context, attributeSet, (i5 & 4) != 0 ? 0 : i4);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @W2.j
    public FragmentContainerView(@l3.d Context context, @l3.e AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        String str;
        kotlin.jvm.internal.F.p(context, "context");
        this.f15080E = new ArrayList();
        this.f15081F = new ArrayList();
        this.f15083H = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            int[] FragmentContainerView = a.d.f22e;
            kotlin.jvm.internal.F.o(FragmentContainerView, "FragmentContainerView");
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, FragmentContainerView, 0, 0);
            if (classAttribute == null) {
                classAttribute = obtainStyledAttributes.getString(a.d.f23f);
                str = "android:name";
            } else {
                str = "class";
            }
            obtainStyledAttributes.recycle();
            if (classAttribute == null || isInEditMode()) {
                return;
            }
            throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + ((Object) classAttribute) + kotlin.text.F.f52746b);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(@l3.d Context context, @l3.d AttributeSet attrs, @l3.d FragmentManager fm) {
        super(context, attrs);
        kotlin.jvm.internal.F.p(context, "context");
        kotlin.jvm.internal.F.p(attrs, "attrs");
        kotlin.jvm.internal.F.p(fm, "fm");
        this.f15080E = new ArrayList();
        this.f15081F = new ArrayList();
        this.f15083H = true;
        String classAttribute = attrs.getClassAttribute();
        int[] FragmentContainerView = a.d.f22e;
        kotlin.jvm.internal.F.o(FragmentContainerView, "FragmentContainerView");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, FragmentContainerView, 0, 0);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(a.d.f23f) : classAttribute;
        String string = obtainStyledAttributes.getString(a.d.f24g);
        obtainStyledAttributes.recycle();
        int id = getId();
        Fragment n02 = fm.n0(id);
        if (classAttribute != null && n02 == null) {
            if (id == -1) {
                throw new IllegalStateException("FragmentContainerView must have an android:id to add Fragment " + ((Object) classAttribute) + (string != null ? kotlin.jvm.internal.F.C(" with tag ", string) : ""));
            }
            Fragment a4 = fm.C0().a(context.getClassLoader(), classAttribute);
            kotlin.jvm.internal.F.o(a4, "fm.fragmentFactory.insta…ontext.classLoader, name)");
            a4.onInflate(context, attrs, (Bundle) null);
            fm.q().Q(true).j(this, a4, string).t();
        }
        fm.f1(this);
    }
}
