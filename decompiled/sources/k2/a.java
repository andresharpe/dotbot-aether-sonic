package K2;

import J2.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import i0.C2067c;
import i0.InterfaceC2066b;

/* loaded from: classes2.dex */
public final class a implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @N
    private final ConstraintLayout f1401E;

    /* renamed from: F, reason: collision with root package name */
    @N
    public final ImageView f1402F;

    /* renamed from: G, reason: collision with root package name */
    @N
    public final RecyclerView f1403G;

    /* renamed from: H, reason: collision with root package name */
    @N
    public final AppCompatTextView f1404H;

    private a(@N ConstraintLayout constraintLayout, @N ImageView imageView, @N RecyclerView recyclerView, @N AppCompatTextView appCompatTextView) {
        this.f1401E = constraintLayout;
        this.f1402F = imageView;
        this.f1403G = recyclerView;
        this.f1404H = appCompatTextView;
    }

    @N
    public static a a(@N View view) {
        int i4 = a.e.f1295e;
        ImageView imageView = (ImageView) C2067c.a(view, i4);
        if (imageView != null) {
            i4 = a.e.f1311u;
            RecyclerView recyclerView = (RecyclerView) C2067c.a(view, i4);
            if (recyclerView != null) {
                i4 = a.e.f1289B;
                AppCompatTextView appCompatTextView = (AppCompatTextView) C2067c.a(view, i4);
                if (appCompatTextView != null) {
                    return new a((ConstraintLayout) view, imageView, recyclerView, appCompatTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @N
    public static a c(@N LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @N
    public static a e(@N LayoutInflater layoutInflater, @P ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(a.f.f1317a, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // i0.InterfaceC2066b
    @N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout d() {
        return this.f1401E;
    }
}
