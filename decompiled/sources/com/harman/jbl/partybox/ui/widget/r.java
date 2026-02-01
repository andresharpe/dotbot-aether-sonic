package com.harman.jbl.partybox.ui.widget;

import android.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.content.C0669d;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.harman.jbl.partybox.databinding.C1880h3;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
public final class r extends BaseTransientBottomBar<r> {

    /* renamed from: K, reason: collision with root package name */
    @l3.d
    public static final a f46149K = new a(null);

    /* renamed from: J, reason: collision with root package name */
    @l3.d
    private final C1880h3 f46150J;

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: com.harman.jbl.partybox.ui.widget.r$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0406a implements com.google.android.material.snackbar.a {
            C0406a() {
            }

            @Override // com.google.android.material.snackbar.a
            public void a(int i4, int i5) {
            }

            @Override // com.google.android.material.snackbar.a
            public void b(int i4, int i5) {
            }
        }

        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        private final ViewGroup a(View view) {
            ViewGroup viewGroup = null;
            while (!(view instanceof CoordinatorLayout)) {
                if (view instanceof FrameLayout) {
                    if (((FrameLayout) view).getId() == 16908290) {
                        return (ViewGroup) view;
                    }
                    viewGroup = (ViewGroup) view;
                }
                if (view != null) {
                    Object parent = view.getParent();
                    if (parent instanceof View) {
                        view = (View) parent;
                    } else {
                        view = null;
                    }
                }
                if (view == null) {
                    return viewGroup;
                }
            }
            return (ViewGroup) view;
        }

        @W2.n
        @l3.d
        public final r b(@l3.d View view, @l3.d String text) {
            F.p(view, "view");
            F.p(text, "text");
            ViewGroup a4 = a(view);
            if (a4 != null) {
                C1880h3 e4 = C1880h3.e(LayoutInflater.from(a4.getContext()), a4, false);
                F.o(e4, "inflate(...)");
                r rVar = new r(a4, e4, new C0406a());
                rVar.p0(text);
                rVar.b0(0);
                rVar.Z(1);
                return rVar;
            }
            throw new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(@l3.d ViewGroup parent, @l3.d C1880h3 binding, @l3.d com.google.android.material.snackbar.a callback) {
        super(parent, binding.d(), callback);
        F.p(parent, "parent");
        F.p(binding, "binding");
        F.p(callback, "callback");
        this.f46150J = binding;
        G().setBackgroundColor(C0669d.f(this.f33361c.getContext(), R.color.transparent));
        G().setPadding(0, 0, 0, 0);
    }

    @W2.n
    @l3.d
    public static final r o0(@l3.d View view, @l3.d String str) {
        return f46149K.b(view, str);
    }

    @l3.d
    public final r p0(@l3.d String text) {
        F.p(text, "text");
        this.f46150J.f39670F.setText(text);
        return this;
    }
}
