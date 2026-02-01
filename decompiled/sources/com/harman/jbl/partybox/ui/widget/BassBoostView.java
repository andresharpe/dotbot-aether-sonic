package com.harman.jbl.partybox.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.harman.jbl.partybox.databinding.Y1;
import com.harman.jbl.partybox.j;
import kotlin.E;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
public final class BassBoostView extends LinearLayout {

    /* renamed from: I, reason: collision with root package name */
    @l3.d
    public static final a f45709I = new a(null);

    /* renamed from: J, reason: collision with root package name */
    @l3.d
    public static final String f45710J = "BassboostView";

    /* renamed from: E, reason: collision with root package name */
    @l3.d
    private final Y1 f45711E;

    /* renamed from: F, reason: collision with root package name */
    @l3.e
    private com.harman.jbl.partybox.ui.widget.a f45712F;

    /* renamed from: G, reason: collision with root package name */
    private int f45713G;

    /* renamed from: H, reason: collision with root package name */
    private int f45714H;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @E(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/harman/jbl/partybox/ui/widget/BassBoostView$EqType;", "", "(Ljava/lang/String;I)V", "PB_SIMPLE_EQ_OFF", "PB_SIMPLE_EQ_BASS_BOOST_1", "PB_SIMPLE_EQ_BASS_BOOST_2", "JBL_Partybox_3.12.20_release_2025-09-15-11-35_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class EqType {
        private static final /* synthetic */ kotlin.enums.a $ENTRIES;
        private static final /* synthetic */ EqType[] $VALUES;
        public static final EqType PB_SIMPLE_EQ_OFF = new EqType("PB_SIMPLE_EQ_OFF", 0);
        public static final EqType PB_SIMPLE_EQ_BASS_BOOST_1 = new EqType("PB_SIMPLE_EQ_BASS_BOOST_1", 1);
        public static final EqType PB_SIMPLE_EQ_BASS_BOOST_2 = new EqType("PB_SIMPLE_EQ_BASS_BOOST_2", 2);

        static {
            EqType[] b4 = b();
            $VALUES = b4;
            $ENTRIES = kotlin.enums.c.c(b4);
        }

        private EqType(String str, int i4) {
        }

        private static final /* synthetic */ EqType[] b() {
            return new EqType[]{PB_SIMPLE_EQ_OFF, PB_SIMPLE_EQ_BASS_BOOST_1, PB_SIMPLE_EQ_BASS_BOOST_2};
        }

        @l3.d
        public static kotlin.enums.a<EqType> e() {
            return $ENTRIES;
        }

        public static EqType valueOf(String str) {
            return (EqType) Enum.valueOf(EqType.class, str);
        }

        public static EqType[] values() {
            return (EqType[]) $VALUES.clone();
        }
    }

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ BassBoostView(Context context, AttributeSet attributeSet, int i4, C2197u c2197u) {
        this(context, (i4 & 2) != 0 ? null : attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(BassBoostView this$0, View view) {
        F.p(this$0, "this$0");
        T1.a.a("BLE_LOG BassboostView Bassboost1 Button selected ");
        EqType eqType = EqType.PB_SIMPLE_EQ_BASS_BOOST_1;
        this$0.h(eqType.ordinal());
        com.harman.jbl.partybox.ui.widget.a aVar = this$0.f45712F;
        if (aVar != null) {
            aVar.a(eqType.ordinal());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(BassBoostView this$0, View view) {
        F.p(this$0, "this$0");
        T1.a.a("BLE_LOG BassboostView Bassboost2 Button selected ");
        EqType eqType = EqType.PB_SIMPLE_EQ_BASS_BOOST_2;
        this$0.h(eqType.ordinal());
        com.harman.jbl.partybox.ui.widget.a aVar = this$0.f45712F;
        if (aVar != null) {
            aVar.a(eqType.ordinal());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(BassBoostView this$0, View view) {
        F.p(this$0, "this$0");
        int i4 = this$0.f45714H;
        EqType eqType = EqType.PB_SIMPLE_EQ_OFF;
        if (i4 == eqType.ordinal()) {
            T1.a.a("BLE_LOG BassboostView Bassboost Switch Turn On ");
            this$0.h(this$0.f45713G);
            com.harman.jbl.partybox.ui.widget.a aVar = this$0.f45712F;
            if (aVar != null) {
                aVar.a(this$0.f45713G);
                return;
            }
            return;
        }
        T1.a.a("BLE_LOG BassboostView Bassboost Switch Turn Off ");
        this$0.h(eqType.ordinal());
        com.harman.jbl.partybox.ui.widget.a aVar2 = this$0.f45712F;
        if (aVar2 != null) {
            aVar2.a(eqType.ordinal());
        }
    }

    public final void g() {
        com.harman.jbl.partybox.persistence.a.f42065a.f("BASS_BOOST_STATE_KEY");
    }

    public final void h(int i4) {
        T1.a.a("BLE_LOG BassboostView updateBassBoost called and Bassboost : " + i4 + " ");
        this.f45714H = i4;
        g();
        this.f45711E.f39253N.setText(getContext().getString(j.m.f41663K1));
        this.f45711E.f39247H.setText(getContext().getString(j.m.U6));
        this.f45711E.f39250K.setText(getContext().getString(j.m.P8));
        if (i4 == EqType.PB_SIMPLE_EQ_BASS_BOOST_1.ordinal()) {
            this.f45713G = i4;
            this.f45711E.f39245F.setEnabled(true);
            this.f45711E.f39248I.setEnabled(true);
            this.f45711E.f39245F.setBackgroundResource(j.f.f40989V);
            this.f45711E.f39248I.setBackgroundResource(0);
            this.f45711E.f39246G.setImageResource(j.f.f41086p1);
            this.f45711E.f39247H.setTextColor(getResources().getColor(j.d.f40749f1, getContext().getTheme()));
            this.f45711E.f39249J.setImageResource(j.f.f41091q1);
            this.f45711E.f39250K.setTextColor(getResources().getColor(j.d.f40687D0, getContext().getTheme()));
            this.f45711E.f39252M.setImageResource(j.f.i4);
            return;
        }
        EqType eqType = EqType.PB_SIMPLE_EQ_BASS_BOOST_2;
        if (i4 == eqType.ordinal()) {
            this.f45713G = i4;
            this.f45711E.f39245F.setEnabled(true);
            this.f45711E.f39248I.setEnabled(true);
            this.f45711E.f39245F.setBackgroundResource(0);
            this.f45711E.f39248I.setBackgroundResource(j.f.f40989V);
            this.f45711E.f39246G.setImageResource(j.f.f41081o1);
            this.f45711E.f39247H.setTextColor(getResources().getColor(j.d.f40687D0, getContext().getTheme()));
            this.f45711E.f39249J.setImageResource(j.f.f41096r1);
            this.f45711E.f39250K.setTextColor(getResources().getColor(j.d.f40749f1, getContext().getTheme()));
            this.f45711E.f39252M.setImageResource(j.f.i4);
            return;
        }
        if (i4 == EqType.PB_SIMPLE_EQ_OFF.ordinal()) {
            T1.a.a("BLE_LOG BassboostView updateBassBoost called and Bassboost is Off and selectedBassboost is : " + this.f45713G + " ");
            this.f45711E.f39252M.setImageResource(j.f.h4);
            this.f45711E.f39245F.setEnabled(false);
            this.f45711E.f39248I.setEnabled(false);
            if (this.f45713G == eqType.ordinal()) {
                this.f45711E.f39245F.setBackgroundResource(0);
                this.f45711E.f39248I.setBackgroundResource(j.f.f40941J);
                this.f45711E.f39246G.setImageResource(j.f.f41081o1);
                this.f45711E.f39247H.setTextColor(getResources().getColor(j.d.f40687D0, getContext().getTheme()));
                this.f45711E.f39249J.setImageResource(j.f.f41091q1);
                this.f45711E.f39250K.setTextColor(getResources().getColor(j.d.f40687D0, getContext().getTheme()));
                return;
            }
            this.f45711E.f39248I.setBackgroundResource(0);
            this.f45711E.f39245F.setBackgroundResource(j.f.f40941J);
            this.f45711E.f39246G.setImageResource(j.f.f41081o1);
            this.f45711E.f39247H.setTextColor(getResources().getColor(j.d.f40687D0, getContext().getTheme()));
            this.f45711E.f39249J.setImageResource(j.f.f41091q1);
            this.f45711E.f39250K.setTextColor(getResources().getColor(j.d.f40687D0, getContext().getTheme()));
        }
    }

    public final void setListener(@l3.d com.harman.jbl.partybox.ui.widget.a listener) {
        F.p(listener, "listener");
        this.f45712F = listener;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BassBoostView(@l3.d Context context, @l3.e AttributeSet attributeSet) {
        super(context, attributeSet);
        F.p(context, "context");
        Y1 e4 = Y1.e(LayoutInflater.from(context), this, true);
        F.o(e4, "inflate(...)");
        this.f45711E = e4;
        EqType eqType = EqType.PB_SIMPLE_EQ_BASS_BOOST_1;
        this.f45713G = eqType.ordinal();
        this.f45714H = eqType.ordinal();
        e4.f39245F.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.widget.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BassBoostView.d(BassBoostView.this, view);
            }
        });
        e4.f39248I.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.widget.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BassBoostView.e(BassBoostView.this, view);
            }
        });
        e4.f39252M.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.widget.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BassBoostView.f(BassBoostView.this, view);
            }
        });
    }
}
