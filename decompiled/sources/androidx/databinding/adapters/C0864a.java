package androidx.databinding.adapters;

import android.widget.AbsListView;
import androidx.annotation.RestrictTo;
import androidx.databinding.InterfaceC0879d;

@androidx.databinding.h({@androidx.databinding.g(attribute = "android:listSelector", method = "setSelector", type = AbsListView.class), @androidx.databinding.g(attribute = "android:scrollingCache", method = "setScrollingCacheEnabled", type = AbsListView.class), @androidx.databinding.g(attribute = "android:smoothScrollbar", method = "setSmoothScrollbarEnabled", type = AbsListView.class), @androidx.databinding.g(attribute = "android:onMovedToScrapHeap", method = "setRecyclerListener", type = AbsListView.class)})
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* renamed from: androidx.databinding.adapters.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0864a {

    /* renamed from: androidx.databinding.adapters.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0120a implements AbsListView.OnScrollListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f14046a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b f14047b;

        C0120a(c cVar, b bVar) {
            this.f14046a = cVar;
            this.f14047b = bVar;
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i4, int i5, int i6) {
            b bVar = this.f14047b;
            if (bVar != null) {
                bVar.onScroll(absListView, i4, i5, i6);
            }
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i4) {
            c cVar = this.f14046a;
            if (cVar != null) {
                cVar.onScrollStateChanged(absListView, i4);
            }
        }
    }

    /* renamed from: androidx.databinding.adapters.a$b */
    /* loaded from: classes.dex */
    public interface b {
        void onScroll(AbsListView absListView, int i4, int i5, int i6);
    }

    /* renamed from: androidx.databinding.adapters.a$c */
    /* loaded from: classes.dex */
    public interface c {
        void onScrollStateChanged(AbsListView absListView, int i4);
    }

    @InterfaceC0879d(requireAll = false, value = {"android:onScroll", "android:onScrollStateChanged"})
    public static void a(AbsListView absListView, b bVar, c cVar) {
        absListView.setOnScrollListener(new C0120a(cVar, bVar));
    }
}
