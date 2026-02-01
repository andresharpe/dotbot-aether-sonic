package m2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.annotation.N;
import com.harman.jbl.partylight.lib.g;
import i0.C2067c;
import i0.InterfaceC2066b;

/* loaded from: classes2.dex */
public final class E implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @N
    private final View f55046E;

    /* renamed from: F, reason: collision with root package name */
    @N
    public final ImageView f55047F;

    /* renamed from: G, reason: collision with root package name */
    @N
    public final ImageView f55048G;

    /* renamed from: H, reason: collision with root package name */
    @N
    public final SeekBar f55049H;

    /* renamed from: I, reason: collision with root package name */
    @N
    public final TextView f55050I;

    /* renamed from: J, reason: collision with root package name */
    @N
    public final TextView f55051J;

    /* renamed from: K, reason: collision with root package name */
    @N
    public final TextView f55052K;

    private E(@N View view, @N ImageView imageView, @N ImageView imageView2, @N SeekBar seekBar, @N TextView textView, @N TextView textView2, @N TextView textView3) {
        this.f55046E = view;
        this.f55047F = imageView;
        this.f55048G = imageView2;
        this.f55049H = seekBar;
        this.f55050I = textView;
        this.f55051J = textView2;
        this.f55052K = textView3;
    }

    @N
    public static E a(@N View view) {
        int i4 = g.C0418g.f46967s0;
        ImageView imageView = (ImageView) C2067c.a(view, i4);
        if (imageView != null) {
            i4 = g.C0418g.f46971t0;
            ImageView imageView2 = (ImageView) C2067c.a(view, i4);
            if (imageView2 != null) {
                i4 = g.C0418g.f46908d1;
                SeekBar seekBar = (SeekBar) C2067c.a(view, i4);
                if (seekBar != null) {
                    i4 = g.C0418g.f46929i2;
                    TextView textView = (TextView) C2067c.a(view, i4);
                    if (textView != null) {
                        i4 = g.C0418g.f46933j2;
                        TextView textView2 = (TextView) C2067c.a(view, i4);
                        if (textView2 != null) {
                            i4 = g.C0418g.f46905c2;
                            TextView textView3 = (TextView) C2067c.a(view, i4);
                            if (textView3 != null) {
                                return new E(view, imageView, imageView2, seekBar, textView, textView2, textView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @N
    public static E b(@N LayoutInflater layoutInflater, @N ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(g.h.f46995E, viewGroup);
            return a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // i0.InterfaceC2066b
    @N
    public View d() {
        return this.f55046E;
    }
}
