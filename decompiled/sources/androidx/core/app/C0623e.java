package androidx.core.app;

import android.app.Activity;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import androidx.annotation.InterfaceC0577u;

/* renamed from: androidx.core.app.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0623e {

    /* renamed from: a, reason: collision with root package name */
    public static final String f11928a = "android.activity.usage_time";

    /* renamed from: b, reason: collision with root package name */
    public static final String f11929b = "android.usage_time_packages";

    @androidx.annotation.W(16)
    /* renamed from: androidx.core.app.e$a */
    /* loaded from: classes.dex */
    private static class a extends C0623e {

        /* renamed from: c, reason: collision with root package name */
        private final ActivityOptions f11930c;

        a(ActivityOptions activityOptions) {
            this.f11930c = activityOptions;
        }

        @Override // androidx.core.app.C0623e
        public Rect a() {
            return C0076e.a(this.f11930c);
        }

        @Override // androidx.core.app.C0623e
        public void j(@androidx.annotation.N PendingIntent pendingIntent) {
            d.c(this.f11930c, pendingIntent);
        }

        @Override // androidx.core.app.C0623e
        @androidx.annotation.N
        public C0623e k(@androidx.annotation.P Rect rect) {
            return new a(C0076e.b(this.f11930c, rect));
        }

        @Override // androidx.core.app.C0623e
        public Bundle l() {
            return this.f11930c.toBundle();
        }

        @Override // androidx.core.app.C0623e
        public void m(@androidx.annotation.N C0623e c0623e) {
            if (c0623e instanceof a) {
                this.f11930c.update(((a) c0623e).f11930c);
            }
        }
    }

    @androidx.annotation.W(16)
    /* renamed from: androidx.core.app.e$b */
    /* loaded from: classes.dex */
    static class b {
        private b() {
        }

        @InterfaceC0577u
        static ActivityOptions a(Context context, int i4, int i5) {
            return ActivityOptions.makeCustomAnimation(context, i4, i5);
        }

        @InterfaceC0577u
        static ActivityOptions b(View view, int i4, int i5, int i6, int i7) {
            return ActivityOptions.makeScaleUpAnimation(view, i4, i5, i6, i7);
        }

        @InterfaceC0577u
        static ActivityOptions c(View view, Bitmap bitmap, int i4, int i5) {
            return ActivityOptions.makeThumbnailScaleUpAnimation(view, bitmap, i4, i5);
        }
    }

    @androidx.annotation.W(21)
    /* renamed from: androidx.core.app.e$c */
    /* loaded from: classes.dex */
    static class c {
        private c() {
        }

        @InterfaceC0577u
        static ActivityOptions a(Activity activity, View view, String str) {
            return ActivityOptions.makeSceneTransitionAnimation(activity, view, str);
        }

        @SafeVarargs
        @InterfaceC0577u
        static ActivityOptions b(Activity activity, Pair<View, String>... pairArr) {
            return ActivityOptions.makeSceneTransitionAnimation(activity, pairArr);
        }

        @InterfaceC0577u
        static ActivityOptions c() {
            return ActivityOptions.makeTaskLaunchBehind();
        }
    }

    @androidx.annotation.W(23)
    /* renamed from: androidx.core.app.e$d */
    /* loaded from: classes.dex */
    static class d {
        private d() {
        }

        @InterfaceC0577u
        static ActivityOptions a() {
            return ActivityOptions.makeBasic();
        }

        @InterfaceC0577u
        static ActivityOptions b(View view, int i4, int i5, int i6, int i7) {
            return ActivityOptions.makeClipRevealAnimation(view, i4, i5, i6, i7);
        }

        @InterfaceC0577u
        static void c(ActivityOptions activityOptions, PendingIntent pendingIntent) {
            activityOptions.requestUsageTimeReport(pendingIntent);
        }
    }

    @androidx.annotation.W(24)
    /* renamed from: androidx.core.app.e$e, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static class C0076e {
        private C0076e() {
        }

        @InterfaceC0577u
        static Rect a(ActivityOptions activityOptions) {
            return activityOptions.getLaunchBounds();
        }

        @InterfaceC0577u
        static ActivityOptions b(ActivityOptions activityOptions, Rect rect) {
            return activityOptions.setLaunchBounds(rect);
        }
    }

    protected C0623e() {
    }

    @androidx.annotation.N
    public static C0623e b() {
        return new a(d.a());
    }

    @androidx.annotation.N
    public static C0623e c(@androidx.annotation.N View view, int i4, int i5, int i6, int i7) {
        return new a(d.b(view, i4, i5, i6, i7));
    }

    @androidx.annotation.N
    public static C0623e d(@androidx.annotation.N Context context, int i4, int i5) {
        return new a(b.a(context, i4, i5));
    }

    @androidx.annotation.N
    public static C0623e e(@androidx.annotation.N View view, int i4, int i5, int i6, int i7) {
        return new a(b.b(view, i4, i5, i6, i7));
    }

    @androidx.annotation.N
    public static C0623e f(@androidx.annotation.N Activity activity, @androidx.annotation.N View view, @androidx.annotation.N String str) {
        return new a(c.a(activity, view, str));
    }

    @androidx.annotation.N
    public static C0623e g(@androidx.annotation.N Activity activity, @androidx.annotation.P androidx.core.util.q<View, String>... qVarArr) {
        Pair[] pairArr;
        if (qVarArr != null) {
            pairArr = new Pair[qVarArr.length];
            for (int i4 = 0; i4 < qVarArr.length; i4++) {
                androidx.core.util.q<View, String> qVar = qVarArr[i4];
                pairArr[i4] = Pair.create(qVar.f13025a, qVar.f13026b);
            }
        } else {
            pairArr = null;
        }
        return new a(c.b(activity, pairArr));
    }

    @androidx.annotation.N
    public static C0623e h() {
        return new a(c.c());
    }

    @androidx.annotation.N
    public static C0623e i(@androidx.annotation.N View view, @androidx.annotation.N Bitmap bitmap, int i4, int i5) {
        return new a(b.c(view, bitmap, i4, i5));
    }

    @androidx.annotation.P
    public Rect a() {
        return null;
    }

    public void j(@androidx.annotation.N PendingIntent pendingIntent) {
    }

    @androidx.annotation.N
    public C0623e k(@androidx.annotation.P Rect rect) {
        return this;
    }

    @androidx.annotation.P
    public Bundle l() {
        return null;
    }

    public void m(@androidx.annotation.N C0623e c0623e) {
    }
}
