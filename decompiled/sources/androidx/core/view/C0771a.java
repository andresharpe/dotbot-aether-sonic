package androidx.core.view;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.annotation.InterfaceC0577u;
import androidx.annotation.RestrictTo;
import androidx.core.view.accessibility.C0774a;
import androidx.core.view.accessibility.M;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import m.C2356a;

/* renamed from: androidx.core.view.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0771a {

    /* renamed from: c, reason: collision with root package name */
    private static final View.AccessibilityDelegate f13279c = new View.AccessibilityDelegate();

    /* renamed from: a, reason: collision with root package name */
    private final View.AccessibilityDelegate f13280a;

    /* renamed from: b, reason: collision with root package name */
    private final View.AccessibilityDelegate f13281b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.view.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0104a extends View.AccessibilityDelegate {

        /* renamed from: a, reason: collision with root package name */
        final C0771a f13282a;

        C0104a(C0771a c0771a) {
            this.f13282a = c0771a;
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f13282a.a(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        @androidx.annotation.W(16)
        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            androidx.core.view.accessibility.S b4 = this.f13282a.b(view);
            if (b4 != null) {
                return (AccessibilityNodeProvider) b4.e();
            }
            return null;
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f13282a.f(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            androidx.core.view.accessibility.M c22 = androidx.core.view.accessibility.M.c2(accessibilityNodeInfo);
            c22.H1(C0823k0.Z0(view));
            c22.n1(C0823k0.N0(view));
            c22.B1(C0823k0.J(view));
            c22.N1(C0823k0.v0(view));
            this.f13282a.g(view, c22);
            c22.f(accessibilityNodeInfo.getText(), view);
            List<M.a> c4 = C0771a.c(view);
            for (int i4 = 0; i4 < c4.size(); i4++) {
                c22.b(c4.get(i4));
            }
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f13282a.h(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f13282a.i(viewGroup, view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean performAccessibilityAction(View view, int i4, Bundle bundle) {
            return this.f13282a.j(view, i4, bundle);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEvent(View view, int i4) {
            this.f13282a.l(view, i4);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f13282a.m(view, accessibilityEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.W(16)
    /* renamed from: androidx.core.view.a$b */
    /* loaded from: classes.dex */
    public static class b {
        private b() {
        }

        @InterfaceC0577u
        static AccessibilityNodeProvider a(View.AccessibilityDelegate accessibilityDelegate, View view) {
            return accessibilityDelegate.getAccessibilityNodeProvider(view);
        }

        @InterfaceC0577u
        static boolean b(View.AccessibilityDelegate accessibilityDelegate, View view, int i4, Bundle bundle) {
            return accessibilityDelegate.performAccessibilityAction(view, i4, bundle);
        }
    }

    public C0771a() {
        this(f13279c);
    }

    static List<M.a> c(View view) {
        List<M.a> list = (List) view.getTag(C2356a.e.f54930d0);
        if (list == null) {
            return Collections.emptyList();
        }
        return list;
    }

    private boolean e(ClickableSpan clickableSpan, View view) {
        if (clickableSpan != null) {
            ClickableSpan[] x3 = androidx.core.view.accessibility.M.x(view.createAccessibilityNodeInfo().getText());
            for (int i4 = 0; x3 != null && i4 < x3.length; i4++) {
                if (clickableSpan.equals(x3[i4])) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean k(int i4, View view) {
        WeakReference weakReference;
        SparseArray sparseArray = (SparseArray) view.getTag(C2356a.e.f54932e0);
        if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i4)) != null) {
            ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
            if (e(clickableSpan, view)) {
                clickableSpan.onClick(view);
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean a(@androidx.annotation.N View view, @androidx.annotation.N AccessibilityEvent accessibilityEvent) {
        return this.f13280a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @androidx.annotation.P
    public androidx.core.view.accessibility.S b(@androidx.annotation.N View view) {
        AccessibilityNodeProvider a4 = b.a(this.f13280a, view);
        if (a4 != null) {
            return new androidx.core.view.accessibility.S(a4);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public View.AccessibilityDelegate d() {
        return this.f13281b;
    }

    public void f(@androidx.annotation.N View view, @androidx.annotation.N AccessibilityEvent accessibilityEvent) {
        this.f13280a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void g(@androidx.annotation.N View view, @androidx.annotation.N androidx.core.view.accessibility.M m4) {
        this.f13280a.onInitializeAccessibilityNodeInfo(view, m4.b2());
    }

    public void h(@androidx.annotation.N View view, @androidx.annotation.N AccessibilityEvent accessibilityEvent) {
        this.f13280a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean i(@androidx.annotation.N ViewGroup viewGroup, @androidx.annotation.N View view, @androidx.annotation.N AccessibilityEvent accessibilityEvent) {
        return this.f13280a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean j(@androidx.annotation.N View view, int i4, @androidx.annotation.P Bundle bundle) {
        List<M.a> c4 = c(view);
        boolean z3 = false;
        int i5 = 0;
        while (true) {
            if (i5 >= c4.size()) {
                break;
            }
            M.a aVar = c4.get(i5);
            if (aVar.b() == i4) {
                z3 = aVar.d(view, bundle);
                break;
            }
            i5++;
        }
        if (!z3) {
            z3 = b.b(this.f13280a, view, i4, bundle);
        }
        if (!z3 && i4 == C2356a.e.f54923a && bundle != null) {
            return k(bundle.getInt(C0774a.f13418H, -1), view);
        }
        return z3;
    }

    public void l(@androidx.annotation.N View view, int i4) {
        this.f13280a.sendAccessibilityEvent(view, i4);
    }

    public void m(@androidx.annotation.N View view, @androidx.annotation.N AccessibilityEvent accessibilityEvent) {
        this.f13280a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public C0771a(@androidx.annotation.N View.AccessibilityDelegate accessibilityDelegate) {
        this.f13280a = accessibilityDelegate;
        this.f13281b = new C0104a(this);
    }
}
