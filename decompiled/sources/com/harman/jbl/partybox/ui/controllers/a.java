package com.harman.jbl.partybox.ui.controllers;

import android.animation.Animator;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AccelerateInterpolator;
import android.widget.ImageView;
import com.harman.jbl.partybox.j;
import com.harman.log.f;
import com.harman.sdk.device.HmDevice;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import l3.e;

/* loaded from: classes2.dex */
public final class a implements X1.c {

    /* renamed from: x, reason: collision with root package name */
    @l3.d
    public static final C0366a f42376x = new C0366a(null);

    /* renamed from: y, reason: collision with root package name */
    private static final String f42377y = a.class.getSimpleName();

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    private final Activity f42378a;

    /* renamed from: b, reason: collision with root package name */
    @e
    private final HmDevice f42379b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f42380c;

    /* renamed from: d, reason: collision with root package name */
    @e
    private View f42381d;

    /* renamed from: e, reason: collision with root package name */
    @l3.d
    private View f42382e;

    /* renamed from: f, reason: collision with root package name */
    @l3.d
    private ImageView f42383f;

    /* renamed from: g, reason: collision with root package name */
    @l3.d
    private ImageView f42384g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f42385h;

    /* renamed from: i, reason: collision with root package name */
    @l3.d
    private ImageView f42386i;

    /* renamed from: j, reason: collision with root package name */
    @l3.d
    private View f42387j;

    /* renamed from: k, reason: collision with root package name */
    @l3.d
    private View f42388k;

    /* renamed from: l, reason: collision with root package name */
    private int f42389l;

    /* renamed from: m, reason: collision with root package name */
    private int f42390m;

    /* renamed from: n, reason: collision with root package name */
    private int f42391n;

    /* renamed from: o, reason: collision with root package name */
    private int f42392o;

    /* renamed from: p, reason: collision with root package name */
    private int f42393p;

    /* renamed from: q, reason: collision with root package name */
    private int f42394q;

    /* renamed from: r, reason: collision with root package name */
    private int f42395r;

    /* renamed from: s, reason: collision with root package name */
    private float f42396s;

    /* renamed from: t, reason: collision with root package name */
    private float f42397t;

    /* renamed from: u, reason: collision with root package name */
    private float f42398u;

    /* renamed from: v, reason: collision with root package name */
    private float f42399v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f42400w;

    /* renamed from: com.harman.jbl.partybox.ui.controllers.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0366a {
        public /* synthetic */ C0366a(C2197u c2197u) {
            this();
        }

