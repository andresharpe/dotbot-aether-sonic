package androidx.core.view.accessibility;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.annotation.W;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class S {

    /* renamed from: b, reason: collision with root package name */
    public static final int f13406b = -1;

    /* renamed from: a, reason: collision with root package name */
    @androidx.annotation.P
    private final Object f13407a;

    @W(16)
    /* loaded from: classes.dex */
    static class a extends AccessibilityNodeProvider {

        /* renamed from: a, reason: collision with root package name */
        final S f13408a;

        a(S s4) {
            this.f13408a = s4;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i4) {
            M b4 = this.f13408a.b(i4);
            if (b4 == null) {
                return null;
            }
            return b4.b2();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i4) {
            List<M> c4 = this.f13408a.c(str, i4);
            if (c4 == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int size = c4.size();
            for (int i5 = 0; i5 < size; i5++) {
                arrayList.add(c4.get(i5).b2());
            }
            return arrayList;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public boolean performAction(int i4, int i5, Bundle bundle) {
            return this.f13408a.f(i4, i5, bundle);
        }
    }

    @W(19)
    /* loaded from: classes.dex */
    static class b extends a {
        b(S s4) {
            super(s4);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo findFocus(int i4) {
            M d4 = this.f13408a.d(i4);
            if (d4 == null) {
                return null;
            }
            return d4.b2();
        }
    }

    @W(26)
    /* loaded from: classes.dex */
    static class c extends b {
        c(S s4) {
            super(s4);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public void addExtraDataToAccessibilityNodeInfo(int i4, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            this.f13408a.a(i4, M.c2(accessibilityNodeInfo), str, bundle);
        }
    }

    public S() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f13407a = new c(this);
        } else {
            this.f13407a = new b(this);
        }
    }

    public void a(int i4, @androidx.annotation.N M m4, @androidx.annotation.N String str, @androidx.annotation.P Bundle bundle) {
    }

    @androidx.annotation.P
    public M b(int i4) {
        return null;
    }

    @androidx.annotation.P
    public List<M> c(@androidx.annotation.N String str, int i4) {
        return null;
    }

    @androidx.annotation.P
    public M d(int i4) {
        return null;
    }

    @androidx.annotation.P
    public Object e() {
        return this.f13407a;
    }

    public boolean f(int i4, int i5, @androidx.annotation.P Bundle bundle) {
        return false;
    }

    public S(@androidx.annotation.P Object obj) {
        this.f13407a = obj;
    }
}
