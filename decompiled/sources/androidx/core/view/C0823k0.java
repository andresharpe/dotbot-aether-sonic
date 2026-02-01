package androidx.core.view;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContentInfo;
import android.view.Display;
import android.view.KeyEvent;
import android.view.OnReceiveContentListener;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.annotation.InterfaceC0577u;
import androidx.annotation.InterfaceC0580x;
import androidx.annotation.RestrictTo;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.C0771a;
import androidx.core.view.C0823k0;
import androidx.core.view.C0860y0;
import androidx.core.view.Y0;
import androidx.core.view.accessibility.M;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import m.C2356a;

@SuppressLint({"PrivateConstructorForUtilityClass"})
/* renamed from: androidx.core.view.k0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0823k0 {

    /* renamed from: A, reason: collision with root package name */
    public static final int f13546A = 1;

    /* renamed from: B, reason: collision with root package name */
    public static final int f13547B = 1;

    /* renamed from: C, reason: collision with root package name */
    public static final int f13548C = 2;

    /* renamed from: D, reason: collision with root package name */
    public static final int f13549D = 4;

    /* renamed from: E, reason: collision with root package name */
    public static final int f13550E = 8;

    /* renamed from: F, reason: collision with root package name */
    public static final int f13551F = 16;

    /* renamed from: G, reason: collision with root package name */
    public static final int f13552G = 32;

    /* renamed from: I, reason: collision with root package name */
    private static Field f13554I = null;

    /* renamed from: J, reason: collision with root package name */
    private static boolean f13555J = false;

    /* renamed from: K, reason: collision with root package name */
    private static Field f13556K = null;

    /* renamed from: L, reason: collision with root package name */
    private static boolean f13557L = false;

    /* renamed from: M, reason: collision with root package name */
    private static Method f13558M = null;

    /* renamed from: N, reason: collision with root package name */
    private static Method f13559N = null;

    /* renamed from: O, reason: collision with root package name */
    private static boolean f13560O = false;

    /* renamed from: P, reason: collision with root package name */
    private static WeakHashMap<View, String> f13561P = null;

    /* renamed from: R, reason: collision with root package name */
    private static Method f13563R = null;

    /* renamed from: S, reason: collision with root package name */
    private static Field f13564S = null;

    /* renamed from: U, reason: collision with root package name */
    private static ThreadLocal<Rect> f13566U = null;

    /* renamed from: a, reason: collision with root package name */
    private static final String f13570a = "ViewCompat";

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final int f13571b = 0;

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final int f13572c = 1;

    /* renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final int f13573d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static final int f13574e = 0;

    /* renamed from: f, reason: collision with root package name */
    public static final int f13575f = 1;

    /* renamed from: g, reason: collision with root package name */
    public static final int f13576g = 2;

    /* renamed from: h, reason: collision with root package name */
    public static final int f13577h = 4;

    /* renamed from: i, reason: collision with root package name */
    public static final int f13578i = 0;

    /* renamed from: j, reason: collision with root package name */
    public static final int f13579j = 1;

    /* renamed from: k, reason: collision with root package name */
    public static final int f13580k = 2;

    /* renamed from: l, reason: collision with root package name */
    @Deprecated
    public static final int f13581l = 0;

    /* renamed from: m, reason: collision with root package name */
    @Deprecated
    public static final int f13582m = 1;

    /* renamed from: n, reason: collision with root package name */
    @Deprecated
    public static final int f13583n = 2;

    /* renamed from: o, reason: collision with root package name */
    public static final int f13584o = 0;

    /* renamed from: p, reason: collision with root package name */
    public static final int f13585p = 1;

    /* renamed from: q, reason: collision with root package name */
    public static final int f13586q = 2;

    /* renamed from: r, reason: collision with root package name */
    public static final int f13587r = 3;

    /* renamed from: s, reason: collision with root package name */
    @Deprecated
    public static final int f13588s = 16777215;

    /* renamed from: t, reason: collision with root package name */
    @Deprecated
    public static final int f13589t = -16777216;

    /* renamed from: u, reason: collision with root package name */
    @Deprecated
    public static final int f13590u = 16;

    /* renamed from: v, reason: collision with root package name */
    @Deprecated
    public static final int f13591v = 16777216;

    /* renamed from: w, reason: collision with root package name */
    public static final int f13592w = 0;

    /* renamed from: x, reason: collision with root package name */
    public static final int f13593x = 1;

    /* renamed from: y, reason: collision with root package name */
    public static final int f13594y = 2;

    /* renamed from: z, reason: collision with root package name */
    public static final int f13595z = 0;

    /* renamed from: H, reason: collision with root package name */
    private static final AtomicInteger f13553H = new AtomicInteger(1);

    /* renamed from: Q, reason: collision with root package name */
    private static WeakHashMap<View, C0850t0> f13562Q = null;

    /* renamed from: T, reason: collision with root package name */
    private static boolean f13565T = false;

    /* renamed from: V, reason: collision with root package name */
    private static final int[] f13567V = {C2356a.e.f54925b, C2356a.e.f54927c, C2356a.e.f54949n, C2356a.e.f54967y, C2356a.e.f54898B, C2356a.e.f54899C, C2356a.e.f54900D, C2356a.e.f54901E, C2356a.e.f54902F, C2356a.e.f54903G, C2356a.e.f54929d, C2356a.e.f54931e, C2356a.e.f54933f, C2356a.e.f54935g, C2356a.e.f54937h, C2356a.e.f54939i, C2356a.e.f54941j, C2356a.e.f54943k, C2356a.e.f54945l, C2356a.e.f54947m, C2356a.e.f54951o, C2356a.e.f54953p, C2356a.e.f54955q, C2356a.e.f54957r, C2356a.e.f54959s, C2356a.e.f54961t, C2356a.e.f54963u, C2356a.e.f54964v, C2356a.e.f54965w, C2356a.e.f54966x, C2356a.e.f54968z, C2356a.e.f54897A};

    /* renamed from: W, reason: collision with root package name */
    private static final InterfaceC0799c0 f13568W = new InterfaceC0799c0() { // from class: androidx.core.view.j0
        @Override // androidx.core.view.InterfaceC0799c0
        public final C0807f a(C0807f c0807f) {
            C0807f c12;
            c12 = C0823k0.c1(c0807f);
            return c12;
        }
    };

    /* renamed from: X, reason: collision with root package name */
    private static final e f13569X = new e();

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: androidx.core.view.k0$A */
    /* loaded from: classes.dex */
    public @interface A {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: androidx.core.view.k0$B */
    /* loaded from: classes.dex */
    public @interface B {
    }

    /* renamed from: androidx.core.view.k0$C */
    /* loaded from: classes.dex */
    static class C {

        /* renamed from: d, reason: collision with root package name */
        private static final ArrayList<WeakReference<View>> f13596d = new ArrayList<>();

        /* renamed from: a, reason: collision with root package name */
        @androidx.annotation.P
        private WeakHashMap<View, Boolean> f13597a = null;

        /* renamed from: b, reason: collision with root package name */
        private SparseArray<WeakReference<View>> f13598b = null;

        /* renamed from: c, reason: collision with root package name */
        private WeakReference<KeyEvent> f13599c = null;

        C() {
        }

        static C a(View view) {
            C c4 = (C) view.getTag(C2356a.e.f54950n0);
            if (c4 == null) {
                C c5 = new C();
                view.setTag(C2356a.e.f54950n0, c5);
                return c5;
            }
            return c4;
        }

        @androidx.annotation.P
        private View c(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.f13597a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View c4 = c(viewGroup.getChildAt(childCount), keyEvent);
                        if (c4 != null) {
                            return c4;
                        }
                    }
                }
                if (e(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        private SparseArray<WeakReference<View>> d() {
            if (this.f13598b == null) {
                this.f13598b = new SparseArray<>();
            }
            return this.f13598b;
        }

        private boolean e(@androidx.annotation.N View view, @androidx.annotation.N KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(C2356a.e.f54952o0);
            if (arrayList != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    if (((z) arrayList.get(size)).onUnhandledKeyEvent(view, keyEvent)) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }

        private void g() {
            WeakHashMap<View, Boolean> weakHashMap = this.f13597a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList<WeakReference<View>> arrayList = f13596d;
            if (arrayList.isEmpty()) {
                return;
            }
            synchronized (arrayList) {
                try {
                    if (this.f13597a == null) {
                        this.f13597a = new WeakHashMap<>();
                    }
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        ArrayList<WeakReference<View>> arrayList2 = f13596d;
                        View view = arrayList2.get(size).get();
                        if (view == null) {
                            arrayList2.remove(size);
                        } else {
                            this.f13597a.put(view, Boolean.TRUE);
                            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                                this.f13597a.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        static void h(View view) {
            ArrayList<WeakReference<View>> arrayList = f13596d;
            synchronized (arrayList) {
                try {
                    Iterator<WeakReference<View>> it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (it.next().get() == view) {
                            return;
                        }
                    }
                    f13596d.add(new WeakReference<>(view));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        static void i(View view) {
            synchronized (f13596d) {
                int i4 = 0;
                while (true) {
                    try {
                        ArrayList<WeakReference<View>> arrayList = f13596d;
                        if (i4 < arrayList.size()) {
                            if (arrayList.get(i4).get() == view) {
                                arrayList.remove(i4);
                                return;
                            }
                            i4++;
                        } else {
                            return;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        boolean b(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                g();
            }
            View c4 = c(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (c4 != null && !KeyEvent.isModifierKey(keyCode)) {
                    d().put(keyCode, new WeakReference<>(c4));
                }
            }
            if (c4 != null) {
                return true;
            }
            return false;
        }

        boolean f(KeyEvent keyEvent) {
            WeakReference<View> weakReference;
            int indexOfKey;
            WeakReference<KeyEvent> weakReference2 = this.f13599c;
            if (weakReference2 != null && weakReference2.get() == keyEvent) {
                return false;
            }
            this.f13599c = new WeakReference<>(keyEvent);
            SparseArray<WeakReference<View>> d4 = d();
            if (keyEvent.getAction() == 1 && (indexOfKey = d4.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                weakReference = d4.valueAt(indexOfKey);
                d4.removeAt(indexOfKey);
            } else {
                weakReference = null;
            }
            if (weakReference == null) {
                weakReference = d4.get(keyEvent.getKeyCode());
            }
            if (weakReference == null) {
                return false;
            }
            View view = weakReference.get();
            if (view != null && C0823k0.O0(view)) {
                e(view, keyEvent);
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.view.k0$a, reason: case insensitive filesystem */
    /* loaded from: classes.dex */
    public class C0824a extends f<Boolean> {
        C0824a(int i4, Class cls, int i5) {
            super(i4, cls, i5);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.C0823k0.f
        @androidx.annotation.W(28)
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public Boolean d(@androidx.annotation.N View view) {
            return Boolean.valueOf(q.d(view));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.C0823k0.f
        @androidx.annotation.W(28)
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public void e(@androidx.annotation.N View view, Boolean bool) {
            q.i(view, bool.booleanValue());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.C0823k0.f
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public boolean h(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.view.k0$b, reason: case insensitive filesystem */
    /* loaded from: classes.dex */
    public class C0825b extends f<CharSequence> {
        C0825b(int i4, Class cls, int i5, int i6) {
            super(i4, cls, i5, i6);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.C0823k0.f
        @androidx.annotation.W(28)
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public CharSequence d(View view) {
            return q.b(view);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.C0823k0.f
        @androidx.annotation.W(28)
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public void e(View view, CharSequence charSequence) {
            q.h(view, charSequence);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.C0823k0.f
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public boolean h(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.view.k0$c, reason: case insensitive filesystem */
    /* loaded from: classes.dex */
    public class C0826c extends f<CharSequence> {
        C0826c(int i4, Class cls, int i5, int i6) {
            super(i4, cls, i5, i6);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.C0823k0.f
        @androidx.annotation.W(30)
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public CharSequence d(View view) {
            return s.a(view);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.C0823k0.f
        @androidx.annotation.W(30)
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public void e(View view, CharSequence charSequence) {
            s.c(view, charSequence);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.C0823k0.f
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public boolean h(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.view.k0$d */
    /* loaded from: classes.dex */
    public class d extends f<Boolean> {
        d(int i4, Class cls, int i5) {
            super(i4, cls, i5);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.C0823k0.f
        @androidx.annotation.W(28)
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public Boolean d(View view) {
            return Boolean.valueOf(q.c(view));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.C0823k0.f
        @androidx.annotation.W(28)
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public void e(View view, Boolean bool) {
            q.g(view, bool.booleanValue());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.C0823k0.f
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public boolean h(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    /* renamed from: androidx.core.view.k0$e */
    /* loaded from: classes.dex */
    static class e implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* renamed from: E, reason: collision with root package name */
        private final WeakHashMap<View, Boolean> f13600E = new WeakHashMap<>();

        e() {
        }

        @androidx.annotation.W(19)
        private void b(View view, boolean z3) {
            boolean z4;
            int i4;
            if (view.isShown() && view.getWindowVisibility() == 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z3 != z4) {
                if (z4) {
                    i4 = 16;
                } else {
                    i4 = 32;
                }
                C0823k0.d1(view, i4);
                this.f13600E.put(view, Boolean.valueOf(z4));
            }
        }

        @androidx.annotation.W(19)
        private void c(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        @androidx.annotation.W(19)
        private void e(View view) {
            h.o(view.getViewTreeObserver(), this);
        }

        @androidx.annotation.W(19)
        void a(View view) {
            boolean z3;
            WeakHashMap<View, Boolean> weakHashMap = this.f13600E;
            if (view.isShown() && view.getWindowVisibility() == 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            weakHashMap.put(view, Boolean.valueOf(z3));
            view.addOnAttachStateChangeListener(this);
            if (k.b(view)) {
                c(view);
            }
        }

        @androidx.annotation.W(19)
        void d(View view) {
            this.f13600E.remove(view);
            view.removeOnAttachStateChangeListener(this);
            e(view);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        @androidx.annotation.W(19)
        public void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                for (Map.Entry<View, Boolean> entry : this.f13600E.entrySet()) {
                    b(entry.getKey(), entry.getValue().booleanValue());
                }
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        @androidx.annotation.W(19)
        public void onViewAttachedToWindow(View view) {
            c(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.view.k0$f */
    /* loaded from: classes.dex */
    public static abstract class f<T> {

        /* renamed from: a, reason: collision with root package name */
        private final int f13601a;

        /* renamed from: b, reason: collision with root package name */
        private final Class<T> f13602b;

        /* renamed from: c, reason: collision with root package name */
        private final int f13603c;

        /* renamed from: d, reason: collision with root package name */
        private final int f13604d;

        f(int i4, Class<T> cls, int i5) {
            this(i4, cls, 0, i5);
        }

        private boolean b() {
            return true;
        }

        private boolean c() {
            if (Build.VERSION.SDK_INT >= this.f13603c) {
                return true;
            }
            return false;
        }

        boolean a(Boolean bool, Boolean bool2) {
            boolean z3;
            boolean z4;
            if (bool != null && bool.booleanValue()) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (bool2 != null && bool2.booleanValue()) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z3 != z4) {
                return false;
            }
            return true;
        }

        abstract T d(View view);

        abstract void e(View view, T t3);

        T f(View view) {
            if (c()) {
                return d(view);
            }
            if (b()) {
                T t3 = (T) view.getTag(this.f13601a);
                if (this.f13602b.isInstance(t3)) {
                    return t3;
                }
                return null;
            }
            return null;
        }

        void g(View view, T t3) {
            if (c()) {
                e(view, t3);
            } else if (b() && h(f(view), t3)) {
                C0823k0.C(view);
                view.setTag(this.f13601a, t3);
                C0823k0.d1(view, this.f13604d);
            }
        }

        boolean h(T t3, T t4) {
            return !t4.equals(t3);
        }

        f(int i4, Class<T> cls, int i5, int i6) {
            this.f13601a = i4;
            this.f13602b = cls;
            this.f13604d = i5;
            this.f13603c = i6;
        }
    }

    @androidx.annotation.W(15)
    /* renamed from: androidx.core.view.k0$g */
    /* loaded from: classes.dex */
    static class g {
        private g() {
        }

        @InterfaceC0577u
        static boolean a(@androidx.annotation.N View view) {
            return view.hasOnClickListeners();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.W(16)
    /* renamed from: androidx.core.view.k0$h */
    /* loaded from: classes.dex */
    public static class h {
        private h() {
        }

        @InterfaceC0577u
        static AccessibilityNodeProvider a(View view) {
            return view.getAccessibilityNodeProvider();
        }

        @InterfaceC0577u
        static boolean b(View view) {
            return view.getFitsSystemWindows();
        }

        @InterfaceC0577u
        static int c(View view) {
            return view.getImportantForAccessibility();
        }

        @InterfaceC0577u
        static int d(View view) {
            return view.getMinimumHeight();
        }

        @InterfaceC0577u
        static int e(View view) {
            return view.getMinimumWidth();
        }

        @InterfaceC0577u
        static ViewParent f(View view) {
            return view.getParentForAccessibility();
        }

        @InterfaceC0577u
        static int g(View view) {
            return view.getWindowSystemUiVisibility();
        }

        @InterfaceC0577u
        static boolean h(View view) {
            return view.hasOverlappingRendering();
        }

        @InterfaceC0577u
        static boolean i(View view) {
            return view.hasTransientState();
        }

        @InterfaceC0577u
        static boolean j(View view, int i4, Bundle bundle) {
            return view.performAccessibilityAction(i4, bundle);
        }

        @InterfaceC0577u
        static void k(View view) {
            view.postInvalidateOnAnimation();
        }

        @InterfaceC0577u
        static void l(View view, int i4, int i5, int i6, int i7) {
            view.postInvalidateOnAnimation(i4, i5, i6, i7);
        }

        @InterfaceC0577u
        static void m(View view, Runnable runnable) {
            view.postOnAnimation(runnable);
        }

        @InterfaceC0577u
        static void n(View view, Runnable runnable, long j4) {
            view.postOnAnimationDelayed(runnable, j4);
        }

        @InterfaceC0577u
        static void o(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }

        @InterfaceC0577u
        static void p(View view) {
            view.requestFitSystemWindows();
        }

        @InterfaceC0577u
        static void q(View view, Drawable drawable) {
            view.setBackground(drawable);
        }

        @InterfaceC0577u
        static void r(View view, boolean z3) {
            view.setHasTransientState(z3);
        }

        @InterfaceC0577u
        static void s(View view, int i4) {
            view.setImportantForAccessibility(i4);
        }
    }

    @androidx.annotation.W(17)
    /* renamed from: androidx.core.view.k0$i */
    /* loaded from: classes.dex */
    static class i {
        private i() {
        }

        @InterfaceC0577u
        static int a() {
            return View.generateViewId();
        }

        @InterfaceC0577u
        static Display b(@androidx.annotation.N View view) {
            return view.getDisplay();
        }

        @InterfaceC0577u
        static int c(View view) {
            return view.getLabelFor();
        }

        @InterfaceC0577u
        static int d(View view) {
            return view.getLayoutDirection();
        }

        @InterfaceC0577u
        static int e(View view) {
            return view.getPaddingEnd();
        }

        @InterfaceC0577u
        static int f(View view) {
            return view.getPaddingStart();
        }

        @InterfaceC0577u
        static boolean g(View view) {
            return view.isPaddingRelative();
        }

        @InterfaceC0577u
        static void h(View view, int i4) {
            view.setLabelFor(i4);
        }

        @InterfaceC0577u
        static void i(View view, Paint paint) {
            view.setLayerPaint(paint);
        }

        @InterfaceC0577u
        static void j(View view, int i4) {
            view.setLayoutDirection(i4);
        }

        @InterfaceC0577u
        static void k(View view, int i4, int i5, int i6, int i7) {
            view.setPaddingRelative(i4, i5, i6, i7);
        }
    }

    @androidx.annotation.W(18)
    /* renamed from: androidx.core.view.k0$j */
    /* loaded from: classes.dex */
    static class j {
        private j() {
        }

        @InterfaceC0577u
        static Rect a(@androidx.annotation.N View view) {
            return view.getClipBounds();
        }

        @InterfaceC0577u
        static boolean b(@androidx.annotation.N View view) {
            return view.isInLayout();
        }

        @InterfaceC0577u
        static void c(@androidx.annotation.N View view, Rect rect) {
            view.setClipBounds(rect);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.W(19)
    /* renamed from: androidx.core.view.k0$k */
    /* loaded from: classes.dex */
    public static class k {
        private k() {
        }

        @InterfaceC0577u
        static int a(View view) {
            return view.getAccessibilityLiveRegion();
        }

        @InterfaceC0577u
        static boolean b(@androidx.annotation.N View view) {
            return view.isAttachedToWindow();
        }

        @InterfaceC0577u
        static boolean c(@androidx.annotation.N View view) {
            return view.isLaidOut();
        }

        @InterfaceC0577u
        static boolean d(@androidx.annotation.N View view) {
            return view.isLayoutDirectionResolved();
        }

        @InterfaceC0577u
        static void e(ViewParent viewParent, View view, View view2, int i4) {
            viewParent.notifySubtreeAccessibilityStateChanged(view, view2, i4);
        }

        @InterfaceC0577u
        static void f(View view, int i4) {
            view.setAccessibilityLiveRegion(i4);
        }

        @InterfaceC0577u
        static void g(AccessibilityEvent accessibilityEvent, int i4) {
            accessibilityEvent.setContentChangeTypes(i4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.W(20)
    /* renamed from: androidx.core.view.k0$l */
    /* loaded from: classes.dex */
    public static class l {
        private l() {
        }

        @InterfaceC0577u
        static WindowInsets a(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        @InterfaceC0577u
        static WindowInsets b(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        @InterfaceC0577u
        static void c(View view) {
            view.requestApplyInsets();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.annotation.W(21)
    /* renamed from: androidx.core.view.k0$m */
    /* loaded from: classes.dex */
    public static class m {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.core.view.k0$m$a */
        /* loaded from: classes.dex */
        public class a implements View.OnApplyWindowInsetsListener {

            /* renamed from: a, reason: collision with root package name */
            Y0 f13605a = null;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ View f13606b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC0772a0 f13607c;

            a(View view, InterfaceC0772a0 interfaceC0772a0) {
                this.f13606b = view;
                this.f13607c = interfaceC0772a0;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                Y0 L3 = Y0.L(windowInsets, view);
                int i4 = Build.VERSION.SDK_INT;
                if (i4 < 30) {
                    m.a(windowInsets, this.f13606b);
                    if (L3.equals(this.f13605a)) {
                        return this.f13607c.a(view, L3).J();
                    }
                }
                this.f13605a = L3;
                Y0 a4 = this.f13607c.a(view, L3);
                if (i4 >= 30) {
                    return a4.J();
                }
                C0823k0.v1(view);
                return a4.J();
            }
        }

        private m() {
        }

        @InterfaceC0577u
        static void a(@androidx.annotation.N WindowInsets windowInsets, @androidx.annotation.N View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(C2356a.e.f54954p0);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        @InterfaceC0577u
        static Y0 b(@androidx.annotation.N View view, @androidx.annotation.N Y0 y02, @androidx.annotation.N Rect rect) {
            WindowInsets J3 = y02.J();
            if (J3 != null) {
                return Y0.L(view.computeSystemWindowInsets(J3, rect), view);
            }
            rect.setEmpty();
            return y02;
        }

        @InterfaceC0577u
        static boolean c(@androidx.annotation.N View view, float f4, float f5, boolean z3) {
            return view.dispatchNestedFling(f4, f5, z3);
        }

        @InterfaceC0577u
        static boolean d(@androidx.annotation.N View view, float f4, float f5) {
            return view.dispatchNestedPreFling(f4, f5);
        }

        @InterfaceC0577u
        static boolean e(View view, int i4, int i5, int[] iArr, int[] iArr2) {
            return view.dispatchNestedPreScroll(i4, i5, iArr, iArr2);
        }

        @InterfaceC0577u
        static boolean f(View view, int i4, int i5, int i6, int i7, int[] iArr) {
            return view.dispatchNestedScroll(i4, i5, i6, i7, iArr);
        }

        @InterfaceC0577u
        static ColorStateList g(View view) {
            return view.getBackgroundTintList();
        }

        @InterfaceC0577u
        static PorterDuff.Mode h(View view) {
            return view.getBackgroundTintMode();
        }

        @InterfaceC0577u
        static float i(View view) {
            return view.getElevation();
        }

        @androidx.annotation.P
        @InterfaceC0577u
        public static Y0 j(@androidx.annotation.N View view) {
            return Y0.a.a(view);
        }

        @InterfaceC0577u
        static String k(View view) {
            return view.getTransitionName();
        }

        @InterfaceC0577u
        static float l(View view) {
            return view.getTranslationZ();
        }

        @InterfaceC0577u
        static float m(@androidx.annotation.N View view) {
            return view.getZ();
        }

        @InterfaceC0577u
        static boolean n(View view) {
            return view.hasNestedScrollingParent();
        }

        @InterfaceC0577u
        static boolean o(View view) {
            return view.isImportantForAccessibility();
        }

        @InterfaceC0577u
        static boolean p(View view) {
            return view.isNestedScrollingEnabled();
        }

        @InterfaceC0577u
        static void q(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        @InterfaceC0577u
        static void r(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        @InterfaceC0577u
        static void s(View view, float f4) {
            view.setElevation(f4);
        }

        @InterfaceC0577u
        static void t(View view, boolean z3) {
            view.setNestedScrollingEnabled(z3);
        }

        @InterfaceC0577u
        static void u(@androidx.annotation.N View view, @androidx.annotation.P InterfaceC0772a0 interfaceC0772a0) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(C2356a.e.f54938h0, interfaceC0772a0);
            }
            if (interfaceC0772a0 == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(C2356a.e.f54954p0));
            } else {
                view.setOnApplyWindowInsetsListener(new a(view, interfaceC0772a0));
            }
        }

        @InterfaceC0577u
        static void v(View view, String str) {
            view.setTransitionName(str);
        }

        @InterfaceC0577u
        static void w(View view, float f4) {
            view.setTranslationZ(f4);
        }

        @InterfaceC0577u
        static void x(@androidx.annotation.N View view, float f4) {
            view.setZ(f4);
        }

        @InterfaceC0577u
        static boolean y(View view, int i4) {
            return view.startNestedScroll(i4);
        }

        @InterfaceC0577u
        static void z(View view) {
            view.stopNestedScroll();
        }
    }

    @androidx.annotation.W(23)
    /* renamed from: androidx.core.view.k0$n */
    /* loaded from: classes.dex */
    private static class n {
        private n() {
        }

        @androidx.annotation.P
        public static Y0 a(@androidx.annotation.N View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            Y0 K3 = Y0.K(rootWindowInsets);
            K3.H(K3);
            K3.d(view.getRootView());
            return K3;
        }

        @InterfaceC0577u
        static int b(@androidx.annotation.N View view) {
            return view.getScrollIndicators();
        }

        @InterfaceC0577u
        static void c(@androidx.annotation.N View view, int i4) {
            view.setScrollIndicators(i4);
        }

        @InterfaceC0577u
        static void d(@androidx.annotation.N View view, int i4, int i5) {
            view.setScrollIndicators(i4, i5);
        }
    }

    @androidx.annotation.W(24)
    /* renamed from: androidx.core.view.k0$o */
    /* loaded from: classes.dex */
    static class o {
        private o() {
        }

        @InterfaceC0577u
        static void a(@androidx.annotation.N View view) {
            view.cancelDragAndDrop();
        }

        @InterfaceC0577u
        static void b(View view) {
            view.dispatchFinishTemporaryDetach();
        }

        @InterfaceC0577u
        static void c(View view) {
            view.dispatchStartTemporaryDetach();
        }

        @InterfaceC0577u
        static void d(@androidx.annotation.N View view, PointerIcon pointerIcon) {
            view.setPointerIcon(pointerIcon);
        }

        @InterfaceC0577u
        static boolean e(@androidx.annotation.N View view, @androidx.annotation.P ClipData clipData, @androidx.annotation.N View.DragShadowBuilder dragShadowBuilder, @androidx.annotation.P Object obj, int i4) {
            return view.startDragAndDrop(clipData, dragShadowBuilder, obj, i4);
        }

        @InterfaceC0577u
        static void f(@androidx.annotation.N View view, @androidx.annotation.N View.DragShadowBuilder dragShadowBuilder) {
            view.updateDragShadow(dragShadowBuilder);
        }
    }

    @androidx.annotation.W(26)
    /* renamed from: androidx.core.view.k0$p */
    /* loaded from: classes.dex */
    static class p {
        private p() {
        }

        @InterfaceC0577u
        static void a(@androidx.annotation.N View view, Collection<View> collection, int i4) {
            view.addKeyboardNavigationClusters(collection, i4);
        }

        @InterfaceC0577u
        static int b(View view) {
            return view.getImportantForAutofill();
        }

        @InterfaceC0577u
        static int c(@androidx.annotation.N View view) {
            return view.getNextClusterForwardId();
        }

        @InterfaceC0577u
        static boolean d(@androidx.annotation.N View view) {
            return view.hasExplicitFocusable();
        }

        @InterfaceC0577u
        static boolean e(@androidx.annotation.N View view) {
            return view.isFocusedByDefault();
        }

        @InterfaceC0577u
        static boolean f(View view) {
            return view.isImportantForAutofill();
        }

        @InterfaceC0577u
        static boolean g(@androidx.annotation.N View view) {
            return view.isKeyboardNavigationCluster();
        }

        @InterfaceC0577u
        static View h(@androidx.annotation.N View view, View view2, int i4) {
            return view.keyboardNavigationClusterSearch(view2, i4);
        }

        @InterfaceC0577u
        static boolean i(@androidx.annotation.N View view) {
            return view.restoreDefaultFocus();
        }

        @InterfaceC0577u
        static void j(@androidx.annotation.N View view, String... strArr) {
            view.setAutofillHints(strArr);
        }

        @InterfaceC0577u
        static void k(@androidx.annotation.N View view, boolean z3) {
            view.setFocusedByDefault(z3);
        }

        @InterfaceC0577u
        static void l(View view, int i4) {
            view.setImportantForAutofill(i4);
        }

        @InterfaceC0577u
        static void m(@androidx.annotation.N View view, boolean z3) {
            view.setKeyboardNavigationCluster(z3);
        }

        @InterfaceC0577u
        static void n(View view, int i4) {
            view.setNextClusterForwardId(i4);
        }

        @InterfaceC0577u
        static void o(@androidx.annotation.N View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.W(28)
    /* renamed from: androidx.core.view.k0$q */
    /* loaded from: classes.dex */
    public static class q {
        private q() {
        }

        @InterfaceC0577u
        static void a(@androidx.annotation.N View view, @androidx.annotation.N final z zVar) {
            androidx.collection.l lVar = (androidx.collection.l) view.getTag(C2356a.e.f54952o0);
            if (lVar == null) {
                lVar = new androidx.collection.l();
                view.setTag(C2356a.e.f54952o0, lVar);
            }
            Objects.requireNonNull(zVar);
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener = new View.OnUnhandledKeyEventListener() { // from class: androidx.core.view.l0
                @Override // android.view.View.OnUnhandledKeyEventListener
                public final boolean onUnhandledKeyEvent(View view2, KeyEvent keyEvent) {
                    return C0823k0.z.this.onUnhandledKeyEvent(view2, keyEvent);
                }
            };
            lVar.put(zVar, onUnhandledKeyEventListener);
            view.addOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }

        @InterfaceC0577u
        static CharSequence b(View view) {
            return view.getAccessibilityPaneTitle();
        }

        @InterfaceC0577u
        static boolean c(View view) {
            return view.isAccessibilityHeading();
        }

        @InterfaceC0577u
        static boolean d(View view) {
            return view.isScreenReaderFocusable();
        }

        @InterfaceC0577u
        static void e(@androidx.annotation.N View view, @androidx.annotation.N z zVar) {
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
            androidx.collection.l lVar = (androidx.collection.l) view.getTag(C2356a.e.f54952o0);
            if (lVar != null && (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) lVar.get(zVar)) != null) {
                view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
            }
        }

        @InterfaceC0577u
        static <T> T f(View view, int i4) {
            return (T) view.requireViewById(i4);
        }

        @InterfaceC0577u
        static void g(View view, boolean z3) {
            view.setAccessibilityHeading(z3);
        }

        @InterfaceC0577u
        static void h(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        @InterfaceC0577u
        static void i(View view, boolean z3) {
            view.setScreenReaderFocusable(z3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.annotation.W(ConstraintLayout.b.a.f9571D)
    /* renamed from: androidx.core.view.k0$r */
    /* loaded from: classes.dex */
    public static class r {
        private r() {
        }

        @InterfaceC0577u
        static View.AccessibilityDelegate a(View view) {
            return view.getAccessibilityDelegate();
        }

        @InterfaceC0577u
        static List<Rect> b(View view) {
            return view.getSystemGestureExclusionRects();
        }

        @InterfaceC0577u
        static void c(@androidx.annotation.N View view, @androidx.annotation.N Context context, @androidx.annotation.N int[] iArr, @androidx.annotation.P AttributeSet attributeSet, @androidx.annotation.N TypedArray typedArray, int i4, int i5) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i4, i5);
        }

        @InterfaceC0577u
        static void d(View view, List<Rect> list) {
            view.setSystemGestureExclusionRects(list);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.annotation.W(30)
    /* renamed from: androidx.core.view.k0$s */
    /* loaded from: classes.dex */
    public static class s {
        private s() {
        }

        @InterfaceC0577u
        static CharSequence a(View view) {
            return view.getStateDescription();
        }

        @androidx.annotation.P
        public static E1 b(@androidx.annotation.N View view) {
            WindowInsetsController windowInsetsController = view.getWindowInsetsController();
            if (windowInsetsController != null) {
                return E1.l(windowInsetsController);
            }
            return null;
        }

        @InterfaceC0577u
        static void c(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    @androidx.annotation.W(ConstraintLayout.b.a.f9573F)
    /* renamed from: androidx.core.view.k0$t */
    /* loaded from: classes.dex */
    private static final class t {
        private t() {
        }

        @androidx.annotation.P
        @InterfaceC0577u
        public static String[] a(@androidx.annotation.N View view) {
            return view.getReceiveContentMimeTypes();
        }

        @androidx.annotation.P
        @InterfaceC0577u
        public static C0807f b(@androidx.annotation.N View view, @androidx.annotation.N C0807f c0807f) {
            ContentInfo l4 = c0807f.l();
            ContentInfo performReceiveContent = view.performReceiveContent(l4);
            if (performReceiveContent == null) {
                return null;
            }
            if (performReceiveContent == l4) {
                return c0807f;
            }
            return C0807f.m(performReceiveContent);
        }

        @InterfaceC0577u
        public static void c(@androidx.annotation.N View view, @androidx.annotation.P String[] strArr, @androidx.annotation.P InterfaceC0796b0 interfaceC0796b0) {
            if (interfaceC0796b0 == null) {
                view.setOnReceiveContentListener(strArr, null);
            } else {
                view.setOnReceiveContentListener(strArr, new y(interfaceC0796b0));
            }
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: androidx.core.view.k0$u */
    /* loaded from: classes.dex */
    public @interface u {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: androidx.core.view.k0$v */
    /* loaded from: classes.dex */
    public @interface v {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: androidx.core.view.k0$w */
    /* loaded from: classes.dex */
    public @interface w {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: androidx.core.view.k0$x */
    /* loaded from: classes.dex */
    public @interface x {
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.annotation.W(ConstraintLayout.b.a.f9573F)
    /* renamed from: androidx.core.view.k0$y */
    /* loaded from: classes.dex */
    public static final class y implements OnReceiveContentListener {

        /* renamed from: a, reason: collision with root package name */
        @androidx.annotation.N
        private final InterfaceC0796b0 f13608a;

        y(@androidx.annotation.N InterfaceC0796b0 interfaceC0796b0) {
            this.f13608a = interfaceC0796b0;
        }

        @androidx.annotation.P
        public ContentInfo onReceiveContent(@androidx.annotation.N View view, @androidx.annotation.N ContentInfo contentInfo) {
            C0807f m4 = C0807f.m(contentInfo);
            C0807f a4 = this.f13608a.a(view, m4);
            if (a4 == null) {
                return null;
            }
            if (a4 == m4) {
                return contentInfo;
            }
            return a4.l();
        }
    }

    /* renamed from: androidx.core.view.k0$z */
    /* loaded from: classes.dex */
    public interface z {
        boolean onUnhandledKeyEvent(@androidx.annotation.N View view, @androidx.annotation.N KeyEvent keyEvent);
    }

    @Deprecated
    protected C0823k0() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.h0
    public static boolean A(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return C.a(view).f(keyEvent);
    }

    public static float A0(@androidx.annotation.N View view) {
        return m.l(view);
    }

    private static f<Boolean> A1() {
        return new C0824a(C2356a.e.f54944k0, Boolean.class, 28);
    }

    @Deprecated
    public static void A2(View view, float f4) {
        view.setY(f4);
    }

    public static void B(@androidx.annotation.N View view) {
        C(view);
    }

    @androidx.annotation.P
    @Deprecated
    public static E1 B0(@androidx.annotation.N View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            return s.b(view);
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                Window window = ((Activity) context).getWindow();
                if (window == null) {
                    return null;
                }
                return C0858x0.a(window, view);
            }
        }
        return null;
    }

    public static void B1(@androidx.annotation.N View view, @androidx.annotation.P C0771a c0771a) {
        View.AccessibilityDelegate d4;
        if (c0771a == null && (F(view) instanceof C0771a.C0104a)) {
            c0771a = new C0771a();
        }
        if (c0771a == null) {
            d4 = null;
        } else {
            d4 = c0771a.d();
        }
        view.setAccessibilityDelegate(d4);
    }

    public static void B2(@androidx.annotation.N View view, float f4) {
        m.x(view, f4);
    }

    static void C(@androidx.annotation.N View view) {
        C0771a E3 = E(view);
        if (E3 == null) {
            E3 = new C0771a();
        }
        B1(view, E3);
    }

    @Deprecated
    public static int C0(@androidx.annotation.N View view) {
        return h.g(view);
    }

    @androidx.annotation.h0
    public static void C1(@androidx.annotation.N View view, boolean z3) {
        b().g(view, Boolean.valueOf(z3));
    }

    public static boolean C2(@androidx.annotation.N View view, @androidx.annotation.P ClipData clipData, @androidx.annotation.N View.DragShadowBuilder dragShadowBuilder, @androidx.annotation.P Object obj, int i4) {
        return o.e(view, clipData, dragShadowBuilder, obj, i4);
    }

    public static int D() {
        return i.a();
    }

    @Deprecated
    public static float D0(View view) {
        return view.getX();
    }

    public static void D1(@androidx.annotation.N View view, int i4) {
        k.f(view, i4);
    }

    public static boolean D2(@androidx.annotation.N View view, int i4) {
        return m.y(view, i4);
    }

    @androidx.annotation.P
    public static C0771a E(@androidx.annotation.N View view) {
        View.AccessibilityDelegate F3 = F(view);
        if (F3 == null) {
            return null;
        }
        if (F3 instanceof C0771a.C0104a) {
            return ((C0771a.C0104a) F3).f13282a;
        }
        return new C0771a(F3);
    }

    @Deprecated
    public static float E0(View view) {
        return view.getY();
    }

    @androidx.annotation.h0
    public static void E1(@androidx.annotation.N View view, @androidx.annotation.P CharSequence charSequence) {
        k1().g(view, charSequence);
        if (charSequence != null) {
            f13569X.a(view);
        } else {
            f13569X.d(view);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean E2(@androidx.annotation.N View view, int i4, int i5) {
        if (view instanceof S) {
            return ((S) view).f(i4, i5);
        }
        if (i5 == 0) {
            return D2(view, i4);
        }
        return false;
    }

    @androidx.annotation.P
    private static View.AccessibilityDelegate F(@androidx.annotation.N View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return r.a(view);
        }
        return G(view);
    }

    public static float F0(@androidx.annotation.N View view) {
        return m.m(view);
    }

    @Deprecated
    public static void F1(View view, boolean z3) {
        view.setActivated(z3);
    }

    private static f<CharSequence> F2() {
        return new C0826c(C2356a.e.f54946l0, CharSequence.class, 64, 30);
    }

    @androidx.annotation.P
    private static View.AccessibilityDelegate G(@androidx.annotation.N View view) {
        if (f13565T) {
            return null;
        }
        if (f13564S == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f13564S = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f13565T = true;
                return null;
            }
        }
        try {
            Object obj = f13564S.get(view);
            if (!(obj instanceof View.AccessibilityDelegate)) {
                return null;
            }
            return (View.AccessibilityDelegate) obj;
        } catch (Throwable unused2) {
            f13565T = true;
            return null;
        }
    }

    public static boolean G0(@androidx.annotation.N View view) {
        if (F(view) != null) {
            return true;
        }
        return false;
    }

    @Deprecated
    public static void G1(View view, @InterfaceC0580x(from = 0.0d, to = 1.0d) float f4) {
        view.setAlpha(f4);
    }

    public static void G2(@androidx.annotation.N View view) {
        m.z(view);
    }

    public static int H(@androidx.annotation.N View view) {
        return k.a(view);
    }

    public static boolean H0(@androidx.annotation.N View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return p.d(view);
        }
        return view.hasFocusable();
    }

    public static void H1(@androidx.annotation.N View view, @androidx.annotation.P String... strArr) {
        if (Build.VERSION.SDK_INT >= 26) {
            p.j(view, strArr);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void H2(@androidx.annotation.N View view, int i4) {
        if (view instanceof S) {
            ((S) view).g(i4);
        } else if (i4 == 0) {
            G2(view);
        }
    }

    @androidx.annotation.P
    public static androidx.core.view.accessibility.S I(@androidx.annotation.N View view) {
        AccessibilityNodeProvider a4 = h.a(view);
        if (a4 != null) {
            return new androidx.core.view.accessibility.S(a4);
        }
        return null;
    }

    public static boolean I0(@androidx.annotation.N View view) {
        return m.n(view);
    }

    public static void I1(@androidx.annotation.N View view, @androidx.annotation.P Drawable drawable) {
        h.q(view, drawable);
    }

    private static void I2(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }

    @androidx.annotation.P
    @androidx.annotation.h0
    public static CharSequence J(@androidx.annotation.N View view) {
        return k1().f(view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean J0(@androidx.annotation.N View view, int i4) {
        if (view instanceof S) {
            ((S) view).d(i4);
            return false;
        }
        if (i4 == 0) {
            return I0(view);
        }
        return false;
    }

    public static void J1(@androidx.annotation.N View view, @androidx.annotation.P ColorStateList colorStateList) {
        m.q(view, colorStateList);
    }

    public static void J2(@androidx.annotation.N View view, @androidx.annotation.N View.DragShadowBuilder dragShadowBuilder) {
        o.f(view, dragShadowBuilder);
    }

    private static List<M.a> K(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(C2356a.e.f54930d0);
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            view.setTag(C2356a.e.f54930d0, arrayList2);
            return arrayList2;
        }
        return arrayList;
    }

    public static boolean K0(@androidx.annotation.N View view) {
        return g.a(view);
    }

    public static void K1(@androidx.annotation.N View view, @androidx.annotation.P PorterDuff.Mode mode) {
        m.r(view, mode);
    }

    @Deprecated
    public static float L(View view) {
        return view.getAlpha();
    }

    public static boolean L0(@androidx.annotation.N View view) {
        return h.h(view);
    }

    @SuppressLint({"BanUncheckedReflection"})
    @Deprecated
    public static void L1(ViewGroup viewGroup, boolean z3) {
        if (f13563R == null) {
            try {
                f13563R = ViewGroup.class.getDeclaredMethod("setChildrenDrawingOrderEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException e4) {
                Log.e(f13570a, "Unable to find childrenDrawingOrderEnabled", e4);
            }
            f13563R.setAccessible(true);
        }
        try {
            f13563R.invoke(viewGroup, Boolean.valueOf(z3));
        } catch (IllegalAccessException e5) {
            Log.e(f13570a, "Unable to invoke childrenDrawingOrderEnabled", e5);
        } catch (IllegalArgumentException e6) {
            Log.e(f13570a, "Unable to invoke childrenDrawingOrderEnabled", e6);
        } catch (InvocationTargetException e7) {
            Log.e(f13570a, "Unable to invoke childrenDrawingOrderEnabled", e7);
        }
    }

    private static int M(View view, @androidx.annotation.N CharSequence charSequence) {
        boolean z3;
        List<M.a> K3 = K(view);
        for (int i4 = 0; i4 < K3.size(); i4++) {
            if (TextUtils.equals(charSequence, K3.get(i4).c())) {
                return K3.get(i4).b();
            }
        }
        int i5 = -1;
        int i6 = 0;
        while (true) {
            int[] iArr = f13567V;
            if (i6 >= iArr.length || i5 != -1) {
                break;
            }
            int i7 = iArr[i6];
            boolean z4 = true;
            for (int i8 = 0; i8 < K3.size(); i8++) {
                if (K3.get(i8).b() != i7) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                z4 &= z3;
            }
            if (z4) {
                i5 = i7;
            }
            i6++;
        }
        return i5;
    }

    public static boolean M0(@androidx.annotation.N View view) {
        return h.i(view);
    }

    public static void M1(@androidx.annotation.N View view, @androidx.annotation.P Rect rect) {
        j.c(view, rect);
    }

    @androidx.annotation.P
    public static ColorStateList N(@androidx.annotation.N View view) {
        return m.g(view);
    }

    @androidx.annotation.h0
    public static boolean N0(@androidx.annotation.N View view) {
        Boolean f4 = b().f(view);
        if (f4 != null && f4.booleanValue()) {
            return true;
        }
        return false;
    }

    public static void N1(@androidx.annotation.N View view, float f4) {
        m.s(view, f4);
    }

    @androidx.annotation.P
    public static PorterDuff.Mode O(@androidx.annotation.N View view) {
        return m.h(view);
    }

    public static boolean O0(@androidx.annotation.N View view) {
        return k.b(view);
    }

    @Deprecated
    public static void O1(View view, boolean z3) {
        view.setFitsSystemWindows(z3);
    }

    @androidx.annotation.P
    public static Rect P(@androidx.annotation.N View view) {
        return j.a(view);
    }

    public static boolean P0(@androidx.annotation.N View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return p.e(view);
        }
        return false;
    }

    public static void P1(@androidx.annotation.N View view, boolean z3) {
        if (Build.VERSION.SDK_INT >= 26) {
            p.k(view, z3);
        }
    }

    @androidx.annotation.P
    public static Display Q(@androidx.annotation.N View view) {
        return i.b(view);
    }

    public static boolean Q0(@androidx.annotation.N View view) {
        return m.o(view);
    }

    public static void Q1(@androidx.annotation.N View view, boolean z3) {
        h.r(view, z3);
    }

    public static float R(@androidx.annotation.N View view) {
        return m.i(view);
    }

    public static boolean R0(@androidx.annotation.N View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return p.f(view);
        }
        return true;
    }

    @androidx.annotation.h0
    public static void R1(@androidx.annotation.N View view, int i4) {
        h.s(view, i4);
    }

    private static Rect S() {
        if (f13566U == null) {
            f13566U = new ThreadLocal<>();
        }
        Rect rect = f13566U.get();
        if (rect == null) {
            rect = new Rect();
            f13566U.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    public static boolean S0(@androidx.annotation.N View view) {
        return j.b(view);
    }

    public static void S1(@androidx.annotation.N View view, int i4) {
        if (Build.VERSION.SDK_INT >= 26) {
            p.l(view, i4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static InterfaceC0799c0 T(@androidx.annotation.N View view) {
        if (view instanceof InterfaceC0799c0) {
            return (InterfaceC0799c0) view;
        }
        return f13568W;
    }

    public static boolean T0(@androidx.annotation.N View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return p.g(view);
        }
        return false;
    }

    public static void T1(@androidx.annotation.N View view, boolean z3) {
        if (Build.VERSION.SDK_INT >= 26) {
            p.m(view, z3);
        }
    }

    public static boolean U(@androidx.annotation.N View view) {
        return h.b(view);
    }

    public static boolean U0(@androidx.annotation.N View view) {
        return k.c(view);
    }

    public static void U1(@androidx.annotation.N View view, @androidx.annotation.D int i4) {
        i.h(view, i4);
    }

    public static int V(@androidx.annotation.N View view) {
        return h.c(view);
    }

    public static boolean V0(@androidx.annotation.N View view) {
        return k.d(view);
    }

    public static void V1(@androidx.annotation.N View view, @androidx.annotation.P Paint paint) {
        i.i(view, paint);
    }

    @SuppressLint({"InlinedApi"})
    public static int W(@androidx.annotation.N View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return p.b(view);
        }
        return 0;
    }

    public static boolean W0(@androidx.annotation.N View view) {
        return m.p(view);
    }

    @Deprecated
    public static void W1(View view, int i4, Paint paint) {
        view.setLayerType(i4, paint);
    }

    public static int X(@androidx.annotation.N View view) {
        return i.c(view);
    }

    @Deprecated
    public static boolean X0(View view) {
        return view.isOpaque();
    }

    public static void X1(@androidx.annotation.N View view, int i4) {
        i.j(view, i4);
    }

    @Deprecated
    public static int Y(View view) {
        return view.getLayerType();
    }

    public static boolean Y0(@androidx.annotation.N View view) {
        return i.g(view);
    }

    public static void Y1(@androidx.annotation.N View view, boolean z3) {
        m.t(view, z3);
    }

    public static int Z(@androidx.annotation.N View view) {
        return i.d(view);
    }

    @androidx.annotation.h0
    public static boolean Z0(@androidx.annotation.N View view) {
        Boolean f4 = A1().f(view);
        if (f4 != null && f4.booleanValue()) {
            return true;
        }
        return false;
    }

    public static void Z1(@androidx.annotation.N View view, int i4) {
        if (Build.VERSION.SDK_INT >= 26) {
            p.n(view, i4);
        }
    }

    @androidx.annotation.P
    @Deprecated
    public static Matrix a0(View view) {
        return view.getMatrix();
    }

    @Deprecated
    public static void a1(View view) {
        view.jumpDrawablesToCurrentState();
    }

    public static void a2(@androidx.annotation.N View view, @androidx.annotation.P InterfaceC0772a0 interfaceC0772a0) {
        m.u(view, interfaceC0772a0);
    }

    private static f<Boolean> b() {
        return new d(C2356a.e.f54934f0, Boolean.class, 28);
    }

    @Deprecated
    public static int b0(View view) {
        return view.getMeasuredHeightAndState();
    }

    @androidx.annotation.P
    public static View b1(@androidx.annotation.N View view, @androidx.annotation.P View view2, int i4) {
        if (Build.VERSION.SDK_INT >= 26) {
            return p.h(view, view2, i4);
        }
        return null;
    }

    public static void b2(@androidx.annotation.N View view, @androidx.annotation.P String[] strArr, @androidx.annotation.P InterfaceC0796b0 interfaceC0796b0) {
        boolean z3;
        if (Build.VERSION.SDK_INT >= 31) {
            t.c(view, strArr, interfaceC0796b0);
            return;
        }
        if (strArr == null || strArr.length == 0) {
            strArr = null;
        }
        boolean z4 = false;
        if (interfaceC0796b0 != null) {
            if (strArr != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            androidx.core.util.u.b(z3, "When the listener is set, MIME types must also be set");
        }
        if (strArr != null) {
            int length = strArr.length;
            int i4 = 0;
            while (true) {
                if (i4 >= length) {
                    break;
                }
                if (strArr[i4].startsWith("*")) {
                    z4 = true;
                    break;
                }
                i4++;
            }
            androidx.core.util.u.b(!z4, "A MIME type set here must not start with *: " + Arrays.toString(strArr));
        }
        view.setTag(C2356a.e.f54942j0, strArr);
        view.setTag(C2356a.e.f54940i0, interfaceC0796b0);
    }

    public static int c(@androidx.annotation.N View view, @androidx.annotation.N CharSequence charSequence, @androidx.annotation.N androidx.core.view.accessibility.U u3) {
        int M3 = M(view, charSequence);
        if (M3 != -1) {
            d(view, new M.a(M3, charSequence, u3));
        }
        return M3;
    }

    @Deprecated
    public static int c0(View view) {
        return view.getMeasuredState();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ C0807f c1(C0807f c0807f) {
        return c0807f;
    }

    @Deprecated
    public static void c2(View view, int i4) {
        view.setOverScrollMode(i4);
    }

    private static void d(@androidx.annotation.N View view, @androidx.annotation.N M.a aVar) {
        C(view);
        s1(aVar.b(), view);
        K(view).add(aVar);
        d1(view, 0);
    }

    @Deprecated
    public static int d0(View view) {
        return view.getMeasuredWidthAndState();
    }

    @androidx.annotation.W(19)
    static void d1(View view, int i4) {
        boolean z3;
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (!accessibilityManager.isEnabled()) {
            return;
        }
        if (J(view) != null && view.isShown() && view.getWindowVisibility() == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        int i5 = 32;
        if (H(view) == 0 && !z3) {
            if (i4 == 32) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(obtain);
                obtain.setEventType(32);
                k.g(obtain, i4);
                obtain.setSource(view);
                view.onPopulateAccessibilityEvent(obtain);
                obtain.getText().add(J(view));
                accessibilityManager.sendAccessibilityEvent(obtain);
                return;
            }
            if (view.getParent() != null) {
                try {
                    k.e(view.getParent(), view, view, i4);
                    return;
                } catch (AbstractMethodError e4) {
                    Log.e(f13570a, view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e4);
                    return;
                }
            }
            return;
        }
        AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
        if (!z3) {
            i5 = 2048;
        }
        obtain2.setEventType(i5);
        k.g(obtain2, i4);
        if (z3) {
            obtain2.getText().add(J(view));
            x2(view);
        }
        view.sendAccessibilityEventUnchecked(obtain2);
    }

    public static void d2(@androidx.annotation.N View view, @androidx.annotation.U int i4, @androidx.annotation.U int i5, @androidx.annotation.U int i6, @androidx.annotation.U int i7) {
        i.k(view, i4, i5, i6, i7);
    }

    public static void e(@androidx.annotation.N View view, @androidx.annotation.N Collection<View> collection, int i4) {
        if (Build.VERSION.SDK_INT >= 26) {
            p.a(view, collection, i4);
        }
    }

    public static int e0(@androidx.annotation.N View view) {
        return h.d(view);
    }

    public static void e1(@androidx.annotation.N View view, int i4) {
        view.offsetLeftAndRight(i4);
    }

    @Deprecated
    public static void e2(View view, float f4) {
        view.setPivotX(f4);
    }

    public static void f(@androidx.annotation.N View view, @androidx.annotation.N z zVar) {
        if (Build.VERSION.SDK_INT >= 28) {
            q.a(view, zVar);
            return;
        }
        ArrayList arrayList = (ArrayList) view.getTag(C2356a.e.f54952o0);
        if (arrayList == null) {
            arrayList = new ArrayList();
            view.setTag(C2356a.e.f54952o0, arrayList);
        }
        arrayList.add(zVar);
        if (arrayList.size() == 1) {
            C.h(view);
        }
    }

    public static int f0(@androidx.annotation.N View view) {
        return h.e(view);
    }

    public static void f1(@androidx.annotation.N View view, int i4) {
        view.offsetTopAndBottom(i4);
    }

    @Deprecated
    public static void f2(View view, float f4) {
        view.setPivotY(f4);
    }

    @androidx.annotation.N
    public static C0850t0 g(@androidx.annotation.N View view) {
        if (f13562Q == null) {
            f13562Q = new WeakHashMap<>();
        }
        C0850t0 c0850t0 = f13562Q.get(view);
        if (c0850t0 == null) {
            C0850t0 c0850t02 = new C0850t0(view);
            f13562Q.put(view, c0850t02);
            return c0850t02;
        }
        return c0850t0;
    }

    public static int g0(@androidx.annotation.N View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return p.c(view);
        }
        return -1;
    }

    @androidx.annotation.N
    public static Y0 g1(@androidx.annotation.N View view, @androidx.annotation.N Y0 y02) {
        WindowInsets J3 = y02.J();
        if (J3 != null) {
            WindowInsets b4 = l.b(view, J3);
            if (!b4.equals(J3)) {
                return Y0.L(b4, view);
            }
        }
        return y02;
    }

    public static void g2(@androidx.annotation.N View view, @androidx.annotation.P C0805e0 c0805e0) {
        Object obj;
        if (c0805e0 != null) {
            obj = c0805e0.b();
        } else {
            obj = null;
        }
        o.d(view, (PointerIcon) obj);
    }

    private static void h() {
        try {
            f13558M = View.class.getDeclaredMethod("dispatchStartTemporaryDetach", new Class[0]);
            f13559N = View.class.getDeclaredMethod("dispatchFinishTemporaryDetach", new Class[0]);
        } catch (NoSuchMethodException e4) {
            Log.e(f13570a, "Couldn't find method", e4);
        }
        f13560O = true;
    }

    @androidx.annotation.P
    public static String[] h0(@androidx.annotation.N View view) {
        if (Build.VERSION.SDK_INT >= 31) {
            return t.a(view);
        }
        return (String[]) view.getTag(C2356a.e.f54942j0);
    }

    @Deprecated
    public static void h1(View view, AccessibilityEvent accessibilityEvent) {
        view.onInitializeAccessibilityEvent(accessibilityEvent);
    }

    @Deprecated
    public static void h2(View view, float f4) {
        view.setRotation(f4);
    }

    @Deprecated
    public static boolean i(View view, int i4) {
        return view.canScrollHorizontally(i4);
    }

    @Deprecated
    public static int i0(View view) {
        return view.getOverScrollMode();
    }

    public static void i1(@androidx.annotation.N View view, @androidx.annotation.N androidx.core.view.accessibility.M m4) {
        view.onInitializeAccessibilityNodeInfo(m4.b2());
    }

    @Deprecated
    public static void i2(View view, float f4) {
        view.setRotationX(f4);
    }

    @Deprecated
    public static boolean j(View view, int i4) {
        return view.canScrollVertically(i4);
    }

    @androidx.annotation.U
    public static int j0(@androidx.annotation.N View view) {
        return i.e(view);
    }

    @Deprecated
    public static void j1(View view, AccessibilityEvent accessibilityEvent) {
        view.onPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Deprecated
    public static void j2(View view, float f4) {
        view.setRotationY(f4);
    }

    public static void k(@androidx.annotation.N View view) {
        o.a(view);
    }

    @androidx.annotation.U
    public static int k0(@androidx.annotation.N View view) {
        return i.f(view);
    }

    private static f<CharSequence> k1() {
        return new C0825b(C2356a.e.f54936g0, CharSequence.class, 8, 28);
    }

    @Deprecated
    public static void k2(View view, boolean z3) {
        view.setSaveFromParentEnabled(z3);
    }

    @Deprecated
    public static int l(int i4, int i5) {
        return View.combineMeasuredStates(i4, i5);
    }

    @androidx.annotation.P
    public static ViewParent l0(@androidx.annotation.N View view) {
        return h.f(view);
    }

    public static boolean l1(@androidx.annotation.N View view, int i4, @androidx.annotation.P Bundle bundle) {
        return h.j(view, i4, bundle);
    }

    @Deprecated
    public static void l2(View view, float f4) {
        view.setScaleX(f4);
    }

    private static void m(View view, int i4) {
        view.offsetLeftAndRight(i4);
        if (view.getVisibility() == 0) {
            I2(view);
            Object parent = view.getParent();
            if (parent instanceof View) {
                I2((View) parent);
            }
        }
    }

    @Deprecated
    public static float m0(View view) {
        return view.getPivotX();
    }

    @androidx.annotation.P
    public static C0807f m1(@androidx.annotation.N View view, @androidx.annotation.N C0807f c0807f) {
        if (Log.isLoggable(f13570a, 3)) {
            Log.d(f13570a, "performReceiveContent: " + c0807f + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return t.b(view, c0807f);
        }
        InterfaceC0796b0 interfaceC0796b0 = (InterfaceC0796b0) view.getTag(C2356a.e.f54940i0);
        if (interfaceC0796b0 != null) {
            C0807f a4 = interfaceC0796b0.a(view, c0807f);
            if (a4 == null) {
                return null;
            }
            return T(view).a(a4);
        }
        return T(view).a(c0807f);
    }

    @Deprecated
    public static void m2(View view, float f4) {
        view.setScaleY(f4);
    }

    private static void n(View view, int i4) {
        view.offsetTopAndBottom(i4);
        if (view.getVisibility() == 0) {
            I2(view);
            Object parent = view.getParent();
            if (parent instanceof View) {
                I2((View) parent);
            }
        }
    }

    @Deprecated
    public static float n0(View view) {
        return view.getPivotY();
    }

    public static void n1(@androidx.annotation.N View view) {
        h.k(view);
    }

    @androidx.annotation.h0
    public static void n2(@androidx.annotation.N View view, boolean z3) {
        A1().g(view, Boolean.valueOf(z3));
    }

    @androidx.annotation.N
    public static Y0 o(@androidx.annotation.N View view, @androidx.annotation.N Y0 y02, @androidx.annotation.N Rect rect) {
        return m.b(view, y02, rect);
    }

    @androidx.annotation.P
    public static Y0 o0(@androidx.annotation.N View view) {
        return n.a(view);
    }

    public static void o1(@androidx.annotation.N View view, int i4, int i5, int i6, int i7) {
        h.l(view, i4, i5, i6, i7);
    }

    public static void o2(@androidx.annotation.N View view, int i4) {
        n.c(view, i4);
    }

    @androidx.annotation.N
    public static Y0 p(@androidx.annotation.N View view, @androidx.annotation.N Y0 y02) {
        WindowInsets J3 = y02.J();
        if (J3 != null) {
            WindowInsets a4 = l.a(view, J3);
            if (!a4.equals(J3)) {
                return Y0.L(a4, view);
            }
        }
        return y02;
    }

    @Deprecated
    public static float p0(View view) {
        return view.getRotation();
    }

    public static void p1(@androidx.annotation.N View view, @androidx.annotation.N Runnable runnable) {
        h.m(view, runnable);
    }

    public static void p2(@androidx.annotation.N View view, int i4, int i5) {
        n.d(view, i4, i5);
    }

    public static void q(@androidx.annotation.N View view) {
        o.b(view);
    }

    @Deprecated
    public static float q0(View view) {
        return view.getRotationX();
    }

    @SuppressLint({"LambdaLast"})
    public static void q1(@androidx.annotation.N View view, @androidx.annotation.N Runnable runnable, long j4) {
        h.n(view, runnable, j4);
    }

    @androidx.annotation.h0
    public static void q2(@androidx.annotation.N View view, @androidx.annotation.P CharSequence charSequence) {
        F2().g(view, charSequence);
    }

    public static boolean r(@androidx.annotation.N View view, float f4, float f5, boolean z3) {
        return m.c(view, f4, f5, z3);
    }

    @Deprecated
    public static float r0(View view) {
        return view.getRotationY();
    }

    public static void r1(@androidx.annotation.N View view, int i4) {
        s1(i4, view);
        d1(view, 0);
    }

    public static void r2(@androidx.annotation.N View view, @androidx.annotation.N List<Rect> list) {
        if (Build.VERSION.SDK_INT >= 29) {
            r.d(view, list);
        }
    }

    public static boolean s(@androidx.annotation.N View view, float f4, float f5) {
        return m.d(view, f4, f5);
    }

    @Deprecated
    public static float s0(View view) {
        return view.getScaleX();
    }

    private static void s1(int i4, View view) {
        List<M.a> K3 = K(view);
        for (int i5 = 0; i5 < K3.size(); i5++) {
            if (K3.get(i5).b() == i4) {
                K3.remove(i5);
                return;
            }
        }
    }

    public static void s2(@androidx.annotation.N View view, @androidx.annotation.P CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            p.o(view, charSequence);
        }
    }

    public static boolean t(@androidx.annotation.N View view, int i4, int i5, @androidx.annotation.P int[] iArr, @androidx.annotation.P int[] iArr2) {
        return m.e(view, i4, i5, iArr, iArr2);
    }

    @Deprecated
    public static float t0(View view) {
        return view.getScaleY();
    }

    public static void t1(@androidx.annotation.N View view, @androidx.annotation.N z zVar) {
        if (Build.VERSION.SDK_INT >= 28) {
            q.e(view, zVar);
            return;
        }
        ArrayList arrayList = (ArrayList) view.getTag(C2356a.e.f54952o0);
        if (arrayList != null) {
            arrayList.remove(zVar);
            if (arrayList.size() == 0) {
                C.i(view);
            }
        }
    }

    public static void t2(@androidx.annotation.N View view, @androidx.annotation.P String str) {
        m.v(view, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean u(@androidx.annotation.N View view, int i4, int i5, @androidx.annotation.P int[] iArr, @androidx.annotation.P int[] iArr2, int i6) {
        if (view instanceof S) {
            return ((S) view).b(i4, i5, iArr, iArr2, i6);
        }
        if (i6 == 0) {
            return t(view, i4, i5, iArr, iArr2);
        }
        return false;
    }

    public static int u0(@androidx.annotation.N View view) {
        return n.b(view);
    }

    public static void u1(@androidx.annotation.N View view, @androidx.annotation.N M.a aVar, @androidx.annotation.P CharSequence charSequence, @androidx.annotation.P androidx.core.view.accessibility.U u3) {
        if (u3 == null && charSequence == null) {
            r1(view, aVar.b());
        } else {
            d(view, aVar.a(charSequence, u3));
        }
    }

    @Deprecated
    public static void u2(View view, float f4) {
        view.setTranslationX(f4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void v(@androidx.annotation.N View view, int i4, int i5, int i6, int i7, @androidx.annotation.P int[] iArr, int i8, @androidx.annotation.N int[] iArr2) {
        if (view instanceof T) {
            ((T) view).c(i4, i5, i6, i7, iArr, i8, iArr2);
        } else {
            x(view, i4, i5, i6, i7, iArr, i8);
        }
    }

    @androidx.annotation.P
    @androidx.annotation.h0
    public static CharSequence v0(@androidx.annotation.N View view) {
        return F2().f(view);
    }

    public static void v1(@androidx.annotation.N View view) {
        l.c(view);
    }

    @Deprecated
    public static void v2(View view, float f4) {
        view.setTranslationY(f4);
    }

    public static boolean w(@androidx.annotation.N View view, int i4, int i5, int i6, int i7, @androidx.annotation.P int[] iArr) {
        return m.f(view, i4, i5, i6, i7, iArr);
    }

    @androidx.annotation.N
    public static List<Rect> w0(@androidx.annotation.N View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return r.b(view);
        }
        return Collections.emptyList();
    }

    @androidx.annotation.N
    public static <T extends View> T w1(@androidx.annotation.N View view, @androidx.annotation.D int i4) {
        if (Build.VERSION.SDK_INT >= 28) {
            return (T) q.f(view, i4);
        }
        T t3 = (T) view.findViewById(i4);
        if (t3 != null) {
            return t3;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this View");
    }

    public static void w2(@androidx.annotation.N View view, float f4) {
        m.w(view, f4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean x(@androidx.annotation.N View view, int i4, int i5, int i6, int i7, @androidx.annotation.P int[] iArr, int i8) {
        if (view instanceof S) {
            return ((S) view).a(i4, i5, i6, i7, iArr, i8);
        }
        if (i8 == 0) {
            return w(view, i4, i5, i6, i7, iArr);
        }
        return false;
    }

    @androidx.annotation.P
    public static String x0(@androidx.annotation.N View view) {
        return m.k(view);
    }

    @Deprecated
    public static int x1(int i4, int i5, int i6) {
        return View.resolveSizeAndState(i4, i5, i6);
    }

    private static void x2(View view) {
        if (V(view) == 0) {
            R1(view, 1);
        }
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            if (V((View) parent) == 4) {
                R1(view, 2);
                return;
            }
        }
    }

    public static void y(@androidx.annotation.N View view) {
        o.c(view);
    }

    @Deprecated
    public static float y0(View view) {
        return view.getTranslationX();
    }

    public static boolean y1(@androidx.annotation.N View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return p.i(view);
        }
        return view.requestFocus();
    }

    public static void y2(@androidx.annotation.N View view, @androidx.annotation.P C0860y0.b bVar) {
        C0860y0.h(view, bVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.h0
    public static boolean z(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return C.a(view).b(view, keyEvent);
    }

    @Deprecated
    public static float z0(View view) {
        return view.getTranslationY();
    }

    public static void z1(@androidx.annotation.N View view, @androidx.annotation.N @SuppressLint({"ContextFirst"}) Context context, @androidx.annotation.N int[] iArr, @androidx.annotation.P AttributeSet attributeSet, @androidx.annotation.N TypedArray typedArray, int i4, int i5) {
        if (Build.VERSION.SDK_INT >= 29) {
            r.c(view, context, iArr, attributeSet, typedArray, i4, i5);
        }
    }

    @Deprecated
    public static void z2(View view, float f4) {
        view.setX(f4);
    }
}
