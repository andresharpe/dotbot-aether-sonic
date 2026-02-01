package com.blankj.utilcode.util;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.InterfaceC0566i;
import androidx.annotation.InterfaceC0569l;
import androidx.annotation.InterfaceC0578v;
import androidx.core.app.p1;
import androidx.core.content.C0669d;
import androidx.core.view.C0823k0;
import com.blankj.utilcode.util.E0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import q0.b;

/* loaded from: classes.dex */
public final class ToastUtils {

    /* renamed from: l, reason: collision with root package name */
    private static final String f24932l = "TAG_TOAST";

    /* renamed from: m, reason: collision with root package name */
    private static final int f24933m = -16777217;

    /* renamed from: n, reason: collision with root package name */
    private static final String f24934n = "toast null";

    /* renamed from: o, reason: collision with root package name */
    private static final String f24935o = "toast nothing";

    /* renamed from: p, reason: collision with root package name */
    private static final ToastUtils f24936p = p();

    /* renamed from: q, reason: collision with root package name */
    private static WeakReference<e> f24937q;

    /* renamed from: a, reason: collision with root package name */
    private String f24938a;

    /* renamed from: b, reason: collision with root package name */
    private int f24939b = -1;

    /* renamed from: c, reason: collision with root package name */
    private int f24940c = -1;

    /* renamed from: d, reason: collision with root package name */
    private int f24941d = -1;

    /* renamed from: e, reason: collision with root package name */
    private int f24942e = f24933m;

    /* renamed from: f, reason: collision with root package name */
    private int f24943f = -1;

    /* renamed from: g, reason: collision with root package name */
    private int f24944g = f24933m;

    /* renamed from: h, reason: collision with root package name */
    private int f24945h = -1;

    /* renamed from: i, reason: collision with root package name */
    private boolean f24946i = false;

    /* renamed from: j, reason: collision with root package name */
    private Drawable[] f24947j = new Drawable[4];

    /* renamed from: k, reason: collision with root package name */
    private boolean f24948k = false;

    /* loaded from: classes.dex */
    public static final class UtilsMaxWidthRelativeLayout extends RelativeLayout {

        /* renamed from: E, reason: collision with root package name */
        private static final int f24949E = H0.w(80.0f);

        public UtilsMaxWidthRelativeLayout(Context context) {
            super(context);
        }

