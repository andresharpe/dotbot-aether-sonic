package androidx.core.app;

import android.app.Activity;
import android.app.SharedElementCallback;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.LocusId;
import android.content.pm.PackageManager;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.Display;
import android.view.DragEvent;
import android.view.View;
import androidx.annotation.InterfaceC0577u;
import androidx.annotation.RestrictTo;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.C0617b;
import androidx.core.app.y1;
import androidx.core.content.C0669d;
import androidx.core.os.C0738a;
import androidx.core.view.C0857x;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.core.app.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0617b extends C0669d {

    /* renamed from: i, reason: collision with root package name */
    private static j f11874i;

    /* renamed from: androidx.core.app.b$a */
    /* loaded from: classes.dex */
    class a implements Runnable {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ String[] f11875E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ Activity f11876F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ int f11877G;

        a(String[] strArr, Activity activity, int i4) {
            this.f11875E = strArr;
            this.f11876F = activity;
            this.f11877G = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            int[] iArr = new int[this.f11875E.length];
            PackageManager packageManager = this.f11876F.getPackageManager();
            String packageName = this.f11876F.getPackageName();
            int length = this.f11875E.length;
            for (int i4 = 0; i4 < length; i4++) {
                iArr[i4] = packageManager.checkPermission(this.f11875E[i4], packageName);
            }
            ((i) this.f11876F).onRequestPermissionsResult(this.f11877G, this.f11875E, iArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.W(16)
    /* renamed from: androidx.core.app.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0075b {
        private C0075b() {
        }

        @InterfaceC0577u
        static void a(Activity activity) {
            activity.finishAffinity();
        }

        @InterfaceC0577u
        static void b(Activity activity, Intent intent, int i4, Bundle bundle) {
            activity.startActivityForResult(intent, i4, bundle);
        }

        @InterfaceC0577u
        static void c(Activity activity, IntentSender intentSender, int i4, Intent intent, int i5, int i6, int i7, Bundle bundle) throws IntentSender.SendIntentException {
            activity.startIntentSenderForResult(intentSender, i4, intent, i5, i6, i7, bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.W(21)
    /* renamed from: androidx.core.app.b$c */
    /* loaded from: classes.dex */
    public static class c {
        private c() {
        }

        @InterfaceC0577u
        static void a(Activity activity) {
            activity.finishAfterTransition();
        }

        @InterfaceC0577u
        static void b(Activity activity) {
            activity.postponeEnterTransition();
        }

        @InterfaceC0577u
        static void c(Activity activity, SharedElementCallback sharedElementCallback) {
            activity.setEnterSharedElementCallback(sharedElementCallback);
        }

        @InterfaceC0577u
        static void d(Activity activity, SharedElementCallback sharedElementCallback) {
            activity.setExitSharedElementCallback(sharedElementCallback);
        }

        @InterfaceC0577u
        static void e(Activity activity) {
            activity.startPostponedEnterTransition();
        }
    }

    @androidx.annotation.W(22)
    /* renamed from: androidx.core.app.b$d */
    /* loaded from: classes.dex */
    static class d {
        private d() {
        }

        @InterfaceC0577u
        static Uri a(Activity activity) {
            return activity.getReferrer();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.W(23)
    /* renamed from: androidx.core.app.b$e */
    /* loaded from: classes.dex */
    public static class e {
        private e() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @InterfaceC0577u
        public static void a(Object obj) {
            ((SharedElementCallback.OnSharedElementsReadyListener) obj).onSharedElementsReady();
        }

        @InterfaceC0577u
        static void b(Activity activity, String[] strArr, int i4) {
            activity.requestPermissions(strArr, i4);
        }

        @InterfaceC0577u
        static boolean c(Activity activity, String str) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }

    @androidx.annotation.W(28)
    /* renamed from: androidx.core.app.b$f */
    /* loaded from: classes.dex */
    static class f {
        private f() {
        }

        @InterfaceC0577u
        static <T> T a(Activity activity, int i4) {
            return (T) activity.requireViewById(i4);
        }
    }

    @androidx.annotation.W(30)
    /* renamed from: androidx.core.app.b$g */
    /* loaded from: classes.dex */
    static class g {
        private g() {
        }

        @InterfaceC0577u
        static Display a(ContextWrapper contextWrapper) {
            return contextWrapper.getDisplay();
        }

        @InterfaceC0577u
        static void b(@androidx.annotation.N Activity activity, @androidx.annotation.P androidx.core.content.E e4, @androidx.annotation.P Bundle bundle) {
            LocusId c4;
            if (e4 == null) {
                c4 = null;
            } else {
                c4 = e4.c();
            }
            activity.setLocusContext(c4, bundle);
        }
    }

    @androidx.annotation.W(ConstraintLayout.b.a.f9573F)
    /* renamed from: androidx.core.app.b$h */
    /* loaded from: classes.dex */
    static class h {
        private h() {
        }

        @InterfaceC0577u
        static boolean a(@androidx.annotation.N Activity activity) {
            return activity.isLaunchedFromBubble();
        }
    }

    /* renamed from: androidx.core.app.b$i */
    /* loaded from: classes.dex */
    public interface i {
        void onRequestPermissionsResult(int i4, @androidx.annotation.N String[] strArr, @androidx.annotation.N int[] iArr);
    }

    /* renamed from: androidx.core.app.b$j */
    /* loaded from: classes.dex */
    public interface j {
        boolean a(@androidx.annotation.N Activity activity, @androidx.annotation.F(from = 0) int i4, int i5, @androidx.annotation.P Intent intent);

        boolean b(@androidx.annotation.N Activity activity, @androidx.annotation.N String[] strArr, @androidx.annotation.F(from = 0) int i4);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: androidx.core.app.b$k */
    /* loaded from: classes.dex */
    public interface k {
        void c(int i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.W(21)
    /* renamed from: androidx.core.app.b$l */
    /* loaded from: classes.dex */
    public static class l extends SharedElementCallback {

        /* renamed from: a, reason: collision with root package name */
        private final y1 f11878a;

        l(y1 y1Var) {
            this.f11878a = y1Var;
        }

        @Override // android.app.SharedElementCallback
        public Parcelable onCaptureSharedElementSnapshot(View view, Matrix matrix, RectF rectF) {
            return this.f11878a.b(view, matrix, rectF);
        }

        @Override // android.app.SharedElementCallback
        public View onCreateSnapshotView(Context context, Parcelable parcelable) {
            return this.f11878a.c(context, parcelable);
        }

        @Override // android.app.SharedElementCallback
        public void onMapSharedElements(List<String> list, Map<String, View> map) {
            this.f11878a.d(list, map);
        }

        @Override // android.app.SharedElementCallback
        public void onRejectSharedElements(List<View> list) {
            this.f11878a.e(list);
        }

        @Override // android.app.SharedElementCallback
        public void onSharedElementEnd(List<String> list, List<View> list2, List<View> list3) {
            this.f11878a.f(list, list2, list3);
        }

        @Override // android.app.SharedElementCallback
        public void onSharedElementStart(List<String> list, List<View> list2, List<View> list3) {
            this.f11878a.g(list, list2, list3);
        }

        @Override // android.app.SharedElementCallback
        @androidx.annotation.W(23)
        public void onSharedElementsArrived(List<String> list, List<View> list2, final SharedElementCallback.OnSharedElementsReadyListener onSharedElementsReadyListener) {
            this.f11878a.h(list, list2, new y1.a() { // from class: androidx.core.app.c
                @Override // androidx.core.app.y1.a
                public final void a() {
                    C0617b.e.a(onSharedElementsReadyListener);
                }
            });
        }
    }

    protected C0617b() {
    }

    public static void A(@androidx.annotation.N Activity activity) {
        c.a(activity);
    }

    @androidx.annotation.P
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static j B() {
        return f11874i;
    }

    @androidx.annotation.P
    public static Uri C(@androidx.annotation.N Activity activity) {
        return d.a(activity);
    }

    @Deprecated
    public static boolean D(Activity activity) {
        activity.invalidateOptionsMenu();
        return true;
    }

    public static boolean E(@androidx.annotation.N Activity activity) {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 31) {
            return h.a(activity);
        }
        if (i4 == 30) {
            if (g.a(activity) != null && g.a(activity).getDisplayId() != 0) {
                return true;
            }
            return false;
        }
        if (i4 != 29) {
            return false;
        }
        if (activity.getWindowManager().getDefaultDisplay() != null && activity.getWindowManager().getDefaultDisplay().getDisplayId() != 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void F(Activity activity) {
        if (!activity.isFinishing() && !C0625f.i(activity)) {
            activity.recreate();
        }
    }

    public static void G(@androidx.annotation.N Activity activity) {
        c.b(activity);
    }

    public static void H(@androidx.annotation.N final Activity activity) {
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
        } else {
            new Handler(activity.getMainLooper()).post(new Runnable() { // from class: androidx.core.app.a
                @Override // java.lang.Runnable
                public final void run() {
                    C0617b.F(activity);
                }
            });
        }
    }

    @androidx.annotation.P
    public static C0857x I(@androidx.annotation.N Activity activity, @androidx.annotation.N DragEvent dragEvent) {
        return C0857x.b(activity, dragEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @androidx.annotation.S(markerClass = {C0738a.InterfaceC0093a.class})
    public static void J(@androidx.annotation.N Activity activity, @androidx.annotation.N String[] strArr, @androidx.annotation.F(from = 0) int i4) {
        String[] strArr2;
        j jVar = f11874i;
        if (jVar != null && jVar.b(activity, strArr, i4)) {
            return;
        }
        HashSet hashSet = new HashSet();
        for (int i5 = 0; i5 < strArr.length; i5++) {
            if (!TextUtils.isEmpty(strArr[i5])) {
                if (!C0738a.k() && TextUtils.equals(strArr[i5], "android.permission.POST_NOTIFICATIONS")) {
                    hashSet.add(Integer.valueOf(i5));
                }
            } else {
                throw new IllegalArgumentException("Permission request for permissions " + Arrays.toString(strArr) + " must not contain null or empty values");
            }
        }
        int size = hashSet.size();
        if (size > 0) {
            strArr2 = new String[strArr.length - size];
        } else {
            strArr2 = strArr;
        }
        if (size > 0) {
            if (size == strArr.length) {
                return;
            }
            int i6 = 0;
            for (int i7 = 0; i7 < strArr.length; i7++) {
                if (!hashSet.contains(Integer.valueOf(i7))) {
                    strArr2[i6] = strArr[i7];
                    i6++;
                }
            }
        }
        if (activity instanceof k) {
            ((k) activity).c(i4);
        }
        e.b(activity, strArr, i4);
    }

    @androidx.annotation.N
    public static <T extends View> T K(@androidx.annotation.N Activity activity, @androidx.annotation.D int i4) {
        if (Build.VERSION.SDK_INT >= 28) {
            return (T) f.a(activity, i4);
        }
        T t3 = (T) activity.findViewById(i4);
        if (t3 != null) {
            return t3;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this Activity");
    }

    public static void L(@androidx.annotation.N Activity activity, @androidx.annotation.P y1 y1Var) {
        l lVar;
        if (y1Var != null) {
            lVar = new l(y1Var);
        } else {
            lVar = null;
        }
        c.c(activity, lVar);
    }

    public static void M(@androidx.annotation.N Activity activity, @androidx.annotation.P y1 y1Var) {
        l lVar;
        if (y1Var != null) {
            lVar = new l(y1Var);
        } else {
            lVar = null;
        }
        c.d(activity, lVar);
    }

    public static void N(@androidx.annotation.N Activity activity, @androidx.annotation.P androidx.core.content.E e4, @androidx.annotation.P Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 30) {
            g.b(activity, e4, bundle);
        }
    }

    public static void O(@androidx.annotation.P j jVar) {
        f11874i = jVar;
    }

    @androidx.annotation.S(markerClass = {C0738a.InterfaceC0093a.class})
    public static boolean P(@androidx.annotation.N Activity activity, @androidx.annotation.N String str) {
        if (!C0738a.k() && TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return false;
        }
        return e.c(activity, str);
    }

    public static void Q(@androidx.annotation.N Activity activity, @androidx.annotation.N Intent intent, int i4, @androidx.annotation.P Bundle bundle) {
        C0075b.b(activity, intent, i4, bundle);
    }

    public static void R(@androidx.annotation.N Activity activity, @androidx.annotation.N IntentSender intentSender, int i4, @androidx.annotation.P Intent intent, int i5, int i6, int i7, @androidx.annotation.P Bundle bundle) throws IntentSender.SendIntentException {
        C0075b.c(activity, intentSender, i4, intent, i5, i6, i7, bundle);
    }

    public static void S(@androidx.annotation.N Activity activity) {
        c.e(activity);
    }

    public static void z(@androidx.annotation.N Activity activity) {
        C0075b.a(activity);
    }
}
