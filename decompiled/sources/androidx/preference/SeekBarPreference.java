package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.preference.Preference;
import androidx.preference.q;

/* loaded from: classes.dex */
public class SeekBarPreference extends Preference {

    /* renamed from: J0, reason: collision with root package name */
    private static final String f16817J0 = "SeekBarPreference";

    /* renamed from: A0, reason: collision with root package name */
    private int f16818A0;

    /* renamed from: B0, reason: collision with root package name */
    boolean f16819B0;

    /* renamed from: C0, reason: collision with root package name */
    SeekBar f16820C0;

    /* renamed from: D0, reason: collision with root package name */
    private TextView f16821D0;

    /* renamed from: E0, reason: collision with root package name */
    boolean f16822E0;

    /* renamed from: F0, reason: collision with root package name */
    private boolean f16823F0;

    /* renamed from: G0, reason: collision with root package name */
    boolean f16824G0;

    /* renamed from: H0, reason: collision with root package name */
    private final SeekBar.OnSeekBarChangeListener f16825H0;

    /* renamed from: I0, reason: collision with root package name */
    private final View.OnKeyListener f16826I0;

    /* renamed from: x0, reason: collision with root package name */
    int f16827x0;

    /* renamed from: y0, reason: collision with root package name */
    int f16828y0;

    /* renamed from: z0, reason: collision with root package name */
    private int f16829z0;

