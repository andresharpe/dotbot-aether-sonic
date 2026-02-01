package androidx.preference;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.D;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import androidx.core.view.C0823k0;
import androidx.preference.q;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class p extends RecyclerView.F {

    /* renamed from: I, reason: collision with root package name */
    @P
    private final Drawable f16966I;

    /* renamed from: J, reason: collision with root package name */
    private ColorStateList f16967J;

    /* renamed from: K, reason: collision with root package name */
    private final SparseArray<View> f16968K;

    /* renamed from: L, reason: collision with root package name */
    private boolean f16969L;

    /* renamed from: M, reason: collision with root package name */
    private boolean f16970M;

    /* JADX INFO: Access modifiers changed from: package-private */
    public p(@N View view) {
        super(view);
        SparseArray<View> sparseArray = new SparseArray<>(4);
        this.f16968K = sparseArray;
        TextView textView = (TextView) view.findViewById(R.id.title);
        sparseArray.put(R.id.title, textView);
        sparseArray.put(R.id.summary, view.findViewById(R.id.summary));
        sparseArray.put(R.id.icon, view.findViewById(R.id.icon));
        int i4 = q.f.f17044a;
        sparseArray.put(i4, view.findViewById(i4));
        sparseArray.put(16908350, view.findViewById(16908350));
        this.f16966I = view.getBackground();
        if (textView != null) {
            this.f16967J = textView.getTextColors();
        }
    }

    @N
    @RestrictTo({RestrictTo.Scope.TESTS})
    public static p R(@N View view) {
        return new p(view);
    }

    public View S(@D int i4) {
        View view = this.f16968K.get(i4);
        if (view != null) {
            return view;
        }
        View findViewById = this.f17770a.findViewById(i4);
        if (findViewById != null) {
            this.f16968K.put(i4, findViewById);
        }
        return findViewById;
    }

    public boolean T() {
        return this.f16969L;
    }

    public boolean U() {
        return this.f16970M;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void V() {
        Drawable background = this.f17770a.getBackground();
        Drawable drawable = this.f16966I;
        if (background != drawable) {
            C0823k0.I1(this.f17770a, drawable);
        }
        TextView textView = (TextView) S(R.id.title);
        if (textView != null && this.f16967J != null && !textView.getTextColors().equals(this.f16967J)) {
            textView.setTextColor(this.f16967J);
        }
    }

    public void W(boolean z3) {
        this.f16969L = z3;
    }

    public void X(boolean z3) {
        this.f16970M = z3;
    }
}
