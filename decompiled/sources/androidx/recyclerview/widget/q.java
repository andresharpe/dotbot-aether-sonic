package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
class q {

    /* renamed from: j, reason: collision with root package name */
    static final int f18283j = -1;

    /* renamed from: k, reason: collision with root package name */
    static final int f18284k = 1;

    /* renamed from: l, reason: collision with root package name */
    static final int f18285l = Integer.MIN_VALUE;

    /* renamed from: m, reason: collision with root package name */
    static final int f18286m = -1;

    /* renamed from: n, reason: collision with root package name */
    static final int f18287n = 1;

    /* renamed from: b, reason: collision with root package name */
    int f18289b;

    /* renamed from: c, reason: collision with root package name */
    int f18290c;

    /* renamed from: d, reason: collision with root package name */
    int f18291d;

    /* renamed from: e, reason: collision with root package name */
    int f18292e;

    /* renamed from: h, reason: collision with root package name */
    boolean f18295h;

    /* renamed from: i, reason: collision with root package name */
    boolean f18296i;

    /* renamed from: a, reason: collision with root package name */
    boolean f18288a = true;

    /* renamed from: f, reason: collision with root package name */
    int f18293f = 0;

    /* renamed from: g, reason: collision with root package name */
    int f18294g = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(RecyclerView.C c4) {
        int i4 = this.f18290c;
        if (i4 >= 0 && i4 < c4.d()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public View b(RecyclerView.w wVar) {
        View p4 = wVar.p(this.f18290c);
        this.f18290c += this.f18291d;
        return p4;
    }

    public String toString() {
        return "LayoutState{mAvailable=" + this.f18289b + ", mCurrentPosition=" + this.f18290c + ", mItemDirection=" + this.f18291d + ", mLayoutDirection=" + this.f18292e + ", mStartLine=" + this.f18293f + ", mEndLine=" + this.f18294g + '}';
    }
}