        private C0366a() {
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends CountDownTimer {
        b(long j4, long j5) {
            super(j4, j5);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            a.this.m(false);
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j4) {
        }
    }

    /* loaded from: classes2.dex */
    public static final class c implements ViewTreeObserver.OnGlobalLayoutListener {
        c() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            a aVar = a.this;
            aVar.b(aVar.f42389l, a.this.f42390m);
            a.this.f42387j.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    /* loaded from: classes2.dex */
    public static final class d implements Animator.AnimatorListener {
        d() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@l3.d Animator animator) {
            F.p(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@l3.d Animator animator) {
            F.p(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(@l3.d Animator animator) {
            F.p(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@l3.d Animator animator) {
            F.p(animator, "animator");
        }
    }

    public a(@l3.d Activity activity, @e HmDevice hmDevice) {
        F.p(activity, "activity");
        this.f42378a = activity;
        this.f42379b = hmDevice;
        this.f42400w = true;
        View findViewById = activity.findViewById(j.h.ce);
        F.o(findViewById, "findViewById(...)");
        this.f42382e = findViewById;
        View findViewById2 = activity.findViewById(j.h.Sc);
        F.o(findViewById2, "findViewById(...)");
        this.f42383f = (ImageView) findViewById2;
        View findViewById3 = activity.findViewById(j.h.fe);
        F.o(findViewById3, "findViewById(...)");
        this.f42384g = (ImageView) findViewById3;
        View findViewById4 = activity.findViewById(j.h.Qc);
        F.o(findViewById4, "findViewById(...)");
        this.f42386i = (ImageView) findViewById4;
        View findViewById5 = activity.findViewById(j.h.f41238Y2);
        F.o(findViewById5, "findViewById(...)");
        this.f42387j = findViewById5;
        View findViewById6 = activity.findViewById(j.h.Pc);
        F.o(findViewById6, "findViewById(...)");
        this.f42388k = findViewById6;
        this.f42395r = com.harman.jbl.partybox.utils.j.e(activity);
    }

    private final float j(View view) {
        F.m(view);
        if (view.getParent() == view.getRootView()) {
            return view.getX();
        }
        float x3 = view.getX();
        Object parent = view.getParent();
        F.n(parent, "null cannot be cast to non-null type android.view.View");
        return j((View) parent) + x3;
    }

    private final float k(View view) {
        F.m(view);
        if (view.getParent() == view.getRootView()) {
            return view.getY();
        }
        float y3 = view.getY();
        Object parent = view.getParent();
        F.n(parent, "null cannot be cast to non-null type android.view.View");
        return k((View) parent) + y3;
    }

    @Override // X1.c
    public void a() {
        float f4;
        float f5;
        if (this.f42400w) {
            this.f42396s = j(this.f42381d);
            this.f42397t = k(this.f42381d);
            this.f42398u = j(this.f42382e);
            this.f42399v = k(this.f42382e);
            this.f42400w = false;
        }
        boolean z3 = !this.f42385h;
        this.f42385h = z3;
        if (z3) {
            f4 = this.f42398u - this.f42396s;
            f5 = this.f42399v - this.f42397t;
            this.f42383f.setImageResource(j.f.f41093q3);
            this.f42384g.setImageResource(j.f.f41083o3);
        } else {
            f4 = this.f42396s - this.f42398u;
            f5 = this.f42397t - this.f42399v;
            this.f42383f.setImageResource(j.f.f41083o3);
            this.f42384g.setImageResource(j.f.f41093q3);
        }
        View view = this.f42381d;
        F.m(view);
        view.animate().xBy(f4).yBy(f5);
        this.f42382e.animate().xBy(-f4).yBy(-f5);
        View view2 = this.f42381d;
        F.m(view2);
        long duration = view2.animate().getDuration() + 10;
        new b(duration, duration).start();
    }

    @Override // X1.c
    public void b(int i4, int i5) {
        Math.max(this.f42387j.getWidth(), this.f42387j.getHeight());
        String str = f42377y;
        f.a(str, " activity transition revealx = " + this.f42389l + " revealY = " + this.f42390m);
        f.a(str, " activity transition rootLayoutWidth = " + this.f42387j.getWidth() + " rootLayoutHeight = " + this.f42387j.getHeight());
        this.f42388k.getLocationInWindow(r3);
        int width = this.f42388k.getWidth() / 2;
        int i6 = r3[0] + width;
        int i7 = r3[1] + width;
        int[] iArr = {i6, i7};
        T1.a.a(str + " activity transition origiX = " + i6 + " origiY = " + i7 + " originRevealY = " + this.f42391n + " deviceImgContainer width = " + this.f42388k.getWidth() + " height = " + this.f42388k.getHeight());
        this.f42392o = iArr[0] - this.f42389l;
        int i8 = iArr[1];
        this.f42393p = i8 - this.f42390m;
        this.f42394q = i8 - this.f42391n;
        View view = this.f42387j;
        view.setX(view.getX() - ((float) this.f42392o));
        View view2 = this.f42387j;
        view2.setY(view2.getY() - ((float) this.f42393p));
        iArr[0] = iArr[0] - width;
        iArr[1] = iArr[1] - width;
        View view3 = this.f42387j;
        F.n(view3, "null cannot be cast to non-null type com.harman.jbl.partybox.ui.customviews.HMRoundCornerClipRelativeLayout");
        com.harman.jbl.partybox.ui.customviews.d a4 = com.harman.jbl.partybox.ui.customviews.d.a((com.harman.jbl.partybox.ui.customviews.e) view3, iArr[0], 0, iArr[1] - this.f42395r, 0, this.f42388k.getWidth(), this.f42387j.getWidth(), this.f42388k.getHeight(), this.f42387j.getHeight(), this.f42388k.getWidth() / 2, 0.0f, false);
        F.o(a4, "ofRevealRectangle(...)");
        a4.setDuration(450L);
        a4.setInterpolator(new AccelerateInterpolator());
        this.f42387j.setVisibility(0);
        this.f42387j.animate().translationYBy(this.f42393p).translationXBy(this.f42392o).setDuration(450L).setInterpolator(new AccelerateInterpolator());
        a4.addListener(new d());
        a4.start();
    }

    @Override // X1.c
    public void c(@e Bundle bundle) {
        Intent intent = this.f42378a.getIntent();
        if (bundle == null && intent.hasExtra("extra_circle_reveal_x") && intent.hasExtra("extra_circle_reveal_y")) {
            this.f42387j.setVisibility(4);
            this.f42389l = intent.getIntExtra("extra_circle_reveal_x", 0);
            this.f42390m = intent.getIntExtra("extra_circle_reveal_y", 0);
            this.f42391n = intent.getIntExtra("extra_circle_origin_reveal_y", 0);
            d();
            ViewTreeObserver viewTreeObserver = this.f42387j.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnGlobalLayoutListener(new c());
                return;
            }
            return;
        }
        this.f42387j.setVisibility(0);
    }

    @Override // X1.c
    public void d() {
        int r4;
        HmDevice hmDevice = this.f42379b;
        if (hmDevice != null && (r4 = com.harman.sdk.utils.d.r(this.f42378a, hmDevice.q(), this.f42379b.o())) != 0) {
            this.f42386i.setImageResource(r4);
        }
    }

    @Override // X1.c
    public void e() {
    }

    @Override // X1.c
    public void f(@l3.d View view) {
        F.p(view, "view");
        this.f42381d = view.findViewById(j.h.Pc);
        View findViewById = view.findViewById(j.h.ce);
        F.o(findViewById, "findViewById(...)");
        this.f42382e = findViewById;
        View findViewById2 = view.findViewById(j.h.Sc);
        F.o(findViewById2, "findViewById(...)");
        this.f42383f = (ImageView) findViewById2;
        View findViewById3 = view.findViewById(j.h.fe);
        F.o(findViewById3, "findViewById(...)");
        this.f42384g = (ImageView) findViewById3;
        View findViewById4 = view.findViewById(j.h.Qc);
        F.o(findViewById4, "findViewById(...)");
        this.f42386i = (ImageView) findViewById4;
        View findViewById5 = view.findViewById(j.h.f41257c3);
        F.o(findViewById5, "findViewById(...)");
        this.f42387j = findViewById5;
        View findViewById6 = this.f42378a.findViewById(j.h.Pc);
        F.o(findViewById6, "findViewById(...)");
        this.f42388k = findViewById6;
        this.f42395r = com.harman.jbl.partybox.utils.j.e(this.f42378a);
    }

    public final boolean l() {
        return this.f42380c;
    }

    public final void m(boolean z3) {
        this.f42380c = z3;
    }

    public final void n() {
        if (this.f42385h) {
            this.f42383f.setImageResource(j.f.f41093q3);
            this.f42384g.setImageResource(j.f.f41083o3);
        } else {
            this.f42383f.setImageResource(j.f.f41083o3);
            this.f42384g.setImageResource(j.f.f41093q3);
        }
    }
}
