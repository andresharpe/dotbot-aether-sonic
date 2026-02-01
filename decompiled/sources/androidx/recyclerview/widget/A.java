package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.core.view.C0771a;
import androidx.core.view.C0823k0;
import androidx.core.view.accessibility.M;
import androidx.core.view.accessibility.S;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class A extends C0771a {

    /* renamed from: d, reason: collision with root package name */
    final RecyclerView f17420d;

    /* renamed from: e, reason: collision with root package name */
    private final a f17421e;

    /* loaded from: classes.dex */
    public static class a extends C0771a {

        /* renamed from: d, reason: collision with root package name */
        final A f17422d;

        /* renamed from: e, reason: collision with root package name */
        private Map<View, C0771a> f17423e = new WeakHashMap();

        public a(@N A a4) {
            this.f17422d = a4;
        }

        @Override // androidx.core.view.C0771a
        public boolean a(@N View view, @N AccessibilityEvent accessibilityEvent) {
            C0771a c0771a = this.f17423e.get(view);
            if (c0771a != null) {
                return c0771a.a(view, accessibilityEvent);
            }
            return super.a(view, accessibilityEvent);
        }

        @Override // androidx.core.view.C0771a
        @P
        public S b(@N View view) {
            C0771a c0771a = this.f17423e.get(view);
            if (c0771a != null) {
                return c0771a.b(view);
            }
            return super.b(view);
        }

        @Override // androidx.core.view.C0771a
        public void f(@N View view, @N AccessibilityEvent accessibilityEvent) {
            C0771a c0771a = this.f17423e.get(view);
            if (c0771a != null) {
                c0771a.f(view, accessibilityEvent);
            } else {
                super.f(view, accessibilityEvent);
            }
        }

        @Override // androidx.core.view.C0771a
        public void g(View view, M m4) {
            if (!this.f17422d.o() && this.f17422d.f17420d.getLayoutManager() != null) {
                this.f17422d.f17420d.getLayoutManager().f1(view, m4);
                C0771a c0771a = this.f17423e.get(view);
                if (c0771a != null) {
                    c0771a.g(view, m4);
                    return;
                } else {
                    super.g(view, m4);
                    return;
                }
            }
            super.g(view, m4);
        }

        @Override // androidx.core.view.C0771a
        public void h(@N View view, @N AccessibilityEvent accessibilityEvent) {
            C0771a c0771a = this.f17423e.get(view);
            if (c0771a != null) {
                c0771a.h(view, accessibilityEvent);
            } else {
                super.h(view, accessibilityEvent);
            }
        }

        @Override // androidx.core.view.C0771a
        public boolean i(@N ViewGroup viewGroup, @N View view, @N AccessibilityEvent accessibilityEvent) {
            C0771a c0771a = this.f17423e.get(viewGroup);
            if (c0771a != null) {
                return c0771a.i(viewGroup, view, accessibilityEvent);
            }
            return super.i(viewGroup, view, accessibilityEvent);
        }

        @Override // androidx.core.view.C0771a
        public boolean j(View view, int i4, Bundle bundle) {
            if (!this.f17422d.o() && this.f17422d.f17420d.getLayoutManager() != null) {
                C0771a c0771a = this.f17423e.get(view);
                if (c0771a != null) {
                    if (c0771a.j(view, i4, bundle)) {
                        return true;
                    }
                } else if (super.j(view, i4, bundle)) {
                    return true;
                }
                return this.f17422d.f17420d.getLayoutManager().z1(view, i4, bundle);
            }
            return super.j(view, i4, bundle);
        }

        @Override // androidx.core.view.C0771a
        public void l(@N View view, int i4) {
            C0771a c0771a = this.f17423e.get(view);
            if (c0771a != null) {
                c0771a.l(view, i4);
            } else {
                super.l(view, i4);
            }
        }

        @Override // androidx.core.view.C0771a
        public void m(@N View view, @N AccessibilityEvent accessibilityEvent) {
            C0771a c0771a = this.f17423e.get(view);
            if (c0771a != null) {
                c0771a.m(view, accessibilityEvent);
            } else {
                super.m(view, accessibilityEvent);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public C0771a n(View view) {
            return this.f17423e.remove(view);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void o(View view) {
            C0771a E3 = C0823k0.E(view);
            if (E3 != null && E3 != this) {
                this.f17423e.put(view, E3);
            }
        }
    }

    public A(@N RecyclerView recyclerView) {
        this.f17420d = recyclerView;
        C0771a n4 = n();
        if (n4 != null && (n4 instanceof a)) {
            this.f17421e = (a) n4;
        } else {
            this.f17421e = new a(this);
        }
    }

    @Override // androidx.core.view.C0771a
    public void f(View view, AccessibilityEvent accessibilityEvent) {
        super.f(view, accessibilityEvent);
        if ((view instanceof RecyclerView) && !o()) {
            RecyclerView recyclerView = (RecyclerView) view;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().b1(accessibilityEvent);
            }
        }
    }

    @Override // androidx.core.view.C0771a
    public void g(View view, M m4) {
        super.g(view, m4);
        if (!o() && this.f17420d.getLayoutManager() != null) {
            this.f17420d.getLayoutManager().d1(m4);
        }
    }

    @Override // androidx.core.view.C0771a
    public boolean j(View view, int i4, Bundle bundle) {
        if (super.j(view, i4, bundle)) {
            return true;
        }
        if (!o() && this.f17420d.getLayoutManager() != null) {
            return this.f17420d.getLayoutManager().x1(i4, bundle);
        }
        return false;
    }

    @N
    public C0771a n() {
        return this.f17421e;
    }

    boolean o() {
        return this.f17420d.D0();
    }
}
