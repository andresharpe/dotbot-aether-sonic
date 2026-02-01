package m2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.N;
import androidx.annotation.P;
import com.harman.jbl.partylight.lib.g;
import i0.C2067c;
import i0.InterfaceC2066b;

/* loaded from: classes2.dex */
public final class G implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @N
    private final LinearLayout f55058E;

    /* renamed from: F, reason: collision with root package name */
    @N
    public final TextView f55059F;

    private G(@N LinearLayout linearLayout, @N TextView textView) {
        this.f55058E = linearLayout;
        this.f55059F = textView;
    }

    @N
    public static G a(@N View view) {
        int i4 = g.C0418g.f46836G1;
        TextView textView = (TextView) C2067c.a(view, i4);
        if (textView != null) {
            return new G((LinearLayout) view, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @N
    public static G c(@N LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @N
    public static G e(@N LayoutInflater layoutInflater, @P ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(g.h.f46997G, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // i0.InterfaceC2066b
    @N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout d() {
        return this.f55058E;
    }
}
