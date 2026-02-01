package com.harman.jbl.partybox.ui.djeffects.adapter;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.C0669d;
import androidx.recyclerview.widget.RecyclerView;
import com.harman.jbl.partybox.databinding.A1;
import com.harman.jbl.partybox.ui.djeffects.model.DjEffectToneId;
import com.harman.jbl.partybox.utils.r;
import java.util.List;
import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
public final class b extends RecyclerView.Adapter<a> {

    /* renamed from: d, reason: collision with root package name */
    @l3.d
    private final List<Y1.a> f43379d;

    /* renamed from: e, reason: collision with root package name */
    @l3.d
    private final InterfaceC0373b f43380e;

    /* loaded from: classes2.dex */
    public final class a extends RecyclerView.F {

        /* renamed from: I, reason: collision with root package name */
        @l3.d
        private final Context f43381I;

        /* renamed from: J, reason: collision with root package name */
        @l3.d
        private final A1 f43382J;

        /* renamed from: K, reason: collision with root package name */
        final /* synthetic */ b f43383K;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@l3.d b bVar, @l3.d Context context, A1 binding) {
            super(binding.d());
            F.p(context, "context");
            F.p(binding, "binding");
            this.f43383K = bVar;
            this.f43381I = context;
            this.f43382J = binding;
        }

        public final void R(@l3.d Y1.a sound) {
            F.p(sound, "sound");
            this.f43382J.f38455F.setImageDrawable(C0669d.i(this.f43381I, sound.h()));
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColors(sound.g());
            gradientDrawable.setShape(1);
            gradientDrawable.setGradientType(0);
            this.f43382J.f38455F.setBackground(gradientDrawable);
            this.f43382J.f38456G.setText(sound.i());
        }
    }

    /* renamed from: com.harman.jbl.partybox.ui.djeffects.adapter.b$b, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0373b {
        void a(@l3.d DjEffectToneId djEffectToneId);
    }

    public b(@l3.d List<Y1.a> itemList, @l3.d InterfaceC0373b onDjSoundClick) {
        F.p(itemList, "itemList");
        F.p(onDjSoundClick, "onDjSoundClick");
        this.f43379d = itemList;
        this.f43380e = onDjSoundClick;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Q(b this$0, Y1.a sound, View view) {
        F.p(this$0, "this$0");
        F.p(sound, "$sound");
        r rVar = new r();
        F.m(view);
        rVar.a(view);
        this$0.f43380e.a(sound.j());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public void C(@l3.d a djSoundViewHolder, int i4) {
        F.p(djSoundViewHolder, "djSoundViewHolder");
        final Y1.a aVar = this.f43379d.get(i4);
        djSoundViewHolder.f17770a.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.djeffects.adapter.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                b.Q(b.this, aVar, view);
            }
        });
        djSoundViewHolder.R(aVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @l3.d
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public a E(@l3.d ViewGroup parent, int i4) {
        F.p(parent, "parent");
        Context context = parent.getContext();
        F.o(context, "getContext(...)");
        A1 e4 = A1.e(LayoutInflater.from(parent.getContext()), parent, false);
        F.o(e4, "inflate(...)");
        return new a(this, context, e4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int l() {
        return this.f43379d.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long m(int i4) {
        return i4;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int n(int i4) {
        return i4;
    }
}
