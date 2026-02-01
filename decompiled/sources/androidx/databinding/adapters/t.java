package androidx.databinding.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import androidx.annotation.RestrictTo;
import androidx.databinding.w;
import java.util.List;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes.dex */
class t<T> extends BaseAdapter {

    /* renamed from: E, reason: collision with root package name */
    private List<T> f14064E;

    /* renamed from: F, reason: collision with root package name */
    private w.a f14065F;

    /* renamed from: G, reason: collision with root package name */
    private final Context f14066G;

    /* renamed from: H, reason: collision with root package name */
    private final int f14067H;

    /* renamed from: I, reason: collision with root package name */
    private final int f14068I;

    /* renamed from: J, reason: collision with root package name */
    private final int f14069J;

    /* renamed from: K, reason: collision with root package name */
    private final LayoutInflater f14070K;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends w.a {
        a() {
        }

        @Override // androidx.databinding.w.a
        public void a(androidx.databinding.w wVar) {
            t.this.notifyDataSetChanged();
        }

        @Override // androidx.databinding.w.a
        public void f(androidx.databinding.w wVar, int i4, int i5) {
            t.this.notifyDataSetChanged();
        }

        @Override // androidx.databinding.w.a
        public void g(androidx.databinding.w wVar, int i4, int i5) {
            t.this.notifyDataSetChanged();
        }

        @Override // androidx.databinding.w.a
        public void h(androidx.databinding.w wVar, int i4, int i5, int i6) {
            t.this.notifyDataSetChanged();
        }

        @Override // androidx.databinding.w.a
        public void i(androidx.databinding.w wVar, int i4, int i5) {
            t.this.notifyDataSetChanged();
        }
    }

    public t(Context context, List<T> list, int i4, int i5, int i6) {
        LayoutInflater layoutInflater;
        this.f14066G = context;
        this.f14068I = i4;
        this.f14067H = i5;
        this.f14069J = i6;
        if (i4 == 0) {
            layoutInflater = null;
        } else {
            layoutInflater = (LayoutInflater) context.getSystemService("layout_inflater");
        }
        this.f14070K = layoutInflater;
        b(list);
    }

    public View a(int i4, int i5, View view, ViewGroup viewGroup) {
        View findViewById;
        CharSequence valueOf;
        if (view == null) {
            if (i4 == 0) {
                view = new TextView(this.f14066G);
            } else {
                view = this.f14070K.inflate(i4, viewGroup, false);
            }
        }
        int i6 = this.f14069J;
        if (i6 == 0) {
            findViewById = view;
        } else {
            findViewById = view.findViewById(i6);
        }
        TextView textView = (TextView) findViewById;
        T t3 = this.f14064E.get(i5);
        if (t3 instanceof CharSequence) {
            valueOf = (CharSequence) t3;
        } else {
            valueOf = String.valueOf(t3);
        }
        textView.setText(valueOf);
        return view;
    }

    public void b(List<T> list) {
        List<T> list2 = this.f14064E;
        if (list2 == list) {
            return;
        }
        if (list2 instanceof androidx.databinding.w) {
            ((androidx.databinding.w) list2).h(this.f14065F);
        }
        this.f14064E = list;
        if (list instanceof androidx.databinding.w) {
            if (this.f14065F == null) {
                this.f14065F = new a();
            }
            ((androidx.databinding.w) this.f14064E).G(this.f14065F);
        }
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f14064E.size();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i4, View view, ViewGroup viewGroup) {
        return a(this.f14067H, i4, view, viewGroup);
    }

    @Override // android.widget.Adapter
    public Object getItem(int i4) {
        return this.f14064E.get(i4);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i4) {
        return i4;
    }

    @Override // android.widget.Adapter
    public View getView(int i4, View view, ViewGroup viewGroup) {
        return a(this.f14068I, i4, view, viewGroup);
    }
}
