package androidx.transition;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.transition.D;
import java.util.ArrayList;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
class r extends FrameLayout {

    /* renamed from: E, reason: collision with root package name */
    @androidx.annotation.N
    private ViewGroup f20140E;

    /* renamed from: F, reason: collision with root package name */
    private boolean f20141F;

    /* JADX INFO: Access modifiers changed from: package-private */
    public r(ViewGroup viewGroup) {
        super(viewGroup.getContext());
        setClipChildren(false);
        this.f20140E = viewGroup;
        viewGroup.setTag(D.g.f19277w0, this);
        a0.b(this.f20140E).c(this);
        this.f20141F = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static r b(@androidx.annotation.N ViewGroup viewGroup) {
        return (r) viewGroup.getTag(D.g.f19277w0);
    }

    private int c(ArrayList<View> arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int childCount = getChildCount() - 1;
        int i4 = 0;
        while (i4 <= childCount) {
            int i5 = (i4 + childCount) / 2;
            d(((C0985t) getChildAt(i5)).f20159G, arrayList2);
            if (f(arrayList, arrayList2)) {
                i4 = i5 + 1;
            } else {
                childCount = i5 - 1;
            }
            arrayList2.clear();
        }
        return i4;
    }

    private static void d(View view, ArrayList<View> arrayList) {
        Object parent = view.getParent();
        if (parent instanceof ViewGroup) {
            d((View) parent, arrayList);
        }
        arrayList.add(view);
    }

    private static boolean e(View view, View view2) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        int childCount = viewGroup.getChildCount();
        if (view.getZ() != view2.getZ()) {
            if (view.getZ() <= view2.getZ()) {
                return false;
            }
            return true;
        }
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = viewGroup.getChildAt(a0.a(viewGroup, i4));
            if (childAt == view) {
                return false;
            }
            if (childAt == view2) {
                break;
            }
        }
        return true;
    }

    private static boolean f(ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        if (arrayList.isEmpty() || arrayList2.isEmpty() || arrayList.get(0) != arrayList2.get(0)) {
            return true;
        }
        int min = Math.min(arrayList.size(), arrayList2.size());
        for (int i4 = 1; i4 < min; i4++) {
            View view = arrayList.get(i4);
            View view2 = arrayList2.get(i4);
            if (view != view2) {
                return e(view, view2);
            }
        }
        if (arrayList2.size() == min) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(C0985t c0985t) {
        ArrayList<View> arrayList = new ArrayList<>();
        d(c0985t.f20159G, arrayList);
        int c4 = c(arrayList);
        if (c4 >= 0 && c4 < getChildCount()) {
            addView(c0985t, c4);
        } else {
            addView(c0985t);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g() {
        if (this.f20141F) {
            a0.b(this.f20140E).d(this);
            a0.b(this.f20140E).c(this);
            return;
        }
        throw new IllegalStateException("This GhostViewHolder is detached!");
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        if (this.f20141F) {
            super.onViewAdded(view);
            return;
        }
        throw new IllegalStateException("This GhostViewHolder is detached!");
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if ((getChildCount() == 1 && getChildAt(0) == view) || getChildCount() == 0) {
            this.f20140E.setTag(D.g.f19277w0, null);
            a0.b(this.f20140E).d(this);
            this.f20141F = false;
        }
    }
}
