package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.RestrictTo;
import androidx.core.os.C0742e;
import androidx.core.view.C0823k0;
import androidx.core.view.ViewTreeObserverOnPreDrawListenerC0802d0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@SuppressLint({"UnknownNullness"})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public abstract class J {

    /* loaded from: classes.dex */
    class a implements Runnable {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ int f15182E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ ArrayList f15183F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ ArrayList f15184G;

        /* renamed from: H, reason: collision with root package name */
        final /* synthetic */ ArrayList f15185H;

        /* renamed from: I, reason: collision with root package name */
        final /* synthetic */ ArrayList f15186I;

        a(int i4, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
            this.f15182E = i4;
            this.f15183F = arrayList;
            this.f15184G = arrayList2;
            this.f15185H = arrayList3;
            this.f15186I = arrayList4;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (int i4 = 0; i4 < this.f15182E; i4++) {
                C0823k0.t2((View) this.f15183F.get(i4), (String) this.f15184G.get(i4));
                C0823k0.t2((View) this.f15185H.get(i4), (String) this.f15186I.get(i4));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void d(List<View> list, View view) {
        int size = list.size();
        if (g(list, view, size)) {
            return;
        }
        if (C0823k0.x0(view) != null) {
            list.add(view);
        }
        for (int i4 = size; i4 < list.size(); i4++) {
            View view2 = list.get(i4);
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i5 = 0; i5 < childCount; i5++) {
                    View childAt = viewGroup.getChildAt(i5);
                    if (!g(list, childAt, size) && C0823k0.x0(childAt) != null) {
                        list.add(childAt);
                    }
                }
            }
        }
    }

    private static boolean g(List<View> list, View view, int i4) {
        for (int i5 = 0; i5 < i4; i5++) {
            if (list.get(i5) == view) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static boolean i(List list) {
        if (list != null && !list.isEmpty()) {
            return false;
        }
        return true;
    }

    public abstract void a(Object obj, View view);

    public abstract void b(Object obj, ArrayList<View> arrayList);

    public abstract void c(ViewGroup viewGroup, Object obj);

    public abstract boolean e(Object obj);

    public abstract Object f(Object obj);

    /* JADX INFO: Access modifiers changed from: protected */
    public void h(View view, Rect rect) {
        if (!C0823k0.O0(view)) {
            return;
        }
        RectF rectF = new RectF();
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        view.getMatrix().mapRect(rectF);
        rectF.offset(view.getLeft(), view.getTop());
        Object parent = view.getParent();
        while (parent instanceof View) {
            View view2 = (View) parent;
            rectF.offset(-view2.getScrollX(), -view2.getScrollY());
            view2.getMatrix().mapRect(rectF);
            rectF.offset(view2.getLeft(), view2.getTop());
            parent = view2.getParent();
        }
        view.getRootView().getLocationOnScreen(new int[2]);
        rectF.offset(r1[0], r1[1]);
        rect.set(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
    }

    public abstract Object j(Object obj, Object obj2, Object obj3);

    public abstract Object k(Object obj, Object obj2, Object obj3);

    /* JADX INFO: Access modifiers changed from: package-private */
    public ArrayList<String> l(ArrayList<View> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            View view = arrayList.get(i4);
            arrayList2.add(C0823k0.x0(view));
            C0823k0.t2(view, null);
        }
        return arrayList2;
    }

    public abstract void m(Object obj, View view);

    public abstract void n(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    public abstract void o(Object obj, View view, ArrayList<View> arrayList);

    public abstract void p(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3);

    public abstract void q(Object obj, Rect rect);

    public abstract void r(Object obj, View view);

    public void s(@androidx.annotation.N Fragment fragment, @androidx.annotation.N Object obj, @androidx.annotation.N C0742e c0742e, @androidx.annotation.N Runnable runnable) {
        runnable.run();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void t(View view, ArrayList<View> arrayList, ArrayList<View> arrayList2, ArrayList<String> arrayList3, Map<String, String> map) {
        int size = arrayList2.size();
        ArrayList arrayList4 = new ArrayList();
        for (int i4 = 0; i4 < size; i4++) {
            View view2 = arrayList.get(i4);
            String x02 = C0823k0.x0(view2);
            arrayList4.add(x02);
            if (x02 != null) {
                C0823k0.t2(view2, null);
                String str = map.get(x02);
                int i5 = 0;
                while (true) {
                    if (i5 >= size) {
                        break;
                    }
                    if (str.equals(arrayList3.get(i5))) {
                        C0823k0.t2(arrayList2.get(i5), x02);
                        break;
                    }
                    i5++;
                }
            }
        }
        ViewTreeObserverOnPreDrawListenerC0802d0.a(view, new a(size, arrayList2, arrayList3, arrayList, arrayList4));
    }

    public abstract void u(Object obj, View view, ArrayList<View> arrayList);

    public abstract void v(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    public abstract Object w(Object obj);
}
