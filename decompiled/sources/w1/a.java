package W1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.connection.model.HmMultiDeviceModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.U;
import l3.d;
import l3.e;

@U({"SMAP\nHmMultipleDeviceAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HmMultipleDeviceAdapter.kt\ncom/harman/jbl/partybox/ui/connection/HmMultipleDeviceAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,60:1\n1#2:61\n*E\n"})
/* loaded from: classes2.dex */
public final class a extends RecyclerView.Adapter<C0021a> {

    /* renamed from: d, reason: collision with root package name */
    @e
    private final Context f3807d;

    /* renamed from: e, reason: collision with root package name */
    @d
    private ArrayList<HmMultiDeviceModel> f3808e = new ArrayList<>();

    /* renamed from: W1.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0021a extends RecyclerView.F {

        /* renamed from: I, reason: collision with root package name */
        @d
        private ImageView f3809I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0021a(@d View itemView) {
            super(itemView);
            F.p(itemView, "itemView");
            View findViewById = itemView.findViewById(j.h.f41332r3);
            F.o(findViewById, "findViewById(...)");
            this.f3809I = (ImageView) findViewById;
        }

        @d
        public final ImageView R() {
            return this.f3809I;
        }

        public final void S(@d ImageView imageView) {
            F.p(imageView, "<set-?>");
            this.f3809I = imageView;
        }
    }

    public a(@e Context context) {
        this.f3807d = context;
    }

    @d
    public final List<HmMultiDeviceModel> O() {
        return this.f3808e;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public void C(@d C0021a holder, int i4) {
        Integer num;
        F.p(holder, "holder");
        Context context = this.f3807d;
        if (context != null) {
            num = Integer.valueOf(com.harman.sdk.utils.d.r(context, this.f3808e.get(i4).H(), this.f3808e.get(i4).E()));
        } else {
            num = null;
        }
        if ((num == null || num.intValue() != 0) && num != null) {
            holder.R().setImageResource(num.intValue());
        }
        if (this.f3808e.get(i4).J()) {
            holder.R().setVisibility(0);
        } else {
            holder.R().setVisibility(4);
        }
        if (this.f3808e.get(i4).Q()) {
            holder.R().startAnimation(AnimationUtils.loadAnimation(this.f3807d, j.a.f40568g));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @d
    /* renamed from: Q, reason: merged with bridge method [inline-methods] */
    public C0021a E(@d ViewGroup parent, int i4) {
        F.p(parent, "parent");
        View inflate = LayoutInflater.from(this.f3807d).inflate(j.i.f41393G2, parent, false);
        F.m(inflate);
        return new C0021a(inflate);
    }

    public final void R(@d List<HmMultiDeviceModel> list) {
        F.p(list, "list");
        this.f3808e.clear();
        ArrayList<HmMultiDeviceModel> arrayList = new ArrayList<>();
        this.f3808e = arrayList;
        arrayList.addAll(list);
        r();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int l() {
        return this.f3808e.size();
    }
}
