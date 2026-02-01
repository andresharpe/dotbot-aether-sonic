package m2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.textfield.TextInputEditText;
import com.harman.jbl.partylight.lib.g;
import i0.C2067c;
import i0.InterfaceC2066b;

/* renamed from: m2.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2363c implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @N
    private final LinearLayout f55088E;

    /* renamed from: F, reason: collision with root package name */
    @N
    public final RelativeLayout f55089F;

    /* renamed from: G, reason: collision with root package name */
    @N
    public final CheckBox f55090G;

    /* renamed from: H, reason: collision with root package name */
    @N
    public final AppCompatTextView f55091H;

    /* renamed from: I, reason: collision with root package name */
    @N
    public final ImageButton f55092I;

    /* renamed from: J, reason: collision with root package name */
    @N
    public final Button f55093J;

    /* renamed from: K, reason: collision with root package name */
    @N
    public final CheckBox f55094K;

    /* renamed from: L, reason: collision with root package name */
    @N
    public final AppCompatImageView f55095L;

    /* renamed from: M, reason: collision with root package name */
    @N
    public final RecyclerView f55096M;

    /* renamed from: N, reason: collision with root package name */
    @N
    public final TextInputEditText f55097N;

    /* renamed from: O, reason: collision with root package name */
    @N
    public final RelativeLayout f55098O;

    /* renamed from: P, reason: collision with root package name */
    @N
    public final AppCompatTextView f55099P;

    /* renamed from: Q, reason: collision with root package name */
    @N
    public final TextView f55100Q;

    /* renamed from: R, reason: collision with root package name */
    @N
    public final TextView f55101R;

    private C2363c(@N LinearLayout linearLayout, @N RelativeLayout relativeLayout, @N CheckBox checkBox, @N AppCompatTextView appCompatTextView, @N ImageButton imageButton, @N Button button, @N CheckBox checkBox2, @N AppCompatImageView appCompatImageView, @N RecyclerView recyclerView, @N TextInputEditText textInputEditText, @N RelativeLayout relativeLayout2, @N AppCompatTextView appCompatTextView2, @N TextView textView, @N TextView textView2) {
        this.f55088E = linearLayout;
        this.f55089F = relativeLayout;
        this.f55090G = checkBox;
        this.f55091H = appCompatTextView;
        this.f55092I = imageButton;
        this.f55093J = button;
        this.f55094K = checkBox2;
        this.f55095L = appCompatImageView;
        this.f55096M = recyclerView;
        this.f55097N = textInputEditText;
        this.f55098O = relativeLayout2;
        this.f55099P = appCompatTextView2;
        this.f55100Q = textView;
        this.f55101R = textView2;
    }

    @N
    public static C2363c a(@N View view) {
        int i4 = g.C0418g.f46914f;
        RelativeLayout relativeLayout = (RelativeLayout) C2067c.a(view, i4);
        if (relativeLayout != null) {
            i4 = g.C0418g.f46918g;
            CheckBox checkBox = (CheckBox) C2067c.a(view, i4);
            if (checkBox != null) {
                i4 = g.C0418g.f46922h;
                AppCompatTextView appCompatTextView = (AppCompatTextView) C2067c.a(view, i4);
                if (appCompatTextView != null) {
                    i4 = g.C0418g.f46954p;
                    ImageButton imageButton = (ImageButton) C2067c.a(view, i4);
                    if (imageButton != null) {
                        i4 = g.C0418g.f46958q;
                        Button button = (Button) C2067c.a(view, i4);
                        if (button != null) {
                            i4 = g.C0418g.f46822C;
                            CheckBox checkBox2 = (CheckBox) C2067c.a(view, i4);
                            if (checkBox2 != null) {
                                i4 = g.C0418g.f46834G;
                                AppCompatImageView appCompatImageView = (AppCompatImageView) C2067c.a(view, i4);
                                if (appCompatImageView != null) {
                                    i4 = g.C0418g.f46904c1;
                                    RecyclerView recyclerView = (RecyclerView) C2067c.a(view, i4);
                                    if (recyclerView != null) {
                                        i4 = g.C0418g.f46940l1;
                                        TextInputEditText textInputEditText = (TextInputEditText) C2067c.a(view, i4);
                                        if (textInputEditText != null) {
                                            i4 = g.C0418g.f46948n1;
                                            RelativeLayout relativeLayout2 = (RelativeLayout) C2067c.a(view, i4);
                                            if (relativeLayout2 != null) {
                                                i4 = g.C0418g.f46833F1;
                                                AppCompatTextView appCompatTextView2 = (AppCompatTextView) C2067c.a(view, i4);
                                                if (appCompatTextView2 != null) {
                                                    i4 = g.C0418g.f46857N1;
                                                    TextView textView = (TextView) C2067c.a(view, i4);
                                                    if (textView != null) {
                                                        i4 = g.C0418g.f46890Y1;
                                                        TextView textView2 = (TextView) C2067c.a(view, i4);
                                                        if (textView2 != null) {
                                                            return new C2363c((LinearLayout) view, relativeLayout, checkBox, appCompatTextView, imageButton, button, checkBox2, appCompatImageView, recyclerView, textInputEditText, relativeLayout2, appCompatTextView2, textView, textView2);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @N
    public static C2363c c(@N LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @N
    public static C2363c e(@N LayoutInflater layoutInflater, @P ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(g.h.f47003c, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // i0.InterfaceC2066b
    @N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout d() {
        return this.f55088E;
    }
}
