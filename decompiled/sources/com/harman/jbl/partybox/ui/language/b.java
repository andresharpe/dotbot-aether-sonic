package com.harman.jbl.partybox.ui.language;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.harman.jbl.partybox.j;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.F;
import l3.d;
import l3.e;

/* loaded from: classes2.dex */
public final class b extends RecyclerView.Adapter<a> {

    /* renamed from: d, reason: collision with root package name */
    @d
    private final List<Pair<String, String>> f43897d;

    /* renamed from: e, reason: collision with root package name */
    @d
    private final LanguageFragment f43898e;

    /* renamed from: f, reason: collision with root package name */
    @d
    private final InterfaceC0379b f43899f;

    /* loaded from: classes2.dex */
    public static final class a extends RecyclerView.F {

        /* renamed from: I, reason: collision with root package name */
        @d
        private final TextView f43900I;

        /* renamed from: J, reason: collision with root package name */
        @e
        private final ImageView f43901J;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@d View itemView) {
            super(itemView);
            F.p(itemView, "itemView");
            View findViewById = itemView.findViewById(j.h.f8);
            F.o(findViewById, "findViewById(...)");
            this.f43900I = (TextView) findViewById;
            this.f43901J = (ImageView) itemView.findViewById(j.h.g8);
        }

        @d
        public final TextView R() {
            return this.f43900I;
        }

        @e
        public final ImageView S() {
            return this.f43901J;
        }
    }

    /* renamed from: com.harman.jbl.partybox.ui.language.b$b, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0379b {
        void a(@d a aVar, int i4);
    }

    public b(@d List<Pair<String, String>> mResult, @d LanguageFragment fragment, @d InterfaceC0379b onItemSelectedListener) {
        F.p(mResult, "mResult");
        F.p(fragment, "fragment");
        F.p(onItemSelectedListener, "onItemSelectedListener");
        this.f43897d = mResult;
        this.f43898e = fragment;
        this.f43899f = onItemSelectedListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void R(b this$0, a myViewHolder, View view) {
        F.p(this$0, "this$0");
        F.p(myViewHolder, "$myViewHolder");
        this$0.f43899f.a(myViewHolder, myViewHolder.p());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public void C(@d a vHolder, int i4) {
        String str;
        F.p(vHolder, "vHolder");
        vHolder.R().setText(this.f43897d.get(i4).f());
        Pair<String, String> f4 = this.f43898e.getMLanguageLiveData().f();
        if (f4 != null) {
            str = f4.e();
        } else {
            str = null;
        }
        if (F.g(str, this.f43897d.get(i4).e())) {
            ImageView S3 = vHolder.S();
            if (S3 != null) {
                S3.setImageResource(j.f.f40940I2);
                return;
            }
            return;
        }
        ImageView S4 = vHolder.S();
        if (S4 != null) {
            S4.setImageResource(j.f.f40936H2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @d
    /* renamed from: Q, reason: merged with bridge method [inline-methods] */
    public a E(@d ViewGroup parent, int i4) {
        F.p(parent, "parent");
        View inflate = LayoutInflater.from(parent.getContext()).inflate(j.i.f41516l1, parent, false);
        F.o(inflate, "inflate(...)");
        final a aVar = new a(inflate);
        aVar.f17770a.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.language.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                b.R(b.this, aVar, view);
            }
        });
        return aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int l() {
        return this.f43897d.size();
    }
}