        @Override // android.widget.RelativeLayout, android.view.View
        protected void onMeasure(int i4, int i5) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(H0.K() - f24949E, Integer.MIN_VALUE), i5);
        }

        public UtilsMaxWidthRelativeLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public UtilsMaxWidthRelativeLayout(Context context, AttributeSet attributeSet, int i4) {
            super(context, attributeSet, i4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (ToastUtils.f24937q != null) {
                e eVar = (e) ToastUtils.f24937q.get();
                if (eVar != null) {
                    eVar.cancel();
                }
                WeakReference unused = ToastUtils.f24937q = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ View f24951F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ CharSequence f24952G;

        /* renamed from: H, reason: collision with root package name */
        final /* synthetic */ int f24953H;

        b(View view, CharSequence charSequence, int i4) {
            this.f24951F = view;
            this.f24952G = charSequence;
            this.f24953H = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            ToastUtils.l();
            e q4 = ToastUtils.q(ToastUtils.this);
            WeakReference unused = ToastUtils.f24937q = new WeakReference(q4);
            View view = this.f24951F;
            if (view != null) {
                q4.c(view);
            } else {
                q4.b(this.f24952G);
            }
            q4.a(this.f24953H);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static abstract class c implements e {

        /* renamed from: a, reason: collision with root package name */
        protected Toast f24954a = new Toast(E0.a());

        /* renamed from: b, reason: collision with root package name */
        protected ToastUtils f24955b;

        /* renamed from: c, reason: collision with root package name */
        protected View f24956c;

        c(ToastUtils toastUtils) {
            this.f24955b = toastUtils;
            if (toastUtils.f24939b != -1 || this.f24955b.f24940c != -1 || this.f24955b.f24941d != -1) {
                this.f24954a.setGravity(this.f24955b.f24939b, this.f24955b.f24940c, this.f24955b.f24941d);
            }
        }

        private void e() {
            if (H0.y0()) {
                c(d(-1));
            }
        }

        private void f(TextView textView) {
            if (this.f24955b.f24943f != -1) {
                this.f24956c.setBackgroundResource(this.f24955b.f24943f);
                textView.setBackgroundColor(0);
                return;
            }
            if (this.f24955b.f24942e != ToastUtils.f24933m) {
                Drawable background = this.f24956c.getBackground();
                Drawable background2 = textView.getBackground();
                if (background != null && background2 != null) {
                    background.mutate().setColorFilter(new PorterDuffColorFilter(this.f24955b.f24942e, PorterDuff.Mode.SRC_IN));
                    textView.setBackgroundColor(0);
                } else if (background != null) {
                    background.mutate().setColorFilter(new PorterDuffColorFilter(this.f24955b.f24942e, PorterDuff.Mode.SRC_IN));
                } else if (background2 != null) {
                    background2.mutate().setColorFilter(new PorterDuffColorFilter(this.f24955b.f24942e, PorterDuff.Mode.SRC_IN));
                } else {
                    this.f24956c.setBackgroundColor(this.f24955b.f24942e);
                }
            }
        }

        @Override // com.blankj.utilcode.util.ToastUtils.e
        public void b(CharSequence charSequence) {
            View X3 = this.f24955b.X(charSequence);
            if (X3 != null) {
                c(X3);
                e();
                return;
            }
            View view = this.f24954a.getView();
            this.f24956c = view;
            if (view == null || view.findViewById(R.id.message) == null) {
                c(H0.H0(b.k.f56803b0));
            }
            TextView textView = (TextView) this.f24956c.findViewById(R.id.message);
            textView.setText(charSequence);
            if (this.f24955b.f24944g != ToastUtils.f24933m) {
                textView.setTextColor(this.f24955b.f24944g);
            }
            if (this.f24955b.f24945h != -1) {
                textView.setTextSize(this.f24955b.f24945h);
            }
            f(textView);
            e();
        }

        @Override // com.blankj.utilcode.util.ToastUtils.e
        public void c(View view) {
            this.f24956c = view;
            this.f24954a.setView(view);
        }

        @Override // com.blankj.utilcode.util.ToastUtils.e
        @InterfaceC0566i
        public void cancel() {
            Toast toast = this.f24954a;
            if (toast != null) {
                toast.cancel();
            }
            this.f24954a = null;
            this.f24956c = null;
        }

        View d(int i4) {
            Bitmap g12 = H0.g1(this.f24956c);
            ImageView imageView = new ImageView(E0.a());
            imageView.setTag(ToastUtils.f24932l + i4);
            imageView.setImageBitmap(g12);
            return imageView;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class d extends c {

        /* renamed from: f, reason: collision with root package name */
        private static int f24957f;

        /* renamed from: d, reason: collision with root package name */
        private E0.a f24958d;

        /* renamed from: e, reason: collision with root package name */
        private e f24959e;

        /* loaded from: classes.dex */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                d.this.cancel();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class b extends E0.a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f24961a;

            b(int i4) {
                this.f24961a = i4;
            }

            @Override // com.blankj.utilcode.util.E0.a
            public void a(@androidx.annotation.N Activity activity) {
                if (d.this.i()) {
                    d.this.l(activity, this.f24961a, false);
                }
            }
        }

        d(ToastUtils toastUtils) {
            super(toastUtils);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean i() {
            if (this.f24958d != null) {
                return true;
            }
            return false;
        }

        private void j() {
            b bVar = new b(f24957f);
            this.f24958d = bVar;
            H0.b(bVar);
        }

        private e k(int i4) {
            g gVar = new g(this.f24955b);
            gVar.f24954a = this.f24954a;
            gVar.a(i4);
            return gVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void l(Activity activity, int i4, boolean z3) {
            Window window = activity.getWindow();
            if (window != null) {
                ViewGroup viewGroup = (ViewGroup) window.getDecorView();
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                layoutParams.gravity = this.f24954a.getGravity();
                layoutParams.bottomMargin = this.f24954a.getYOffset() + H0.a0();
                layoutParams.topMargin = this.f24954a.getYOffset() + H0.e0();
                layoutParams.leftMargin = this.f24954a.getXOffset();
                View d4 = d(i4);
                if (z3) {
                    d4.setAlpha(0.0f);
                    d4.animate().alpha(1.0f).setDuration(200L).start();
                }
                viewGroup.addView(d4, layoutParams);
            }
        }

        private e m(Activity activity, int i4) {
            h hVar = new h(this.f24955b, activity.getWindowManager(), 99);
            hVar.f24956c = d(-1);
            hVar.f24954a = this.f24954a;
            hVar.a(i4);
            return hVar;
        }

        private void n() {
            H0.T0(this.f24958d);
            this.f24958d = null;
        }

        @Override // com.blankj.utilcode.util.ToastUtils.e
        public void a(int i4) {
            long j4;
            if (this.f24954a == null) {
                return;
            }
            if (!H0.r0()) {
                this.f24959e = k(i4);
                return;
            }
            boolean z3 = false;
            for (Activity activity : H0.J()) {
                if (H0.p0(activity)) {
                    if (!z3) {
                        this.f24959e = m(activity, i4);
                        z3 = true;
                    } else {
                        l(activity, f24957f, true);
                    }
                }
            }
            if (z3) {
                j();
                a aVar = new a();
                if (i4 == 0) {
                    j4 = 2000;
                } else {
                    j4 = 3500;
                }
                H0.W0(aVar, j4);
                f24957f++;
                return;
            }
            this.f24959e = k(i4);
        }

        @Override // com.blankj.utilcode.util.ToastUtils.c, com.blankj.utilcode.util.ToastUtils.e
        public void cancel() {
            Window window;
            if (i()) {
                n();
                for (Activity activity : H0.J()) {
                    if (H0.p0(activity) && (window = activity.getWindow()) != null) {
                        ViewGroup viewGroup = (ViewGroup) window.getDecorView();
                        StringBuilder sb = new StringBuilder();
                        sb.append(ToastUtils.f24932l);
                        sb.append(f24957f - 1);
                        View findViewWithTag = viewGroup.findViewWithTag(sb.toString());
                        if (findViewWithTag != null) {
                            try {
                                viewGroup.removeView(findViewWithTag);
                            } catch (Exception unused) {
                            }
                        }
                    }
                }
            }
            e eVar = this.f24959e;
            if (eVar != null) {
                eVar.cancel();
                this.f24959e = null;
            }
            super.cancel();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface e {
        void a(int i4);

        void b(CharSequence charSequence);

        void c(View view);

        void cancel();
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface f {

        /* renamed from: p, reason: collision with root package name */
        public static final String f24963p = "light";

        /* renamed from: q, reason: collision with root package name */
        public static final String f24964q = "dark";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class g extends c {

        /* loaded from: classes.dex */
        static class a extends Handler {

            /* renamed from: a, reason: collision with root package name */
            private Handler f24965a;

            a(Handler handler) {
                this.f24965a = handler;
            }

            @Override // android.os.Handler
            public void dispatchMessage(@androidx.annotation.N Message message) {
                try {
                    this.f24965a.dispatchMessage(message);
                } catch (Exception e4) {
                    e4.printStackTrace();
                }
            }

            @Override // android.os.Handler
            public void handleMessage(@androidx.annotation.N Message message) {
                this.f24965a.handleMessage(message);
            }
        }

        g(ToastUtils toastUtils) {
            super(toastUtils);
            if (Build.VERSION.SDK_INT == 25) {
                try {
                    Field declaredField = Toast.class.getDeclaredField("mTN");
                    declaredField.setAccessible(true);
                    Object obj = declaredField.get(this.f24954a);
                    Field declaredField2 = declaredField.getType().getDeclaredField("mHandler");
                    declaredField2.setAccessible(true);
                    declaredField2.set(obj, new a((Handler) declaredField2.get(obj)));
                } catch (Exception unused) {
                }
            }
        }

        @Override // com.blankj.utilcode.util.ToastUtils.e
        public void a(int i4) {
            Toast toast = this.f24954a;
            if (toast == null) {
                return;
            }
            toast.setDuration(i4);
            this.f24954a.show();
        }
    }

    private static void K(@androidx.annotation.N View view, int i4, ToastUtils toastUtils) {
        L(view, null, i4, toastUtils);
    }

    private static void L(@androidx.annotation.P View view, @androidx.annotation.P CharSequence charSequence, int i4, @androidx.annotation.N ToastUtils toastUtils) {
        H0.V0(new b(view, charSequence, i4));
    }

    private static void N(@androidx.annotation.P CharSequence charSequence, int i4, ToastUtils toastUtils) {
        L(null, o(charSequence), i4, toastUtils);
    }

    public static void P(@androidx.annotation.c0 int i4) {
        N(H0.f0(i4), 1, f24936p);
    }

    public static void Q(@androidx.annotation.c0 int i4, Object... objArr) {
        N(H0.g0(i4, objArr), 1, f24936p);
    }

    public static void R(@androidx.annotation.P CharSequence charSequence) {
        N(charSequence, 1, f24936p);
    }

    public static void S(@androidx.annotation.P String str, Object... objArr) {
        N(H0.F(str, objArr), 1, f24936p);
    }

    public static void T(@androidx.annotation.c0 int i4) {
        N(H0.f0(i4), 0, f24936p);
    }

    public static void U(@androidx.annotation.c0 int i4, Object... objArr) {
        N(H0.g0(i4, objArr), 0, f24936p);
    }

    public static void V(@androidx.annotation.P CharSequence charSequence) {
        N(charSequence, 0, f24936p);
    }

    public static void W(@androidx.annotation.P String str, Object... objArr) {
        N(H0.F(str, objArr), 0, f24936p);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public View X(CharSequence charSequence) {
        if (!f.f24964q.equals(this.f24938a) && !f.f24963p.equals(this.f24938a)) {
            Drawable[] drawableArr = this.f24947j;
            if (drawableArr[0] == null && drawableArr[1] == null && drawableArr[2] == null && drawableArr[3] == null) {
                return null;
            }
        }
        View H02 = H0.H0(b.k.f56803b0);
        TextView textView = (TextView) H02.findViewById(R.id.message);
        if (f.f24964q.equals(this.f24938a)) {
            ((GradientDrawable) H02.getBackground().mutate()).setColor(Color.parseColor("#BB000000"));
            textView.setTextColor(-1);
        }
        textView.setText(charSequence);
        if (this.f24947j[0] != null) {
            View findViewById = H02.findViewById(b.h.f56651P1);
            C0823k0.I1(findViewById, this.f24947j[0]);
            findViewById.setVisibility(0);
        }
        if (this.f24947j[1] != null) {
            View findViewById2 = H02.findViewById(b.h.f56657R1);
            C0823k0.I1(findViewById2, this.f24947j[1]);
            findViewById2.setVisibility(0);
        }
        if (this.f24947j[2] != null) {
            View findViewById3 = H02.findViewById(b.h.f56654Q1);
            C0823k0.I1(findViewById3, this.f24947j[2]);
            findViewById3.setVisibility(0);
        }
        if (this.f24947j[3] != null) {
            View findViewById4 = H02.findViewById(b.h.f56648O1);
            C0823k0.I1(findViewById4, this.f24947j[3]);
            findViewById4.setVisibility(0);
        }
        return H02;
    }

    public static void l() {
        H0.V0(new a());
    }

    @androidx.annotation.N
    public static ToastUtils m() {
        return f24936p;
    }

    private int n() {
        return this.f24946i ? 1 : 0;
    }

    private static CharSequence o(CharSequence charSequence) {
        if (charSequence == null) {
            return f24934n;
        }
        if (charSequence.length() == 0) {
            return f24935o;
        }
        return charSequence;
    }

    @androidx.annotation.N
    public static ToastUtils p() {
        return new ToastUtils();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static e q(ToastUtils toastUtils) {
        if (!toastUtils.f24948k && p1.p(E0.a()).a() && !H0.w0()) {
            return new g(toastUtils);
        }
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 25) {
            return new h(toastUtils, 2005);
        }
        if (H0.w0()) {
            if (i4 >= 26) {
                return new h(toastUtils, 2038);
            }
            return new h(toastUtils, 2002);
        }
        return new d(toastUtils);
    }

    @androidx.annotation.N
    public final ToastUtils A() {
        this.f24948k = true;
        return this;
    }

    @androidx.annotation.N
    public final ToastUtils B(@InterfaceC0578v int i4) {
        return C(C0669d.i(E0.a(), i4));
    }

    @androidx.annotation.N
    public final ToastUtils C(@androidx.annotation.P Drawable drawable) {
        this.f24947j[2] = drawable;
        return this;
    }

    @androidx.annotation.N
    public final ToastUtils D(@InterfaceC0569l int i4) {
        this.f24944g = i4;
        return this;
    }

    @androidx.annotation.N
    public final ToastUtils E(int i4) {
        this.f24945h = i4;
        return this;
    }

    @androidx.annotation.N
    public final ToastUtils F(@InterfaceC0578v int i4) {
        return G(C0669d.i(E0.a(), i4));
    }

    @androidx.annotation.N
    public final ToastUtils G(@androidx.annotation.P Drawable drawable) {
        this.f24947j[1] = drawable;
        return this;
    }

    public final void H(@androidx.annotation.c0 int i4) {
        N(H0.f0(i4), n(), this);
    }

    public final void I(@androidx.annotation.c0 int i4, Object... objArr) {
        N(H0.g0(i4, objArr), n(), this);
    }

    public final void J(@androidx.annotation.N View view) {
        K(view, n(), this);
    }

    public final void M(@androidx.annotation.P CharSequence charSequence) {
        N(charSequence, n(), this);
    }

    public final void O(@androidx.annotation.P String str, Object... objArr) {
        N(H0.F(str, objArr), n(), this);
    }

    @androidx.annotation.N
    public final ToastUtils r(@InterfaceC0569l int i4) {
        this.f24942e = i4;
        return this;
    }

    @androidx.annotation.N
    public final ToastUtils s(@InterfaceC0578v int i4) {
        this.f24943f = i4;
        return this;
    }

    @androidx.annotation.N
    public final ToastUtils t(int i4) {
        return u(C0669d.i(E0.a(), i4));
    }

    @androidx.annotation.N
    public final ToastUtils u(@androidx.annotation.P Drawable drawable) {
        this.f24947j[3] = drawable;
        return this;
    }

    @androidx.annotation.N
    public final ToastUtils v(boolean z3) {
        this.f24946i = z3;
        return this;
    }

    @androidx.annotation.N
    public final ToastUtils w(int i4, int i5, int i6) {
        this.f24939b = i4;
        this.f24940c = i5;
        this.f24941d = i6;
        return this;
    }

    @androidx.annotation.N
    public final ToastUtils x(@InterfaceC0578v int i4) {
        return y(C0669d.i(E0.a(), i4));
    }

    @androidx.annotation.N
    public final ToastUtils y(@androidx.annotation.P Drawable drawable) {
        this.f24947j[0] = drawable;
        return this;
    }

    @androidx.annotation.N
    public final ToastUtils z(String str) {
        this.f24938a = str;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class h extends c {

        /* renamed from: d, reason: collision with root package name */
        private WindowManager f24966d;

        /* renamed from: e, reason: collision with root package name */
        private WindowManager.LayoutParams f24967e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                h.this.cancel();
            }
        }

        h(ToastUtils toastUtils, int i4) {
            super(toastUtils);
            this.f24967e = new WindowManager.LayoutParams();
            this.f24966d = (WindowManager) E0.a().getSystemService("window");
            this.f24967e.type = i4;
        }

        @Override // com.blankj.utilcode.util.ToastUtils.e
        public void a(int i4) {
            long j4;
            if (this.f24954a == null) {
                return;
            }
            WindowManager.LayoutParams layoutParams = this.f24967e;
            layoutParams.height = -2;
            layoutParams.width = -2;
            layoutParams.format = -3;
            layoutParams.windowAnimations = R.style.Animation.Toast;
            layoutParams.setTitle("ToastWithoutNotification");
            WindowManager.LayoutParams layoutParams2 = this.f24967e;
            layoutParams2.flags = 152;
            layoutParams2.packageName = E0.a().getPackageName();
            this.f24967e.gravity = this.f24954a.getGravity();
            WindowManager.LayoutParams layoutParams3 = this.f24967e;
            int i5 = layoutParams3.gravity;
            if ((i5 & 7) == 7) {
                layoutParams3.horizontalWeight = 1.0f;
            }
            if ((i5 & 112) == 112) {
                layoutParams3.verticalWeight = 1.0f;
            }
            layoutParams3.x = this.f24954a.getXOffset();
            this.f24967e.y = this.f24954a.getYOffset();
            this.f24967e.horizontalMargin = this.f24954a.getHorizontalMargin();
            this.f24967e.verticalMargin = this.f24954a.getVerticalMargin();
            try {
                WindowManager windowManager = this.f24966d;
                if (windowManager != null) {
                    windowManager.addView(this.f24956c, this.f24967e);
                }
            } catch (Exception unused) {
            }
            a aVar = new a();
            if (i4 == 0) {
                j4 = 2000;
            } else {
                j4 = 3500;
            }
            H0.W0(aVar, j4);
        }

        @Override // com.blankj.utilcode.util.ToastUtils.c, com.blankj.utilcode.util.ToastUtils.e
        public void cancel() {
            try {
                WindowManager windowManager = this.f24966d;
                if (windowManager != null) {
                    windowManager.removeViewImmediate(this.f24956c);
                    this.f24966d = null;
                }
            } catch (Exception unused) {
            }
            super.cancel();
        }

        h(ToastUtils toastUtils, WindowManager windowManager, int i4) {
            super(toastUtils);
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            this.f24967e = layoutParams;
            this.f24966d = windowManager;
            layoutParams.type = i4;
        }
    }
}