    /* loaded from: classes.dex */
    class a implements SeekBar.OnSeekBarChangeListener {
        a() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i4, boolean z3) {
            if (z3) {
                SeekBarPreference seekBarPreference = SeekBarPreference.this;
                if (seekBarPreference.f16824G0 || !seekBarPreference.f16819B0) {
                    seekBarPreference.B1(seekBar);
                    return;
                }
            }
            SeekBarPreference seekBarPreference2 = SeekBarPreference.this;
            seekBarPreference2.C1(i4 + seekBarPreference2.f16828y0);
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            SeekBarPreference.this.f16819B0 = true;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            SeekBarPreference.this.f16819B0 = false;
            int progress = seekBar.getProgress();
            SeekBarPreference seekBarPreference = SeekBarPreference.this;
            if (progress + seekBarPreference.f16828y0 != seekBarPreference.f16827x0) {
                seekBarPreference.B1(seekBar);
            }
        }
    }

    /* loaded from: classes.dex */
    class b implements View.OnKeyListener {
        b() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i4, KeyEvent keyEvent) {
            if (keyEvent.getAction() != 0) {
                return false;
            }
            SeekBarPreference seekBarPreference = SeekBarPreference.this;
            if ((!seekBarPreference.f16822E0 && (i4 == 21 || i4 == 22)) || i4 == 23 || i4 == 66) {
                return false;
            }
            SeekBar seekBar = seekBarPreference.f16820C0;
            if (seekBar == null) {
                Log.e(SeekBarPreference.f16817J0, "SeekBar view is null and hence cannot be adjusted.");
                return false;
            }
            return seekBar.onKeyDown(i4, keyEvent);
        }
    }

    public SeekBarPreference(@N Context context, @P AttributeSet attributeSet, int i4, int i5) {
        super(context, attributeSet, i4, i5);
        this.f16825H0 = new a();
        this.f16826I0 = new b();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q.k.f17194g1, i4, i5);
        this.f16828y0 = obtainStyledAttributes.getInt(q.k.f17206k1, 0);
        u1(obtainStyledAttributes.getInt(q.k.f17200i1, 100));
        w1(obtainStyledAttributes.getInt(q.k.f17209l1, 0));
        this.f16822E0 = obtainStyledAttributes.getBoolean(q.k.f17203j1, true);
        this.f16823F0 = obtainStyledAttributes.getBoolean(q.k.f17212m1, false);
        this.f16824G0 = obtainStyledAttributes.getBoolean(q.k.f17215n1, false);
        obtainStyledAttributes.recycle();
    }

    private void A1(int i4, boolean z3) {
        int i5 = this.f16828y0;
        if (i4 < i5) {
            i4 = i5;
        }
        int i6 = this.f16829z0;
        if (i4 > i6) {
            i4 = i6;
        }
        if (i4 != this.f16827x0) {
            this.f16827x0 = i4;
            C1(i4);
            u0(i4);
            if (z3) {
                X();
            }
        }
    }

    void B1(@N SeekBar seekBar) {
        int progress = this.f16828y0 + seekBar.getProgress();
        if (progress != this.f16827x0) {
            if (e(Integer.valueOf(progress))) {
                A1(progress, false);
            } else {
                seekBar.setProgress(this.f16827x0 - this.f16828y0);
                C1(this.f16827x0);
            }
        }
    }

    void C1(int i4) {
        TextView textView = this.f16821D0;
        if (textView != null) {
            textView.setText(String.valueOf(i4));
        }
    }

    @Override // androidx.preference.Preference
    public void d0(@N p pVar) {
        super.d0(pVar);
        pVar.f17770a.setOnKeyListener(this.f16826I0);
        this.f16820C0 = (SeekBar) pVar.S(q.f.f17049f);
        TextView textView = (TextView) pVar.S(q.f.f17050g);
        this.f16821D0 = textView;
        if (this.f16823F0) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
            this.f16821D0 = null;
        }
        SeekBar seekBar = this.f16820C0;
        if (seekBar == null) {
            Log.e(f16817J0, "SeekBar view is null in onBindViewHolder.");
            return;
        }
        seekBar.setOnSeekBarChangeListener(this.f16825H0);
        this.f16820C0.setMax(this.f16829z0 - this.f16828y0);
        int i4 = this.f16818A0;
        if (i4 != 0) {
            this.f16820C0.setKeyProgressIncrement(i4);
        } else {
            this.f16818A0 = this.f16820C0.getKeyProgressIncrement();
        }
        this.f16820C0.setProgress(this.f16827x0 - this.f16828y0);
        C1(this.f16827x0);
        this.f16820C0.setEnabled(Q());
    }

    @Override // androidx.preference.Preference
    @P
    protected Object h0(@N TypedArray typedArray, int i4) {
        return Integer.valueOf(typedArray.getInt(i4, 0));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.Preference
    public void l0(@P Parcelable parcelable) {
        if (parcelable != null && parcelable.getClass().equals(c.class)) {
            c cVar = (c) parcelable;
            super.l0(cVar.getSuperState());
            this.f16827x0 = cVar.f16832E;
            this.f16828y0 = cVar.f16833F;
            this.f16829z0 = cVar.f16834G;
            X();
            return;
        }
        super.l0(parcelable);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.Preference
    @P
    public Parcelable m0() {
        Parcelable m02 = super.m0();
        if (S()) {
            return m02;
        }
        c cVar = new c(m02);
        cVar.f16832E = this.f16827x0;
        cVar.f16833F = this.f16828y0;
        cVar.f16834G = this.f16829z0;
        return cVar;
    }

    public int m1() {
        return this.f16829z0;
    }

    @Override // androidx.preference.Preference
    protected void n0(Object obj) {
        if (obj == null) {
            obj = 0;
        }
        z1(C(((Integer) obj).intValue()));
    }

    public int n1() {
        return this.f16828y0;
    }

    public final int o1() {
        return this.f16818A0;
    }

    public boolean p1() {
        return this.f16823F0;
    }

    public boolean q1() {
        return this.f16824G0;
    }

    public int r1() {
        return this.f16827x0;
    }

    public boolean s1() {
        return this.f16822E0;
    }

    public void t1(boolean z3) {
        this.f16822E0 = z3;
    }

    public final void u1(int i4) {
        int i5 = this.f16828y0;
        if (i4 < i5) {
            i4 = i5;
        }
        if (i4 != this.f16829z0) {
            this.f16829z0 = i4;
            X();
        }
    }

    public void v1(int i4) {
        int i5 = this.f16829z0;
        if (i4 > i5) {
            i4 = i5;
        }
        if (i4 != this.f16828y0) {
            this.f16828y0 = i4;
            X();
        }
    }

    public final void w1(int i4) {
        if (i4 != this.f16818A0) {
            this.f16818A0 = Math.min(this.f16829z0 - this.f16828y0, Math.abs(i4));
            X();
        }
    }

    public void x1(boolean z3) {
        this.f16823F0 = z3;
        X();
    }

    public void y1(boolean z3) {
        this.f16824G0 = z3;
    }

    public void z1(int i4) {
        A1(i4, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class c extends Preference.b {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: E, reason: collision with root package name */
        int f16832E;

        /* renamed from: F, reason: collision with root package name */
        int f16833F;

        /* renamed from: G, reason: collision with root package name */
        int f16834G;

        /* loaded from: classes.dex */
        class a implements Parcelable.Creator<c> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public c createFromParcel(Parcel parcel) {
                return new c(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public c[] newArray(int i4) {
                return new c[i4];
            }
        }

        c(Parcel parcel) {
            super(parcel);
            this.f16832E = parcel.readInt();
            this.f16833F = parcel.readInt();
            this.f16834G = parcel.readInt();
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i4) {
            super.writeToParcel(parcel, i4);
            parcel.writeInt(this.f16832E);
            parcel.writeInt(this.f16833F);
            parcel.writeInt(this.f16834G);
        }

        c(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public SeekBarPreference(@N Context context, @P AttributeSet attributeSet, int i4) {
        this(context, attributeSet, i4, 0);
    }

    public SeekBarPreference(@N Context context, @P AttributeSet attributeSet) {
        this(context, attributeSet, q.a.f16990T);
    }

    public SeekBarPreference(@N Context context) {
        this(context, null);
    }
}
