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
import com.xiaoming.party.auracast.widget.HmTextViewWithImage;
import i0.C2067c;
import i0.InterfaceC2066b;

/* loaded from: classes2.dex */
public final class b implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @N
    private final ConstraintLayout f1405E;

    /* renamed from: F, reason: collision with root package name */
    @N
    public final ImageView f1406F;

    /* renamed from: G, reason: collision with root package name */
    @N
    public final AppCompatTextView f1407G;

    /* renamed from: H, reason: collision with root package name */
    @N
    public final ImageView f1408H;

    /* renamed from: I, reason: collision with root package name */
    @N
    public final HmTextViewWithImage f1409I;

    private b(@N ConstraintLayout constraintLayout, @N ImageView imageView, @N AppCompatTextView appCompatTextView, @N ImageView imageView2, @N HmTextViewWithImage hmTextViewWithImage) {
        this.f1405E = constraintLayout;
        this.f1406F = imageView;
        this.f1407G = appCompatTextView;
        this.f1408H = imageView2;
        this.f1409I = hmTextViewWithImage;
    }

    @N
    public static b a(@N View view) {
        int i4 = a.e.f1292b;
        ImageView imageView = (ImageView) C2067c.a(view, i4);
        if (imageView != null) {
            i4 = a.e.f1294d;
            AppCompatTextView appCompatTextView = (AppCompatTextView) C2067c.a(view, i4);
            if (appCompatTextView != null) {
                i4 = a.e.f1301k;
                ImageView imageView2 = (ImageView) C2067c.a(view, i4);
                if (imageView2 != null) {
                    i4 = a.e.f1290C;
                    HmTextViewWithImage hmTextViewWithImage = (HmTextViewWithImage) C2067c.a(view, i4);
                    if (hmTextViewWithImage != null) {
                        return new b((ConstraintLayout) view, imageView, appCompatTextView, imageView2, hmTextViewWithImage);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @N
    public static b c(@N LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @N
    public static b e(@N LayoutInflater layoutInflater, @P ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(a.f.f1318b, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // i0.InterfaceC2066b
    @N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout d() {
        return this.f1405E;
    }
}
